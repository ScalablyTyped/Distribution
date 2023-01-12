package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageObjectModel extends StObject {
  
  var commands: js.UndefOr[Any] = js.undefined
  
  var elements: js.UndefOr[PageElements] = js.undefined
  
  var props: js.UndefOr[Any] = js.undefined
  
  var sections: js.UndefOr[EnhancedPageObjectSections] = js.undefined
  
  var url: js.UndefOr[String | (js.Function1[/* args */ Any, String])] = js.undefined
}
object PageObjectModel {
  
  inline def apply(): PageObjectModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageObjectModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageObjectModel] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: Any): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setElements(value: PageElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setSections(value: EnhancedPageObjectSections): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setUrl(value: String | (js.Function1[/* args */ Any, String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlFunction1(value: /* args */ Any => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
