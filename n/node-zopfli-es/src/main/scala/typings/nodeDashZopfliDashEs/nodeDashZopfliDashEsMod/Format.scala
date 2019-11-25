package typings.nodeDashZopfliDashEs.nodeDashZopfliDashEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZopfliDashEs.nodeDashZopfliDashEsStrings.deflate
  - typings.nodeDashZopfliDashEs.nodeDashZopfliDashEsStrings.gzip
  - typings.nodeDashZopfliDashEs.nodeDashZopfliDashEsStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typings.nodeDashZopfliDashEs.nodeDashZopfliDashEsStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typings.nodeDashZopfliDashEs.nodeDashZopfliDashEsStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typings.nodeDashZopfliDashEs.nodeDashZopfliDashEsStrings.zlib = this.cast("zlib")
}

