package typings.parse.parseMod._Global_.Parse.Object

import typings.parse.parseStrings.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Encode[T] extends js.Object

object _Encode {
  @scala.inline
  def Anon_Date[T](__type: Date, iso: String): _Encode[T] = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Encode[T]]
  }
  @scala.inline
  def Pointer[T](__type: String, className: String, objectId: String): _Encode[T] = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Encode[T]]
  }
}

