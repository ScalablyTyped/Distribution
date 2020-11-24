package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait compression extends js.Object
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.3|RFC4880, section 9.3}
  */
@JSImport("openpgp", "enums.compression")
@js.native
object compression extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[compression with Double] = js.native
  
  @js.native
  sealed trait bzip2 extends compression
  /* 3 */ @js.native
  object bzip2 extends TopLevel[bzip2 with Double]
  
  @js.native
  sealed trait uncompressed extends compression
  /* 0 */ @js.native
  object uncompressed extends TopLevel[uncompressed with Double]
  
  /**
    * RFC1951
    */
  @js.native
  sealed trait zip extends compression
  /* 1 */ @js.native
  object zip extends TopLevel[zip with Double]
  
  /**
    * RFC1950
    */
  @js.native
  sealed trait zlib extends compression
  /* 2 */ @js.native
  object zlib extends TopLevel[zlib with Double]
}
