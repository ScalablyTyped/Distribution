package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecialFolder extends StObject {
  
  // The unique identifier for this item in the /drive/special collection
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object SpecialFolder {
  
  @scala.inline
  def apply(): SpecialFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecialFolder]
  }
  
  @scala.inline
  implicit class SpecialFolderMutableBuilder[Self <: SpecialFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
