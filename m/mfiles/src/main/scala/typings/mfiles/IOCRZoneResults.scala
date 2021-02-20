package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRZoneResults extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IOCRZoneResult = js.native
}
object IOCRZoneResults {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IOCRZoneResult): IOCRZoneResults = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IOCRZoneResults]
  }
  
  @scala.inline
  implicit class IOCRZoneResultsMutableBuilder[Self <: IOCRZoneResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IOCRZoneResult): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
