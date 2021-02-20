package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBorderFill extends StObject {
  
  /** Solid fill. */
  var solidFill: js.UndefOr[SolidFill] = js.native
}
object TableBorderFill {
  
  @scala.inline
  def apply(): TableBorderFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderFill]
  }
  
  @scala.inline
  implicit class TableBorderFillMutableBuilder[Self <: TableBorderFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolidFill(value: SolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
