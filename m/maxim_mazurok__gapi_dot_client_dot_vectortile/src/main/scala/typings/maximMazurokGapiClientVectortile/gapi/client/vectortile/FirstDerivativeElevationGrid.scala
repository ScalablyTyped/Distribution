package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstDerivativeElevationGrid extends js.Object {
  
  /** A multiplier applied to the altitude fields below to extract the actual altitudes in meters from the elevation grid. */
  var altitudeMultiplier: js.UndefOr[Double] = js.native
  
  /**
    * Rows of points containing altitude data making up the elevation grid. Each row is the same length. Rows are ordered from north to south. E.g: rows[0] is the north-most row, and
    * rows[n] is the south-most row.
    */
  var rows: js.UndefOr[js.Array[Row]] = js.native
}
object FirstDerivativeElevationGrid {
  
  @scala.inline
  def apply(): FirstDerivativeElevationGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstDerivativeElevationGrid]
  }
  
  @scala.inline
  implicit class FirstDerivativeElevationGridOps[Self <: FirstDerivativeElevationGrid] (val x: Self) extends AnyVal {
    
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
    def setRowsVarargs(value: Row*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
