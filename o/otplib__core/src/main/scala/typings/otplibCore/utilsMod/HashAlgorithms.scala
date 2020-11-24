package typings.otplibCore.utilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HashAlgorithms extends js.Object
@JSImport("@otplib/core/utils", "HashAlgorithms")
@js.native
object HashAlgorithms extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HashAlgorithms with String] = js.native
  
  @js.native
  sealed trait SHA1 extends HashAlgorithms
  /* "sha1" */ @js.native
  object SHA1 extends TopLevel[SHA1 with String]
  
  @js.native
  sealed trait SHA256 extends HashAlgorithms
  /* "sha256" */ @js.native
  object SHA256 extends TopLevel[SHA256 with String]
  
  @js.native
  sealed trait SHA512 extends HashAlgorithms
  /* "sha512" */ @js.native
  object SHA512 extends TopLevel[SHA512 with String]
}
