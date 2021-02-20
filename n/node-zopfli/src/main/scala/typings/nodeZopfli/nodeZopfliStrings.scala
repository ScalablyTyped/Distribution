package typings.nodeZopfli

import typings.nodeZopfli.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeZopfliStrings {
  
  @js.native
  sealed trait deflate extends Format
  @scala.inline
  def deflate: deflate = "deflate".asInstanceOf[deflate]
  
  @js.native
  sealed trait gzip extends Format
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @js.native
  sealed trait zlib extends Format
  @scala.inline
  def zlib: zlib = "zlib".asInstanceOf[zlib]
}
