package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates and manages physics joint components.
  *
  * @augments ComponentSystem
  * @ignore
  */
@JSImport("playcanvas", "JointComponentSystem")
@js.native
open class JointComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ JointComponentSystem, /* entity */ Entity, JointComponent] = js.native
  
  var DataType: Instantiable0[JointComponentData] = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  @JSName("schema")
  var schema_JointComponentSystem: js.Array[String] = js.native
}
