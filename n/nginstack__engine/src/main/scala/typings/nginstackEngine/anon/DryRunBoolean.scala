package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRunBoolean extends StObject {
  
  var dryRun: Boolean
}
object DryRunBoolean {
  
  inline def apply(dryRun: Boolean): DryRunBoolean = {
    val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryRunBoolean]
  }
  
  extension [Self <: DryRunBoolean](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
  }
}
