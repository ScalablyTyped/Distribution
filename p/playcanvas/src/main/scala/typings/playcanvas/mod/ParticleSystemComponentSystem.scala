package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.playcanvas.anon.AlphaGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows an Entity to render a particle system.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "ParticleSystemComponentSystem")
@js.native
open class ParticleSystemComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[
    /* system */ ParticleSystemComponentSystem, 
    /* entity */ Entity, 
    ParticleSystemComponent
  ] = js.native
  
  var DataType: Instantiable0[ParticleSystemComponentData] = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, _data: Any, properties: Any): Unit = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  var propertyTypes: AlphaGraph = js.native
  
  @JSName("schema")
  var schema_ParticleSystemComponentSystem: js.Array[String] = js.native
}
