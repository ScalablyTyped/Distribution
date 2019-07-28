package typings.mobileDashDetect

import typings.mobileDashDetect.mobileDashDetectMod.MobileDetectComplexRules
import typings.mobileDashDetect.mobileDashDetectMod.MobileDetectRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Oss extends js.Object {
  var oss: MobileDetectRules
  var phones: MobileDetectRules
  var props: MobileDetectComplexRules
  var tablets: MobileDetectRules
  var uas: MobileDetectRules
  var utils: MobileDetectRules
}

object Anon_Oss {
  @scala.inline
  def apply(
    oss: MobileDetectRules,
    phones: MobileDetectRules,
    props: MobileDetectComplexRules,
    tablets: MobileDetectRules,
    uas: MobileDetectRules,
    utils: MobileDetectRules
  ): Anon_Oss = {
    val __obj = js.Dynamic.literal(oss = oss, phones = phones, props = props, tablets = tablets, uas = uas, utils = utils)
  
    __obj.asInstanceOf[Anon_Oss]
  }
}

