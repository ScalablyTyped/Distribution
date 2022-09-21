package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLink extends StObject {
  
  /**
    * URL to open when the element is clicked on.
    *
    * Use in combination with a `text` or `image` property.
    */
  var link: js.UndefOr[String] = js.undefined
  
  /**
    * `id` of an element to jump to when the element is clicked on.
    *
    * Use in combination with a `text` or `image` property.
    *
    * - To display the target element's content, use `textReference` instead.
    * - To display the target element's page number, use `pageReference` instead.
    *
    * To link to a fixed page number (without a reference target), use `linkToPage` instead.
    */
  var linkToDestination: js.UndefOr[String] = js.undefined
  
  /**
    * Page to jump to when the element is clicked on.
    *
    * Use in combination with a `text` or `image` property.
    *
    * To link to another element, use {@link linkToDestination}, `textReference`
    * or `pageReference` instead.
    */
  var linkToPage: js.UndefOr[Double] = js.undefined
}
object ContentLink {
  
  inline def apply(): ContentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentLink]
  }
  
  extension [Self <: ContentLink](x: Self) {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
    
    inline def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
    
    inline def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
    
    inline def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
