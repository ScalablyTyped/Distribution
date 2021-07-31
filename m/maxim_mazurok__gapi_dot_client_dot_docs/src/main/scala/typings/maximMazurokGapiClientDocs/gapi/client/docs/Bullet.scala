package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bullet extends StObject {
  
  /** The ID of the list this paragraph belongs to. */
  var listId: js.UndefOr[String] = js.undefined
  
  /** The nesting level of this paragraph in the list. */
  var nestingLevel: js.UndefOr[Double] = js.undefined
  
  /** The paragraph specific text style applied to this bullet. */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
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
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
