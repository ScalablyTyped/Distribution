package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilFileMod extends Shortcut {
  
  @JSImport("sap/ui/core/util/File", JSImport.Default)
  @js.native
  val default: File = js.native
  
  /**
    * @SINCE 1.22.0
    *
    * Utility class to handle files.
    */
  @js.native
  trait File extends StObject {
    
    /**
      * Triggers a download / save action of the given file.
      */
    def save(
      /**
      * file content
      */
    sData: String,
      /**
      * file name
      */
    sFileName: String,
      /**
      * file extension
      */
    sFileExtension: String,
      /**
      * file mime-type
      */
    sMimeType: String,
      /**
      * file charset
      */
    sCharset: String
    ): Unit = js.native
    def save(
      /**
      * file content
      */
    sData: String,
      /**
      * file name
      */
    sFileName: String,
      /**
      * file extension
      */
    sFileExtension: String,
      /**
      * file mime-type
      */
    sMimeType: String,
      /**
      * file charset
      */
    sCharset: String,
      /**
      * Whether to prepend a unicode byte order mark (only applies for utf-8 charset). Default is `false` except
      * when `sFileExtension` === 'csv' and `sCharset` === 'utf-8' it is `true` (compatibility reasons).
      */
    bByteOrderMark: Boolean
    ): Unit = js.native
  }
  
  type _To = File
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreUtilFileMod.foo` */
  override def _to: File = default
}
