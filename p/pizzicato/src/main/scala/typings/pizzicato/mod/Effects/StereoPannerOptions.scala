package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The stereo panner is used to adjust the level of a sound through
  * the left and right speakers.
  */
trait StereoPannerOptions extends StObject {
  
  /**
    * Pan value between -1 (full left pan) and 1 (full right pan).
    * Defaults to zero.
    */
  var pan: js.UndefOr[Double] = js.undefined
}
object StereoPannerOptions {
  
  inline def apply(): StereoPannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StereoPannerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StereoPannerOptions] (val x: Self) extends AnyVal {
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
  }
}
