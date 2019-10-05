package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait compression extends js.Object

/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.3|RFC4880, section 9.3}
  */
@JSImport("openpgp", "enums.compression")
@js.native
object compression extends js.Object {
  @js.native
  sealed trait bzip2 extends compression
  
  @js.native
  sealed trait uncompressed extends compression
  
  /**
    * RFC1951
    */
  @js.native
  sealed trait zip extends compression
  
  /**
    * RFC1950
    */
  @js.native
  sealed trait zlib extends compression
  
  /* 3 */ val bzip2: typings.openpgp.openpgpMod.enums.compression.bzip2 with Double = js.native
  /* 0 */ val uncompressed: typings.openpgp.openpgpMod.enums.compression.uncompressed with Double = js.native
  /* 1 */ val zip: typings.openpgp.openpgpMod.enums.compression.zip with Double = js.native
  /* 2 */ val zlib: typings.openpgp.openpgpMod.enums.compression.zlib with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[compression with Double] = js.native
}

