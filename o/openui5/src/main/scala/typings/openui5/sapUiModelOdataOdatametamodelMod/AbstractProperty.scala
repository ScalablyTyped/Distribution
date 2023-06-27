package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.`false`
import typings.openui5.openui5Strings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractProperty
  extends StObject
     with Annotatable {
  
  /**
    * The default value of the property
    */
  var default: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the property
    */
  var name: String
  
  /**
    * Whether this property can be `null`
    */
  var nullable: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * Whether this property is read-only
    */
  var readOnly: js.UndefOr[`false` | `true`] = js.undefined
}
object AbstractProperty {
  
  inline def apply(name: String): AbstractProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbstractProperty] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNullable(value: `false` | `true`): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setReadOnly(value: `false` | `true`): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
