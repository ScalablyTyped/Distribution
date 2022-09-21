package typings.pathCompleteExtname

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Takes a file path and returns the complete file extension (multiple dots, like .tar.gz)
    * Automatically determines if running under Posix or Win32 environment
    */
  inline def apply(path: String): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("path-complete-extname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Takes a file path and returns the complete file extension (multiple dots, like .tar.gz)
    * Uses Posix logic for extension extraction
    */
  inline def posix(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("posix")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Takes a file path and returns the complete file extension (multiple dots, like .tar.gz)
    * Uses Win32 logic for extension extraction
    */
  inline def win32(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("win32")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
