package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldName extends StObject {
  
  var fieldName: String
  
  var fieldType: String
  
  var gridName: String
  
  var interactionName: String
  
  var processKey: Double
}
object FieldName {
  
  inline def apply(
    fieldName: String,
    fieldType: String,
    gridName: String,
    interactionName: String,
    processKey: Double
  ): FieldName = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], gridName = gridName.asInstanceOf[js.Any], interactionName = interactionName.asInstanceOf[js.Any], processKey = processKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldName] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldType(value: String): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    inline def setGridName(value: String): Self = StObject.set(x, "gridName", value.asInstanceOf[js.Any])
    
    inline def setInteractionName(value: String): Self = StObject.set(x, "interactionName", value.asInstanceOf[js.Any])
    
    inline def setProcessKey(value: Double): Self = StObject.set(x, "processKey", value.asInstanceOf[js.Any])
  }
}
