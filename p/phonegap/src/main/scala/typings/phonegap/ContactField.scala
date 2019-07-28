package typings.phonegap

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactField extends js.Object {
  var pref: Boolean
  var `type`: String
  var value: String
}

@JSGlobal("ContactField")
@js.native
class ContactFieldCls protected () extends ContactField {
  def this(`type`: String, calue: String, perf: Boolean) = this()
  /* CompleteClass */
  override var pref: Boolean = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var value: String = js.native
}

@JSGlobal("ContactField")
@js.native
object ContactField extends Instantiable3[/* type */ String, /* calue */ String, /* perf */ Boolean, ContactField]

