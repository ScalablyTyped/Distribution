package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookSortField extends StObject {
  
  // Represents whether the sorting is done in an ascending fashion.
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  // Represents the color that is the target of the condition if the sorting is on font or cell color.
  var color: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents additional sorting options for this field. The possible values are: Normal, TextAsNumber.
  var dataOption: js.UndefOr[String] = js.undefined
  
  // Represents the icon that is the target of the condition if the sorting is on the cell's icon.
  var icon: js.UndefOr[NullableOption[WorkbookIcon]] = js.undefined
  
  /**
    * Represents the column (or row, depending on the sort orientation) that the condition is on. Represented as an offset
    * from the first column (or row).
    */
  var key: js.UndefOr[Double] = js.undefined
  
  // Represents the type of sorting of this condition. The possible values are: Value, CellColor, FontColor, Icon.
  var sortOn: js.UndefOr[String] = js.undefined
}
object WorkbookSortField {
  
  @scala.inline
  def apply(): WorkbookSortField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSortField]
  }
  
  @scala.inline
  implicit class WorkbookSortFieldMutableBuilder[Self <: WorkbookSortField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    @scala.inline
    def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDataOption(value: String): Self = StObject.set(x, "dataOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataOptionUndefined: Self = StObject.set(x, "dataOption", js.undefined)
    
    @scala.inline
    def setIcon(value: NullableOption[WorkbookIcon]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNull: Self = StObject.set(x, "icon", null)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSortOn(value: String): Self = StObject.set(x, "sortOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOnUndefined: Self = StObject.set(x, "sortOn", js.undefined)
  }
}
