package typings.photoshop.domConstantsMod

import typings.photoshop.photoshopStrings.customEnum
import typings.photoshop.photoshopStrings.none
import typings.photoshop.photoshopStrings.workingSpaceCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.photoshop.photoshopStrings.customEnum
  - typings.photoshop.photoshopStrings.none
  - typings.photoshop.photoshopStrings.workingSpaceCode
*/
trait ColorProfileType extends StObject
object ColorProfileType {
  
  /**
    * Set for all custom profiles
    */
  inline def CUSTOM: customEnum = "customEnum".asInstanceOf[customEnum]
  
  /**
    * Set when document is not color managed
    */
  inline def NONE: none = "none".asInstanceOf[none]
  
  /**
    * Set when document uses the working color profile
    */
  inline def WORKING: workingSpaceCode = "workingSpaceCode".asInstanceOf[workingSpaceCode]
}
