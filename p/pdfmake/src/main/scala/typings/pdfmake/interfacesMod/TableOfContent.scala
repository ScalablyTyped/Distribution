package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOfContent extends StObject {
  
  /**
    * ID to differentiate multiple tables of contents:
    * - Without an ID set, a table of content contains all items setting
    *   {@link ContentTocItem.tocItem} to `true`
    * - With an ID set, a table of content contains all items setting
    *   {@link ContentTocItem.tocItem} to its ID
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Style or style reference to apply to the page numbers.
    *
    * Can be overridden per item using {@link ContentTocItem.tocNumberStyle}.
    */
  var numberStyle: js.UndefOr[StyleReference] = js.undefined
  
  /**
    * Margin around each item in `pt`.
    *
    * Can be overridden per item using {@link ContentTocItem.tocMargin}.
    *
    * Defaults to `0`.
    */
  var textMargin: js.UndefOr[Margins] = js.undefined
  
  /**
    * Style or style reference to apply to each item.
    *
    * Can be overridden per item using {@link ContentTocItem.tocStyle}.
    */
  var textStyle: js.UndefOr[StyleReference] = js.undefined
  
  /**
    * Title displayed at the top of the table of contents.
    */
  var title: js.UndefOr[Content] = js.undefined
}
object TableOfContent {
  
  inline def apply(): TableOfContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOfContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableOfContent] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNumberStyle(value: StyleReference): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
    
    inline def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
    
    inline def setNumberStyleVarargs(value: (String | Style)*): Self = StObject.set(x, "numberStyle", js.Array(value*))
    
    inline def setTextMargin(value: Margins): Self = StObject.set(x, "textMargin", value.asInstanceOf[js.Any])
    
    inline def setTextMarginUndefined: Self = StObject.set(x, "textMargin", js.undefined)
    
    inline def setTextStyle(value: StyleReference): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextStyleVarargs(value: (String | Style)*): Self = StObject.set(x, "textStyle", js.Array(value*))
    
    inline def setTitle(value: Content): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: Any*): Self = StObject.set(x, "title", js.Array(value*))
  }
}
