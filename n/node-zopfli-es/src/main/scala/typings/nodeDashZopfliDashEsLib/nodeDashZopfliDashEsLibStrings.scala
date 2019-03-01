package typings
package nodeDashZopfliDashEsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashZopfliDashEsLibStrings {
  @js.native
  sealed trait deflate
    extends nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format
  
  @js.native
  sealed trait gzip
    extends nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format
  
  @js.native
  sealed trait zlib
    extends nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format
  
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  @scala.inline
  def zlib: zlib = "zlib".asInstanceOf[zlib]
}

