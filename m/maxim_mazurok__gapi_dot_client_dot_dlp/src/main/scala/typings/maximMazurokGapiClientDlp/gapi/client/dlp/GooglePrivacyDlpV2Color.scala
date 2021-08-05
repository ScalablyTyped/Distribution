package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Color extends StObject {
  
  /** The amount of blue in the color as a value in the interval [0, 1]. */
  var blue: js.UndefOr[Double] = js.undefined
  
  /** The amount of green in the color as a value in the interval [0, 1]. */
  var green: js.UndefOr[Double] = js.undefined
  
  /** The amount of red in the color as a value in the interval [0, 1]. */
  var red: js.UndefOr[Double] = js.undefined
}
object GooglePrivacyDlpV2Color {
  
  inline def apply(): GooglePrivacyDlpV2Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Color]
  }
  
  extension [Self <: GooglePrivacyDlpV2Color](x: Self) {
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
