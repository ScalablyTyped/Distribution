package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.RegExpValidator.ValidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-base", "RegExpValidator")
@js.native
class RegExpValidator () extends Validator[String | Double] {
  def this(options: ValidatorOptions) = this()
  
  @JSName("getHint")
  def getHint_MRegExpValidator(): String | Null = js.native
  
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}
object RegExpValidator {
  
  // tslint:disable-next-line interface-over-type-literal
  @js.native
  trait ValidatorOptions extends StObject {
    
    var hint: js.UndefOr[String] = js.native
    
    var messageDetail: js.UndefOr[String] = js.native
    
    var messageSummary: js.UndefOr[String] = js.native
    
    var pattern: js.UndefOr[String] = js.native
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
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setMessageDetail(value: String): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
      
      @scala.inline
      def setMessageSummary(value: String): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
}
