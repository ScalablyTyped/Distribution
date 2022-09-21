package typings.opentok.mod

import typings.opentok.opentokStrings.bestFit
import typings.opentok.opentokStrings.focus
import typings.opentok.opentokStrings.horizontalPresentation
import typings.opentok.opentokStrings.pip
import typings.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredefinedArchiveLayoutOptions
  extends StObject
     with ArchiveLayoutOptions {
  
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation | focus
}
object PredefinedArchiveLayoutOptions {
  
  inline def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation | focus): PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedArchiveLayoutOptions]
  }
  
  extension [Self <: PredefinedArchiveLayoutOptions](x: Self) {
    
    inline def setType(value: bestFit | pip | verticalPresentation | horizontalPresentation | focus): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
