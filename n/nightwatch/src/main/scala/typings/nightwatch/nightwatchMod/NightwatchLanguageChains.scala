package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchLanguageChains extends js.Object {
  var and: Expect
  var at: Expect
  var be: Expect
  var been: Expect
  var has: Expect
  var have: Expect
  var is: Expect
  var of: Expect
  var that: Expect
  var to: Expect
  var which: Expect
  var `with`: Expect
}

object NightwatchLanguageChains {
  @scala.inline
  def apply(
    and: Expect,
    at: Expect,
    be: Expect,
    been: Expect,
    has: Expect,
    have: Expect,
    is: Expect,
    of: Expect,
    that: Expect,
    to: Expect,
    which: Expect,
    `with`: Expect
  ): NightwatchLanguageChains = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLanguageChains]
  }
}

