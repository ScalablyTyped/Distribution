package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITraditionalFolderContents extends StObject {
  
  val ID: Double = js.native
  
  val ObjectVersions: IObjectVersions = js.native
  
  val TraditionalFolders: ITraditionalFolders = js.native
}
object ITraditionalFolderContents {
  
  @scala.inline
  def apply(ID: Double, ObjectVersions: IObjectVersions, TraditionalFolders: ITraditionalFolders): ITraditionalFolderContents = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], TraditionalFolders = TraditionalFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITraditionalFolderContents]
  }
  
  @scala.inline
  implicit class ITraditionalFolderContentsMutableBuilder[Self <: ITraditionalFolderContents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersions(value: IObjectVersions): Self = StObject.set(x, "ObjectVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraditionalFolders(value: ITraditionalFolders): Self = StObject.set(x, "TraditionalFolders", value.asInstanceOf[js.Any])
  }
}
