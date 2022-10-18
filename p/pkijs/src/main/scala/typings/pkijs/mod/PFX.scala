package typings.pkijs.mod

import typings.pkijs.anon.CheckIntegrity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PFX structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@js.native
trait PFX
  extends StObject
     with PkiObject
     with IPFX {
  
  /**
    * Making ContentInfo from PARSED_VALUE object
    * @param parameters Parameters, specific to each "integrity mode"
    * @param crypto Crypto engine
    */
  def makeInternalValues(): js.Promise[Unit] = js.native
  def makeInternalValues(parameters: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def makeInternalValues(parameters: MakeInternalValuesParams): js.Promise[Unit] = js.native
  def makeInternalValues(parameters: MakeInternalValuesParams, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  def parseInternalValues(parameters: CheckIntegrity): js.Promise[Unit] = js.native
  def parseInternalValues(parameters: CheckIntegrity, crypto: ICryptoEngine): js.Promise[Unit] = js.native
}
