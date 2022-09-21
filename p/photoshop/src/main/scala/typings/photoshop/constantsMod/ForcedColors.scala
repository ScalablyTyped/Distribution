package typings.photoshop.constantsMod

import typings.photoshop.photoshopStrings.blackAndWhite
import typings.photoshop.photoshopStrings.none
import typings.photoshop.photoshopStrings.primaries
import typings.photoshop.photoshopStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.photoshop.photoshopStrings.none
  - typings.photoshop.photoshopStrings.blackAndWhite
  - typings.photoshop.photoshopStrings.primaries
  - typings.photoshop.photoshopStrings.web
*/
trait ForcedColors extends StObject
object ForcedColors {
  
  /** Pure black and pure white */
  inline def BLACKANDWHITE: blackAndWhite = "blackAndWhite".asInstanceOf[blackAndWhite]
  
  /** None */
  inline def NONE: none = "none".asInstanceOf[none]
  
  /**
    * Red, green, blue, cyan, magenta, yellow, black, and white.
    */
  inline def PRIMARIES: primaries = "primaries".asInstanceOf[primaries]
  
  /**
    * The 216 web-safe colors
    */
  inline def WEB: web = "web".asInstanceOf[web]
}
