package typings.phaser.anon

import typings.phaser.spine.TextureFilter
import typings.phaser.spine.TextureWrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTexture extends StObject {
  
  /* static member */
  def filterFromString(text: String): TextureFilter
  
  /* static member */
  def wrapFromString(text: String): TextureWrap
}
object TypeofTexture {
  
  inline def apply(filterFromString: String => TextureFilter, wrapFromString: String => TextureWrap): TypeofTexture = {
    val __obj = js.Dynamic.literal(filterFromString = js.Any.fromFunction1(filterFromString), wrapFromString = js.Any.fromFunction1(wrapFromString))
    __obj.asInstanceOf[TypeofTexture]
  }
  
  extension [Self <: TypeofTexture](x: Self) {
    
    inline def setFilterFromString(value: String => TextureFilter): Self = StObject.set(x, "filterFromString", js.Any.fromFunction1(value))
    
    inline def setWrapFromString(value: String => TextureWrap): Self = StObject.set(x, "wrapFromString", js.Any.fromFunction1(value))
  }
}
