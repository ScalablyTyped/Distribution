package typings.monacoEditor.mod.languages.css

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueData extends StObject {
  
  var browsers: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String | MarkupContent] = js.undefined
  
  var name: String
  
  var references: js.UndefOr[js.Array[IReference]] = js.undefined
  
  var status: js.UndefOr[EntryStatus] = js.undefined
}
object IValueData {
  
  inline def apply(name: String): IValueData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueData]
  }
  
  extension [Self <: IValueData](x: Self) {
    
    inline def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setDescription(value: String | MarkupContent): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[IReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: IReference*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setStatus(value: EntryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
