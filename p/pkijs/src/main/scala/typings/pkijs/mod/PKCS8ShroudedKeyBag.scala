package typings.pkijs.mod

import typings.pkijs.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PKCS8ShroudedKeyBag structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@js.native
trait PKCS8ShroudedKeyBag
  extends StObject
     with PkiObject
     with IPKCS8ShroudedKeyBag
     with BagType {
  
  def makeInternalValues(parameters: PKCS8ShroudedKeyBagMakeInternalValuesParams): js.Promise[Unit] = js.native
  
  /* protected */ def parseInternalValues(parameters: Password): js.Promise[Unit] = js.native
  /* protected */ def parseInternalValues(parameters: Password, crypto: ICryptoEngine): js.Promise[Unit] = js.native
}
