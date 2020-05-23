package typings.mobileDetect.anon

import typings.mobileDetect.mod.MobileDetectComplexRules
import typings.mobileDetect.mod.MobileDetectRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Oss extends js.Object {
  var oss: MobileDetectRules
  var phones: MobileDetectRules
  var props: MobileDetectComplexRules
  var tablets: MobileDetectRules
  var uas: MobileDetectRules
  var utils: MobileDetectRules
}

object Oss {
  @scala.inline
  def apply(
    oss: MobileDetectRules,
    phones: MobileDetectRules,
    props: MobileDetectComplexRules,
    tablets: MobileDetectRules,
    uas: MobileDetectRules,
    utils: MobileDetectRules
  ): Oss = {
    val __obj = js.Dynamic.literal(oss = oss.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tablets = tablets.asInstanceOf[js.Any], uas = uas.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oss]
  }
}

