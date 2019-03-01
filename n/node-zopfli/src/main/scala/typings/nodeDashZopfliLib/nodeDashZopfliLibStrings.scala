package typings
package nodeDashZopfliLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashZopfliLibStrings {
  @js.native
  sealed trait deflate
    extends nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format
  
  @js.native
  sealed trait gzip
    extends nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format
  
  @js.native
  sealed trait zlib
    extends nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format
  
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  @scala.inline
  def zlib: zlib = "zlib".asInstanceOf[zlib]
}

