package typings.opentok.mod

import typings.opentok.opentokStrings.bestFit
import typings.opentok.opentokStrings.custom
import typings.opentok.opentokStrings.horizontalPresentation
import typings.opentok.opentokStrings.pip
import typings.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastLayoutOptions extends StObject {
  
  var stylesheet: js.UndefOr[String] = js.undefined
  
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation | custom
}
object BroadcastLayoutOptions {
  
  @scala.inline
  def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation | custom): BroadcastLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastLayoutOptions]
  }
  
  @scala.inline
  implicit class BroadcastLayoutOptionsMutableBuilder[Self <: BroadcastLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
    
    @scala.inline
    def setType(value: bestFit | pip | verticalPresentation | horizontalPresentation | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
