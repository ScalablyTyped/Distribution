package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _model extends StObject {
  
  var name: String = js.native
  
  var reducers: js.Any = js.native
}
object _model {
  
  @scala.inline
  def apply(name: String, reducers: js.Any): _model = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[_model]
  }
  
  @scala.inline
  implicit class _modelMutableBuilder[Self <: _model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducers(value: js.Any): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
  }
}
