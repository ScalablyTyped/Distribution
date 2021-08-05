package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITraditionalFolderContents extends StObject {
  
  val ID: Double
  
  val ObjectVersions: IObjectVersions
  
  val TraditionalFolders: ITraditionalFolders
}
object ITraditionalFolderContents {
  
  inline def apply(ID: Double, ObjectVersions: IObjectVersions, TraditionalFolders: ITraditionalFolders): ITraditionalFolderContents = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], TraditionalFolders = TraditionalFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITraditionalFolderContents]
  }
  
  extension [Self <: ITraditionalFolderContents](x: Self) {
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setObjectVersions(value: IObjectVersions): Self = StObject.set(x, "ObjectVersions", value.asInstanceOf[js.Any])
    
    inline def setTraditionalFolders(value: ITraditionalFolders): Self = StObject.set(x, "TraditionalFolders", value.asInstanceOf[js.Any])
  }
}
