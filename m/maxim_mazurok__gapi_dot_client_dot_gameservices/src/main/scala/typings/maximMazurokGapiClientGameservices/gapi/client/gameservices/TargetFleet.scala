package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetFleet extends StObject {
  
  /** The name of the Agones fleet. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Encapsulates the source of the Agones fleet spec. The Agones fleet spec source. */
  var specSource: js.UndefOr[SpecSource] = js.undefined
}
object TargetFleet {
  
  inline def apply(): TargetFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFleet]
  }
  
  extension [Self <: TargetFleet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpecSource(value: SpecSource): Self = StObject.set(x, "specSource", value.asInstanceOf[js.Any])
    
    inline def setSpecSourceUndefined: Self = StObject.set(x, "specSource", js.undefined)
  }
}
