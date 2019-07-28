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
    val __obj = js.Dynamic.literal(and = and, at = at, be = be, been = been, has = has, have = have, is = is, of = of, that = that, to = to, which = which)
    __obj.updateDynamic("with")(`with`)
    __obj.asInstanceOf[NightwatchLanguageChains]
  }
}

