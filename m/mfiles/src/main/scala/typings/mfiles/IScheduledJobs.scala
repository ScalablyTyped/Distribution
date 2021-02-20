package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledJobs extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IScheduledJob = js.native
}
object IScheduledJobs {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IScheduledJob): IScheduledJobs = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IScheduledJobs]
  }
  
  @scala.inline
  implicit class IScheduledJobsMutableBuilder[Self <: IScheduledJobs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IScheduledJob): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
