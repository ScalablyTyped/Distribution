package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object CloseOptions {
  
  inline def apply(): CloseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseOptions]
  }
  
  extension [Self <: CloseOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
