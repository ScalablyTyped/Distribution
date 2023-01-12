package typings.monacoEditor.mod.languages.css

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyData extends StObject {
  
  var browsers: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String | MarkupContent] = js.undefined
  
  var name: String
  
  var references: js.UndefOr[js.Array[IReference]] = js.undefined
  
  var relevance: js.UndefOr[Double] = js.undefined
  
  var restrictions: js.UndefOr[js.Array[String]] = js.undefined
  
  var status: js.UndefOr[EntryStatus] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[IValueData]] = js.undefined
}
object IPropertyData {
  
  inline def apply(name: String): IPropertyData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPropertyData] (val x: Self) extends AnyVal {
    
    inline def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
    
    inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
    
    inline def setDescription(value: String | MarkupContent): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[IReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: IReference*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
    
    inline def setRestrictions(value: js.Array[String]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    inline def setRestrictionsVarargs(value: String*): Self = StObject.set(x, "restrictions", js.Array(value*))
    
    inline def setStatus(value: EntryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setValues(value: js.Array[IValueData]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: IValueData*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
