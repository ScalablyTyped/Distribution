package typings.pnpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopLevelPackageLocator extends PackageLocator {
  
  var name: Null = js.native
  
  var reference: Null = js.native
}
object TopLevelPackageLocator {
  
  @scala.inline
  def apply(name: Null, reference: Null): TopLevelPackageLocator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelPackageLocator]
  }
  
  @scala.inline
  implicit class TopLevelPackageLocatorOps[Self <: TopLevelPackageLocator] (val x: Self) extends AnyVal {
    
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
    def setName(value: Null): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Null): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
