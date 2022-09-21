package typings.photoshop.constantsMod

import typings.photoshop.photoshopStrings.component
import typings.photoshop.photoshopStrings.maskedAreas
import typings.photoshop.photoshopStrings.selectedAreas
import typings.photoshop.photoshopStrings.spot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.photoshop.photoshopStrings.component
  - typings.photoshop.photoshopStrings.maskedAreas
  - typings.photoshop.photoshopStrings.selectedAreas
  - typings.photoshop.photoshopStrings.spot
*/
trait ChannelType extends StObject
object ChannelType {
  
  /** Specific to document color mode */
  inline def COMPONENT: component = "component".asInstanceOf[component]
  
  /** Alpha channel where color indicates masked area */
  inline def MASKEDAREA: maskedAreas = "maskedAreas".asInstanceOf[maskedAreas]
  
  /** Alpha channel where color indicates selected area */
  inline def SELECTEDAREA: selectedAreas = "selectedAreas".asInstanceOf[selectedAreas]
  
  /** Alpha channel to store a spot color */
  inline def SPOTCOLOR: spot = "spot".asInstanceOf[spot]
}
