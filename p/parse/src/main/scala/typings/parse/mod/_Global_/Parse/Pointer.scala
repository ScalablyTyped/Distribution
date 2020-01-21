package typings.parse.mod._Global_.Parse

import typings.parse.mod._Global_.Parse.Object._Encode
import typings.parse.mod._Global_.Parse.Schema._TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pointer
  extends _Encode[js.Any]
     with _TYPE {
  var __type: String
  var className: String
  var objectId: String
}

object Pointer {
  @scala.inline
  def apply(__type: String, className: String, objectId: String): Pointer = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pointer]
  }
}

