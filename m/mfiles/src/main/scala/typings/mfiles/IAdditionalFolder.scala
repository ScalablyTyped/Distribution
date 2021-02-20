package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAdditionalFolder extends StObject {
  
  def Clone(): IAdditionalFolder = js.native
  
  var Folder: String = js.native
  
  var Impersonation: IImpersonation = js.native
  
  var LimitInMB: Double = js.native
}
object IAdditionalFolder {
  
  @scala.inline
  def apply(Clone: () => IAdditionalFolder, Folder: String, Impersonation: IImpersonation, LimitInMB: Double): IAdditionalFolder = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Folder = Folder.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], LimitInMB = LimitInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalFolder]
  }
  
  @scala.inline
  implicit class IAdditionalFolderMutableBuilder[Self <: IAdditionalFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IAdditionalFolder): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFolder(value: String): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitInMB(value: Double): Self = StObject.set(x, "LimitInMB", value.asInstanceOf[js.Any])
  }
}
