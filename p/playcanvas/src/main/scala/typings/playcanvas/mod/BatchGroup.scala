package typings.playcanvas.mod

import typings.playcanvas.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds mesh batching settings and a unique id. Created via {@link BatchManager#addGroup}.
  *
  * @property {boolean} dynamic Whether objects within this batch group should support transforming
  * at runtime.
  * @property {number} maxAabbSize Maximum size of any dimension of a bounding box around batched
  * objects. {@link BatchManager#prepare} will split objects into local groups based on this size.
  * @property {number} id Unique id. Can be assigned to model and element components.
  * @property {string} name Name of the group.
  * @property {number[]} [layers] Layer ID array. Default is [{@link LAYERID_WORLD}]. The whole
  * batch group will belong to these layers. Layers of source models will be ignored.
  */
trait BatchGroup extends StObject {
  
  var _obj: Element
  
  var _sprite: Boolean
  
  var _ui: Boolean
  
  var dynamic: Boolean
  
  var id: Double
  
  var layers: js.Array[Double]
  
  var maxAabbSize: Double
  
  var name: String
}
object BatchGroup {
  
  inline def apply(
    _obj: Element,
    _sprite: Boolean,
    _ui: Boolean,
    dynamic: Boolean,
    id: Double,
    layers: js.Array[Double],
    maxAabbSize: Double,
    name: String
  ): BatchGroup = {
    val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any], _sprite = _sprite.asInstanceOf[js.Any], _ui = _ui.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], maxAabbSize = maxAabbSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGroup]
  }
  
  extension [Self <: BatchGroup](x: Self) {
    
    inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLayers(value: js.Array[Double]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: Double*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setMaxAabbSize(value: Double): Self = StObject.set(x, "maxAabbSize", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_obj(value: Element): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    
    inline def set_sprite(value: Boolean): Self = StObject.set(x, "_sprite", value.asInstanceOf[js.Any])
    
    inline def set_ui(value: Boolean): Self = StObject.set(x, "_ui", value.asInstanceOf[js.Any])
  }
}
