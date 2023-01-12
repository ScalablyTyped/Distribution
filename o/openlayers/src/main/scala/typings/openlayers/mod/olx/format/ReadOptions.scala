package typings.openlayers.mod.olx.format

import typings.openlayers.mod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOptions extends StObject {
  
  var dataProjection: ProjectionLike
  
  var featureProjection: ProjectionLike
}
object ReadOptions {
  
  inline def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
    
    inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
    
    inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
    
    inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
  }
}
