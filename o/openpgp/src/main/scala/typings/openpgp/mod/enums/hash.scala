package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait hash extends js.Object
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.4|RFC4880, section 9.4}
  */
@JSImport("openpgp", "enums.hash")
@js.native
object hash extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[hash with Double] = js.native
  
  @js.native
  sealed trait md5 extends hash
  /* 1 */ @js.native
  object md5 extends TopLevel[md5 with Double]
  
  @js.native
  sealed trait ripemd extends hash
  /* 3 */ @js.native
  object ripemd extends TopLevel[ripemd with Double]
  
  @js.native
  sealed trait sha1 extends hash
  /* 2 */ @js.native
  object sha1 extends TopLevel[sha1 with Double]
  
  @js.native
  sealed trait sha224 extends hash
  /* 11 */ @js.native
  object sha224 extends TopLevel[sha224 with Double]
  
  @js.native
  sealed trait sha256 extends hash
  /* 8 */ @js.native
  object sha256 extends TopLevel[sha256 with Double]
  
  @js.native
  sealed trait sha384 extends hash
  /* 9 */ @js.native
  object sha384 extends TopLevel[sha384 with Double]
  
  @js.native
  sealed trait sha512 extends hash
  /* 10 */ @js.native
  object sha512 extends TopLevel[sha512 with Double]
}
