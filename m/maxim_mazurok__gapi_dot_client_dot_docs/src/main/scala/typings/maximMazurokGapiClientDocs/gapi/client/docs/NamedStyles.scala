package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedStyles extends StObject {
  
  /** The named styles. There is an entry for each of the possible named style types. */
  var styles: js.UndefOr[js.Array[NamedStyle]] = js.undefined
}
object NamedStyles {
  
  inline def apply(): NamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStyles]
  }
  
  extension [Self <: NamedStyles](x: Self) {
    
    inline def setStyles(value: js.Array[NamedStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: NamedStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
