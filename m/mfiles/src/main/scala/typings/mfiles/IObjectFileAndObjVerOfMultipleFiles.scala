package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFileAndObjVerOfMultipleFiles extends StObject {
  
  def Add(Index: Double, ObjectFileAndObjVer: IObjectFileAndObjVer): Unit
  
  def Clone(): IObjectFileAndObjVerOfMultipleFiles
  
  val Count: Double
  
  def Item(Index: Double): IObjectFileAndObjVer
  
  def Remove(Index: Double): Unit
}
object IObjectFileAndObjVerOfMultipleFiles {
  
  inline def apply(
    Add: (Double, IObjectFileAndObjVer) => Unit,
    Clone: () => IObjectFileAndObjVerOfMultipleFiles,
    Count: Double,
    Item: Double => IObjectFileAndObjVer,
    Remove: Double => Unit
  ): IObjectFileAndObjVerOfMultipleFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectFileAndObjVerOfMultipleFiles]
  }
  
  extension [Self <: IObjectFileAndObjVerOfMultipleFiles](x: Self) {
    
    inline def setAdd(value: (Double, IObjectFileAndObjVer) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    inline def setClone(value: () => IObjectFileAndObjVerOfMultipleFiles): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectFileAndObjVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
