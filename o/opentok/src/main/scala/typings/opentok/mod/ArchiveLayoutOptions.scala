package typings.opentok.mod

import typings.opentok.opentokStrings.bestFit
import typings.opentok.opentokStrings.horizontalPresentation
import typings.opentok.opentokStrings.pip
import typings.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.opentok.mod.PredefinedArchiveLayoutOptions
  - typings.opentok.mod.CustomArchiveLayoutOptions
*/
trait ArchiveLayoutOptions extends StObject
object ArchiveLayoutOptions {
  
  inline def CustomArchiveLayoutOptions(stylesheet: String): typings.opentok.mod.CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typings.opentok.mod.CustomArchiveLayoutOptions]
  }
  
  inline def PredefinedArchiveLayoutOptions(`type`: bestFit | pip | verticalPresentation | horizontalPresentation): typings.opentok.mod.PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.opentok.mod.PredefinedArchiveLayoutOptions]
  }
}
