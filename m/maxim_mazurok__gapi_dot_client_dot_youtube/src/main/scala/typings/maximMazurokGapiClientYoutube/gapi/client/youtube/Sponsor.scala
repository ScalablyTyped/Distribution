package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sponsor extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string `"youtube#sponsor"`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The `snippet` object contains basic details about the sponsor. */
  var snippet: js.UndefOr[SponsorSnippet] = js.undefined
}
object Sponsor {
  
  @scala.inline
  def apply(): Sponsor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sponsor]
  }
  
  @scala.inline
  implicit class SponsorMutableBuilder[Self <: Sponsor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSnippet(value: SponsorSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
