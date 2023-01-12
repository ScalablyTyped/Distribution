package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is Enum
  */
trait EnumProperty[EnumType] extends StObject {
  
  var raw: EnumType
  
  var `type`: String
}
object EnumProperty {
  
  inline def apply[EnumType](raw: EnumType, `type`: String): EnumProperty[EnumType] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumProperty[EnumType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumProperty[?], EnumType] (val x: Self & EnumProperty[EnumType]) extends AnyVal {
    
    inline def setRaw(value: EnumType): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
