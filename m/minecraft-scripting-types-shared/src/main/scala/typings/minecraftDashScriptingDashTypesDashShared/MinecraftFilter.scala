package typings.minecraftDashScriptingDashTypesDashShared

import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`!=`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`<=`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`<>`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`<`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`==`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`=`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`>=`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.`>`
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.equals
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.not
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.other
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.parent
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.player
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.self
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinecraftFilter extends js.Object {
  var all_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  var any_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[`!=` | `<` | `<=` | `<>` | `=` | `==` | `>` | `>=` | equals | not] = js.undefined
  var subject: js.UndefOr[other | parent | player | self | target] = js.undefined
  var test: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object MinecraftFilter {
  @scala.inline
  def apply(
    all_of: js.Array[MinecraftFilter] = null,
    any_of: js.Array[MinecraftFilter] = null,
    domain: String = null,
    operator: `!=` | `<` | `<=` | `<>` | `=` | `==` | `>` | `>=` | equals | not = null,
    subject: other | parent | player | self | target = null,
    test: String = null,
    value: js.Any = null
  ): MinecraftFilter = {
    val __obj = js.Dynamic.literal()
    if (all_of != null) __obj.updateDynamic("all_of")(all_of)
    if (any_of != null) __obj.updateDynamic("any_of")(any_of)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MinecraftFilter]
  }
}

