package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjID extends StObject {
  
  def Clone(): IObjID
  
  def CloneFrom(ObjID: IObjID): Unit
  
  var ID: Double
  
  def Serialize(): js.Array[Double]
  
  def SetIDs(ObjType: Double, ID: Double): Unit
  
  def ToJSON(): String
  
  var Type: Double
  
  def Unserialize(Bytes: js.Array[Double]): Unit
}
object IObjID {
  
  inline def apply(
    Clone: () => IObjID,
    CloneFrom: IObjID => Unit,
    ID: Double,
    Serialize: () => js.Array[Double],
    SetIDs: (Double, Double) => Unit,
    ToJSON: () => String,
    Type: Double,
    Unserialize: js.Array[Double] => Unit
  ): IObjID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction2(SetIDs), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type.asInstanceOf[js.Any], Unserialize = js.Any.fromFunction1(Unserialize))
    __obj.asInstanceOf[IObjID]
  }
  
  extension [Self <: IObjID](x: Self) {
    
    inline def setClone(value: () => IObjID): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCloneFrom(value: IObjID => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: () => js.Array[Double]): Self = StObject.set(x, "Serialize", js.Any.fromFunction0(value))
    
    inline def setSetIDs(value: (Double, Double) => Unit): Self = StObject.set(x, "SetIDs", js.Any.fromFunction2(value))
    
    inline def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnserialize(value: js.Array[Double] => Unit): Self = StObject.set(x, "Unserialize", js.Any.fromFunction1(value))
  }
}
