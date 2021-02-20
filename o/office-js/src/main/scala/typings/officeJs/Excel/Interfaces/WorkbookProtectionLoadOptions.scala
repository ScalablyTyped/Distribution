package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the protection of a workbook object.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait WorkbookProtectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the workbook is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.native
}
object WorkbookProtectionLoadOptions {
  
  @scala.inline
  def apply(): WorkbookProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProtectionLoadOptions]
  }
  
  @scala.inline
  implicit class WorkbookProtectionLoadOptionsMutableBuilder[Self <: WorkbookProtectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
  }
}
