package typings.nodal.mod

import typings.nodal.nodalNumbers.`0`
import typings.nodal.nodalNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnProperties extends StObject {
  
  var array: js.UndefOr[Boolean] = js.undefined
  
  var auto_increment: js.UndefOr[Boolean] = js.undefined
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var length: js.UndefOr[Double | Null] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var primary_key: js.UndefOr[`0` | `1` | Boolean] = js.undefined
  
  var unique: js.UndefOr[`0` | `1` | Boolean] = js.undefined
}
object IColumnProperties {
  
  inline def apply(): IColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnProperties]
  }
  
  extension [Self <: IColumnProperties](x: Self) {
    
    inline def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setAuto_increment(value: Boolean): Self = StObject.set(x, "auto_increment", value.asInstanceOf[js.Any])
    
    inline def setAuto_incrementUndefined: Self = StObject.set(x, "auto_increment", js.undefined)
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setPrimary_key(value: `0` | `1` | Boolean): Self = StObject.set(x, "primary_key", value.asInstanceOf[js.Any])
    
    inline def setPrimary_keyUndefined: Self = StObject.set(x, "primary_key", js.undefined)
    
    inline def setUnique(value: `0` | `1` | Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
