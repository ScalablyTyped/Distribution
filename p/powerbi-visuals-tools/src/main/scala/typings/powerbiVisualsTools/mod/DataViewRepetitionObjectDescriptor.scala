package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewRepetitionObjectDescriptor extends StObject {
  
  /** Properties used for formatting (e.g., Conditional Formatting). */
  var formattingProperties: js.UndefOr[js.Array[String]] = js.undefined
}
object DataViewRepetitionObjectDescriptor {
  
  inline def apply(): DataViewRepetitionObjectDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewRepetitionObjectDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewRepetitionObjectDescriptor] (val x: Self) extends AnyVal {
    
    inline def setFormattingProperties(value: js.Array[String]): Self = StObject.set(x, "formattingProperties", value.asInstanceOf[js.Any])
    
    inline def setFormattingPropertiesUndefined: Self = StObject.set(x, "formattingProperties", js.undefined)
    
    inline def setFormattingPropertiesVarargs(value: String*): Self = StObject.set(x, "formattingProperties", js.Array(value*))
  }
}
