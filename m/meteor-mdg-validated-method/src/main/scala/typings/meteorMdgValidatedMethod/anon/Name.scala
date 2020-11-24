package typings.meteorMdgValidatedMethod.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name[TName /* <: String */] extends js.Object {
  
  var name: String | TName = js.native
}
object Name {
  
  @scala.inline
  def apply[TName /* <: String */](name: String | TName): Name[TName] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[TName]]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name[_], TName /* <: String */] (val x: Self with Name[TName]) extends AnyVal {
    
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
    def setName(value: String | TName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
