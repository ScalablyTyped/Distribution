package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalItem
  extends StObject
     with Entity {
  
  // An array of access control entries. Each entry specifies the access granted to a user or group. Required.
  var acl: js.UndefOr[NullableOption[js.Array[Acl]]] = js.undefined
  
  // A plain-text representation of the contents of the item. The text in this property is full-text indexed. Optional.
  var content: js.UndefOr[NullableOption[ExternalItemContent]] = js.undefined
  
  /**
    * A property bag with the properties of the item. The properties MUST conform to the schema defined for the
    * externalConnection. Required.
    */
  var properties: js.UndefOr[NullableOption[Properties]] = js.undefined
}
object ExternalItem {
  
  inline def apply(): ExternalItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalItem]
  }
  
  extension [Self <: ExternalItem](x: Self) {
    
    inline def setAcl(value: NullableOption[js.Array[Acl]]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclNull: Self = StObject.set(x, "acl", null)
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setAclVarargs(value: Acl*): Self = StObject.set(x, "acl", js.Array(value*))
    
    inline def setContent(value: NullableOption[ExternalItemContent]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setProperties(value: NullableOption[Properties]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
