package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopoJSONOptions extends StObject {
  
  var defaultDataProjection: ProjectionLike
}
object TopoJSONOptions {
  
  inline def apply(): TopoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoJSONOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopoJSONOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultDataProjection(value: ProjectionLike): Self = StObject.set(x, "defaultDataProjection", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataProjectionUndefined: Self = StObject.set(x, "defaultDataProjection", js.undefined)
  }
}
