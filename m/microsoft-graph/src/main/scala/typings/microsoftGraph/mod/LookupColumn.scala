package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupColumn extends js.Object {
  
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleValues: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether values in the column should be able to exceed the standard limit of 255 characters.
  var allowUnlimitedLength: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The name of the lookup source column.
  var columnName: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier of the lookup source list.
  var listId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * If specified, this column is a secondary lookup, pulling an additional field from the list item looked up by the
    * primary lookup. Use the list item looked up by the primary as the source for the column named here.
    */
  var primaryLookupColumnId: js.UndefOr[NullableOption[String]] = js.native
}
object LookupColumn {
  
  @scala.inline
  def apply(): LookupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupColumn]
  }
  
  @scala.inline
  implicit class LookupColumnOps[Self <: LookupColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMultipleValues(value: NullableOption[Boolean]): Self = this.set("allowMultipleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleValues: Self = this.set("allowMultipleValues", js.undefined)
    
    @scala.inline
    def setAllowMultipleValuesNull: Self = this.set("allowMultipleValues", null)
    
    @scala.inline
    def setAllowUnlimitedLength(value: NullableOption[Boolean]): Self = this.set("allowUnlimitedLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnlimitedLength: Self = this.set("allowUnlimitedLength", js.undefined)
    
    @scala.inline
    def setAllowUnlimitedLengthNull: Self = this.set("allowUnlimitedLength", null)
    
    @scala.inline
    def setColumnName(value: NullableOption[String]): Self = this.set("columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    
    @scala.inline
    def setColumnNameNull: Self = this.set("columnName", null)
    
    @scala.inline
    def setListId(value: NullableOption[String]): Self = this.set("listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListId: Self = this.set("listId", js.undefined)
    
    @scala.inline
    def setListIdNull: Self = this.set("listId", null)
    
    @scala.inline
    def setPrimaryLookupColumnId(value: NullableOption[String]): Self = this.set("primaryLookupColumnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryLookupColumnId: Self = this.set("primaryLookupColumnId", js.undefined)
    
    @scala.inline
    def setPrimaryLookupColumnIdNull: Self = this.set("primaryLookupColumnId", null)
  }
}
