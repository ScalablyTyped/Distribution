package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18nRegionSnippet extends StObject {
  
  /** The region code as a 2-letter ISO country code. */
  var gl: js.UndefOr[String] = js.native
  
  /** The human-readable name of the region. */
  var name: js.UndefOr[String] = js.native
}
object I18nRegionSnippet {
  
  @scala.inline
  def apply(): I18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nRegionSnippet]
  }
  
  @scala.inline
  implicit class I18nRegionSnippetMutableBuilder[Self <: I18nRegionSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
