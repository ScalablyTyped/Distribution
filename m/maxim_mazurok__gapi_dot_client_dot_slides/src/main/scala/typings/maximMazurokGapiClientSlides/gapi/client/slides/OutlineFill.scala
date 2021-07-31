package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineFill extends StObject {
  
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}
object OutlineFill {
  
  @scala.inline
  def apply(): OutlineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineFill]
  }
  
  @scala.inline
  implicit class OutlineFillMutableBuilder[Self <: OutlineFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolidFill(value: SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
