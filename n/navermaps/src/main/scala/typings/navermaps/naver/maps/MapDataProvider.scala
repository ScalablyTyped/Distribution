package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapDataProvider
  */
trait MapDataProvider extends StObject {
  
  var bounds: js.UndefOr[Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var title: String
}
object MapDataProvider {
  
  inline def apply(title: String): MapDataProvider = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapDataProvider] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: (LatLngBounds | LatLngBoundsLiteral | PointBounds | PointBoundsLiteral)*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
