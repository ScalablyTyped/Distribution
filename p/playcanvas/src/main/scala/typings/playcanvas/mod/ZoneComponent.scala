package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ZoneComponent allows you to define an area in world space of certain size. This can be used
  * in various ways, such as affecting audio reverb when {@link AudioListenerComponent} is within
  * zone. Or create culling system with portals between zones to hide whole indoor sections for
  * performance reasons. And many other possible options. Zones are building blocks and meant to be
  * used in many different ways.
  *
  * @augments Component
  * @ignore
  */
@JSImport("playcanvas", "ZoneComponent")
@js.native
open class ZoneComponent protected () extends Component {
  /**
    * Create a new ZoneComponent instance.
    *
    * @param {import('./system.js').ZoneComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: ZoneComponentSystem, entity: Entity) = this()
  
  def _checkState(): Unit = js.native
  
  var _oldState: Boolean = js.native
  
  def _onBeforeRemove(): Unit = js.native
  
  def _onSetEnabled(prop: Any, old: Any, value: Any): Unit = js.native
  
  var _size: Vec3 = js.native
  
  def size: Vec3 = js.native
  /**
    * Fired when Component becomes enabled. Note: this event does not take in account entity or
    * any of its parent enabled state.
    *
    * @event ZoneComponent#enable
    * @example
    * entity.zone.on('enable', function () {
    *     // component is enabled
    * });
    * @ignore
    */
  /**
    * Fired when Component becomes disabled. Note: this event does not take in account entity or
    * any of its parent enabled state.
    *
    * @event ZoneComponent#disable
    * @example
    * entity.zone.on('disable', function () {
    *     // component is disabled
    * });
    * @ignore
    */
  /**
    * Fired when Component changes state to enabled or disabled. Note: this event does not take in
    * account entity or any of its parent enabled state.
    *
    * @event ZoneComponent#state
    * @param {boolean} enabled - True if now enabled, False if disabled.
    * @example
    * entity.zone.on('state', function (enabled) {
    *     // component changed state
    * });
    * @ignore
    */
  /**
    * Fired when a zone is removed from an entity.
    *
    * @event ZoneComponent#remove
    * @example
    * entity.zone.on('remove', function () {
    *     // zone has been removed from an entity
    * });
    * @ignore
    */
  /**
    * The size of the axis-aligned box of this ZoneComponent.
    *
    * @type {Vec3}
    */
  def size_=(arg: Vec3): Unit = js.native
}
