package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordArt extends js.Object {
  
  /** The text rendered as word art. */
  var renderedText: js.UndefOr[String] = js.native
}
object WordArt {
  
  @scala.inline
  def apply(): WordArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordArt]
  }
  
  @scala.inline
  implicit class WordArtOps[Self <: WordArt] (val x: Self) extends AnyVal {
    
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
    def setRenderedText(value: String): Self = this.set("renderedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderedText: Self = this.set("renderedText", js.undefined)
  }
}
