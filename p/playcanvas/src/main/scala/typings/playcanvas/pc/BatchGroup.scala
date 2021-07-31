package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds mesh batching settings and a unique id. Created via {@link pc.BatchManager#addGroup}.
  * @property dynamic - Whether objects within this batch group should support transforming at runtime.
  * @property maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @property id - Unique id. Can be assigned to model and element components.
  * @property name - Name of the group.
  * @property [layers] - Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  * @param id - Unique id. Can be assigned to model and element components.
  * @param name - The name of the group.
  * @param dynamic - Whether objects within this batch group should support transforming at runtime.
  * @param maxAabbSize - Maximum size of any dimension of a bounding box around batched objects.
  * {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
  * @param [layers] - Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
  * to these layers. Layers of source models will be ignored.
  */
trait BatchGroup extends StObject {
  
  /**
    * Whether objects within this batch group should support transforming at runtime.
    */
  var dynamic: Boolean
  
  /**
    * Unique id. Can be assigned to model and element components.
    */
  var id: Double
  
  /**
    * Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
    to these layers. Layers of source models will be ignored.
    */
  var layers: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Maximum size of any dimension of a bounding box around batched objects.
    {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
    */
  var maxAabbSize: Double
  
  /**
    * Name of the group.
    */
  var name: String
}
object BatchGroup {
  
  @scala.inline
  def apply(dynamic: Boolean, id: Double, maxAabbSize: Double, name: String): BatchGroup = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxAabbSize = maxAabbSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGroup]
  }
  
  @scala.inline
  implicit class BatchGroupMutableBuilder[Self <: BatchGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayers(value: js.Array[Double]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Double*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setMaxAabbSize(value: Double): Self = StObject.set(x, "maxAabbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
