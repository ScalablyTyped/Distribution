package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundImageLink extends StObject {
  
  /** Deprecated - use driveThemes/backgroundImageLink instead. */
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  
  /** Deprecated - use driveThemes/colorRgb instead. */
  var colorRgb: js.UndefOr[String] = js.undefined
  
  /** Deprecated - use driveThemes/id instead. */
  var id: js.UndefOr[String] = js.undefined
}
object BackgroundImageLink {
  
  inline def apply(): BackgroundImageLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundImageLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundImageLink] (val x: Self) extends AnyVal {
    
    inline def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
    
    inline def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
    
    inline def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
