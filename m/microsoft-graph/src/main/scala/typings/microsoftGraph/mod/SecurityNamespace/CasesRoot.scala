package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CasesRoot
  extends StObject
     with Entity {
  
  var ediscoveryCases: js.UndefOr[NullableOption[js.Array[EdiscoveryCase]]] = js.undefined
}
object CasesRoot {
  
  inline def apply(): CasesRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CasesRoot]
  }
  
  extension [Self <: CasesRoot](x: Self) {
    
    inline def setEdiscoveryCases(value: NullableOption[js.Array[EdiscoveryCase]]): Self = StObject.set(x, "ediscoveryCases", value.asInstanceOf[js.Any])
    
    inline def setEdiscoveryCasesNull: Self = StObject.set(x, "ediscoveryCases", null)
    
    inline def setEdiscoveryCasesUndefined: Self = StObject.set(x, "ediscoveryCases", js.undefined)
    
    inline def setEdiscoveryCasesVarargs(value: EdiscoveryCase*): Self = StObject.set(x, "ediscoveryCases", js.Array(value*))
  }
}
