package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait compression extends StObject
/**
  * {@link https://tools.ietf.org/html/rfc4880#section-9.3|RFC4880, section 9.3}
  */
@JSImport("openpgp", "enums.compression")
@js.native
object compression extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[compression & Double] = js.native
  
  @js.native
  sealed trait bzip2
    extends StObject
       with compression
  /* 3 */ val bzip2: typings.openpgp.mod.enums.compression.bzip2 & Double = js.native
  
  @js.native
  sealed trait uncompressed
    extends StObject
       with compression
  /* 0 */ val uncompressed: typings.openpgp.mod.enums.compression.uncompressed & Double = js.native
  
  /**
    * RFC1951
    */
  @js.native
  sealed trait zip
    extends StObject
       with compression
  /* 1 */ val zip: typings.openpgp.mod.enums.compression.zip & Double = js.native
  
  /**
    * RFC1950
    */
  @js.native
  sealed trait zlib
    extends StObject
       with compression
  /* 2 */ val zlib: typings.openpgp.mod.enums.compression.zlib & Double = js.native
}
