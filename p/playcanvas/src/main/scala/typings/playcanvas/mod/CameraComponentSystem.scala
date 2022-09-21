package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to add and remove {@link CameraComponent}s from Entities. It also holds an array of all
  * active cameras.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "CameraComponentSystem")
@js.native
open class CameraComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ CameraComponentSystem, /* entity */ Entity, CameraComponent] = js.native
  
  var DataType: Instantiable0[CameraComponentData] = js.native
  
  def addCamera(camera: Any): Unit = js.native
  
  /**
    * Holds all the active camera components.
    *
    * @type {CameraComponent[]}
    */
  var cameras: js.Array[CameraComponent] = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def onAppPrerender(): Unit = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  def removeCamera(camera: Any): Unit = js.native
  
  @JSName("schema")
  var schema_CameraComponentSystem: js.Array[String] = js.native
}
