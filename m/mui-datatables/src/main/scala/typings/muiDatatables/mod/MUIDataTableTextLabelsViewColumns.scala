package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableTextLabelsViewColumns extends StObject {
  
  var title: String = js.native
  
  var titleAria: String = js.native
}
object MUIDataTableTextLabelsViewColumns {
  
  @scala.inline
  def apply(title: String, titleAria: String): MUIDataTableTextLabelsViewColumns = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleAria = titleAria.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsViewColumns]
  }
  
  @scala.inline
  implicit class MUIDataTableTextLabelsViewColumnsMutableBuilder[Self <: MUIDataTableTextLabelsViewColumns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAria(value: String): Self = StObject.set(x, "titleAria", value.asInstanceOf[js.Any])
  }
}
