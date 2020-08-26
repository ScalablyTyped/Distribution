package typings.officeUiFabricReact.suggestionsStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionsStoreOptions[T] extends js.Object {
  var getAriaLabel: js.UndefOr[js.Function1[/* item */ T, String]] = js.native
}

object SuggestionsStoreOptions {
  @scala.inline
  def apply[T](): SuggestionsStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionsStoreOptions[T]]
  }
  @scala.inline
  implicit class SuggestionsStoreOptionsOps[Self <: SuggestionsStoreOptions[_], T] (val x: Self with SuggestionsStoreOptions[T]) extends AnyVal {
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
    def setGetAriaLabel(value: /* item */ T => String): Self = this.set("getAriaLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAriaLabel: Self = this.set("getAriaLabel", js.undefined)
  }
  
}

