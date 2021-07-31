package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Landmark extends StObject {
  
  /** Face landmark position. */
  var position: js.UndefOr[Position] = js.undefined
  
  /** Face landmark type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Landmark {
  
  @scala.inline
  def apply(): Landmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Landmark]
  }
  
  @scala.inline
  implicit class LandmarkMutableBuilder[Self <: Landmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
