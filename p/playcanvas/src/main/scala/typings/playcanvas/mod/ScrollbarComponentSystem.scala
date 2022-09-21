package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.playcanvas.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link ScrollbarComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "ScrollbarComponentSystem")
@js.native
open class ScrollbarComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ ScrollbarComponentSystem, /* entity */ Entity, ScrollbarComponent] = js.native
  
  var DataType: Instantiable0[ScrollbarComponentData] = js.native
  
  def _onRemoveComponent(entity: Any, component: Any): Unit = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  @JSName("schema")
  var schema_ScrollbarComponentSystem: js.Array[Name] = js.native
}
