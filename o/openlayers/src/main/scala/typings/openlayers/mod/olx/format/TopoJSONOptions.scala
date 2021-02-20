package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopoJSONOptions extends StObject {
  
  var defaultDataProjection: ProjectionLike = js.native
}
object TopoJSONOptions {
  
  @scala.inline
  def apply(): TopoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoJSONOptions]
  }
  
  @scala.inline
  implicit class TopoJSONOptionsMutableBuilder[Self <: TopoJSONOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDataProjection(value: ProjectionLike): Self = StObject.set(x, "defaultDataProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDataProjectionUndefined: Self = StObject.set(x, "defaultDataProjection", js.undefined)
  }
}
