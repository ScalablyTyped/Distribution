package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.playcanvas.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link ScrollViewComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "ScrollViewComponentSystem")
@js.native
open class ScrollViewComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ ScrollViewComponentSystem, /* entity */ Entity, ScrollViewComponent] = js.native
  
  var DataType: Instantiable0[ScrollViewComponentData] = js.native
  
  def _onRemoveComponent(entity: Any, component: Any): Unit = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  @JSName("schema")
  var schema_ScrollViewComponentSystem: js.Array[Type] = js.native
}
