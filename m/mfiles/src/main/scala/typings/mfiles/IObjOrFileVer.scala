package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjOrFileVer extends StObject {
  
  def Clone(): IObjOrFileVer
  
  var FileVer: IFileVer
  
  def IsFile(): Boolean
  
  var ObjVer: IObjVer
}
object IObjOrFileVer {
  
  @scala.inline
  def apply(Clone: () => IObjOrFileVer, FileVer: IFileVer, IsFile: () => Boolean, ObjVer: IObjVer): IObjOrFileVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FileVer = FileVer.asInstanceOf[js.Any], IsFile = js.Any.fromFunction0(IsFile), ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjOrFileVer]
  }
  
  @scala.inline
  implicit class IObjOrFileVerMutableBuilder[Self <: IObjOrFileVer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IObjOrFileVer): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileVer(value: IFileVer): Self = StObject.set(x, "FileVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = StObject.set(x, "IsFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
  }
}
