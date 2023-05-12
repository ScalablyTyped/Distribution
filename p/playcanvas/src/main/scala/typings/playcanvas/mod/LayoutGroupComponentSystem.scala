package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link LayoutGroupComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "LayoutGroupComponentSystem")
@js.native
open class LayoutGroupComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ LayoutGroupComponentSystem, /* entity */ Entity, LayoutGroupComponent] = js.native
  
  var DataType: Instantiable0[LayoutGroupComponentData] = js.native
  
  def _onPostUpdate(): Unit = js.native
  
  def _onRemoveComponent(entity: Any, component: Any): Unit = js.native
  
  def _processReflowQueue(): Unit = js.native
  
  var _reflowQueue: js.Array[Any] = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def scheduleReflow(component: Any): Unit = js.native
  
  @JSName("schema")
  var schema_LayoutGroupComponentSystem: js.Array[String] = js.native
}
