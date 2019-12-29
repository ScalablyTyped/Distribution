package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait hash extends js.Object

/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC4880, section 9.4}
  */
@JSImport("openpgp", "enums.hash")
@js.native
object hash extends js.Object {
  @js.native
  sealed trait md5 extends hash
  
  @js.native
  sealed trait ripemd extends hash
  
  @js.native
  sealed trait sha1 extends hash
  
  @js.native
  sealed trait sha224 extends hash
  
  @js.native
  sealed trait sha256 extends hash
  
  @js.native
  sealed trait sha384 extends hash
  
  @js.native
  sealed trait sha512 extends hash
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[hash with Double] = js.native
  /* 1 */ @js.native
  object md5 extends TopLevel[md5 with Double]
  
  /* 3 */ @js.native
  object ripemd extends TopLevel[ripemd with Double]
  
  /* 2 */ @js.native
  object sha1 extends TopLevel[sha1 with Double]
  
  /* 11 */ @js.native
  object sha224 extends TopLevel[sha224 with Double]
  
  /* 8 */ @js.native
  object sha256 extends TopLevel[sha256 with Double]
  
  /* 9 */ @js.native
  object sha384 extends TopLevel[sha384 with Double]
  
  /* 10 */ @js.native
  object sha512 extends TopLevel[sha512 with Double]
  
}

