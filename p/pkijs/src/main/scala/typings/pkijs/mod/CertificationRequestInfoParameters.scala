package typings.pkijs.mod

import typings.pkijs.anon.BlockName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificationRequestInfoParameters extends StObject {
  
  var names: js.UndefOr[BlockName] = js.undefined
}
object CertificationRequestInfoParameters {
  
  inline def apply(): CertificationRequestInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationRequestInfoParameters]
  }
  
  extension [Self <: CertificationRequestInfoParameters](x: Self) {
    
    inline def setNames(value: BlockName): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
  }
}
