package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.anon.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that encapsulates an Entity Reference as a plain object suitable for storing in the state tree
  */
trait EntityReference extends StObject {
  
  /**
    * The entity logical name. Read-only.
    */
  var etn: js.UndefOr[String] = js.undefined
  
  /**
    * The record id. Read-only.
    */
  var id: Guid
  
  /**
    * The name of the entity reference. Read-only.
    */
  var name: String
}
object EntityReference {
  
  inline def apply(id: Guid, name: String): EntityReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityReference] (val x: Self) extends AnyVal {
    
    inline def setEtn(value: String): Self = StObject.set(x, "etn", value.asInstanceOf[js.Any])
    
    inline def setEtnUndefined: Self = StObject.set(x, "etn", js.undefined)
    
    inline def setId(value: Guid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
