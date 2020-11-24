package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewLocation extends js.Object {
  
  def Clone(): IViewLocation = js.native
  
  var OverlappedFolder: ITypedValue = js.native
  
  var Overlapping: Boolean = js.native
  
  var ParentFolder: IFolderDefs = js.native
}
object IViewLocation {
  
  @scala.inline
  def apply(
    Clone: () => IViewLocation,
    OverlappedFolder: ITypedValue,
    Overlapping: Boolean,
    ParentFolder: IFolderDefs
  ): IViewLocation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OverlappedFolder = OverlappedFolder.asInstanceOf[js.Any], Overlapping = Overlapping.asInstanceOf[js.Any], ParentFolder = ParentFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewLocation]
  }
  
  @scala.inline
  implicit class IViewLocationOps[Self <: IViewLocation] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IViewLocation): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverlappedFolder(value: ITypedValue): Self = this.set("OverlappedFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapping(value: Boolean): Self = this.set("Overlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolder(value: IFolderDefs): Self = this.set("ParentFolder", value.asInstanceOf[js.Any])
  }
}
