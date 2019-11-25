package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is Enum
		 */
trait EnumProperty[EnumType] extends js.Object {
  var raw: EnumType
  var `type`: String
}

object EnumProperty {
  @scala.inline
  def apply[EnumType](raw: EnumType, `type`: String): EnumProperty[EnumType] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumProperty[EnumType]]
  }
}

