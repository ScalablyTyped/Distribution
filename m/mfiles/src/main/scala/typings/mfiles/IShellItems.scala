package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellItems extends StObject {
  
  val Count: Double
  
  val Folders: IFolderDefs
  
  def GetObjectVersionsCount(): Double
  
  val ObjectFiles: IObjectFileAndObjVerOfMultipleFiles
  
  val ObjectVersions: IObjectVersions
  
  val ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
}
object IShellItems {
  
  inline def apply(
    Count: Double,
    Folders: IFolderDefs,
    GetObjectVersionsCount: () => Double,
    ObjectFiles: IObjectFileAndObjVerOfMultipleFiles,
    ObjectVersions: IObjectVersions,
    ObjectVersionsAndProperties: IObjectVersionAndPropertiesOfMultipleObjects
  ): IShellItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Folders = Folders.asInstanceOf[js.Any], GetObjectVersionsCount = js.Any.fromFunction0(GetObjectVersionsCount), ObjectFiles = ObjectFiles.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], ObjectVersionsAndProperties = ObjectVersionsAndProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellItems]
  }
  
  extension [Self <: IShellItems](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setFolders(value: IFolderDefs): Self = StObject.set(x, "Folders", value.asInstanceOf[js.Any])
    
    inline def setGetObjectVersionsCount(value: () => Double): Self = StObject.set(x, "GetObjectVersionsCount", js.Any.fromFunction0(value))
    
    inline def setObjectFiles(value: IObjectFileAndObjVerOfMultipleFiles): Self = StObject.set(x, "ObjectFiles", value.asInstanceOf[js.Any])
    
    inline def setObjectVersions(value: IObjectVersions): Self = StObject.set(x, "ObjectVersions", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionsAndProperties(value: IObjectVersionAndPropertiesOfMultipleObjects): Self = StObject.set(x, "ObjectVersionsAndProperties", value.asInstanceOf[js.Any])
  }
}
