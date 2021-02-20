package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IErrorsObject
  extends /* field */ StringDictionary[js.Array[String]] {
  
  var _query: js.UndefOr[js.Any] = js.native
}
object IErrorsObject {
  
  @scala.inline
  def apply(): IErrorsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrorsObject]
  }
  
  @scala.inline
  implicit class IErrorsObjectMutableBuilder[Self <: IErrorsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_query(value: js.Any): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_queryUndefined: Self = StObject.set(x, "_query", js.undefined)
  }
}
