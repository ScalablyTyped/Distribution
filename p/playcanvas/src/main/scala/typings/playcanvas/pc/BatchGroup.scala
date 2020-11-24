package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait BatchGroup extends js.Object {
  
  /**
    * Whether objects within this batch group should support transforming at runtime.
    */
  var dynamic: Boolean = js.native
  
  /**
    * Unique id. Can be assigned to model and element components.
    */
  var id: Double = js.native
  
  /**
    * Layer ID array. Default is [pc.LAYERID_WORLD]. The whole batch group will belong
    to these layers. Layers of source models will be ignored.
    */
  var layers: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Maximum size of any dimension of a bounding box around batched objects.
    {@link pc.BatchManager#prepare} will split objects into local groups based on this size.
    */
  var maxAabbSize: Double = js.native
  
  /**
    * Name of the group.
    */
  var name: String = js.native
}
object BatchGroup {
  
  @scala.inline
  def apply(dynamic: Boolean, id: Double, maxAabbSize: Double, name: String): BatchGroup = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxAabbSize = maxAabbSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGroup]
  }
  
  @scala.inline
  implicit class BatchGroupOps[Self <: BatchGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAabbSize(value: Double): Self = this.set("maxAabbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: Double*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Double]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
}
