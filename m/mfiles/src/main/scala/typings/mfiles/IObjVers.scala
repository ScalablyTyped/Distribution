package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjVers extends StObject {
  
  def Add(Index: Double, ObjVer: IObjVer): Unit
  
  def Clone(): IObjVers
  
  val Count: Double
  
  def GetAllDistinctObjIDs(): IObjIDs
  
  def Item(Index: Double): IObjVer
  
  def Remove(Index: Double): Unit
  
  def ToJSON(): String
}
object IObjVers {
  
  @scala.inline
  def apply(
    Add: (Double, IObjVer) => Unit,
    Clone: () => IObjVers,
    Count: Double,
    GetAllDistinctObjIDs: () => IObjIDs,
    Item: Double => IObjVer,
    Remove: Double => Unit,
    ToJSON: () => String
  ): IObjVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetAllDistinctObjIDs = js.Any.fromFunction0(GetAllDistinctObjIDs), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IObjVers]
  }
  
  @scala.inline
  implicit class IObjVersMutableBuilder[Self <: IObjVers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IObjVer) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IObjVers): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllDistinctObjIDs(value: () => IObjIDs): Self = StObject.set(x, "GetAllDistinctObjIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItem(value: Double => IObjVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => String): Self = StObject.set(x, "ToJSON", js.Any.fromFunction0(value))
  }
}
