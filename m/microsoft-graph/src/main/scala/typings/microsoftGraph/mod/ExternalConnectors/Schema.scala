package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema
  extends StObject
     with Entity {
  
  // Must be set to microsoft.graph.externalConnector.externalItem. Required.
  var baseType: js.UndefOr[String] = js.undefined
  
  // The properties defined for the items in the connection. The minimum number of properties is one, the maximum is 128.
  var properties: js.UndefOr[NullableOption[js.Array[Property]]] = js.undefined
}
object Schema {
  
  inline def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def setBaseType(value: String): Self = StObject.set(x, "baseType", value.asInstanceOf[js.Any])
    
    inline def setBaseTypeUndefined: Self = StObject.set(x, "baseType", js.undefined)
    
    inline def setProperties(value: NullableOption[js.Array[Property]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
