package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel
  extends /* key */ StringDictionary[js.Any] {
  var viewModel: js.Object
}

object ViewModel {
  @scala.inline
  def apply(viewModel: js.Object, StringDictionary: /* name */ StringDictionary[js.Any] = null): ViewModel = {
    val __obj = js.Dynamic.literal(viewModel = viewModel.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ViewModel]
  }
}

