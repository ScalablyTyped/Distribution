package typings
package nunjucksLib.nunjucksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  var autoescape: js.UndefOr[scala.Boolean] = js.undefined
  var express: js.UndefOr[js.Object] = js.undefined
  var lstripBlocks: js.UndefOr[scala.Boolean] = js.undefined
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.UndefOr[nunjucksLib.Anon_BlockEnd] = js.undefined
  var throwOnUndefined: js.UndefOr[scala.Boolean] = js.undefined
  var trimBlocks: js.UndefOr[scala.Boolean] = js.undefined
  var watch: js.UndefOr[scala.Boolean] = js.undefined
  var web: js.UndefOr[nunjucksLib.Anon_Async] = js.undefined
}

object ConfigureOptions {
  @scala.inline
  def apply(
    autoescape: js.UndefOr[scala.Boolean] = js.undefined,
    express: js.Object = null,
    lstripBlocks: js.UndefOr[scala.Boolean] = js.undefined,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    tags: nunjucksLib.Anon_BlockEnd = null,
    throwOnUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    trimBlocks: js.UndefOr[scala.Boolean] = js.undefined,
    watch: js.UndefOr[scala.Boolean] = js.undefined,
    web: nunjucksLib.Anon_Async = null
  ): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoescape)) __obj.updateDynamic("autoescape")(autoescape)
    if (express != null) __obj.updateDynamic("express")(express)
    if (!js.isUndefined(lstripBlocks)) __obj.updateDynamic("lstripBlocks")(lstripBlocks)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(throwOnUndefined)) __obj.updateDynamic("throwOnUndefined")(throwOnUndefined)
    if (!js.isUndefined(trimBlocks)) __obj.updateDynamic("trimBlocks")(trimBlocks)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    if (web != null) __obj.updateDynamic("web")(web)
    __obj.asInstanceOf[ConfigureOptions]
  }
}

