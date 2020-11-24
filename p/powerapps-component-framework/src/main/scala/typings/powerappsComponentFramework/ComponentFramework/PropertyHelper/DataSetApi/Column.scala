package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata about a column in a dataset
  */
@js.native
trait Column extends js.Object {
  
  /**
    * The alias of this column.
    */
  var alias: String = js.native
  
  /**
    * The manifest type of this column's values.
    */
  var dataType: String = js.native
  
  /**
    * Prevents the UI from making the column sortable.
    */
  var disableSorting: js.UndefOr[Boolean] = js.native
  
  /**
    * Localized display name for the column
    */
  var displayName: String = js.native
  
  /**
    * The column visibility state.
    */
  var isHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Is specific column the primary attrribute of the view's entity
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the column, unique in this dataset
    */
  var name: String = js.native
  
  /**
    * The column order for the layout
    */
  var order: Double = js.native
  
  /**
    * Customized column width ratios
    */
  var visualSizeFactor: Double = js.native
}
object Column {
  
  @scala.inline
  def apply(
    alias: String,
    dataType: String,
    displayName: String,
    name: String,
    order: Double,
    visualSizeFactor: Double
  ): Column = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], visualSizeFactor = visualSizeFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualSizeFactor(value: Double): Self = this.set("visualSizeFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSorting(value: Boolean): Self = this.set("disableSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSorting: Self = this.set("disableSorting", js.undefined)
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
  }
}
