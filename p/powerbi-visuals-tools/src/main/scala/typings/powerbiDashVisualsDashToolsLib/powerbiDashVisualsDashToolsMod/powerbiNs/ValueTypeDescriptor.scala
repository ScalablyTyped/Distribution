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

