package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AnimComponentSystem manages creating and deleting AnimComponents.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "AnimComponentSystem")
@js.native
open class AnimComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ AnimComponentSystem, /* entity */ Entity, AnimComponent] = js.native
  
  var DataType: Instantiable0[AnimComponentData] = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def onAnimationUpdate(dt: Any): Unit = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  @JSName("schema")
  var schema_AnimComponentSystem: js.Array[String] = js.native
}
