package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLink extends StObject {
  
  var link: js.UndefOr[String] = js.undefined
  
  var linkToDestination: js.UndefOr[String] = js.undefined
  
  var linkToPage: js.UndefOr[Double] = js.undefined
}
object ContentLink {
  
  @scala.inline
  def apply(): ContentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentLink]
  }
  
  @scala.inline
  implicit class ContentLinkMutableBuilder[Self <: ContentLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkToDestination(value: String): Self = StObject.set(x, "linkToDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkToDestinationUndefined: Self = StObject.set(x, "linkToDestination", js.undefined)
    
    @scala.inline
    def setLinkToPage(value: Double): Self = StObject.set(x, "linkToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkToPageUndefined: Self = StObject.set(x, "linkToPage", js.undefined)
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
