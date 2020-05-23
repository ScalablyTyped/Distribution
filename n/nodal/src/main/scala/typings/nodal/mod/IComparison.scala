package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComparison
  extends /* item */ StringDictionary[js.Any] {
  var __count: js.UndefOr[Double] = js.undefined
  var __offset: js.UndefOr[Double] = js.undefined
  var __order: js.UndefOr[String] = js.undefined
}

object IComparison {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    __count: js.UndefOr[Double] = js.undefined,
    __offset: js.UndefOr[Double] = js.undefined,
    __order: String = null
  ): IComparison = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(__count)) __obj.updateDynamic("__count")(__count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(__offset)) __obj.updateDynamic("__offset")(__offset.get.asInstanceOf[js.Any])
    if (__order != null) __obj.updateDynamic("__order")(__order.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComparison]
  }
}

