package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetFleet extends StObject {
  
  /** The name of the Agones fleet. */
  var name: js.UndefOr[String] = js.native
  
  /** Encapsulates the source of the Agones fleet spec. The Agones fleet spec source. */
  var specSource: js.UndefOr[SpecSource] = js.native
}
object TargetFleet {
  
  @scala.inline
  def apply(): TargetFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetFleet]
  }
  
  @scala.inline
  implicit class TargetFleetMutableBuilder[Self <: TargetFleet] (val x: Self) extends AnyVal {
    
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
