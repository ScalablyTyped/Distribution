package typings.nodal.mod

import typings.nodal.nodalNumbers.`0`
import typings.nodal.nodalNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnProperties extends StObject {
  
  var array: js.UndefOr[Boolean] = js.native
  
  var auto_increment: js.UndefOr[Boolean] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var length: js.UndefOr[Double | Null] = js.native
  
  var nullable: js.UndefOr[Boolean] = js.native
  
  var primary_key: js.UndefOr[`0` | `1` | Boolean] = js.native
  
  var unique: js.UndefOr[`0` | `1` | Boolean] = js.native
}
object IColumnProperties {
  
  @scala.inline
  def apply(): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnProperties]
  }
  
  @scala.inline
  implicit class IColumnPropertiesMutableBuilder[Self <: IColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setAuto_increment(value: Boolean): Self = StObject.set(x, "auto_increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_incrementUndefined: Self = StObject.set(x, "auto_increment", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthNull: Self = StObject.set(x, "length", null)
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setPrimary_key(value: `0` | `1` | Boolean): Self = StObject.set(x, "primary_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_keyUndefined: Self = StObject.set(x, "primary_key", js.undefined)
    
    @scala.inline
    def setUnique(value: `0` | `1` | Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
