package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpCallEvidence extends StObject {
  
  /** URLs of HTTP calls made by the creative. */
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object HttpCallEvidence {
  
  @scala.inline
  def apply(): HttpCallEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCallEvidence]
  }
  
  @scala.inline
  implicit class HttpCallEvidenceMutableBuilder[Self <: HttpCallEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
