package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import typings.nextAuth.adaptersMod.TypeORMSessionModel
import typings.nextAuth.adaptersMod.TypeORMUserModel
import typings.nextAuth.adaptersMod.TypeORMVerificationRequestModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends StObject {
  
  var models: js.UndefOr[Session[A, U, S, VR]] = js.undefined
}
object `0` {
  
  inline def apply[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */](): `0`[A, U, S, VR] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[A, U, S, VR]]
  }
  
  extension [Self <: `0`[?, ?, ?, ?], A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */](x: Self & (`0`[A, U, S, VR])) {
    
    inline def setModels(value: Session[A, U, S, VR]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
  }
}
