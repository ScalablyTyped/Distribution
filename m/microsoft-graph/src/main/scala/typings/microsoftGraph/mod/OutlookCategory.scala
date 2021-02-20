package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookCategory extends Entity {
  
  /**
    * A pre-set color constant that characterizes a category, and that is mapped to one of 25 predefined colors. See the note
    * below.
    */
  var color: js.UndefOr[NullableOption[CategoryColor]] = js.native
  
  /**
    * A unique name that identifies a category in the user's mailbox. After a category is created, the name cannot be
    * changed. Read-only.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
}
object OutlookCategory {
  
  @scala.inline
  def apply(): OutlookCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookCategory]
  }
  
  @scala.inline
  implicit class OutlookCategoryMutableBuilder[Self <: OutlookCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: NullableOption[CategoryColor]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
