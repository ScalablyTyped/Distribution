package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationMillis extends StObject {
  
  /** The duration of the video in milliseconds. */
  var durationMillis: js.UndefOr[String] = js.native
  
  /** The height of the video in pixels. */
  var height: js.UndefOr[Double] = js.native
  
  /** The width of the video in pixels. */
  var width: js.UndefOr[Double] = js.native
}
object DurationMillis {
  
  @scala.inline
  def apply(): DurationMillis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationMillis]
  }
  
  @scala.inline
  implicit class DurationMillisMutableBuilder[Self <: DurationMillis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
