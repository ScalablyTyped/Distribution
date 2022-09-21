package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.buildProgress
import typings.parcelTypes.parcelTypesStrings.bundling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundlingProgressEvent
  extends StObject
     with BuildProgressEvent {
  
  val phase: bundling
  
  val `type`: buildProgress
}
object BundlingProgressEvent {
  
  inline def apply(): BundlingProgressEvent = {
    val __obj = js.Dynamic.literal(phase = "bundling")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[BundlingProgressEvent]
  }
  
  extension [Self <: BundlingProgressEvent](x: Self) {
    
    inline def setPhase(value: bundling): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setType(value: buildProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
