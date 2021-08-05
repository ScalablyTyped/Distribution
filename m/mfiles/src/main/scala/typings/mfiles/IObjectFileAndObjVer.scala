package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFileAndObjVer extends StObject {
  
  def Clone(): IObjectFileAndObjVer
  
  val ObjVer: IObjVer
  
  val ObjectFile: IObjectFile
  
  def ToJSON(): String
}
object IObjectFileAndObjVer {
  
  inline def apply(Clone: () => IObjectFileAndObjVer, ObjVer: IObjVer, ObjectFile: IObjectFile, ToJSON: () => String): IObjectFileAndObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjVer = ObjVer.asInstanceOf[js.Any], ObjectFile = ObjectFile.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IObjectFileAndObjVer]
  }
  
  extension [Self <: IObjectFileAndObjVer](x: Self) {
    
    inline def setClone(value: () => IObjectFileAndObjVer): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    inline def setObjectFile(value: IObjectFile): Self = StObject.set(x, "ObjectFile", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
