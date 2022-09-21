package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../../scene/composition/layer-composition.js').LayerComposition} LayerComposition */
/** @typedef {import('../../../scene/materials/material.js').Material} Material */
/** @typedef {import('../../../shape/bounding-box.js').BoundingBox} BoundingBox */
/** @typedef {import('../../entity.js').Entity} Entity */
/** @typedef {import('./system.js').ModelComponentSystem} ModelComponentSystem */
/**
  * Enables an Entity to render a model or a primitive shape. This Component attaches additional
  * model geometry in to the scene graph below the Entity.
  *
  * @augments Component
  */
@JSGlobal("pc.ModelComponent")
@js.native
open class ModelComponent protected ()
  extends typings.playcanvas.mod.ModelComponent {
  /**
    * Create a new ModelComponent instance.
    *
    * @param {ModelComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.ModelComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
