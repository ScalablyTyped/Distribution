package typings.photoshop.domConstantsMod

import typings.photoshop.photoshopStrings.optimizedbaseline
import typings.photoshop.photoshopStrings.progressive
import typings.photoshop.photoshopStrings.standardbaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.photoshop.photoshopStrings.standardbaseline
  - typings.photoshop.photoshopStrings.progressive
  - typings.photoshop.photoshopStrings.optimizedbaseline
*/
trait JPEGFormatOptions extends StObject
object JPEGFormatOptions {
  
  /**
    * Optimized color and a slightly reduced file size.
    */
  inline def OPTIMIZEDBASELINE: optimizedbaseline = "optimizedbaseline".asInstanceOf[optimizedbaseline]
  
  /**
    * Displays a series of increasing detailed scans as the image downloads.
    */
  inline def PROGRESSIVE: progressive = "progressive".asInstanceOf[progressive]
  
  /**
    * Format recognized by most web browsers.
    */
  inline def STANDARDBASELINE: standardbaseline = "standardbaseline".asInstanceOf[standardbaseline]
}
