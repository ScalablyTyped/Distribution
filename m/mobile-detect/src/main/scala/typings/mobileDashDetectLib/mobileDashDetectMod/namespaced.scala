package typings
package mobileDashDetectLib.mobileDashDetectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobile-detect", JSImport.Namespace)
@js.native
class namespaced protected () extends MobileDetect {
  def this(userAgent: java.lang.String) = this()
  def this(userAgent: java.lang.String, maxPhoneWidth: scala.Double) = this()
}

@JSImport("mobile-detect", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  // only used internally; if necessary, one can replace, intercept or augment particular methods or values
  var _impl: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectImpl = js.native
  var version: java.lang.String = js.native
  def isPhoneSized(): scala.Boolean = js.native
  def isPhoneSized(maxPhoneWidth: scala.Double): scala.Boolean = js.native
}

