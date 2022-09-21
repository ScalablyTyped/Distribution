package typings.playcanvas.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages creation of {@link ElementComponent}s.
  *
  * @augments ComponentSystem
  */
@JSImport("playcanvas", "ElementComponentSystem")
@js.native
open class ElementComponentSystem protected () extends ComponentSystem {
  /**
    * Create a new ComponentSystem instance.
    *
    * @param {AppBase} app - The application managing this system.
    */
  def this(app: AppBase) = this()
  
  var ComponentType: Instantiable2[/* system */ ElementComponentSystem, /* entity */ Entity, ElementComponent] = js.native
  
  var DataType: Instantiable0[ElementComponentData] = js.native
  
  def _createBaseImageMaterial(): StandardMaterial = js.native
  
  var _defaultTexture: Texture = js.native
  
  var _rtlReorder: Any = js.native
  
  var _unicodeConverter: Any = js.native
  
  def cloneComponent(entity: Any, clone: Any): Component = js.native
  
  var defaultImage9SlicedMaskMaterial: StandardMaterial = js.native
  
  var defaultImage9SlicedMaterial: StandardMaterial = js.native
  
  var defaultImage9TiledMaskMaterial: StandardMaterial = js.native
  
  var defaultImage9TiledMaterial: StandardMaterial = js.native
  
  var defaultImageMaskMaterial: StandardMaterial = js.native
  
  var defaultImageMaterial: StandardMaterial = js.native
  
  var defaultImageMaterials: js.Array[Any] = js.native
  
  var defaultScreenSpaceImage9SlicedMaterial: StandardMaterial = js.native
  
  var defaultScreenSpaceImage9TiledMaterial: StandardMaterial = js.native
  
  var defaultScreenSpaceImageMask9SlicedMaterial: StandardMaterial = js.native
  
  var defaultScreenSpaceImageMask9TiledMaterial: StandardMaterial = js.native
  
  var defaultScreenSpaceImageMaskMaterial: StandardMaterial = js.native
  
  var defaultScreenSpaceImageMaterial: StandardMaterial = js.native
  
  def getImageElementMaterial(screenSpace: Any, mask: Any, nineSliced: Any, nineSliceTiled: Any): StandardMaterial = js.native
  
  def getRtlReorder(): Any = js.native
  
  def getTextElementMaterial(screenSpace: Any, msdf: Any, textAttibutes: Any): Any = js.native
  
  def getUnicodeConverter(): Any = js.native
  
  var id: String = js.native
  
  def initializeComponentData(component: Any, data: Any, properties: Any): Unit = js.native
  
  def onRemoveComponent(entity: Any, component: Any): Unit = js.native
  
  def registerRtlReorder(func: Any): Unit = js.native
  
  def registerUnicodeConverter(func: Any): Unit = js.native
  
  @JSName("schema")
  var schema_ElementComponentSystem: js.Array[String] = js.native
}
