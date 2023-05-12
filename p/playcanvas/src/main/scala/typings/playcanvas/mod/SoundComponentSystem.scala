package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.std.AudioContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link SoundComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "SoundComponentSystem")
@js.native
open class SoundComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ SoundComponentSystem, /* entity */ Entity, SoundComponent] = js.native
  
  var DataType: Instantiable0[SoundComponentData] = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  /**
    * Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
    * Returns null if the device does not support the Web Audio API.
    *
    * @type {AudioContext|null}
    */
  def context: AudioContext = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  /**
    * Gets / sets the sound manager.
    *
    * @type {import('../../../platform/sound/manager.js').SoundManager}
    */
  var manager: SoundManager = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  @JSName("schema")
  var schema_SoundComponentSystem: js.Array[String] = js.native
  
  def volume: Double = js.native
  /**
    * Sets / gets the volume for the entire Sound system. All sounds will have their volume
    * multiplied by this value. Valid between [0, 1].
    *
    * @type {number}
    */
  def volume_=(arg: Double): Unit = js.native
}
