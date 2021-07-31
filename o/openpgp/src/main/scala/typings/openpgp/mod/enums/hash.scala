package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[hash & Double] = js.native
  
  @js.native
  sealed trait md5
    extends StObject
       with hash
  /* 1 */ val md5: typings.openpgp.mod.enums.hash.md5 & Double = js.native
  
  @js.native
  sealed trait ripemd
    extends StObject
       with hash
  /* 3 */ val ripemd: typings.openpgp.mod.enums.hash.ripemd & Double = js.native
  
  @js.native
  sealed trait sha1
    extends StObject
       with hash
  /* 2 */ val sha1: typings.openpgp.mod.enums.hash.sha1 & Double = js.native
  
  @js.native
  sealed trait sha224
    extends StObject
       with hash
  /* 11 */ val sha224: typings.openpgp.mod.enums.hash.sha224 & Double = js.native
  
  @js.native
  sealed trait sha256
    extends StObject
       with hash
  /* 8 */ val sha256: typings.openpgp.mod.enums.hash.sha256 & Double = js.native
  
  @js.native
  sealed trait sha384
    extends StObject
       with hash
  /* 9 */ val sha384: typings.openpgp.mod.enums.hash.sha384 & Double = js.native
  
  @js.native
  sealed trait sha512
    extends StObject
       with hash
  /* 10 */ val sha512: typings.openpgp.mod.enums.hash.sha512 & Double = js.native
}
