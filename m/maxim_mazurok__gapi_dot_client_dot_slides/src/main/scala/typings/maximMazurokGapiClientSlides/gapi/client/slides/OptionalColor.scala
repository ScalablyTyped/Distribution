package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalColor extends StObject {
  
  /** If set, this will be used as an opaque color. If unset, this represents a transparent color. */
  var opaqueColor: js.UndefOr[OpaqueColor] = js.undefined
}
object OptionalColor {
  
  inline def apply(): OptionalColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalColor]
  }
  
  extension [Self <: OptionalColor](x: Self) {
    
    inline def setOpaqueColor(value: OpaqueColor): Self = StObject.set(x, "opaqueColor", value.asInstanceOf[js.Any])
    
    inline def setOpaqueColorUndefined: Self = StObject.set(x, "opaqueColor", js.undefined)
  }
}
