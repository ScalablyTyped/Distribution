package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectFileAndObjVer extends StObject {
  
  def Clone(): IObjectFileAndObjVer = js.native
  
  val ObjVer: IObjVer = js.native
  
  val ObjectFile: IObjectFile = js.native
  
  def ToJSON(): String = js.native
}
object IObjectFileAndObjVer {
  
  @scala.inline
  def apply(Clone: () => IObjectFileAndObjVer, ObjVer: IObjVer, ObjectFile: IObjectFile, ToJSON: () => String): IObjectFileAndObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjVer = ObjVer.asInstanceOf[js.Any], ObjectFile = ObjectFile.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IObjectFileAndObjVer]
  }
  
  @scala.inline
  implicit class IObjectFileAndObjVerMutableBuilder[Self <: IObjectFileAndObjVer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IObjectFileAndObjVer): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFile(value: IObjectFile): Self = StObject.set(x, "ObjectFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
