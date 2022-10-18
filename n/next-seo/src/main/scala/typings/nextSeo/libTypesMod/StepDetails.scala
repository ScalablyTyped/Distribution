package typings.nextSeo.libTypesMod

import typings.nextSeo.nextSeoStrings.HowToDirection
import typings.nextSeo.nextSeoStrings.HowToTip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepDetails extends StObject {
  
  var text: String
  
  var `type`: HowToTip | HowToDirection
}
object StepDetails {
  
  inline def apply(text: String, `type`: HowToTip | HowToDirection): StepDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDetails]
  }
  
  extension [Self <: StepDetails](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: HowToTip | HowToDirection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
