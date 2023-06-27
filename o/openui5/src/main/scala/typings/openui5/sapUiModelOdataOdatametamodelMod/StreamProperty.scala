package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotStream
import typings.openui5.openui5Strings.`false`
import typings.openui5.openui5Strings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * Whether the stream requires a fixed length
    */
  var fixedLength: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * The maximal length of the stream
    */
  var maxLength: js.UndefOr[String] = js.undefined
  
  /**
    * The type name
    */
  var `type`: EdmDotStream
}
object StreamProperty {
  
  inline def apply(name: String): StreamProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Stream")
    __obj.asInstanceOf[StreamProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamProperty] (val x: Self) extends AnyVal {
    
    inline def setFixedLength(value: `false` | `true`): Self = StObject.set(x, "fixedLength", value.asInstanceOf[js.Any])
    
    inline def setFixedLengthUndefined: Self = StObject.set(x, "fixedLength", js.undefined)
    
    inline def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setType(value: EdmDotStream): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
