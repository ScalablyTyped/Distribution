package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link SpriteComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "SpriteComponentSystem")
@js.native
open class SpriteComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ SpriteComponentSystem, /* entity */ Entity, SpriteComponent] = js.native
  
  var DataType: Instantiable0[SpriteComponentData] = js.native
  
  var _default9SlicedMaterialSlicedMode: Any = js.native
  
  var _default9SlicedMaterialTiledMode: Any = js.native
  
  var _defaultMaterial: Any = js.native
  
  var _defaultTexture: Texture = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  def default9SlicedMaterialSlicedMode: Any = js.native
  def default9SlicedMaterialSlicedMode_=(arg: Any): Unit = js.native
  
  def default9SlicedMaterialTiledMode: Any = js.native
  def default9SlicedMaterialTiledMode_=(arg: Any): Unit = js.native
  
  def defaultMaterial: Any = js.native
  def defaultMaterial_=(arg: Any): Unit = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def onBeforeRemove(entity: Any, component: Any): Unit = js.native
  
  def onUpdate(dt: Any): Unit = js.native
  
  @JSName("schema")
  var schema_SpriteComponentSystem: js.Array[String] = js.native
}
