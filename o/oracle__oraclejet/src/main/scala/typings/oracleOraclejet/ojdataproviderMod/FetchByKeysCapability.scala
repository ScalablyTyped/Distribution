package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.oracleOraclejetStrings.iteration
import typings.oracleOraclejet.oracleOraclejetStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchByKeysCapability[D] extends StObject {
  
  var implementation: iteration | lookup
}
object FetchByKeysCapability {
  
  inline def apply[D](implementation: iteration | lookup): FetchByKeysCapability[D] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysCapability[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchByKeysCapability[?], D] (val x: Self & FetchByKeysCapability[D]) extends AnyVal {
    
    inline def setImplementation(value: iteration | lookup): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
  }
}
