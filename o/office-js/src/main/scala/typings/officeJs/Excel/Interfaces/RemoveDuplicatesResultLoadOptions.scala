package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the results from the removeDuplicates method on range
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait RemoveDuplicatesResultLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Number of duplicated rows removed by the operation.
    *
    * [Api set: ExcelApi 1.9]
    */
  var removed: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Number of remaining unique rows present in the resulting range.
    *
    * [Api set: ExcelApi 1.9]
    */
  var uniqueRemaining: js.UndefOr[Boolean] = js.native
}
object RemoveDuplicatesResultLoadOptions {
  
  @scala.inline
  def apply(): RemoveDuplicatesResultLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDuplicatesResultLoadOptions]
  }
  
  @scala.inline
  implicit class RemoveDuplicatesResultLoadOptionsMutableBuilder[Self <: RemoveDuplicatesResultLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setUniqueRemaining(value: Boolean): Self = StObject.set(x, "uniqueRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueRemainingUndefined: Self = StObject.set(x, "uniqueRemaining", js.undefined)
  }
}
