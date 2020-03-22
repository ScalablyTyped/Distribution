package typings.minappEnv.WXNS

import typings.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestSuccessResult extends js.Object {
  var data: AnyObject | String | ArrayBuffer
  var header: AnyObject
  var statusCode: Double
}

object IRequestSuccessResult {
  @scala.inline
  def apply(data: AnyObject | String | ArrayBuffer, header: AnyObject, statusCode: Double): IRequestSuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRequestSuccessResult]
  }
}

