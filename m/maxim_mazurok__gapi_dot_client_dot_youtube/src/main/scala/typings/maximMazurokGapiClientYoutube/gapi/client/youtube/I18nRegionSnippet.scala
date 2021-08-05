package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait I18nRegionSnippet extends StObject {
  
  /** The region code as a 2-letter ISO country code. */
  var gl: js.UndefOr[String] = js.undefined
  
  /** The human-readable name of the region. */
  var name: js.UndefOr[String] = js.undefined
}
object I18nRegionSnippet {
  
  inline def apply(): I18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18nRegionSnippet]
  }
  
  extension [Self <: I18nRegionSnippet](x: Self) {
    
    inline def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
