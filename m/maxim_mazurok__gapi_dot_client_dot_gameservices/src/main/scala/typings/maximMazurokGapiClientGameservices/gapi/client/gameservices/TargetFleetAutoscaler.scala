package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetFleetAutoscaler extends StObject {
  
  /** The name of the Agones autoscaler. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Encapsulates the source of the Agones fleet spec. Details about the Agones autoscaler spec. */
  var specSource: js.UndefOr[SpecSource] = js.undefined
}
object TargetFleetAutoscaler {
  
  inline def apply(): TargetFleetAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFleetAutoscaler]
  }
  
  extension [Self <: TargetFleetAutoscaler](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpecSource(value: SpecSource): Self = StObject.set(x, "specSource", value.asInstanceOf[js.Any])
    
    inline def setSpecSourceUndefined: Self = StObject.set(x, "specSource", js.undefined)
  }
}
