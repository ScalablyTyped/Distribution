package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModel
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var viewModel: js.Object
}
object ViewModel {
  
  inline def apply(viewModel: js.Object): ViewModel = {
    val __obj = js.Dynamic.literal(viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewModel] (val x: Self) extends AnyVal {
    
    inline def setViewModel(value: js.Object): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
  }
}
