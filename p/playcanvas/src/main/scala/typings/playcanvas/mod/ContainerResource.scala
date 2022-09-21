package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/entity.js').Entity} Entity */
/** @typedef {import('../scene/mesh-instance').MeshInstance} MeshInstance */
/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/** @typedef {import('./handler.js').ResourceHandlerCallback} ResourceHandlerCallback */
/**
  * @interface
  * @name ContainerResource
  * @description Container for a list of animations, textures, materials, renders and a model.
  */
@JSImport("playcanvas", "ContainerResource")
@js.native
open class ContainerResource () extends StObject {
  
  /**
    * Applies a material variant to an entity hierarchy.
    *
    * @param {Entity} entity - The entity root to which material variants will be applied
    * @param {string} [name] - The name of the variant, as queried from getMaterialVariants,
    * if null the variant will be reset to the default
    * @example
    * // load a glb file and instantiate an entity with a render component based on it
    * app.assets.loadFromUrl("statue.glb", "container", function (err, asset) {
    *     var entity = asset.resource.instantiateRenderEntity({
    *         castShadows: true
    *     });
    *     app.root.addChild(entity);
    *     var materialVariants = asset.resource.getMaterialVariants();
    *     asset.resource.applyMaterialVariant(entity, materialVariants[0]);
    */
  def applyMaterialVariant(entity: Entity): Unit = js.native
  def applyMaterialVariant(entity: Entity, name: String): Unit = js.native
  
  /**
    * Applies a material variant to a set of mesh instances. Compared to the applyMaterialVariant,
    * this method allows for setting the variant on a specific set of mesh instances instead of the
    * whole entity.
    *
    * @param {MeshInstance[]} instances - An array of mesh instances
    * @param {string} [name] - The the name of the variant, as quered from getMaterialVariants,
    * if null the variant will be reset to the default
    * @example
    * // load a glb file and instantiate an entity with a render component based on it
    * app.assets.loadFromUrl("statue.glb", "container", function (err, asset) {
    *     var entity = asset.resource.instantiateRenderEntity({
    *         castShadows: true
    *     });
    *     app.root.addChild(entity);
    *     var materialVariants = asset.resource.getMaterialVariants();
    *     var renders = entity.findComponents("render");
    *     for (var i = 0; i < renders.length; i++) {
    *         var renderComponent = renders[i];
    *         asset.resource.applyMaterialVariantInstances(renderComponent.meshInstances, materialVariants[0]);
    *     }
    */
  def applyMaterialVariantInstances(instances: js.Array[MeshInstance]): Unit = js.native
  def applyMaterialVariantInstances(instances: js.Array[MeshInstance], name: String): Unit = js.native
  
  /**
    * Queries the list of available material variants.
    *
    * @returns {string[]} An array of variant names.
    */
  def getMaterialVariants(): js.Array[String] = js.native
  
  /**
    * Instantiates an entity with a model component.
    *
    * @param {object} [options] - The initialization data for the model component type
    * {@link ModelComponent}.
    * @returns {Entity} A single entity with a model component. Model component internally
    * contains a hierarchy based on {@link GraphNode}.
    * @example
    * // load a glb file and instantiate an entity with a model component based on it
    * app.assets.loadFromUrl("statue.glb", "container", function (err, asset) {
    *     var entity = asset.resource.instantiateModelEntity({
    *         castShadows: true
    *     });
    *     app.root.addChild(entity);
    * });
    */
  def instantiateModelEntity(): Entity = js.native
  def instantiateModelEntity(options: js.Object): Entity = js.native
  
  /**
    * Instantiates an entity with a render component.
    *
    * @param {object} [options] - The initialization data for the render component type
    * {@link RenderComponent}.
    * @returns {Entity} A hierarchy of entities with render components on entities containing
    * renderable geometry.
    * @example
    * // load a glb file and instantiate an entity with a render component based on it
    * app.assets.loadFromUrl("statue.glb", "container", function (err, asset) {
    *     var entity = asset.resource.instantiateRenderEntity({
    *         castShadows: true
    *     });
    *     app.root.addChild(entity);
    *
    *     // find all render components containing mesh instances, and change blend mode on their materials
    *     var renders = entity.findComponents("render");
    *     renders.forEach(function (render) {
    *         render.meshInstances.forEach(function (meshInstance) {
    *             meshInstance.material.blendType = pc.BLEND_MULTIPLICATIVE;
    *             meshInstance.material.update();
    *         });
    *     });
    * });
    */
  def instantiateRenderEntity(): Entity = js.native
  def instantiateRenderEntity(options: js.Object): Entity = js.native
}
