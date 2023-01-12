package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.buildProgress
import typings.parcelTypes.parcelTypesStrings.optimizing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizingProgressEvent
  extends StObject
     with BuildProgressEvent {
  
  val bundle: NamedBundle
  
  val phase: optimizing
  
  val `type`: buildProgress
}
object OptimizingProgressEvent {
  
  inline def apply(bundle: NamedBundle): OptimizingProgressEvent = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], phase = "optimizing")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[OptimizingProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimizingProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setBundle(value: NamedBundle): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: optimizing): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setType(value: buildProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
