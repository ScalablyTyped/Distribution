package typings.photoshop.constantsMod

import typings.photoshop.photoshopStrings.placeAfter
import typings.photoshop.photoshopStrings.placeAtBeginning
import typings.photoshop.photoshopStrings.placeAtEnd
import typings.photoshop.photoshopStrings.placeBefore
import typings.photoshop.photoshopStrings.placeInside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.photoshop.photoshopStrings.placeBefore
  - typings.photoshop.photoshopStrings.placeAtBeginning
  - typings.photoshop.photoshopStrings.placeAtEnd
  - typings.photoshop.photoshopStrings.placeAfter
  - typings.photoshop.photoshopStrings.placeInside
*/
trait ElementPlacement extends StObject
object ElementPlacement {
  
  /**
    * Place below a layer, below group if group layer
    */
  inline def PLACEAFTER: placeAfter = "placeAfter".asInstanceOf[placeAfter]
  
  /**
    * Place at the top
    */
  inline def PLACEATBEGINNING: placeAtBeginning = "placeAtBeginning".asInstanceOf[placeAtBeginning]
  
  /**
    * Place at the bottom, above background if background layer exists
    */
  inline def PLACEATEND: placeAtEnd = "placeAtEnd".asInstanceOf[placeAtEnd]
  
  /**
    * Place above a layer, above group if group layer
    */
  inline def PLACEBEFORE: placeBefore = "placeBefore".asInstanceOf[placeBefore]
  
  /**
    * Place inside a group layer, throws error if not group layer
    */
  inline def PLACEINSIDE: placeInside = "placeInside".asInstanceOf[placeInside]
}
