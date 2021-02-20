package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait hash extends StObject
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC4880, section 9.4}
  */
@JSImport("openpgp", "enums.hash")
@js.native
object hash extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[hash with Double] = js.native
  
  @js.native
  sealed trait md5 extends hash
  /* 1 */ val md5: typings.openpgp.mod.enums.hash.md5 with Double = js.native
  
  @js.native
  sealed trait ripemd extends hash
  /* 3 */ val ripemd: typings.openpgp.mod.enums.hash.ripemd with Double = js.native
  
  @js.native
  sealed trait sha1 extends hash
  /* 2 */ val sha1: typings.openpgp.mod.enums.hash.sha1 with Double = js.native
  
  @js.native
  sealed trait sha224 extends hash
  /* 11 */ val sha224: typings.openpgp.mod.enums.hash.sha224 with Double = js.native
  
  @js.native
  sealed trait sha256 extends hash
  /* 8 */ val sha256: typings.openpgp.mod.enums.hash.sha256 with Double = js.native
  
  @js.native
  sealed trait sha384 extends hash
  /* 9 */ val sha384: typings.openpgp.mod.enums.hash.sha384 with Double = js.native
  
  @js.native
  sealed trait sha512 extends hash
  /* 10 */ val sha512: typings.openpgp.mod.enums.hash.sha512 with Double = js.native
}
