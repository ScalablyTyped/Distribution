package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var view: js.Array[Node]
  
  var viewModel: js.Object
}
object View {
  
  inline def apply(view: js.Array[Node], viewModel: js.Object): View = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setView(value: js.Array[Node]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: js.Object): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewVarargs(value: Node*): Self = StObject.set(x, "view", js.Array(value*))
  }
}
