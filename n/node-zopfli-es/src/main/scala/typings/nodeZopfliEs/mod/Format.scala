package typings.nodeZopfliEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZopfliEs.nodeZopfliEsStrings.deflate
  - typings.nodeZopfliEs.nodeZopfliEsStrings.gzip
  - typings.nodeZopfliEs.nodeZopfliEsStrings.zlib
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deflate: typings.nodeZopfliEs.nodeZopfliEsStrings.deflate = this.cast("deflate")
  @scala.inline
  def gzip: typings.nodeZopfliEs.nodeZopfliEsStrings.gzip = this.cast("gzip")
  @scala.inline
  def zlib: typings.nodeZopfliEs.nodeZopfliEsStrings.zlib = this.cast("zlib")
}

