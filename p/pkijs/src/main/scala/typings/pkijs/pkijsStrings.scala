package typings.pkijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkijsStrings {
  
  @scala.inline
  def jwk: jwk = "jwk".asInstanceOf[jwk]
  
  @scala.inline
  def pkcs8: pkcs8 = "pkcs8".asInstanceOf[pkcs8]
  
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  
  @scala.inline
  def spki: spki = "spki".asInstanceOf[spki]
  
  @js.native
  sealed trait jwk extends js.Object
  
  @js.native
  sealed trait pkcs8 extends js.Object
  
  @js.native
  sealed trait raw extends js.Object
  
  @js.native
  sealed trait spki extends js.Object
}
