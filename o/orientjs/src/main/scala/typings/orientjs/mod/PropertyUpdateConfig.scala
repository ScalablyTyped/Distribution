package typings.orientjs.mod

import typings.orientjs.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyUpdateConfig extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var collate: js.UndefOr[String] = js.undefined
  
  var custom: js.UndefOr[Fields] = js.undefined
  
  var linkedClass: js.UndefOr[String] = js.undefined
  
  var linkedType: js.UndefOr[String] = js.undefined
  
  var mandatory: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var notNull: js.UndefOr[Boolean] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var regexp: js.UndefOr[js.RegExp | String] = js.undefined
  
  var `type`: PropertyType
}
object PropertyUpdateConfig {
  
  inline def apply(name: String, `type`: PropertyType): PropertyUpdateConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyUpdateConfig] (val x: Self) extends AnyVal {
    
    inline def setCollate(value: String): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
    
    inline def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
    
    inline def setCustom(value: Fields): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setLinkedClass(value: String): Self = StObject.set(x, "linkedClass", value.asInstanceOf[js.Any])
    
    inline def setLinkedClassUndefined: Self = StObject.set(x, "linkedClass", js.undefined)
    
    inline def setLinkedType(value: String): Self = StObject.set(x, "linkedType", value.asInstanceOf[js.Any])
    
    inline def setLinkedTypeUndefined: Self = StObject.set(x, "linkedType", js.undefined)
    
    inline def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    inline def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRegexp(value: js.RegExp | String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
