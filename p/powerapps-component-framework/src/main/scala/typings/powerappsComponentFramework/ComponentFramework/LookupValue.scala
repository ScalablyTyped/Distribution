package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object used to contain an entity reference to a selected Lookup value. Fields defined as
  * such to align with other Lookup APIs
  */
trait LookupValue extends StObject {
  
  /**
    * The entity logical name of the record the lookup selection references.
    */
  var entityType: String
  
  /**
    * The record id.
    */
  var id: String
  
  /**
    * The name of the record the lookup selection references.
    */
  var name: js.UndefOr[String] = js.undefined
}
object LookupValue {
  
  inline def apply(entityType: String, id: String): LookupValue = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupValue] (val x: Self) extends AnyVal {
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
