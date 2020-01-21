package typings.nextServer

import typings.nextServer.libUtilsMod.Send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJson[T] extends js.Object {
  /**
    * Send data `json` data in response
    */
  var json: Send[T]
  /**
    * Send data `any` data in response
    */
  var send: Send[T]
  def status(statusCode: Double): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next-server.next-server/dist/lib/utils.NextApiResponse<T> */ js.Object
}

object AnonJson {
  @scala.inline
  def apply[T](
    json: T => Unit,
    send: T => Unit,
    status: Double => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next-server.next-server/dist/lib/utils.NextApiResponse<T> */ js.Object
  ): AnonJson[T] = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction1(json), send = js.Any.fromFunction1(send), status = js.Any.fromFunction1(status))
  
    __obj.asInstanceOf[AnonJson[T]]
  }
}

