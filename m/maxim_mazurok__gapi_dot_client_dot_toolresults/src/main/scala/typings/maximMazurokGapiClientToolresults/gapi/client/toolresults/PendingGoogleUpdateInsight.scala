package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingGoogleUpdateInsight extends StObject {
  
  /** The name of the Google-provided library with the non-SDK API dependency. */
  var nameOfGoogleLibrary: js.UndefOr[String] = js.native
}
object PendingGoogleUpdateInsight {
  
  @scala.inline
  def apply(): PendingGoogleUpdateInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingGoogleUpdateInsight]
  }
  
  @scala.inline
  implicit class PendingGoogleUpdateInsightMutableBuilder[Self <: PendingGoogleUpdateInsight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameOfGoogleLibrary(value: String): Self = StObject.set(x, "nameOfGoogleLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOfGoogleLibraryUndefined: Self = StObject.set(x, "nameOfGoogleLibrary", js.undefined)
  }
}
