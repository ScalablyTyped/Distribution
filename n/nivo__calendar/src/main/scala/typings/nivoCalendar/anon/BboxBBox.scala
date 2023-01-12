package typings.nivoCalendar.anon

import typings.nivoCalendar.distTypesTypesMod.BBox
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BboxBBox] (val x: Self) extends AnyVal {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
  }
}
