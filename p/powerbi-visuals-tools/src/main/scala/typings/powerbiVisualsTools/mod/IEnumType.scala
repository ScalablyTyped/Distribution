package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a custom enumeration data type, and its values. */
@js.native
trait IEnumType extends StObject {
  
  /** Gets the members of the enumeration, limited to the validMembers, if appropriate. */
  def members(): js.Array[IEnumMember] = js.native
  def members(validMembers: js.Array[EnumMemberValue]): js.Array[IEnumMember] = js.native
}
