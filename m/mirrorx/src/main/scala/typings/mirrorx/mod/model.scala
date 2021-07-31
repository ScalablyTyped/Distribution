package typings.mirrorx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait model extends StObject {
  
  var effects: js.UndefOr[js.Any] = js.undefined
  
  var initialState: js.UndefOr[js.Any] = js.undefined
  
  var name: String
  
  var reducers: js.UndefOr[js.Any] = js.undefined
}
object model {
  
  @JSImport("mirrorx", "model")
  @js.native
  def apply(options: model): _model = js.native
  
  @scala.inline
  implicit class modelMutableBuilder[Self <: model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffects(value: js.Any): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    @scala.inline
    def setInitialState(value: js.Any): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducers(value: js.Any): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducersUndefined: Self = StObject.set(x, "reducers", js.undefined)
  }
}
