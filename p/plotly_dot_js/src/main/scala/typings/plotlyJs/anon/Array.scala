package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.plotlyJsStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends StObject {
  
  var array: js.Array[Datum] = js.native
  
  var arrayminus: js.UndefOr[js.Array[Datum]] = js.native
  
  var `type`: data = js.native
}
object Array {
  
  @scala.inline
  def apply(array: js.Array[Datum], `type`: data): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[Datum]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayVarargs(value: Datum*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setArrayminus(value: js.Array[Datum]): Self = StObject.set(x, "arrayminus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayminusUndefined: Self = StObject.set(x, "arrayminus", js.undefined)
    
    @scala.inline
    def setArrayminusVarargs(value: Datum*): Self = StObject.set(x, "arrayminus", js.Array(value :_*))
    
    @scala.inline
    def setType(value: data): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
