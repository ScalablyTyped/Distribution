package typings.phaser.anon

import typings.phaser.spine.TextureFilter
import typings.phaser.spine.TextureWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTexture extends StObject {
  
  /* static member */
  def filterFromString(text: String): TextureFilter = js.native
  
  /* static member */
  def wrapFromString(text: String): TextureWrap = js.native
}
object TypeofTexture {
  
  @scala.inline
  def apply(filterFromString: String => TextureFilter, wrapFromString: String => TextureWrap): TypeofTexture = {
    val __obj = js.Dynamic.literal(filterFromString = js.Any.fromFunction1(filterFromString), wrapFromString = js.Any.fromFunction1(wrapFromString))
    __obj.asInstanceOf[TypeofTexture]
  }
  
  @scala.inline
  implicit class TypeofTextureMutableBuilder[Self <: TypeofTexture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFromString(value: String => TextureFilter): Self = StObject.set(x, "filterFromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrapFromString(value: String => TextureWrap): Self = StObject.set(x, "wrapFromString", js.Any.fromFunction1(value))
  }
}
