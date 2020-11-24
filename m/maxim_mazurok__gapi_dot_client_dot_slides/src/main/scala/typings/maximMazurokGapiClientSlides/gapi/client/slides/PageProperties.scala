package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageProperties extends js.Object {
  
  /**
    * The color scheme of the page. If unset, the color scheme is inherited from a parent page. If the page has no parent, the color scheme uses a default Slides color scheme, matching
    * the defaults in the Slides editor. Only the concrete colors of the first 12 ThemeColorTypes are editable. In addition, only the color scheme on `Master` pages can be updated. To
    * update the field, a color scheme containing mappings from all the first 12 ThemeColorTypes to their concrete colors must be provided. Colors for the remaining ThemeColorTypes will
    * be ignored.
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.native
  
  /**
    * The background fill of the page. If unset, the background fill is inherited from a parent page if it exists. If the page has no parent, then the background fill defaults to the
    * corresponding fill in the Slides editor.
    */
  var pageBackgroundFill: js.UndefOr[PageBackgroundFill] = js.native
}
object PageProperties {
  
  @scala.inline
  def apply(): PageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageProperties]
  }
  
  @scala.inline
  implicit class PagePropertiesOps[Self <: PageProperties] (val x: Self) extends AnyVal {
    
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
    def setColorScheme(value: ColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    
    @scala.inline
    def setPageBackgroundFill(value: PageBackgroundFill): Self = this.set("pageBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBackgroundFill: Self = this.set("pageBackgroundFill", js.undefined)
  }
}
