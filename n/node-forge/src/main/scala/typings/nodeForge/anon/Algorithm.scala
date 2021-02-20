package typings.nodeForge.anon

import typings.nodeForge.mod.Hex
import typings.nodeForge.nodeForgeStrings.`3des`
import typings.nodeForge.nodeForgeStrings.aes128
import typings.nodeForge.nodeForgeStrings.aes192
import typings.nodeForge.nodeForgeStrings.aes256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends StObject {
  
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var generateLocalKeyId: js.UndefOr[Boolean] = js.native
  
  var localKeyId: js.UndefOr[Hex] = js.native
  
  var saltSize: js.UndefOr[Double] = js.native
  
  var useMac: js.UndefOr[Boolean] = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  @scala.inline
  implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: aes128 | aes192 | aes256 | `3des`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setGenerateLocalKeyId(value: Boolean): Self = StObject.set(x, "generateLocalKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateLocalKeyIdUndefined: Self = StObject.set(x, "generateLocalKeyId", js.undefined)
    
    @scala.inline
    def setLocalKeyId(value: Hex): Self = StObject.set(x, "localKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalKeyIdUndefined: Self = StObject.set(x, "localKeyId", js.undefined)
    
    @scala.inline
    def setSaltSize(value: Double): Self = StObject.set(x, "saltSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltSizeUndefined: Self = StObject.set(x, "saltSize", js.undefined)
    
    @scala.inline
    def setUseMac(value: Boolean): Self = StObject.set(x, "useMac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMacUndefined: Self = StObject.set(x, "useMac", js.undefined)
  }
}
