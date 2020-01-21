package typings.nodeZopfliEs

import typings.nodeZopfliEs.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeZopfliEsStrings {
  @js.native
  sealed trait deflate extends Format
  
  @js.native
  sealed trait gzip extends Format
  
  @js.native
  sealed trait zlib extends Format
  
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  @scala.inline
  def zlib: zlib = "zlib".asInstanceOf[zlib]
}

