package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library extends StObject {
  
  /**
    * Name of a library (e.g. "sap.ui.core")
    */
  var library: js.UndefOr[String] = js.undefined
}
object Library {
  
  inline def apply(): Library = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Library]
  }
  
  extension [Self <: Library](x: Self) {
    
    inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
  }
}
