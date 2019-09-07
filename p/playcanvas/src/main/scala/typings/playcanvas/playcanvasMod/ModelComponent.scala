package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.ModelComponent
  * @classdesc Enables an Entity to render a model or a primitive shape. This Component attaches additional model
  * geometry in to the scene graph below the Entity.
  * @description Create a new ModelComponent
  * @param {pc.ModelComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @extends pc.Component
  * @property {String} type The type of the model, which can be one of the following values:
  * <ul>
  *     <li>asset: The component will render a model asset</li>
  *     <li>box: The component will render a box (1 unit in each dimension)</li>
  *     <li>capsule: The component will render a capsule (radius 0.5, height 2)</li>
  *     <li>cone: The component will render a cone (radius 0.5, height 1)</li>
  *     <li>cylinder: The component will render a cylinder (radius 0.5, height 1)</li>
  *     <li>plane: The component will render a plane (1 unit in each dimension)</li>
  *     <li>sphere: The component will render a sphere (radius 0.5)</li>
  * </ul>
  * @property {pc.Asset|Number} asset The asset for the model (only applies to models of type 'asset') - can also be an asset id.
  * @property {Boolean} castShadows If true, this model will cast shadows for lights that have shadow casting enabled.
  * @property {Boolean} receiveShadows If true, shadows will be cast on this model
  * @property {Number} materialAsset The material {@link pc.Asset} that will be used to render the model (not used on models of type 'asset')
  * @property {pc.Model} model The model that is added to the scene graph. It can be not set or loaded, so will return null.
  * @property {Object} mapping A dictionary that holds material overrides for each mesh instance. Only applies to model components of type 'asset'. The mapping contains pairs of mesh instance index - material asset id.
  * @property {Boolean} castShadowsLightmap If true, this model will cast shadows when rendering lightmaps
  * @property {Boolean} lightmapped If true, this model will be lightmapped after using lightmapper.bake()
  * @property {Number} lightmapSizeMultiplier Lightmap resolution multiplier
  * @property {Boolean} isStatic Mark model as non-movable (optimization)
  * @property {pc.MeshInstance[]} meshInstances An array of meshInstances contained in the component's model. If model is not set or loaded for component it will return null.
  * @property {Number} batchGroupId Assign model to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property {Number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this model should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  */
@JSImport("playcanvas", "ModelComponent")
@js.native
class ModelComponent protected ()
  extends typings.playcanvas.pcNs.ModelComponent {
  def this(system: typings.playcanvas.pcNs.ModelComponentSystem, entity: typings.playcanvas.pcNs.Entity) = this()
}

