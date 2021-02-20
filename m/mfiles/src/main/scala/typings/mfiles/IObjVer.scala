package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjVer extends StObject {
  
  def Clone(): IObjVer = js.native
  
  def CloneFrom(ObjVer: IObjVer): Unit = js.native
  
  var ID: Double = js.native
  
  var ObjID: IObjID = js.native
  
  def Serialize(): js.Array[Double] = js.native
  
  def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit = js.native
  
  def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit = js.native
  
  def ToJSON(): String = js.native
  
  var Type: Double = js.native
  
  def Unserialize(Bytes: js.Array[Double]): Unit = js.native
  
  var Version: Double = js.native
}
object IObjVer {
  
  @scala.inline
  def apply(
    Clone: () => IObjVer,
    CloneFrom: IObjVer => Unit,
    ID: Double,
    ObjID: IObjID,
    Serialize: () => js.Array[Double],
    SetIDs: (Double, Double, Double) => Unit,
    SetObjIDAndVersion: (IObjID, Double) => Unit,
    ToJSON: () => String,
    Type: Double,
    Unserialize: js.Array[Double] => Unit,
    Version: Double
  ): IObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], ObjID = ObjID.asInstanceOf[js.Any], Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction3(SetIDs), SetObjIDAndVersion = js.Any.fromFunction2(SetObjIDAndVersion), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type.asInstanceOf[js.Any], Unserialize = js.Any.fromFunction1(Unserialize), Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjVer]
  }
  
  @scala.inline
  implicit class IObjVerMutableBuilder[Self <: IObjVer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IObjVer): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IObjVer => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjID(value: IObjID): Self = StObject.set(x, "ObjID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialize(value: () => js.Array[Double]): Self = StObject.set(x, "Serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetIDs(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "SetIDs", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetObjIDAndVersion(value: (IObjID, Double) => Unit): Self = StObject.set(x, "SetObjIDAndVersion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnserialize(value: js.Array[Double] => Unit): Self = StObject.set(x, "Unserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
