package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pageView.toJSON()`. */
trait PageViewData extends StObject {
  
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object PageViewData {
  
  inline def apply(): PageViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageViewData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageViewData] (val x: Self) extends AnyVal {
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
