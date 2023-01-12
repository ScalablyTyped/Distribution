package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFileAndVersion extends StObject {
  
  val ObjectFile: IObjectFile
  
  val ObjectVersion: IObjectVersionAndProperties
}
object IObjectFileAndVersion {
  
  inline def apply(ObjectFile: IObjectFile, ObjectVersion: IObjectVersionAndProperties): IObjectFileAndVersion = {
    val __obj = js.Dynamic.literal(ObjectFile = ObjectFile.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectFileAndVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObjectFileAndVersion] (val x: Self) extends AnyVal {
    
    inline def setObjectFile(value: IObjectFile): Self = StObject.set(x, "ObjectFile", value.asInstanceOf[js.Any])
    
    inline def setObjectVersion(value: IObjectVersionAndProperties): Self = StObject.set(x, "ObjectVersion", value.asInstanceOf[js.Any])
  }
}
