package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bullet extends StObject {
  
  /** The paragraph specific text style applied to this bullet. */
  var bulletStyle: js.UndefOr[TextStyle] = js.native
  
  /** The rendered bullet glyph for this paragraph. */
  var glyph: js.UndefOr[String] = js.native
  
  /** The ID of the list this paragraph belongs to. */
  var listId: js.UndefOr[String] = js.native
  
  /** The nesting level of this paragraph in the list. */
  var nestingLevel: js.UndefOr[Double] = js.native
}
object Bullet {
  
  @scala.inline
  def apply(): Bullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bullet]
  }
  
  @scala.inline
  implicit class BulletMutableBuilder[Self <: Bullet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletStyle(value: TextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
    
    @scala.inline
    def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
  }
}
