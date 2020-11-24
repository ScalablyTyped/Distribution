package typings.nestedProperty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidPath extends js.Object {
  
  var validPath: Boolean = js.native
}
object ValidPath {
  
  @scala.inline
  def apply(validPath: Boolean): ValidPath = {
    val __obj = js.Dynamic.literal(validPath = validPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidPath]
  }
  
  @scala.inline
  implicit class ValidPathOps[Self <: ValidPath] (val x: Self) extends AnyVal {
    
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
    def setValidPath(value: Boolean): Self = this.set("validPath", value.asInstanceOf[js.Any])
  }
}
