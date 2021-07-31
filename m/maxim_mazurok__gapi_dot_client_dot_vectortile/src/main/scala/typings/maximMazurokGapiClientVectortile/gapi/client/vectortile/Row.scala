package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /**
    * The difference between each successive pair of altitudes, from west to east. The first, westmost point, is just the altitude rather than a diff. The units are specified by the
    * altitude_multiplier parameter above; the value in meters is given by altitude_multiplier * altitude_diffs[n]. The altitude row (in metres above sea level) can be reconstructed with:
    * a[0] = altitude_diffs[0] * altitude_multiplier when n > 0, a[n] = a[n-1] + altitude_diffs[n-1] * altitude_multiplier.
    */
  var altitudeDiffs: js.UndefOr[js.Array[Double]] = js.undefined
}
object Row {
  
  @scala.inline
  def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeDiffs(value: js.Array[Double]): Self = StObject.set(x, "altitudeDiffs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeDiffsUndefined: Self = StObject.set(x, "altitudeDiffs", js.undefined)
    
    @scala.inline
    def setAltitudeDiffsVarargs(value: Double*): Self = StObject.set(x, "altitudeDiffs", js.Array(value :_*))
  }
}
