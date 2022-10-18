package typings.photoshop.domConstantsMod

import typings.photoshop.photoshopStrings.display
import typings.photoshop.photoshopStrings.dontDisplay
import typings.photoshop.photoshopStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.photoshop.photoshopStrings.display
  - typings.photoshop.photoshopStrings.silent
  - typings.photoshop.photoshopStrings.dontDisplay
*/
trait DialogModes extends StObject
object DialogModes {
  
  /**
    * All dialogs will be shown
    */
  inline def ALL: display = "display".asInstanceOf[display]
  
  /**
    * Dialogs will be shown only if Photoshop raises an error
    */
  inline def ERROR: silent = "silent".asInstanceOf[silent]
  
  /**
    * All dialogs will be hidden, and bad calls will silently fail
    */
  inline def NONE: dontDisplay = "dontDisplay".asInstanceOf[dontDisplay]
}
