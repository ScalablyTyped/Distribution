package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the TSTInfo structure described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  */
@js.native
trait TSTInfo
  extends StObject
     with PkiObject
     with ITSTInfo {
  
  /**
    * Verify current TST Info value
    * @param params Input parameters
    * @param crypto Crypto engine
    */
  def verify(params: TSTInfoVerifyParams): js.Promise[Boolean] = js.native
  def verify(params: TSTInfoVerifyParams, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
