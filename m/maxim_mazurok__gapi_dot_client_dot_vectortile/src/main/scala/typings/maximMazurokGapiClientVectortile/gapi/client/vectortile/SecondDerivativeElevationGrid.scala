package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecondDerivativeElevationGrid extends js.Object {
  
  /** A multiplier applied to the elements in the encoded data to extract the actual altitudes in meters. */
  var altitudeMultiplier: js.UndefOr[Double] = js.native
  
  /** The number of columns included in the encoded elevation data (i.e. the horizontal resolution of the grid). */
  var columnCount: js.UndefOr[Double] = js.native
  
  /**
    * A stream of elements each representing a point on the tile running across each row from left to right, top to bottom. There will be precisely horizontal_resolution *
    * vertical_resolution elements in the stream. The elements are not the heights, rather the second order derivative of the values one would expect in a stream of height data. Each
    * element is a varint with the following encoding: ------------------------------------------------------------------------| | Head Nibble |
    * ------------------------------------------------------------------------| | Bit 0 | Bit 1 | Bits 2-3 | | Terminator| Sign (1=neg) | Least significant 2 bits of absolute error |
    * ------------------------------------------------------------------------| | Tail Nibble #1 | ------------------------------------------------------------------------| | Bit 0 | Bit
    * 1-3 | | Terminator| Least significant 3 bits of absolute error | ------------------------------------------------------------------------| | ... | Tail Nibble #n |
    * ------------------------------------------------------------------------| | Bit 0 | Bit 1-3 | | Terminator| Least significant 3 bits of absolute error |
    * ------------------------------------------------------------------------|
    */
  var encodedData: js.UndefOr[String] = js.native
  
  /** The number of rows included in the encoded elevation data (i.e. the vertical resolution of the grid). */
  var rowCount: js.UndefOr[Double] = js.native
}
object SecondDerivativeElevationGrid {
  
  @scala.inline
  def apply(): SecondDerivativeElevationGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecondDerivativeElevationGrid]
  }
  
  @scala.inline
  implicit class SecondDerivativeElevationGridOps[Self <: SecondDerivativeElevationGrid] (val x: Self) extends AnyVal {
    
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
    def setAltitudeMultiplier(value: Double): Self = this.set("altitudeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitudeMultiplier: Self = this.set("altitudeMultiplier", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setEncodedData(value: String): Self = this.set("encodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedData: Self = this.set("encodedData", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
  }
}
