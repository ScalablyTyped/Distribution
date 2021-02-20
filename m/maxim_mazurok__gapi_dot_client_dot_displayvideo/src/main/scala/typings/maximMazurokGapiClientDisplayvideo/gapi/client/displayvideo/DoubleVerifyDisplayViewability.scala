package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleVerifyDisplayViewability extends StObject {
  
  /** Target web and app inventory to maximize IAB viewable rate. */
  var iab: js.UndefOr[String] = js.native
  
  /** Target web and app inventory to maximize 100% viewable duration. */
  var viewableDuring: js.UndefOr[String] = js.native
}
object DoubleVerifyDisplayViewability {
  
  @scala.inline
  def apply(): DoubleVerifyDisplayViewability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyDisplayViewability]
  }
  
  @scala.inline
  implicit class DoubleVerifyDisplayViewabilityMutableBuilder[Self <: DoubleVerifyDisplayViewability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIab(value: String): Self = StObject.set(x, "iab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIabUndefined: Self = StObject.set(x, "iab", js.undefined)
    
    @scala.inline
    def setViewableDuring(value: String): Self = StObject.set(x, "viewableDuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewableDuringUndefined: Self = StObject.set(x, "viewableDuring", js.undefined)
  }
}
