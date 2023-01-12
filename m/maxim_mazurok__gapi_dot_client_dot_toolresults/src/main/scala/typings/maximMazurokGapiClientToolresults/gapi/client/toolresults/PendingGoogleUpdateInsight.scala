package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingGoogleUpdateInsight extends StObject {
  
  /** The name of the Google-provided library with the non-SDK API dependency. */
  var nameOfGoogleLibrary: js.UndefOr[String] = js.undefined
}
object PendingGoogleUpdateInsight {
  
  inline def apply(): PendingGoogleUpdateInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingGoogleUpdateInsight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingGoogleUpdateInsight] (val x: Self) extends AnyVal {
    
    inline def setNameOfGoogleLibrary(value: String): Self = StObject.set(x, "nameOfGoogleLibrary", value.asInstanceOf[js.Any])
    
    inline def setNameOfGoogleLibraryUndefined: Self = StObject.set(x, "nameOfGoogleLibrary", js.undefined)
  }
}
