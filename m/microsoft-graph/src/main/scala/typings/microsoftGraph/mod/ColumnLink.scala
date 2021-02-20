package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnLink extends Entity {
  
  // The name of the column in this content type.
  var name: js.UndefOr[NullableOption[String]] = js.native
}
object ColumnLink {
  
  @scala.inline
  def apply(): ColumnLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnLink]
  }
  
  @scala.inline
  implicit class ColumnLinkMutableBuilder[Self <: ColumnLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
