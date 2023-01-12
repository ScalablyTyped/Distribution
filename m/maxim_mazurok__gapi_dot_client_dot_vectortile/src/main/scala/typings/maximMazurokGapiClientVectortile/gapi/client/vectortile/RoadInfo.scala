package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoadInfo extends StObject {
  
  /** Road has signage discouraging or prohibiting use by the general public. E.g., roads with signs that say "Private", or "No trespassing." */
  var isPrivate: js.UndefOr[Boolean] = js.undefined
}
object RoadInfo {
  
  inline def apply(): RoadInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoadInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoadInfo] (val x: Self) extends AnyVal {
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
  }
}
