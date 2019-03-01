package typings
package mobileDashDetectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Oss extends js.Object {
  var oss: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules
  var phones: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules
  var props: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectComplexRules
  var tablets: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules
  var uas: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules
  var utils: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules
}

object Anon_Oss {
  @scala.inline
  def apply(
    oss: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules,
    phones: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules,
    props: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectComplexRules,
    tablets: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules,
    uas: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules,
    utils: mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs.MobileDetectRules
  ): Anon_Oss = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oss")(oss)
    __obj.updateDynamic("phones")(phones)
    __obj.updateDynamic("props")(props)
    __obj.updateDynamic("tablets")(tablets)
    __obj.updateDynamic("uas")(uas)
    __obj.updateDynamic("utils")(utils)
    __obj.asInstanceOf[Anon_Oss]
  }
}

