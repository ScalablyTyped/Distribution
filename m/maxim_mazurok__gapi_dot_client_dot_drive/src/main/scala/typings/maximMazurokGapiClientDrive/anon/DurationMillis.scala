package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationMillis extends StObject {
  
  /** The duration of the video in milliseconds. */
  var durationMillis: js.UndefOr[String] = js.undefined
  
  /** The height of the video in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The width of the video in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}
object DurationMillis {
  
  inline def apply(): DurationMillis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationMillis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurationMillis] (val x: Self) extends AnyVal {
    
    inline def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
