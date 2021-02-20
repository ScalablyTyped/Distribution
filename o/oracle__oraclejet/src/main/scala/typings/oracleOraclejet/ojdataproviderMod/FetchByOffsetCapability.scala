package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.oracleOraclejetStrings.iteration
import typings.oracleOraclejet.oracleOraclejetStrings.randomAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchByOffsetCapability[D] extends StObject {
  
  var implementation: iteration | randomAccess = js.native
}
object FetchByOffsetCapability {
  
  @scala.inline
  def apply[D](implementation: iteration | randomAccess): FetchByOffsetCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetCapability[D]]
  }
  
  @scala.inline
  implicit class FetchByOffsetCapabilityMutableBuilder[Self <: FetchByOffsetCapability[_], D] (val x: Self with FetchByOffsetCapability[D]) extends AnyVal {
    
    @scala.inline
    def setImplementation(value: iteration | randomAccess): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
  }
}
