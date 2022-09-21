package typings.playcanvas.mod

import typings.playcanvas.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../app-base.js').AppBase} AppBase */
/** @typedef {import('./component.js').Component} Component */
/** @typedef {import('../entity.js').Entity} Entity */
/**
  * Component Systems contain the logic and functionality to update all Components of a particular
  * type.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "ComponentSystem")
@js.native
open class ComponentSystem protected () extends EventHandler {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  /**
    * Create new {@link Component} and component data instances and attach them to the entity.
    *
    * @param {Entity} entity - The Entity to attach this component to.
    * @param {object} [data] - The source data with which to create the component.
    * @returns {Component} Returns a Component of type defined by the component system.
    * @example
    * var entity = new pc.Entity(app);
    * app.systems.model.addComponent(entity, { type: 'box' });
    * // entity.model is now set to a pc.ModelComponent
    * @ignore
    */
  def addComponent(entity: Entity): Component = js.native
  def addComponent(entity: Entity, data: js.Object): Component = js.native
  
  var app: AppBase = js.native
  
  /**
    * Create a clone of component. This creates a copy of all component data variables.
    *
    * @param {Entity} entity - The entity to clone the component from.
    * @param {Entity} clone - The entity to clone the component into.
    * @returns {Component} The newly cloned component.
    * @ignore
    */
  def cloneComponent(entity: Entity, clone: Entity): Component = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Searches the component schema for properties that match the specified type.
    *
    * @param {string} type - The type to search for.
    * @returns {string[]|object[]} An array of property descriptors matching the specified type.
    * @ignore
    */
  def getPropertiesOfType(`type`: String): js.Array[js.Object | String] = js.native
  
  /**
    * Called during {@link ComponentSystem#addComponent} to initialize the component data in the
    * store. This can be overridden by derived Component Systems and either called by the derived
    * System or replaced entirely.
    *
    * @param {Component} component - The component being initialized.
    * @param {object} data - The data block used to initialize the component.
    * @param {Array<string | {name: string, type: string}>} properties - The array of property descriptors for the component.
    * A descriptor can be either a plain property name, or an object specifying the name and type.
    * @ignore
    */
  def initializeComponentData(component: Component, data: js.Object, properties: js.Array[String | Name]): Unit = js.native
  
  /**
    * Remove the {@link Component} from the entity and delete the associated component data.
    *
    * @param {Entity} entity - The entity to remove the component from.
    * @example
    * app.systems.model.removeComponent(entity);
    * // entity.model === undefined
    * @ignore
    */
  def removeComponent(entity: Entity): Unit = js.native
  
  var schema: js.Array[Any] = js.native
}
