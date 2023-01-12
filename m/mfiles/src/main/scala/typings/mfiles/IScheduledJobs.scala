package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledJobs extends StObject {
  
  val Count: Double
  
  def Item(Index: Double): IScheduledJob
}
object IScheduledJobs {
  
  inline def apply(Count: Double, Item: Double => IScheduledJob): IScheduledJobs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IScheduledJobs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IScheduledJobs] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IScheduledJob): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
