package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @targetfolder objects/returnobjects
  * @minVersion 23.0
  */
trait LayerTreeInfo extends StObject {
  
  /**
    * @minVersion 23.0
    */
  var kind: String
  
  /**
    * @minVersion 23.0
    */
  var layerID: Double
  
  /**
    * @minVersion 23.0
    */
  var layers: js.UndefOr[js.Array[LayerTreeInfo]] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var name: String
}
object LayerTreeInfo {
  
  inline def apply(kind: String, layerID: Double, name: String): LayerTreeInfo = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], layerID = layerID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerTreeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerTreeInfo] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLayerID(value: Double): Self = StObject.set(x, "layerID", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[LayerTreeInfo]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: LayerTreeInfo*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
