package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortSpec extends js.Object {
  
  /** The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color. */
  var backgroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The background fill color to sort by; cells with this fill color are sorted to the top. Mutually exclusive with foreground_color, and must be an RGB-type color. If background_color
    * is also set, this field takes precedence.
    */
  var backgroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** Reference to a data source column. */
  var dataSourceColumnReference: js.UndefOr[DataSourceColumnReference] = js.native
  
  /** The dimension the sort should be applied to. */
  var dimensionIndex: js.UndefOr[Double] = js.native
  
  /** The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color. */
  var foregroundColor: js.UndefOr[Color] = js.native
  
  /**
    * The foreground color to sort by; cells with this foreground color are sorted to the top. Mutually exclusive with background_color, and must be an RGB-type color. If foreground_color
    * is also set, this field takes precedence.
    */
  var foregroundColorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The order data should be sorted. */
  var sortOrder: js.UndefOr[String] = js.native
}
object SortSpec {
  
  @scala.inline
  def apply(): SortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSpec]
  }
  
  @scala.inline
  implicit class SortSpecOps[Self <: SortSpec] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorStyle(value: ColorStyle): Self = this.set("backgroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColorStyle: Self = this.set("backgroundColorStyle", js.undefined)
    
    @scala.inline
    def setDataSourceColumnReference(value: DataSourceColumnReference): Self = this.set("dataSourceColumnReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceColumnReference: Self = this.set("dataSourceColumnReference", js.undefined)
    
    @scala.inline
    def setDimensionIndex(value: Double): Self = this.set("dimensionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionIndex: Self = this.set("dimensionIndex", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: Color): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    
    @scala.inline
    def setForegroundColorStyle(value: ColorStyle): Self = this.set("foregroundColorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColorStyle: Self = this.set("foregroundColorStyle", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
