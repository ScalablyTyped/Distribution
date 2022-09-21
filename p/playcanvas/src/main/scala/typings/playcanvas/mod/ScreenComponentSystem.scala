package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link ScreenComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "ScreenComponentSystem")
@js.native
open class ScreenComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ ScreenComponentSystem, /* entity */ Entity, ScreenComponent] = js.native
  
  var DataType: Instantiable0[ScreenComponentData] = js.native
  
  var _drawOrderSyncQueue: IndexedList = js.native
  
  def _onResize(width: Any, height: Any): Unit = js.native
  
  def _onUpdate(dt: Any): Unit = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def onRemoveComponent(entity: Any, component: Any): Unit = js.native
  
  def processDrawOrderSyncQueue(): Unit = js.native
  
  def queueDrawOrderSync(id: Any, fn: Any, scope: Any): Unit = js.native
  
  @JSName("schema")
  var schema_ScreenComponentSystem: js.Array[String] = js.native
  
  var windowResolution: Vec2 = js.native
}
