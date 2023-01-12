package typings.mfiles

import typings.mfiles.MFiles.MFFolderContentItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderContentItem extends StObject {
  
  val FolderContentItemType: MFFolderContentItemType
  
  val ObjectVersion: IObjectVersion
  
  val PropertyFolder: ITypedValue
  
  val TraditionalFolder: ILookup
  
  val View: IView
}
object IFolderContentItem {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IFolderContentItem] (val x: Self) extends AnyVal {
    
    inline def setFolderContentItemType(value: MFFolderContentItemType): Self = StObject.set(x, "FolderContentItemType", value.asInstanceOf[js.Any])
    
    inline def setObjectVersion(value: IObjectVersion): Self = StObject.set(x, "ObjectVersion", value.asInstanceOf[js.Any])
    
    inline def setPropertyFolder(value: ITypedValue): Self = StObject.set(x, "PropertyFolder", value.asInstanceOf[js.Any])
    
    inline def setTraditionalFolder(value: ILookup): Self = StObject.set(x, "TraditionalFolder", value.asInstanceOf[js.Any])
    
    inline def setView(value: IView): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
  }
}
