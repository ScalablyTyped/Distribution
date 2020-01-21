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
    StringDictionary: /* item */ StringDictionary[js.Any] = null,
    __count: Int | Double = null,
    __offset: Int | Double = null,
    __order: String = null
  ): IComparison = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__count != null) __obj.updateDynamic("__count")(__count.asInstanceOf[js.Any])
    if (__offset != null) __obj.updateDynamic("__offset")(__offset.asInstanceOf[js.Any])
    if (__order != null) __obj.updateDynamic("__order")(__order.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComparison]
  }
}

