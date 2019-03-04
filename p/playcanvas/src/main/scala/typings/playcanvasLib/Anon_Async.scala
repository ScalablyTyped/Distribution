package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: scala.Boolean
  var postData: stdLib.Document | js.Object
  var responseType: java.lang.String
  var withCredentials: scala.Boolean
}

object Anon_Async {
  @scala.inline
  def apply(
    async: scala.Boolean,
    postData: stdLib.Document | js.Object,
    responseType: java.lang.String,
    withCredentials: scala.Boolean
  ): Anon_Async = {
    val __obj = js.Dynamic.literal(async = async, postData = postData.asInstanceOf[js.Any], responseType = responseType, withCredentials = withCredentials)
  
    __obj.asInstanceOf[Anon_Async]
  }
}

