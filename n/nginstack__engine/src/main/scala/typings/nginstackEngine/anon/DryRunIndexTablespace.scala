package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRunIndexTablespace extends StObject {
  
  var dryRun: Boolean
  
  var indexTablespace: String
}
object DryRunIndexTablespace {
  
  inline def apply(dryRun: Boolean, indexTablespace: String): DryRunIndexTablespace = {
    val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any], indexTablespace = indexTablespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryRunIndexTablespace]
  }
  
  extension [Self <: DryRunIndexTablespace](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setIndexTablespace(value: String): Self = StObject.set(x, "indexTablespace", value.asInstanceOf[js.Any])
  }
}
