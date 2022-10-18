package typings.next.anon

import typings.next.distBuildWebpackPluginsSubresourceIntegrityPluginMod.SubresourceIntegrityAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithm extends StObject {
  
  var algorithm: js.UndefOr[SubresourceIntegrityAlgorithm] = js.undefined
}
object Algorithm {
  
  inline def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  extension [Self <: Algorithm](x: Self) {
    
    inline def setAlgorithm(value: SubresourceIntegrityAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
  }
}
