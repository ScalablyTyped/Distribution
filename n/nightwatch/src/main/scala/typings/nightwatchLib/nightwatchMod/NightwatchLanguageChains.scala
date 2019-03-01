package typings
package nightwatchLib.nightwatchMod

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
    val __obj = js.Dynamic.literal(`with` = `with`)
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("at")(at)
    __obj.updateDynamic("be")(be)
    __obj.updateDynamic("been")(been)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("have")(have)
    __obj.updateDynamic("is")(is)
    __obj.updateDynamic("of")(of)
    __obj.updateDynamic("that")(that)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("which")(which)
    __obj.asInstanceOf[NightwatchLanguageChains]
  }
}

