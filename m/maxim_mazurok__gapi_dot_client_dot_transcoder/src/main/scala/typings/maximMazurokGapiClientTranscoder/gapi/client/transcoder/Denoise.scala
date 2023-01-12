package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Denoise extends StObject {
  
  /** Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother the image. 0 is no denoising. The default is 0. */
  var strength: js.UndefOr[Double] = js.undefined
  
  /** Set the denoiser mode. The default is `standard`. Supported denoiser modes: - `standard` - `grain` */
  var tune: js.UndefOr[String] = js.undefined
}
object Denoise {
  
  inline def apply(): Denoise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Denoise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Denoise] (val x: Self) extends AnyVal {
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setTune(value: String): Self = StObject.set(x, "tune", value.asInstanceOf[js.Any])
    
    inline def setTuneUndefined: Self = StObject.set(x, "tune", js.undefined)
  }
}
