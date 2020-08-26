package typings.officeUiFabricReact.ithemeslotruleMod

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.shadesMod.Shade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemeSlotRule extends js.Object {
  /** If set, this slot is the specified shade of the slot it inherits from. */
  var asShade: js.UndefOr[Shade] = js.native
  /** The actual color this theme slot is if it is a color. */
  var color: js.UndefOr[IColor] = js.native
  /**
    * A collection of rules that inherit from this one. It is the responsibility of the inheriting rule to add
    * itself to its parent's dependentRules collection.
    */
  var dependentRules: js.Array[IThemeSlotRule] = js.native
  /** The theme slot this slot is based on. */
  var inherits: js.UndefOr[IThemeSlotRule] = js.native
  /**
    * Whether this slot is a background shade, which uses different logic for generating its inheriting-as-shade value.
    */
  var isBackgroundShade: js.UndefOr[Boolean] = js.native
  /** Whether this slot has been manually overridden (else, it was automatically generated based on inheritance). */
  var isCustomized: js.UndefOr[Boolean] = js.native
  /** The name of this theme slot. */
  var name: String = js.native
  /** The value of this slot if it is NOT a color. Must be falsey if not a color. */
  var value: js.UndefOr[String] = js.native
}

object IThemeSlotRule {
  @scala.inline
  def apply(dependentRules: js.Array[IThemeSlotRule], name: String): IThemeSlotRule = {
    val __obj = js.Dynamic.literal(dependentRules = dependentRules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeSlotRule]
  }
  @scala.inline
  implicit class IThemeSlotRuleOps[Self <: IThemeSlotRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDependentRulesVarargs(value: IThemeSlotRule*): Self = this.set("dependentRules", js.Array(value :_*))
    @scala.inline
    def setDependentRules(value: js.Array[IThemeSlotRule]): Self = this.set("dependentRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsShade(value: Shade): Self = this.set("asShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsShade: Self = this.set("asShade", js.undefined)
    @scala.inline
    def setColor(value: IColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setInherits(value: IThemeSlotRule): Self = this.set("inherits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherits: Self = this.set("inherits", js.undefined)
    @scala.inline
    def setIsBackgroundShade(value: Boolean): Self = this.set("isBackgroundShade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBackgroundShade: Self = this.set("isBackgroundShade", js.undefined)
    @scala.inline
    def setIsCustomized(value: Boolean): Self = this.set("isCustomized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCustomized: Self = this.set("isCustomized", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

