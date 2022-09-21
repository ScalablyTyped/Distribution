package typings.nivoCalendar.anon

import typings.nivoCalendar.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BboxBBox extends StObject {
  
  var bbox: BBox
}
object BboxBBox {
  
  inline def apply(bbox: BBox): BboxBBox = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[BboxBBox]
  }
  
  extension [Self <: BboxBBox](x: Self) {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
  }
}
