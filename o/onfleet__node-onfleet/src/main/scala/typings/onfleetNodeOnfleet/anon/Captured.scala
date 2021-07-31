package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.tasksMod.Barcode
import typings.onfleetNodeOnfleet.tasksMod.CapturedBarcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Captured extends StObject {
  
  /** Once a task is completed for which barcodes have been captured, the capture details can be found here */
  var captured: js.Array[CapturedBarcode]
  
  /** The requested barcodes */
  var required: js.Array[Barcode]
}
object Captured {
  
  @scala.inline
  def apply(captured: js.Array[CapturedBarcode], required: js.Array[Barcode]): Captured = {
    val __obj = js.Dynamic.literal(captured = captured.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Captured]
  }
  
  @scala.inline
  implicit class CapturedMutableBuilder[Self <: Captured] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptured(value: js.Array[CapturedBarcode]): Self = StObject.set(x, "captured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapturedVarargs(value: CapturedBarcode*): Self = StObject.set(x, "captured", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[Barcode]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredVarargs(value: Barcode*): Self = StObject.set(x, "required", js.Array(value :_*))
  }
}
