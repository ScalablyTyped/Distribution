package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait webHash extends js.Object
/**
  * A list of hash names as accepted by webCrypto functions.
  * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest|Parameters, algo}
  */
@JSImport("openpgp", "enums.webHash")
@js.native
object webHash extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[webHash with Double] = js.native
  
  @js.native
  sealed trait `SHA-1` extends webHash
  /* 2 */ @js.native
  object `SHA-1` extends TopLevel[`SHA-1` with Double]
  
  @js.native
  sealed trait `SHA-256` extends webHash
  /* 8 */ @js.native
  object `SHA-256` extends TopLevel[`SHA-256` with Double]
  
  @js.native
  sealed trait `SHA-384` extends webHash
  /* 9 */ @js.native
  object `SHA-384` extends TopLevel[`SHA-384` with Double]
  
  @js.native
  sealed trait `SHA-512` extends webHash
  /* 10 */ @js.native
  object `SHA-512` extends TopLevel[`SHA-512` with Double]
}
