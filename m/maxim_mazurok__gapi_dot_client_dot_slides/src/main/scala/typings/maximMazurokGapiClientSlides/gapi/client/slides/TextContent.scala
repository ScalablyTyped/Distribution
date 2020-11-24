package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextContent extends js.Object {
  
  /** The bulleted lists contained in this text, keyed by list ID. */
  var lists: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.List}
    */ typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.TextContent with TopLevel[js.Any]
  ] = js.native
  
  /** The text contents broken down into its component parts, including styling information. This property is read-only. */
  var textElements: js.UndefOr[js.Array[TextElement]] = js.native
}
object TextContent {
  
  @scala.inline
  def apply(): TextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContent]
  }
  
  @scala.inline
  implicit class TextContentOps[Self <: TextContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLists(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.slides.gapi.client.slides.List}
      */ typings.maximMazurokGapiClientSlides.maximMazurokGapiClientSlidesStrings.TextContent with TopLevel[js.Any]
    ): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    
    @scala.inline
    def setTextElementsVarargs(value: TextElement*): Self = this.set("textElements", js.Array(value :_*))
    
    @scala.inline
    def setTextElements(value: js.Array[TextElement]): Self = this.set("textElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextElements: Self = this.set("textElements", js.undefined)
  }
}
