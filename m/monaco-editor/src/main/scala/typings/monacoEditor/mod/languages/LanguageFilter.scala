package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageFilter extends StObject {
  
  val exclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This provider is implemented in the UI thread.
    */
  val hasAccessToAllModels: js.UndefOr[Boolean] = js.undefined
  
  val language: js.UndefOr[String] = js.undefined
  
  val notebookType: js.UndefOr[String] = js.undefined
  
  val pattern: js.UndefOr[String | IRelativePattern] = js.undefined
  
  val scheme: js.UndefOr[String] = js.undefined
}
object LanguageFilter {
  
  inline def apply(): LanguageFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageFilter] (val x: Self) extends AnyVal {
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setHasAccessToAllModels(value: Boolean): Self = StObject.set(x, "hasAccessToAllModels", value.asInstanceOf[js.Any])
    
    inline def setHasAccessToAllModelsUndefined: Self = StObject.set(x, "hasAccessToAllModels", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNotebookType(value: String): Self = StObject.set(x, "notebookType", value.asInstanceOf[js.Any])
    
    inline def setNotebookTypeUndefined: Self = StObject.set(x, "notebookType", js.undefined)
    
    inline def setPattern(value: String | IRelativePattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
