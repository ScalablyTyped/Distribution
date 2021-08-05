package typings.mmmagic

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mmmagic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mmmagic", "MAGIC_APPLE")
  @js.native
  def MAGIC_APPLE: bitmask = js.native
  inline def MAGIC_APPLE_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_APPLE")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_CHECK")
  @js.native
  def MAGIC_CHECK: bitmask = js.native
  inline def MAGIC_CHECK_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_CHECK")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_CONTINUE")
  @js.native
  def MAGIC_CONTINUE: bitmask = js.native
  inline def MAGIC_CONTINUE_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_CONTINUE")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_DEBUG")
  @js.native
  def MAGIC_DEBUG: bitmask = js.native
  inline def MAGIC_DEBUG_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_DEVICES")
  @js.native
  def MAGIC_DEVICES: bitmask = js.native
  inline def MAGIC_DEVICES_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_DEVICES")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_MIME")
  @js.native
  def MAGIC_MIME: bitmask = js.native
  inline def MAGIC_MIME_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_MIME")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_MIME_ENCODING")
  @js.native
  def MAGIC_MIME_ENCODING: bitmask = js.native
  inline def MAGIC_MIME_ENCODING_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_MIME_ENCODING")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_MIME_TYPE")
  @js.native
  def MAGIC_MIME_TYPE: bitmask = js.native
  inline def MAGIC_MIME_TYPE_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_MIME_TYPE")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NONE")
  @js.native
  def MAGIC_NONE: bitmask = js.native
  inline def MAGIC_NONE_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NONE")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_APPTYPE")
  @js.native
  def MAGIC_NO_CHECK_APPTYPE: bitmask = js.native
  inline def MAGIC_NO_CHECK_APPTYPE_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_APPTYPE")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_CDF")
  @js.native
  def MAGIC_NO_CHECK_CDF: bitmask = js.native
  inline def MAGIC_NO_CHECK_CDF_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_CDF")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_ELF")
  @js.native
  def MAGIC_NO_CHECK_ELF: bitmask = js.native
  inline def MAGIC_NO_CHECK_ELF_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_ELF")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_ENCODING")
  @js.native
  def MAGIC_NO_CHECK_ENCODING: bitmask = js.native
  inline def MAGIC_NO_CHECK_ENCODING_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_ENCODING")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_SOFT")
  @js.native
  def MAGIC_NO_CHECK_SOFT: bitmask = js.native
  inline def MAGIC_NO_CHECK_SOFT_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_SOFT")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_TAR")
  @js.native
  def MAGIC_NO_CHECK_TAR: bitmask = js.native
  inline def MAGIC_NO_CHECK_TAR_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_TAR")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_TEXT")
  @js.native
  def MAGIC_NO_CHECK_TEXT: bitmask = js.native
  inline def MAGIC_NO_CHECK_TEXT_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_TEXT")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_NO_CHECK_TOKENS")
  @js.native
  def MAGIC_NO_CHECK_TOKENS: bitmask = js.native
  inline def MAGIC_NO_CHECK_TOKENS_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_NO_CHECK_TOKENS")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_PRESERVE_ATIME")
  @js.native
  def MAGIC_PRESERVE_ATIME: bitmask = js.native
  inline def MAGIC_PRESERVE_ATIME_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_PRESERVE_ATIME")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_RAW")
  @js.native
  def MAGIC_RAW: bitmask = js.native
  inline def MAGIC_RAW_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_RAW")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "MAGIC_SYMLINK")
  @js.native
  def MAGIC_SYMLINK: bitmask = js.native
  inline def MAGIC_SYMLINK_=(x: bitmask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGIC_SYMLINK")(x.asInstanceOf[js.Any])
  
  @JSImport("mmmagic", "Magic")
  @js.native
  class Magic () extends StObject {
    def this(magicPath: String) = this()
    def this(mask: bitmask) = this()
    def this(magicPath: String, mask: bitmask) = this()
    def this(magicPath: Unit, mask: bitmask) = this()
    
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
