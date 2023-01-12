package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalIndex extends StObject {
  
  var fieldName: String
  
  var originalIndex: Double
}
object OriginalIndex {
  
  inline def apply(fieldName: String, originalIndex: Double): OriginalIndex = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], originalIndex = originalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginalIndex] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setOriginalIndex(value: Double): Self = StObject.set(x, "originalIndex", value.asInstanceOf[js.Any])
  }
}
