package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPocket extends StObject {
  
  var generations: js.Array[Double] = js.native
  
  var pocket: String = js.native
}
object ItemPocket {
  
  @scala.inline
  def apply(generations: js.Array[Double], pocket: String): ItemPocket = {
    val __obj = js.Dynamic.literal(generations = generations.asInstanceOf[js.Any], pocket = pocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPocket]
  }
  
  @scala.inline
  implicit class ItemPocketMutableBuilder[Self <: ItemPocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenerations(value: js.Array[Double]): Self = StObject.set(x, "generations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationsVarargs(value: Double*): Self = StObject.set(x, "generations", js.Array(value :_*))
    
    @scala.inline
    def setPocket(value: String): Self = StObject.set(x, "pocket", value.asInstanceOf[js.Any])
  }
}
