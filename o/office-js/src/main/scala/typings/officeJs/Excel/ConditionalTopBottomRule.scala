package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.BottomItems
import typings.officeJs.officeJsStrings.BottomPercent
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.TopItems
import typings.officeJs.officeJsStrings.TopPercent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the rule of the top/bottom conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalTopBottomRule extends StObject {
  
  /**
    *
    * The rank between 1 and 1000 for numeric ranks or 1 and 100 for percent ranks.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rank: Double
  
  /**
    *
    * Format values based on the top or bottom rank.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
}
object ConditionalTopBottomRule {
  
  @scala.inline
  def apply(
    rank: Double,
    `type`: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
  ): ConditionalTopBottomRule = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTopBottomRule]
  }
  
  @scala.inline
  implicit class ConditionalTopBottomRuleMutableBuilder[Self <: ConditionalTopBottomRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: ConditionalTopBottomCriterionType | Invalid | TopItems | TopPercent | BottomItems | BottomPercent
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
