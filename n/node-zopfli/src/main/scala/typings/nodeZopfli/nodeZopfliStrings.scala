package typings.nodeZopfli

import typings.nodeZopfli.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeZopfliStrings {
  
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @scala.inline
  def zlib: zlib = "zlib".asInstanceOf[zlib]
  
  @js.native
  sealed trait deflate extends Format
  
  @js.native
  sealed trait gzip extends Format
  
  @js.native
  sealed trait zlib extends Format
}
