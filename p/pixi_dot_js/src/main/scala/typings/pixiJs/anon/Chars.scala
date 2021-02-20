package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chars extends StObject {
  
  var chars: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var textureHeight: js.UndefOr[Double] = js.native
  
  var textureWidth: js.UndefOr[Double] = js.native
}
object Chars {
  
  @scala.inline
  def apply(): Chars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chars]
  }
  
  @scala.inline
  implicit class CharsMutableBuilder[Self <: Chars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChars(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
    
    @scala.inline
    def setCharsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "chars", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setTextureHeight(value: Double): Self = StObject.set(x, "textureHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureHeightUndefined: Self = StObject.set(x, "textureHeight", js.undefined)
    
    @scala.inline
    def setTextureWidth(value: Double): Self = StObject.set(x, "textureWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureWidthUndefined: Self = StObject.set(x, "textureWidth", js.undefined)
  }
}
