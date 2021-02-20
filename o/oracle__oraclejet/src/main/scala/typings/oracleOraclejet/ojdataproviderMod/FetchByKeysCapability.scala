package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.oracleOraclejetStrings.iteration
import typings.oracleOraclejet.oracleOraclejetStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchByKeysCapability[D] extends StObject {
  
  var implementation: iteration | lookup = js.native
}
object FetchByKeysCapability {
  
  @scala.inline
  def apply[D](implementation: iteration | lookup): FetchByKeysCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysCapability[D]]
  }
  
  @scala.inline
  implicit class FetchByKeysCapabilityMutableBuilder[Self <: FetchByKeysCapability[_], D] (val x: Self with FetchByKeysCapability[D]) extends AnyVal {
    
    @scala.inline
    def setImplementation(value: iteration | lookup): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
  }
}
