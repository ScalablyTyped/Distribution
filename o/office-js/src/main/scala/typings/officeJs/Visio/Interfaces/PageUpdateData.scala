package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Page object, for use in "page.set({ ... })". */
@js.native
trait PageUpdateData extends StObject {
  
  /**
    *
    * Returns the view of the page.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewUpdateData] = js.native
}
object PageUpdateData {
  
  @scala.inline
  def apply(): PageUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageUpdateData]
  }
  
  @scala.inline
  implicit class PageUpdateDataMutableBuilder[Self <: PageUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setView(value: PageViewUpdateData): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
