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
@JSImport("playcanvas", "BatchGroup")
@js.native
open class BatchGroup protected () extends StObject {
  /**
    * Create a new BatchGroup instance.
    *
    * @param {number} id - Unique id. Can be assigned to model and element components.
    * @param {string} name - The name of the group.
    * @param {boolean} dynamic - Whether objects within this batch group should support
    * transforming at runtime.
    * @param {number} maxAabbSize - Maximum size of any dimension of a bounding box around batched
    * objects. {@link BatchManager#prepare} will split objects into local groups based on this
    * size.
    * @param {number[]} [layers] - Layer ID array. Default is [{@link LAYERID_WORLD}]. The whole
    * batch group will belong to these layers. Layers of source models will be ignored.
    */
  def this(id: Double, name: String, dynamic: Boolean, maxAabbSize: Double) = this()
  def this(id: Double, name: String, dynamic: Boolean, maxAabbSize: Double, layers: js.Array[Double]) = this()
  
  var _obj: Element = js.native
  
  var _sprite: Boolean = js.native
  
  var _ui: Boolean = js.native
  
  var dynamic: Boolean = js.native
  
  var id: Double = js.native
  
  var layers: js.Array[Double] = js.native
  
  var maxAabbSize: Double = js.native
  
  var name: String = js.native
}
object BatchGroup {
  
  @JSImport("playcanvas", "BatchGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("playcanvas", "BatchGroup.ELEMENT")
  @js.native
  def ELEMENT: String = js.native
  inline def ELEMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("playcanvas", "BatchGroup.MODEL")
  @js.native
  def MODEL: String = js.native
  inline def MODEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("playcanvas", "BatchGroup.RENDER")
  @js.native
  def RENDER: String = js.native
  inline def RENDER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RENDER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("playcanvas", "BatchGroup.SPRITE")
  @js.native
  def SPRITE: String = js.native
  inline def SPRITE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPRITE")(x.asInstanceOf[js.Any])
}
