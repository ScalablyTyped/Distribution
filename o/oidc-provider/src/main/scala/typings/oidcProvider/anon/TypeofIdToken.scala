package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIdToken extends StObject {
  
  /* static member */
  def validate(idToken: String, client: typings.oidcProvider.mod.Client): js.Promise[Header]
}
object TypeofIdToken {
  
  inline def apply(validate: (String, typings.oidcProvider.mod.Client) => js.Promise[Header]): TypeofIdToken = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2(validate))
    __obj.asInstanceOf[TypeofIdToken]
  }
  
  extension [Self <: TypeofIdToken](x: Self) {
    
    inline def setValidate(value: (String, typings.oidcProvider.mod.Client) => js.Promise[Header]): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
  }
}
