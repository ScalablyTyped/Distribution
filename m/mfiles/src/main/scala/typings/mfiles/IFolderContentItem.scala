package typings.mfiles

import typings.mfiles.MFiles.MFFolderContentItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderContentItem extends StObject {
  
  val FolderContentItemType: MFFolderContentItemType = js.native
  
  val ObjectVersion: IObjectVersion = js.native
  
  val PropertyFolder: ITypedValue = js.native
  
  val TraditionalFolder: ILookup = js.native
  
  val View: IView = js.native
}
object IFolderContentItem {
  
  @scala.inline
  def apply(
    FolderContentItemType: MFFolderContentItemType,
    ObjectVersion: IObjectVersion,
    PropertyFolder: ITypedValue,
    TraditionalFolder: ILookup,
    View: IView
  ): IFolderContentItem = {
    val __obj = js.Dynamic.literal(FolderContentItemType = FolderContentItemType.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any], PropertyFolder = PropertyFolder.asInstanceOf[js.Any], TraditionalFolder = TraditionalFolder.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderContentItem]
  }
  
  @scala.inline
  implicit class IFolderContentItemMutableBuilder[Self <: IFolderContentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolderContentItemType(value: MFFolderContentItemType): Self = StObject.set(x, "FolderContentItemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersion(value: IObjectVersion): Self = StObject.set(x, "ObjectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyFolder(value: ITypedValue): Self = StObject.set(x, "PropertyFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraditionalFolder(value: ILookup): Self = StObject.set(x, "TraditionalFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: IView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
