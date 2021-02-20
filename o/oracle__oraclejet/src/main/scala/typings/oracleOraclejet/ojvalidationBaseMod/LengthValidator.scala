package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.anon.CountBy
import typings.oracleOraclejet.anon.Max
import typings.oracleOraclejet.anon.TooLong
import typings.oracleOraclejet.ojvalidationBaseMod.LengthValidator.ValidatorOptions
import typings.oracleOraclejet.oracleOraclejetStrings.codePoint
import typings.oracleOraclejet.oracleOraclejetStrings.codeUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator")
@js.native
class LengthValidator () extends Validator[Double | String] {
  def this(options: ValidatorOptions) = this()
  
  @JSName("getHint")
  def getHint_MLengthValidator(): String | Null = js.native
  
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}
/* static members */
object LengthValidator {
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@oracle/oraclejet/ojvalidation-base", "LengthValidator.defaults")
  @js.native
  def defaults: CountBy = js.native
  @scala.inline
  def defaults_=(x: CountBy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ValidatorOptions extends StObject {
    
    var countBy: js.UndefOr[codeUnit | codePoint] = js.native
    
    var hint: js.UndefOr[Max] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var messageDetail: js.UndefOr[TooLong] = js.native
    
    var messageSummary: js.UndefOr[TooLong] = js.native
    
    var min: js.UndefOr[Double] = js.native
  }
  object ValidatorOptions {
    
    @scala.inline
    def apply(): ValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatorOptions]
    }
    
    @scala.inline
    implicit class ValidatorOptionsMutableBuilder[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountBy(value: codeUnit | codePoint): Self = StObject.set(x, "countBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountByUndefined: Self = StObject.set(x, "countBy", js.undefined)
      
      @scala.inline
      def setHint(value: Max): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessageDetail(value: TooLong): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
      
      @scala.inline
      def setMessageSummary(value: TooLong): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
}
