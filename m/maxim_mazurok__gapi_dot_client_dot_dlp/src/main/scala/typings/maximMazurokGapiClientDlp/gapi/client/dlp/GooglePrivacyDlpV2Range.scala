package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Range extends StObject {
  
  /** Index of the last character of the range (exclusive). */
  var end: js.UndefOr[String] = js.undefined
  
  /** Index of the first character of the range (inclusive). */
  var start: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2Range {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Range]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RangeMutableBuilder[Self <: GooglePrivacyDlpV2Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
