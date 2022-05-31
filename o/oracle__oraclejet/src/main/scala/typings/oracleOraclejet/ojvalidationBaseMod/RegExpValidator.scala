package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojvalidationBaseMod.RegExpValidator.ValidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojvalidation-base", "RegExpValidator")
@js.native
class RegExpValidator ()
  extends StObject
     with Validator[String | Double] {
  def this(options: ValidatorOptions) = this()
  
  @JSName("getHint")
  def getHint_MRegExpValidator(): String | Null = js.native
  
  /* CompleteClass */
  override def validate(value: String | Double): Unit = js.native
  def validate(value: String): Unit = js.native
  def validate(value: Double): Unit = js.native
}
object RegExpValidator {
  
  // tslint:disable-next-line interface-over-type-literal
  trait ValidatorOptions extends StObject {
    
    var hint: js.UndefOr[String] = js.undefined
    
    var messageDetail: js.UndefOr[String] = js.undefined
    
    var messageSummary: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
  }
  object ValidatorOptions {
    
    inline def apply(): ValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatorOptions]
    }
    
    extension [Self <: ValidatorOptions](x: Self) {
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setMessageDetail(value: String): Self = StObject.set(x, "messageDetail", value.asInstanceOf[js.Any])
      
      inline def setMessageDetailUndefined: Self = StObject.set(x, "messageDetail", js.undefined)
      
      inline def setMessageSummary(value: String): Self = StObject.set(x, "messageSummary", value.asInstanceOf[js.Any])
      
      inline def setMessageSummaryUndefined: Self = StObject.set(x, "messageSummary", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
}
