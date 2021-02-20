package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionProto extends StObject {
  
  /** The height, in pixels. Always set. */
  var heightPx: js.UndefOr[Double] = js.native
  
  /** The left side of the rectangle, in pixels. Always set. */
  var leftPx: js.UndefOr[Double] = js.native
  
  /** The top of the rectangle, in pixels. Always set. */
  var topPx: js.UndefOr[Double] = js.native
  
  /** The width, in pixels. Always set. */
  var widthPx: js.UndefOr[Double] = js.native
}
object RegionProto {
  
  @scala.inline
  def apply(): RegionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionProto]
  }
  
  @scala.inline
  implicit class RegionProtoMutableBuilder[Self <: RegionProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeightPx(value: Double): Self = StObject.set(x, "heightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightPxUndefined: Self = StObject.set(x, "heightPx", js.undefined)
    
    @scala.inline
    def setLeftPx(value: Double): Self = StObject.set(x, "leftPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftPxUndefined: Self = StObject.set(x, "leftPx", js.undefined)
    
    @scala.inline
    def setTopPx(value: Double): Self = StObject.set(x, "topPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopPxUndefined: Self = StObject.set(x, "topPx", js.undefined)
    
    @scala.inline
    def setWidthPx(value: Double): Self = StObject.set(x, "widthPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthPxUndefined: Self = StObject.set(x, "widthPx", js.undefined)
  }
}
