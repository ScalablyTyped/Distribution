package typings.openlayers.mod.olx.format

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsriJSONOptions extends StObject {
  
  var geometryName: js.UndefOr[String] = js.native
}
object EsriJSONOptions {
  
  @scala.inline
  def apply(): EsriJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsriJSONOptions]
  }
  
  @scala.inline
  implicit class EsriJSONOptionsMutableBuilder[Self <: EsriJSONOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
  }
}
