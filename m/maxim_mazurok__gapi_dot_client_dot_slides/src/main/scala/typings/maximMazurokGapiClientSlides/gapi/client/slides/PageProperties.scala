package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageProperties extends StObject {
  
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
  implicit class PagePropertiesMutableBuilder[Self <: PageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setPageBackgroundFill(value: PageBackgroundFill): Self = StObject.set(x, "pageBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBackgroundFillUndefined: Self = StObject.set(x, "pageBackgroundFill", js.undefined)
  }
}
