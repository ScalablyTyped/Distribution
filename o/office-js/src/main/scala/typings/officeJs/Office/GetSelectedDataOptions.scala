package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for customizing what data is returned and how it is formatted.
  */
trait GetSelectedDataOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Specify whether to get only the visible (that is, filtered-in) data or all the data. Useful when filtering data. 
    * Use {@link Office.FilterType} or string equivalent. This parameter is ignored in Word documents.
    */
  var filterType: js.UndefOr[FilterType | String] = js.undefined
  
  /**
    * Specify whether the data is formatted. Use Office.ValueFormat or string equivalent.
    */
  var valueFormat: js.UndefOr[ValueFormat | String] = js.undefined
}
object GetSelectedDataOptions {
  
  @scala.inline
  def apply(): GetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSelectedDataOptions]
  }
  
  @scala.inline
  implicit class GetSelectedDataOptionsMutableBuilder[Self <: GetSelectedDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType | String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setValueFormat(value: ValueFormat | String): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
  }
}
