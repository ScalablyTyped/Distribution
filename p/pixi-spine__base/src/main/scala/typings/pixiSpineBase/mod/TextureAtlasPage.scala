package typings.pixiSpineBase.mod

import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiCore.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "TextureAtlasPage")
@js.native
open class TextureAtlasPage () extends StObject {
  
  var baseTexture: BaseTexture[Resource, IAutoDetectOptions] = js.native
  
  var height: Double = js.native
  
  var magFilter: TextureFilter = js.native
  
  var minFilter: TextureFilter = js.native
  
  var name: String = js.native
  
  var pma: Boolean = js.native
  
  def setFilters(): Unit = js.native
  
  var uWrap: TextureWrap = js.native
  
  var vWrap: TextureWrap = js.native
  
  var width: Double = js.native
}
