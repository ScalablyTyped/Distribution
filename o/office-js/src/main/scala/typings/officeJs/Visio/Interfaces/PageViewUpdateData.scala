package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PageView object, for use in `pageView.set({ ... })`. */
trait PageViewUpdateData extends StObject {
  
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object PageViewUpdateData {
  
  inline def apply(): PageViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageViewUpdateData]
  }
  
  extension [Self <: PageViewUpdateData](x: Self) {
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
