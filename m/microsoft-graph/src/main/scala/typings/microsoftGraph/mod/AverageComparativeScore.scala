package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AverageComparativeScore extends StObject {
  
  // Average score within specified basis.
  var averageScore: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes.
  var basis: js.UndefOr[NullableOption[String]] = js.undefined
}
object AverageComparativeScore {
  
  inline def apply(): AverageComparativeScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AverageComparativeScore]
  }
  
  extension [Self <: AverageComparativeScore](x: Self) {
    
    inline def setAverageScore(value: NullableOption[Double]): Self = StObject.set(x, "averageScore", value.asInstanceOf[js.Any])
    
    inline def setAverageScoreNull: Self = StObject.set(x, "averageScore", null)
    
    inline def setAverageScoreUndefined: Self = StObject.set(x, "averageScore", js.undefined)
    
    inline def setBasis(value: NullableOption[String]): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisNull: Self = StObject.set(x, "basis", null)
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
  }
}
