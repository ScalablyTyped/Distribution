package typings.mmmagic

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mmmagic", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var MAGIC_APPLE: bitmask = js.native
  
  var MAGIC_CHECK: bitmask = js.native
  
  var MAGIC_CONTINUE: bitmask = js.native
  
  var MAGIC_DEBUG: bitmask = js.native
  
  var MAGIC_DEVICES: bitmask = js.native
  
  var MAGIC_MIME: bitmask = js.native
  
  var MAGIC_MIME_ENCODING: bitmask = js.native
  
  var MAGIC_MIME_TYPE: bitmask = js.native
  
  var MAGIC_NONE: bitmask = js.native
  
  var MAGIC_NO_CHECK_APPTYPE: bitmask = js.native
  
  var MAGIC_NO_CHECK_CDF: bitmask = js.native
  
  var MAGIC_NO_CHECK_ELF: bitmask = js.native
  
  var MAGIC_NO_CHECK_ENCODING: bitmask = js.native
  
  var MAGIC_NO_CHECK_SOFT: bitmask = js.native
  
  var MAGIC_NO_CHECK_TAR: bitmask = js.native
  
  var MAGIC_NO_CHECK_TEXT: bitmask = js.native
  
  var MAGIC_NO_CHECK_TOKENS: bitmask = js.native
  
  var MAGIC_PRESERVE_ATIME: bitmask = js.native
  
  var MAGIC_RAW: bitmask = js.native
  
  var MAGIC_SYMLINK: bitmask = js.native
  
  @js.native
  class Magic () extends js.Object {
    def this(magicPath: String) = this()
    def this(mask: bitmask) = this()
    def this(magicPath: js.UndefOr[scala.Nothing], mask: bitmask) = this()
    def this(magicPath: String, mask: bitmask) = this()
    
    def detect(data: Buffer, callback: DetectionCallback): Unit = js.native
    
    def detectFile(path: String, callback: DetectionCallback): Unit = js.native
  }
  
  /**
    * callback for detect() and detectFile()
    * Result is a string, except when MAGIC_CONTINUE is set,
    * then it is an array of string
    */
  type DetectionCallback = js.Function2[/* err */ Error, /* result */ String | js.Array[String], Unit]
  
  type bitmask = Double
}
