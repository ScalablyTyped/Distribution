package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Light Component is used to dynamically light the scene.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "LightComponentSystem")
@js.native
open class LightComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ LightComponentSystem, /* entity */ Entity, LightComponent] = js.native
  
  var DataType: Instantiable0[LightComponentData] = js.native
  
  def _onRemoveComponent(entity: Any, component: Any): Unit = js.native
  
  def changeType(component: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, _data: Any): Unit = js.native
}
