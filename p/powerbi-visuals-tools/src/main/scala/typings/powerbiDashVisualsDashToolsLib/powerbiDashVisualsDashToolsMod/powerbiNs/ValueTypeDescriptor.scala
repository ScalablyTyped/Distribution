package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a data value type in the client type system. Can be used to get a concrete ValueType instance. */
trait ValueTypeDescriptor extends js.Object {
  val binary: js.UndefOr[scala.Boolean] = js.undefined
  val bool: js.UndefOr[scala.Boolean] = js.undefined
  val dateTime: js.UndefOr[scala.Boolean] = js.undefined
  val duration: js.UndefOr[scala.Boolean] = js.undefined
  /*readonly*/ var enumeration: js.UndefOr[IEnumType] = js.undefined
  val formatting: js.UndefOr[FormattingTypeDescriptor] = js.undefined
  val geography: js.UndefOr[GeographyTypeDescriptor] = js.undefined
  val integer: js.UndefOr[scala.Boolean] = js.undefined
  val misc: js.UndefOr[MiscellaneousTypeDescriptor] = js.undefined
  val none: js.UndefOr[scala.Boolean] = js.undefined
  val numeric: js.UndefOr[scala.Boolean] = js.undefined
  val operations: js.UndefOr[OperationalTypeDescriptor] = js.undefined
  val scripting: js.UndefOr[ScriptTypeDescriptor] = js.undefined
   // TODO: 5005022 remove none type when we introduce property categories.
  // Extended types
  val temporal: js.UndefOr[TemporalTypeDescriptor] = js.undefined
  // Simplified primitive types
  val text: js.UndefOr[scala.Boolean] = js.undefined
  // variant types
  val variant: js.UndefOr[js.Array[ValueTypeDescriptor]] = js.undefined
}

object ValueTypeDescriptor {
  @scala.inline
  def apply(
    binary: js.UndefOr[scala.Boolean] = js.undefined,
    bool: js.UndefOr[scala.Boolean] = js.undefined,
    dateTime: js.UndefOr[scala.Boolean] = js.undefined,
    duration: js.UndefOr[scala.Boolean] = js.undefined,
    enumeration: IEnumType = null,
    formatting: FormattingTypeDescriptor = null,
    geography: GeographyTypeDescriptor = null,
    integer: js.UndefOr[scala.Boolean] = js.undefined,
    misc: MiscellaneousTypeDescriptor = null,
    none: js.UndefOr[scala.Boolean] = js.undefined,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    operations: OperationalTypeDescriptor = null,
    scripting: ScriptTypeDescriptor = null,
    temporal: TemporalTypeDescriptor = null,
    text: js.UndefOr[scala.Boolean] = js.undefined,
    variant: js.Array[ValueTypeDescriptor] = null
  ): ValueTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary)
    if (!js.isUndefined(bool)) __obj.updateDynamic("bool")(bool)
    if (!js.isUndefined(dateTime)) __obj.updateDynamic("dateTime")(dateTime)
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration)
    if (enumeration != null) __obj.updateDynamic("enumeration")(enumeration)
    if (formatting != null) __obj.updateDynamic("formatting")(formatting)
    if (geography != null) __obj.updateDynamic("geography")(geography)
    if (!js.isUndefined(integer)) __obj.updateDynamic("integer")(integer)
    if (misc != null) __obj.updateDynamic("misc")(misc)
    if (!js.isUndefined(none)) __obj.updateDynamic("none")(none)
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (scripting != null) __obj.updateDynamic("scripting")(scripting)
    if (temporal != null) __obj.updateDynamic("temporal")(temporal)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[ValueTypeDescriptor]
  }
}

