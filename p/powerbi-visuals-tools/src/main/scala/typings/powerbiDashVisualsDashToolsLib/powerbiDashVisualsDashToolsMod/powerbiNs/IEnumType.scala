package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a custom enumeration data type, and its values. */
@js.native
trait IEnumType extends js.Object {
  /** Gets the members of the enumeration, limited to the validMembers, if appropriate. */
  def members(): js.Array[IEnumMember] = js.native
  def members(validMembers: js.Array[EnumMemberValue]): js.Array[IEnumMember] = js.native
}

