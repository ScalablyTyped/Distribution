package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComparison
  extends /* item */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var __count: js.UndefOr[scala.Double] = js.undefined
  var __offset: js.UndefOr[scala.Double] = js.undefined
  var __order: js.UndefOr[java.lang.String] = js.undefined
}

object IComparison {
  @scala.inline
  def apply(
    StringDictionary: /* item */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    __count: scala.Int | scala.Double = null,
    __offset: scala.Int | scala.Double = null,
    __order: java.lang.String = null
  ): IComparison = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__count != null) __obj.updateDynamic("__count")(__count.asInstanceOf[js.Any])
    if (__offset != null) __obj.updateDynamic("__offset")(__offset.asInstanceOf[js.Any])
    if (__order != null) __obj.updateDynamic("__order")(__order)
    __obj.asInstanceOf[IComparison]
  }
}

