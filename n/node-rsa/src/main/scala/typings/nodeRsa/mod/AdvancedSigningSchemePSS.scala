package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.pss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSigningSchemePSS extends AdvancedSigningScheme {
  
  var hash: HashingAlgorithm = js.native
  
  var saltLength: Double = js.native
  
  var scheme: pss = js.native
}
object AdvancedSigningSchemePSS {
  
  @scala.inline
  def apply(hash: HashingAlgorithm, saltLength: Double, scheme: pss): AdvancedSigningSchemePSS = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSigningSchemePSS]
  }
  
  @scala.inline
  implicit class AdvancedSigningSchemePSSMutableBuilder[Self <: AdvancedSigningSchemePSS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: HashingAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: pss): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
