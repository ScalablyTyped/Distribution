package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Equalssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.EqualssignEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.ExclamationmarkEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Greaterthansign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.GreaterthansignEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Lessthansign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignEqualssign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignGreaterthansign
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.equals
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.not
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.other
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.parent
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.player
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.self
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinecraftFilter extends js.Object {
  var all_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  var any_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[
    ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
  ] = js.undefined
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
    operator: ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not = null,
    subject: other | parent | player | self | target = null,
    test: String = null,
    value: js.Any = null
  ): MinecraftFilter = {
    val __obj = js.Dynamic.literal()
    if (all_of != null) __obj.updateDynamic("all_of")(all_of.asInstanceOf[js.Any])
    if (any_of != null) __obj.updateDynamic("any_of")(any_of.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinecraftFilter]
  }
}

