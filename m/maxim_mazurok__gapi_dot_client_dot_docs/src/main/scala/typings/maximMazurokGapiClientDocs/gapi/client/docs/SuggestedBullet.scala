package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedBullet extends StObject {
  
  /** A Bullet that only includes the changes made in this suggestion. This can be used along with the bullet_suggestion_state to see which fields have changed and their new values. */
  var bullet: js.UndefOr[Bullet] = js.undefined
  
  /** A mask that indicates which of the fields on the base Bullet have been changed in this suggestion. */
  var bulletSuggestionState: js.UndefOr[BulletSuggestionState] = js.undefined
}
object SuggestedBullet {
  
  inline def apply(): SuggestedBullet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedBullet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestedBullet] (val x: Self) extends AnyVal {
    
    inline def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    inline def setBulletSuggestionState(value: BulletSuggestionState): Self = StObject.set(x, "bulletSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setBulletSuggestionStateUndefined: Self = StObject.set(x, "bulletSuggestionState", js.undefined)
    
    inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
  }
}
