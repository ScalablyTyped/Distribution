package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetFleetAutoscaler extends StObject {
  
  /** The name of the Agones autoscaler. */
  var name: js.UndefOr[String] = js.native
  
  /** Encapsulates the source of the Agones fleet spec. Details about the Agones autoscaler spec. */
  var specSource: js.UndefOr[SpecSource] = js.native
}
object TargetFleetAutoscaler {
  
  @scala.inline
  def apply(): TargetFleetAutoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFleetAutoscaler]
  }
  
  @scala.inline
  implicit class TargetFleetAutoscalerMutableBuilder[Self <: TargetFleetAutoscaler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSpecSource(value: SpecSource): Self = StObject.set(x, "specSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecSourceUndefined: Self = StObject.set(x, "specSource", js.undefined)
  }
}
