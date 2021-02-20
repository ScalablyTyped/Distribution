package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AverageComparativeScore extends StObject {
  
  // Average score within specified basis.
  var averageScore: js.UndefOr[NullableOption[Double]] = js.native
  
  // Scope type. The possible values are: AllTenants, TotalSeats, IndustryTypes.
  var basis: js.UndefOr[NullableOption[String]] = js.native
}
object AverageComparativeScore {
  
  @scala.inline
  def apply(): AverageComparativeScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AverageComparativeScore]
  }
  
  @scala.inline
  implicit class AverageComparativeScoreMutableBuilder[Self <: AverageComparativeScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageScore(value: NullableOption[Double]): Self = StObject.set(x, "averageScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageScoreNull: Self = StObject.set(x, "averageScore", null)
    
    @scala.inline
    def setAverageScoreUndefined: Self = StObject.set(x, "averageScore", js.undefined)
    
    @scala.inline
    def setBasis(value: NullableOption[String]): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasisNull: Self = StObject.set(x, "basis", null)
    
    @scala.inline
    def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
  }
}
