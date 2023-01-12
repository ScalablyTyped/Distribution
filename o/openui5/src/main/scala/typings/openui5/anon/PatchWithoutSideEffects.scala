package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchWithoutSideEffects extends StObject {
  
  /**
    * The group ID used for read requests for the context's entity or its properties. If not given, the model's
    * {@link #getGroupId group ID} is used
    */
  @JSName("$$groupId")
  var DollarDollargroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether implicit loading of side effects via PATCH requests is switched off
    */
  @JSName("$$patchWithoutSideEffects")
  var DollarDollarpatchWithoutSideEffects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group ID to be used for **update** requests triggered by the context's binding
    */
  @JSName("$$updateGroupId")
  var DollarDollarupdateGroupId: js.UndefOr[String] = js.undefined
}
object PatchWithoutSideEffects {
  
  inline def apply(): PatchWithoutSideEffects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchWithoutSideEffects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchWithoutSideEffects] (val x: Self) extends AnyVal {
    
    inline def setDollarDollargroupId(value: String): Self = StObject.set(x, "$$groupId", value.asInstanceOf[js.Any])
    
    inline def setDollarDollargroupIdUndefined: Self = StObject.set(x, "$$groupId", js.undefined)
    
    inline def setDollarDollarpatchWithoutSideEffects(value: Boolean): Self = StObject.set(x, "$$patchWithoutSideEffects", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarpatchWithoutSideEffectsUndefined: Self = StObject.set(x, "$$patchWithoutSideEffects", js.undefined)
    
    inline def setDollarDollarupdateGroupId(value: String): Self = StObject.set(x, "$$updateGroupId", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarupdateGroupIdUndefined: Self = StObject.set(x, "$$updateGroupId", js.undefined)
  }
}
