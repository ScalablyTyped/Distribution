package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoRegionSearchTerms extends StObject {
  
  /** The search query for the desired geo region. The query can be a prefix, e.g. "New Yor", "Seattle", "USA", etc. */
  var geoRegionQuery: js.UndefOr[String] = js.undefined
}
object GeoRegionSearchTerms {
  
  inline def apply(): GeoRegionSearchTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoRegionSearchTerms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoRegionSearchTerms] (val x: Self) extends AnyVal {
    
    inline def setGeoRegionQuery(value: String): Self = StObject.set(x, "geoRegionQuery", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionQueryUndefined: Self = StObject.set(x, "geoRegionQuery", js.undefined)
  }
}
