package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[compression with Double] = js.native
  /* 3 */ @js.native
  object bzip2 extends TopLevel[bzip2 with Double]
  
  /* 0 */ @js.native
  object uncompressed extends TopLevel[uncompressed with Double]
  
  /* 1 */ @js.native
  object zip extends TopLevel[zip with Double]
  
  /* 2 */ @js.native
  object zlib extends TopLevel[zlib with Double]
  
}

