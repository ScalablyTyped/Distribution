package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait webHash extends StObject
/**
  * A list of hash names as accepted by webCrypto functions.
  * {@link https://developer.mozilla.org/en-US/docs/Web/API/SubtleCrypto/digest|Parameters, algo}
  */
@JSImport("openpgp", "enums.webHash")
@js.native
object webHash extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[webHash & Double] = js.native
  
  @js.native
  sealed trait `SHA-1`
    extends StObject
       with webHash
  /* 2 */ val `SHA-1`: typings.openpgp.mod.enums.webHash.`SHA-1` & Double = js.native
  
  @js.native
  sealed trait `SHA-256`
    extends StObject
       with webHash
  /* 8 */ val `SHA-256`: typings.openpgp.mod.enums.webHash.`SHA-256` & Double = js.native
  
  @js.native
  sealed trait `SHA-384`
    extends StObject
       with webHash
  /* 9 */ val `SHA-384`: typings.openpgp.mod.enums.webHash.`SHA-384` & Double = js.native
  
  @js.native
  sealed trait `SHA-512`
    extends StObject
       with webHash
  /* 10 */ val `SHA-512`: typings.openpgp.mod.enums.webHash.`SHA-512` & Double = js.native
}
