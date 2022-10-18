package typings.pkijs.mod

import typings.pkijs.anon.SafeContentsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AuthenticatedSafe structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@js.native
trait AuthenticatedSafe
  extends StObject
     with PkiObject
     with IAuthenticatedSafe {
  
  def makeInternalValues(parameters: SafeContentsArray): js.Promise[this.type] = js.native
  def makeInternalValues(parameters: SafeContentsArray, crypto: ICryptoEngine): js.Promise[this.type] = js.native
  
  def parseInternalValues(parameters: typings.pkijs.anon.SafeContents): js.Promise[Unit] = js.native
  def parseInternalValues(parameters: typings.pkijs.anon.SafeContents, crypto: ICryptoEngine): js.Promise[Unit] = js.native
}
