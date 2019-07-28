package typings.nunjucks.nunjucksMod

import typings.nunjucks.Anon_Async
import typings.nunjucks.Anon_BlockEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  var autoescape: js.UndefOr[Boolean] = js.undefined
  var express: js.UndefOr[js.Object] = js.undefined
  var lstripBlocks: js.UndefOr[Boolean] = js.undefined
  var noCache: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[Anon_BlockEnd] = js.undefined
  var throwOnUndefined: js.UndefOr[Boolean] = js.undefined
  var trimBlocks: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var web: js.UndefOr[Anon_Async] = js.undefined
}

object ConfigureOptions {
  @scala.inline
  def apply(
    autoescape: js.UndefOr[Boolean] = js.undefined,
    express: js.Object = null,
    lstripBlocks: js.UndefOr[Boolean] = js.undefined,
    noCache: js.UndefOr[Boolean] = js.undefined,
    tags: Anon_BlockEnd = null,
    throwOnUndefined: js.UndefOr[Boolean] = js.undefined,
    trimBlocks: js.UndefOr[Boolean] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined,
    web: Anon_Async = null
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

