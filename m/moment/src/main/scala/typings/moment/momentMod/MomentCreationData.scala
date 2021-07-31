package typings.moment.momentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MomentCreationData extends StObject {
  
  var format: js.UndefOr[MomentFormatSpecification] = js.undefined
  
  var input: MomentInput
  
  var isUTC: Boolean
  
  var locale: Locale_
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object MomentCreationData {
  
  @scala.inline
  def apply(isUTC: Boolean, locale: Locale_): MomentCreationData = {
    val __obj = js.Dynamic.literal(isUTC = isUTC.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentCreationData]
  }
  
  @scala.inline
  implicit class MomentCreationDataMutableBuilder[Self <: MomentCreationData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: MomentFormatSpecification): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatVarargs(value: (String | MomentBuiltinFormat)*): Self = StObject.set(x, "format", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: MomentInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNull: Self = StObject.set(x, "input", null)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: (Double | String)*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setIsUTC(value: Boolean): Self = StObject.set(x, "isUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale_): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
