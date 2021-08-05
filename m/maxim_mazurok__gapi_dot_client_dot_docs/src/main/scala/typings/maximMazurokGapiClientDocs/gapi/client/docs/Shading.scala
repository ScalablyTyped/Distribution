package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shading extends StObject {
  
  /** The background color of this paragraph shading. */
  var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
}
object Shading {
  
  inline def apply(): Shading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shading]
  }
  
  extension [Self <: Shading](x: Self) {
    
    inline def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
  }
}
