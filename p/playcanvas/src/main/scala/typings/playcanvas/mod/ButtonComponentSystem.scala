package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.playcanvas.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link ButtonComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "ButtonComponentSystem")
@js.native
open class ButtonComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ ButtonComponentSystem, /* entity */ Entity, ButtonComponent] = js.native
  
  var DataType: Instantiable0[ButtonComponentData] = js.native
  
  def _onRemoveComponent(entity: Any, component: Any): Unit = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  @JSName("schema")
  var schema_ButtonComponentSystem: js.Array[String | Name] = js.native
}
