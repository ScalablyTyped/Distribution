package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineFill extends StObject {
  
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.native
}
object LineFill {
  
  @scala.inline
  def apply(): LineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineFill]
  }
  
  @scala.inline
  implicit class LineFillMutableBuilder[Self <: LineFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolidFill(value: SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
