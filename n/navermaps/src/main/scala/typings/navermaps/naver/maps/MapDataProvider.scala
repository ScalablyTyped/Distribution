package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapDataProvider extends StObject {
  
  var bounds: js.UndefOr[Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var title: String
}
object MapDataProvider {
  
  @scala.inline
  def apply(title: String): MapDataProvider = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataProvider]
  }
  
  @scala.inline
  implicit class MapDataProviderMutableBuilder[Self <: MapDataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: (LatLngBounds | LatLngBoundsLiteral | PointBounds | PointBoundsLiteral)*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
