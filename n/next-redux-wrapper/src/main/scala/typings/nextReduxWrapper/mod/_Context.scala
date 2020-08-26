package typings.nextReduxWrapper.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Context extends js.Object

object _Context {
  @scala.inline
  def GetStaticPropsContext(): _Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Context]
  }
  @scala.inline
  def GetServerSidePropsContext(query: ParsedUrlQuery, req: IncomingMessage, res: ServerResponse): _Context = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Context]
  }
}

