package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DocumentLocation extends StObject {
  
  /** Offset of the line, from the beginning of the file, where the finding is located. */
  var fileOffset: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2DocumentLocation {
  
  inline def apply(): GooglePrivacyDlpV2DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DocumentLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2DocumentLocation] (val x: Self) extends AnyVal {
    
    inline def setFileOffset(value: String): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
    
    inline def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
  }
}
