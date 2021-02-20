package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModel
  extends /* key */ StringDictionary[js.Any] {
  
  var viewModel: js.Object = js.native
}
object ViewModel {
  
  @scala.inline
  def apply(viewModel: js.Object): ViewModel = {
    val __obj = js.Dynamic.literal(viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModel]
  }
  
  @scala.inline
  implicit class ViewModelMutableBuilder[Self <: ViewModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewModel(value: js.Object): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
  }
}
