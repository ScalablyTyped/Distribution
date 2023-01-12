package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardUnvalidatedValue extends StObject {
  
  val ID: String
  
  val IsMultiValue: Boolean
  
  val IsUnvalidated: Boolean
  
  val Name: String
}
object IMetadataCardUnvalidatedValue {
  
  inline def apply(ID: String, IsMultiValue: Boolean, IsUnvalidated: Boolean, Name: String): IMetadataCardUnvalidatedValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], IsUnvalidated = IsUnvalidated.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardUnvalidatedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardUnvalidatedValue] (val x: Self) extends AnyVal {
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIsMultiValue(value: Boolean): Self = StObject.set(x, "IsMultiValue", value.asInstanceOf[js.Any])
    
    inline def setIsUnvalidated(value: Boolean): Self = StObject.set(x, "IsUnvalidated", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
