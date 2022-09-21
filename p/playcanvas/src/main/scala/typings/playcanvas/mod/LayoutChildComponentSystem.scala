package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link LayoutChildComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "LayoutChildComponentSystem")
@js.native
open class LayoutChildComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ LayoutChildComponentSystem, /* entity */ Entity, LayoutChildComponent] = js.native
  
  var DataType: Instantiable0[LayoutChildComponentData] = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  @JSName("schema")
  var schema_LayoutChildComponentSystem: js.Array[String] = js.native
}
