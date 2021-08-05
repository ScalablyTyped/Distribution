package typings.nodeForge.anon

import typings.nodeForge.mod.Hex
import typings.nodeForge.nodeForgeStrings.`3des`
import typings.nodeForge.nodeForgeStrings.aes128
import typings.nodeForge.nodeForgeStrings.aes192
import typings.nodeForge.nodeForgeStrings.aes256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithm extends StObject {
  
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var friendlyName: js.UndefOr[String] = js.undefined
  
  var generateLocalKeyId: js.UndefOr[Boolean] = js.undefined
  
  var localKeyId: js.UndefOr[Hex] = js.undefined
  
  var saltSize: js.UndefOr[Double] = js.undefined
  
  var useMac: js.UndefOr[Boolean] = js.undefined
}
object Algorithm {
  
  inline def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  extension [Self <: Algorithm](x: Self) {
    
    inline def setAlgorithm(value: aes128 | aes192 | aes256 | `3des`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setGenerateLocalKeyId(value: Boolean): Self = StObject.set(x, "generateLocalKeyId", value.asInstanceOf[js.Any])
    
    inline def setGenerateLocalKeyIdUndefined: Self = StObject.set(x, "generateLocalKeyId", js.undefined)
    
    inline def setLocalKeyId(value: Hex): Self = StObject.set(x, "localKeyId", value.asInstanceOf[js.Any])
    
    inline def setLocalKeyIdUndefined: Self = StObject.set(x, "localKeyId", js.undefined)
    
    inline def setSaltSize(value: Double): Self = StObject.set(x, "saltSize", value.asInstanceOf[js.Any])
    
    inline def setSaltSizeUndefined: Self = StObject.set(x, "saltSize", js.undefined)
    
    inline def setUseMac(value: Boolean): Self = StObject.set(x, "useMac", value.asInstanceOf[js.Any])
    
    inline def setUseMacUndefined: Self = StObject.set(x, "useMac", js.undefined)
  }
}
