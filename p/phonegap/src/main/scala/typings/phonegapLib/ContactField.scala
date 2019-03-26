package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactField extends js.Object {
  var pref: scala.Boolean
  var `type`: java.lang.String
  var value: java.lang.String
}

@JSGlobal("ContactField")
@js.native
class ContactFieldCls protected () extends ContactField {
  def this(`type`: java.lang.String, calue: java.lang.String, perf: scala.Boolean) = this()
  /* CompleteClass */
  override var pref: scala.Boolean = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override var value: java.lang.String = js.native
}

@JSGlobal("ContactField")
@js.native
object ContactField
  extends org.scalablytyped.runtime.Instantiable3[
      /* type */ java.lang.String, 
      /* calue */ java.lang.String, 
      /* perf */ scala.Boolean, 
      ContactField
    ]

