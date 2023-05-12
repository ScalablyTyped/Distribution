package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link CollisionComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "CollisionComponentSystem")
@js.native
open class CollisionComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {import('../app-base.js').AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ CollisionComponentSystem, /* entity */ Entity, CollisionComponent] = js.native
  
  var DataType: Instantiable0[CollisionComponentData] = js.native
  
  def _calculateNodeRelativeTransform(node: Any, relative: Any): Unit = js.native
  
  def _createImplementation(`type`: Any): Any = js.native
  
  def _getImplementation(entity: Any): Any = js.native
  
  def _getNodeScaling(node: Any): Any = js.native
  
  def _getNodeTransform(node: Any, relative: Any): Any = js.native
  
  def _removeCompoundChild(collision: Any, shape: Any): Unit = js.native
  
  def changeType(component: Any, previousType: Any, newType: Any): Unit = js.native
  
  def cloneComponent(entity: Any, clone: Any): Any = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, _data: Any, properties: Any): Unit = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def onRemove(entity: Any, data: Any): Unit = js.native
  
  def onTransformChanged(component: Any, position: Any, rotation: Any, scale: Any): Unit = js.native
  
  def recreatePhysicalShapes(component: Any): Unit = js.native
  
  @JSName("schema")
  var schema_CollisionComponentSystem: js.Array[String] = js.native
  
  def updateCompoundChildTransform(entity: Any): Unit = js.native
}
