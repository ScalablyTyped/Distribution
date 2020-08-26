package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ViewModelOps[Self <: ViewModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setViewModel(value: js.Object): Self = this.set("viewModel", value.asInstanceOf[js.Any])
  }
  
}

