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
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Color]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ColorMutableBuilder[Self <: GooglePrivacyDlpV2Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
