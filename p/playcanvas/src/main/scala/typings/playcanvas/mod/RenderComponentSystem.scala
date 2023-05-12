package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.playcanvas.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows an Entity to render a mesh or a primitive shape like a box, capsule, sphere, cylinder,
  * cone etc.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "RenderComponentSystem")
@js.native
open class RenderComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ RenderComponentSystem, /* entity */ Entity, RenderComponent] = js.native
  
  var DataType: Instantiable0[RenderComponentData] = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var defaultMaterial: StandardMaterial = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, _data: Any, properties: Any): Unit = js.native
  
  def onRemove(entity: Any, component: Any): Unit = js.native
  
  @JSName("schema")
  var schema_RenderComponentSystem: js.Array[String | Type] = js.native
}
