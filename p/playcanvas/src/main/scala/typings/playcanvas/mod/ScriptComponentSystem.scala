package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows scripts to be attached to an Entity and executed.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "ScriptComponentSystem")
@js.native
open class ScriptComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ ScriptComponentSystem, /* entity */ Entity, ScriptComponent] = js.native
  
  var DataType: Instantiable0[ScriptComponentData] = js.native
  
  def _addComponentToEnabled(component: Any): Unit = js.native
  
  def _callComponentMethod(components: Any, name: Any, dt: Any): Unit = js.native
  
  var _components: SortedLoopArray = js.native
  
  var _enabledComponents: SortedLoopArray = js.native
  
  def _onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def _onInitialize(): Unit = js.native
  
  def _onPostInitialize(): Unit = js.native
  
  def _onPostUpdate(dt: Any): Unit = js.native
  
  def _onUpdate(dt: Any): Unit = js.native
  
  def _removeComponentFromEnabled(component: Any): Unit = js.native
  
  def _resetExecutionOrder(): Unit = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any): Unit = js.native
  
  var preloading: Boolean = js.native
}
