package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StringDictionary
import typings.powerbiVisualsTools.mod.data.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualObjectInstance extends StObject {
  
  /** (Optional) VisualObjectInstanceEnumeration category index. */
  var containerIdx: js.UndefOr[Double] = js.undefined
  
  /** A display name for the object instance. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The name of the object (as defined in VisualCapabilities). */
  var objectName: String
  
  /** The set of property values for this object.  Some of these properties may be defaults provided by the IVisual. */
  var properties: StringDictionary[DataViewPropertyValue]
  
  /** (Optional) Set the required type for particular properties that support variant types. */
  var propertyTypes: js.UndefOr[StringDictionary[ValueTypeDescriptor]] = js.undefined
  
  /** The selector that identifies this object. */
  var selector: Selector
  
  /** (Optional) Defines the constrained set of valid values for a property. */
  var validValues: js.UndefOr[StringDictionary[js.Array[String] | ValidationOptions]] = js.undefined
}
object VisualObjectInstance {
  
  inline def apply(objectName: String, properties: StringDictionary[DataViewPropertyValue], selector: Selector): VisualObjectInstance = {
    val __obj = js.Dynamic.literal(objectName = objectName.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualObjectInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualObjectInstance] (val x: Self) extends AnyVal {
    
    inline def setContainerIdx(value: Double): Self = StObject.set(x, "containerIdx", value.asInstanceOf[js.Any])
    
    inline def setContainerIdxUndefined: Self = StObject.set(x, "containerIdx", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[DataViewPropertyValue]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertyTypes(value: StringDictionary[ValueTypeDescriptor]): Self = StObject.set(x, "propertyTypes", value.asInstanceOf[js.Any])
    
    inline def setPropertyTypesUndefined: Self = StObject.set(x, "propertyTypes", js.undefined)
    
    inline def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setValidValues(value: StringDictionary[js.Array[String] | ValidationOptions]): Self = StObject.set(x, "validValues", value.asInstanceOf[js.Any])
    
    inline def setValidValuesUndefined: Self = StObject.set(x, "validValues", js.undefined)
  }
}
