package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextContent extends StObject {
  
  /** The bulleted lists contained in this text, keyed by list ID. */
  var lists: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.List}
    */ typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.TextContent & TopLevel[js.Any]
  ] = js.undefined
  
  /** The text contents broken down into its component parts, including styling information. This property is read-only. */
  var textElements: js.UndefOr[js.Array[TextElement]] = js.undefined
}
object TextContent {
  
  inline def apply(): TextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContent]
  }
  
  extension [Self <: TextContent](x: Self) {
    
    inline def setLists(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.List}
      */ typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.TextContent & TopLevel[js.Any]
    ): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    inline def setTextElements(value: js.Array[TextElement]): Self = StObject.set(x, "textElements", value.asInstanceOf[js.Any])
    
    inline def setTextElementsUndefined: Self = StObject.set(x, "textElements", js.undefined)
    
    inline def setTextElementsVarargs(value: TextElement*): Self = StObject.set(x, "textElements", js.Array(value :_*))
  }
}
