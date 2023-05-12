package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Components are used to attach functionality on a {@link Entity}. Components can receive update
  * events each frame, and expose properties to the PlayCanvas Editor.
  *
  * @property {boolean} enabled Enables or disables the component.
  * @augments EventHandler
  */
@JSImport("playcanvas", "Component")
@js.native
open class Component protected () extends EventHandler {
  /**
    * Base constructor for a Component.
    *
    * @param {import('./system.js').ComponentSystem} system - The ComponentSystem used to create
    * this Component.
    * @param {import('../entity.js').Entity} entity - The Entity that this Component is attached
    * to.
    */
  def this(system: ComponentSystem, entity: Entity) = this()
  
  /** @ignore */
  def buildAccessors(schema: Any): Unit = js.native
  
  /**
    * Access the component data directly. Usually you should access the data properties via the
    * individual properties as modifying this data directly will not fire 'set' events.
    *
    * @type {*}
    * @ignore
    */
  def data: Any = js.native
  
  def enabled: Boolean = js.native
  def enabled_=(arg: Boolean): Unit = js.native
  
  /**
    * The Entity that this Component is attached to.
    *
    * @type {import('../entity.js').Entity}
    */
  var entity: Entity = js.native
  
  /** @ignore */
  def onDisable(): Unit = js.native
  
  /** @ignore */
  def onEnable(): Unit = js.native
  
  /** @ignore */
  def onPostStateChange(): Unit = js.native
  
  /** @ignore */
  def onSetEnabled(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  /**
    * The ComponentSystem used to create this Component.
    *
    * @type {import('./system.js').ComponentSystem}
    */
  var system: ComponentSystem = js.native
}
object Component {
  
  @JSImport("playcanvas", "Component")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  /* static member */
  inline def buildAccessors(obj: Any, schema: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_buildAccessors")(obj.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
