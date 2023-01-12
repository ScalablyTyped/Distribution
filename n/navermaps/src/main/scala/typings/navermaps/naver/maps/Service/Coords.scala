package typings.navermaps.naver.maps.Service

import typings.navermaps.anon.Crs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coords extends StObject {
  
  var center: Crs
}
object Coords {
  
  inline def apply(center: Crs): Coords = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coords] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Crs): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
