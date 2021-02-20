package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewLocation extends StObject {
  
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
  implicit class IViewLocationMutableBuilder[Self <: IViewLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IViewLocation): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverlappedFolder(value: ITypedValue): Self = StObject.set(x, "OverlappedFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapping(value: Boolean): Self = StObject.set(x, "Overlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolder(value: IFolderDefs): Self = StObject.set(x, "ParentFolder", value.asInstanceOf[js.Any])
  }
}
