package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import typings.nextAuth.adaptersMod.TypeORMSessionModel
import typings.nextAuth.adaptersMod.TypeORMUserModel
import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends StObject {
  
  var models: js.UndefOr[Session[A, U, S, VR]] = js.native
}
object `0` {
  
  @scala.inline
  def apply[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */](): `0`[A, U, S, VR] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[A, U, S, VR]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[_, _, _, _], A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] (val x: Self with (`0`[A, U, S, VR])) extends AnyVal {
    
    @scala.inline
    def setModels(value: Session[A, U, S, VR]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
  }
}
