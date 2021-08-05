package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomApplications extends StObject {
  
  def Clone(): ICustomApplications
  
  val Count: Double
  
  def Item(Index: Double): ICustomApplication
}
object ICustomApplications {
  
  inline def apply(Clone: () => ICustomApplications, Count: Double, Item: Double => ICustomApplication): ICustomApplications = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[ICustomApplications]
  }
  
  extension [Self <: ICustomApplications](x: Self) {
    
    inline def setClone(value: () => ICustomApplications): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ICustomApplication): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
