package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates and manages {@link ZoneComponent} instances.
  *
  * @augments ComponentSystem
  * @ignore
  */
@JSImport("playcanvas", "ZoneComponentSystem")
@js.native
open class ZoneComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ ZoneComponentSystem, /* entity */ Entity, ZoneComponent] = js.native
  
  var DataType: Instantiable0[ZoneComponentData] = js.native
  
  def _onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  @JSName("schema")
  var schema_ZoneComponentSystem: js.Array[String] = js.native
}
