package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenotePagePreview extends StObject {
  
  var links: js.UndefOr[NullableOption[OnenotePagePreviewLinks]] = js.undefined
  
  var previewText: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenotePagePreview {
  
  @scala.inline
  def apply(): OnenotePagePreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePagePreview]
  }
  
  @scala.inline
  implicit class OnenotePagePreviewMutableBuilder[Self <: OnenotePagePreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: NullableOption[OnenotePagePreviewLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksNull: Self = StObject.set(x, "links", null)
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setPreviewText(value: NullableOption[String]): Self = StObject.set(x, "previewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewTextNull: Self = StObject.set(x, "previewText", null)
    
    @scala.inline
    def setPreviewTextUndefined: Self = StObject.set(x, "previewText", js.undefined)
  }
}
