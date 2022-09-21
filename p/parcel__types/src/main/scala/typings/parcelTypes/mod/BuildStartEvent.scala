package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.buildStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildStartEvent
  extends StObject
     with ReporterEvent {
  
  val `type`: buildStart
}
object BuildStartEvent {
  
  inline def apply(): BuildStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("buildStart")
    __obj.asInstanceOf[BuildStartEvent]
  }
  
  extension [Self <: BuildStartEvent](x: Self) {
    
    inline def setType(value: buildStart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
