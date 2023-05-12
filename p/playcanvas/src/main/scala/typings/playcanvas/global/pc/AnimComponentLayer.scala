package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Anim Component Layer allows managers a single layer of the animation state graph.
  */
@JSGlobal("pc.AnimComponentLayer")
@js.native
open class AnimComponentLayer protected ()
  extends typings.playcanvas.mod.AnimComponentLayer {
  /**
    * Create a new AnimComponentLayer instance.
    *
    * @param {string} name - The name of the layer.
    * @param {object} controller - The controller to manage this layers animations.
    * @param {import('./component.js').AnimComponent} component - The component that this layer is
    * a member of.
    * @param {number} [weight] - The weight of this layer. Defaults to 1.
    * @param {string} [blendType] - The blend type of this layer. Defaults to {@link ANIM_LAYER_OVERWRITE}.
    * @param {boolean} [normalizedWeight] - Whether the weight of this layer should be normalized
    * using the total weight of all layers.
    */
  def this(name: String, controller: js.Object, component: typings.playcanvas.mod.AnimComponent) = this()
  def this(
    name: String,
    controller: js.Object,
    component: typings.playcanvas.mod.AnimComponent,
    weight: Double
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: typings.playcanvas.mod.AnimComponent,
    weight: Double,
    blendType: String
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: typings.playcanvas.mod.AnimComponent,
    weight: Unit,
    blendType: String
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: typings.playcanvas.mod.AnimComponent,
    weight: Double,
    blendType: String,
    normalizedWeight: Boolean
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: typings.playcanvas.mod.AnimComponent,
    weight: Double,
    blendType: Unit,
    normalizedWeight: Boolean
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: typings.playcanvas.mod.AnimComponent,
    weight: Unit,
    blendType: String,
    normalizedWeight: Boolean
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: typings.playcanvas.mod.AnimComponent,
    weight: Unit,
    blendType: Unit,
    normalizedWeight: Boolean
  ) = this()
}
