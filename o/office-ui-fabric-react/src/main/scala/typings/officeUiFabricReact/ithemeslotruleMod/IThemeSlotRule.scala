package typings.officeUiFabricReact.ithemeslotruleMod

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.shadesMod.Shade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeSlotRule extends js.Object {
  /** If set, this slot is the specified shade of the slot it inherits from. */
  var asShade: js.UndefOr[Shade] = js.undefined
  /** The actual color this theme slot is if it is a color. */
  var color: js.UndefOr[IColor] = js.undefined
  /**
    * A collection of rules that inherit from this one. It is the responsibility of the inheriting rule to add
    * itself to its parent's dependentRules collection.
    */
  var dependentRules: js.Array[IThemeSlotRule]
  /** The theme slot this slot is based on. */
  var inherits: js.UndefOr[IThemeSlotRule] = js.undefined
  /**
    * Whether this slot is a background shade, which uses different logic for generating its inheriting-as-shade value.
    */
  var isBackgroundShade: js.UndefOr[Boolean] = js.undefined
  /** Whether this slot has been manually overridden (else, it was automatically generated based on inheritance). */
  var isCustomized: js.UndefOr[Boolean] = js.undefined
  /** The name of this theme slot. */
  var name: String
  /** The value of this slot if it is NOT a color. Must be falsey if not a color. */
  var value: js.UndefOr[String] = js.undefined
}

object IThemeSlotRule {
  @scala.inline
  def apply(
    dependentRules: js.Array[IThemeSlotRule],
    name: String,
    asShade: Shade = null,
    color: IColor = null,
    inherits: IThemeSlotRule = null,
    isBackgroundShade: js.UndefOr[Boolean] = js.undefined,
    isCustomized: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): IThemeSlotRule = {
    val __obj = js.Dynamic.literal(dependentRules = dependentRules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (asShade != null) __obj.updateDynamic("asShade")(asShade.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (inherits != null) __obj.updateDynamic("inherits")(inherits.asInstanceOf[js.Any])
    if (!js.isUndefined(isBackgroundShade)) __obj.updateDynamic("isBackgroundShade")(isBackgroundShade.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustomized)) __obj.updateDynamic("isCustomized")(isCustomized.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeSlotRule]
  }
}

