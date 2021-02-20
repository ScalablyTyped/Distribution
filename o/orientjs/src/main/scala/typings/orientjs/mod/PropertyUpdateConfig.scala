package typings.orientjs.mod

import typings.orientjs.anon.Fields
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyUpdateConfig extends StObject {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var collate: js.UndefOr[String] = js.native
  
  var custom: js.UndefOr[Fields] = js.native
  
  var linkedClass: js.UndefOr[String] = js.native
  
  var linkedType: js.UndefOr[String] = js.native
  
  var mandatory: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var notNull: js.UndefOr[Boolean] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var regexp: js.UndefOr[RegExp | String] = js.native
  
  var `type`: PropertyType = js.native
}
object PropertyUpdateConfig {
  
  @scala.inline
  def apply(name: String, `type`: PropertyType): PropertyUpdateConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdateConfig]
  }
  
  @scala.inline
  implicit class PropertyUpdateConfigMutableBuilder[Self <: PropertyUpdateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollate(value: String): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
    
    @scala.inline
    def setCustom(value: Fields): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setLinkedClass(value: String): Self = StObject.set(x, "linkedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedClassUndefined: Self = StObject.set(x, "linkedClass", js.undefined)
    
    @scala.inline
    def setLinkedType(value: String): Self = StObject.set(x, "linkedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedTypeUndefined: Self = StObject.set(x, "linkedType", js.undefined)
    
    @scala.inline
    def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotNull(value: Boolean): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setRegexp(value: RegExp | String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    @scala.inline
    def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
