package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "ScriptLegacyComponentSystem")
@js.native
open class ScriptLegacyComponentSystem protected () extends ComponentSystem {
  def this(app: Any) = this()
  
  var ComponentType: Instantiable2[/* system */ Any, /* entity */ Any, ScriptLegacyComponent] = js.native
  
  var DataType: Instantiable0[ScriptLegacyComponentData] = js.native
  
  def _callInstancesMethod(script: Any, method: Any): Unit = js.native
  
  def _cloneAttributes(attributes: Any): js.Object = js.native
  
  def _convertAttributeValue(attribute: Any): Unit = js.native
  
  def _createAccessor(attribute: Any, instance: Any): Unit = js.native
  
  def _createAccessors(entity: Any, instance: Any): Unit = js.native
  
  def _destroyScriptComponent(script: Any): Unit = js.native
  
  def _disableScriptComponent(script: Any): Unit = js.native
  
  def _enableScriptComponent(script: Any): Unit = js.native
  
  def _initializeScriptComponent(script: Any): Unit = js.native
  
  def _postInitializeScriptComponent(script: Any): Unit = js.native
  
  def _preRegisterInstance(entity: Any, url: Any, name: Any, instance: Any): Unit = js.native
  
  def _registerInstances(entity: Any): Unit = js.native
  
  def _updateAccessors(entity: Any, instance: Any): Unit = js.native
  
  def _updateInstances(method: Any, updateList: Any, dt: Any): Unit = js.native
  
  def broadcast(name: Any, functionName: Any, args: Any*): Unit = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  var instancesWithFixedUpdate: js.Array[Any] = js.native
  
  var instancesWithPostUpdate: js.Array[Any] = js.native
  
  var instancesWithToolsUpdate: js.Array[Any] = js.native
  
  var instancesWithUpdate: js.Array[Any] = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def onFixedUpdate(dt: Any): Unit = js.native
  
  def onInitialize(root: Any): Unit = js.native
  
  def onPostInitialize(root: Any): Unit = js.native
  
  def onPostUpdate(dt: Any): Unit = js.native
  
  def onToolsUpdate(dt: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  var preloading: Boolean = js.native
  
  @JSName("schema")
  var schema_ScriptLegacyComponentSystem: js.Array[String] = js.native
}
