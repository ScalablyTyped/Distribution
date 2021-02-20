package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageView object, for use in "pageView.set({ ... })". */
@js.native
trait PageViewUpdateData extends StObject {
  
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[Double] = js.native
}
object PageViewUpdateData {
  
  @scala.inline
  def apply(): PageViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageViewUpdateData]
  }
  
  @scala.inline
  implicit class PageViewUpdateDataMutableBuilder[Self <: PageViewUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
