package typings.playcanvas

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: Boolean
  var postData: Document | js.Object
  var responseType: String
  var withCredentials: Boolean
}

object Anon_Async {
  @scala.inline
  def apply(async: Boolean, postData: Document | js.Object, responseType: String, withCredentials: Boolean): Anon_Async = {
    val __obj = js.Dynamic.literal(async = async, postData = postData.asInstanceOf[js.Any], responseType = responseType, withCredentials = withCredentials)
  
    __obj.asInstanceOf[Anon_Async]
  }
}

