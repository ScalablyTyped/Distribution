package typings.officeUiFabricReact.suggestionsStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsStoreOptions[T] extends js.Object {
  var getAriaLabel: js.UndefOr[js.Function1[/* item */ T, String]] = js.undefined
}

object SuggestionsStoreOptions {
  @scala.inline
  def apply[T](getAriaLabel: /* item */ T => String = null): SuggestionsStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (getAriaLabel != null) __obj.updateDynamic("getAriaLabel")(js.Any.fromFunction1(getAriaLabel))
    __obj.asInstanceOf[SuggestionsStoreOptions[T]]
  }
}

