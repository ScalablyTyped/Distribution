package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileVer extends StObject {
  
  def Clone(): IFileVer
  
  def CloneFrom(FileVer: IFileVer): Unit
  
  var ID: Double
  
  var Version: Double
}
object IFileVer {
  
  @scala.inline
  def apply(Clone: () => IFileVer, CloneFrom: IFileVer => Unit, ID: Double, Version: Double): IFileVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileVer]
  }
  
  @scala.inline
  implicit class IFileVerMutableBuilder[Self <: IFileVer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IFileVer): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IFileVer => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
