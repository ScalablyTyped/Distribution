package typings.onfleetNodeOnfleet.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapturedBarcode extends js.Object {
  
  /** The base64 string of the data contained in the captured barcode */
  var data: js.UndefOr[String] = js.native
  
  /** The ID of the captured barcode */
  var id: String = js.native
  
  /** The [ lon, lat ] coordinates where the barcode capture took place */
  var location: js.Tuple2[Double, Double] = js.native
  
  /** The symbology that was captured */
  var symbology: String = js.native
  
  /** The time at which the barcode capture happened */
  var time: Double = js.native
  
  /** Whether the barcode was captured as a result of a barcode request */
  var wasRequested: Boolean = js.native
}
object CapturedBarcode {
  
  @scala.inline
  def apply(
    id: String,
    location: js.Tuple2[Double, Double],
    symbology: String,
    time: Double,
    wasRequested: Boolean
  ): CapturedBarcode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], symbology = symbology.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], wasRequested = wasRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedBarcode]
  }
  
  @scala.inline
  implicit class CapturedBarcodeOps[Self <: CapturedBarcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: js.Tuple2[Double, Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbology(value: String): Self = this.set("symbology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasRequested(value: Boolean): Self = this.set("wasRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
