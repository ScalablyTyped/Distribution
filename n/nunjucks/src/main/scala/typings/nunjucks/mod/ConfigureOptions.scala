package typings.nunjucks.mod

import typings.nunjucks.anon.Async
import typings.nunjucks.anon.BlockEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  var autoescape: js.UndefOr[Boolean] = js.undefined
  var express: js.UndefOr[js.Object] = js.undefined
  var lstripBlocks: js.UndefOr[Boolean] = js.undefined
  var noCache: js.UndefOr[Boolean] = js.undefined
  var tags: js.UndefOr[BlockEnd] = js.undefined
  var throwOnUndefined: js.UndefOr[Boolean] = js.undefined
  var trimBlocks: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
  var web: js.UndefOr[Async] = js.undefined
}

object ConfigureOptions {
  @scala.inline
  def apply(
    autoescape: js.UndefOr[Boolean] = js.undefined,
    express: js.Object = null,
    lstripBlocks: js.UndefOr[Boolean] = js.undefined,
    noCache: js.UndefOr[Boolean] = js.undefined,
    tags: BlockEnd = null,
    throwOnUndefined: js.UndefOr[Boolean] = js.undefined,
    trimBlocks: js.UndefOr[Boolean] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined,
    web: Async = null
  ): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoescape)) __obj.updateDynamic("autoescape")(autoescape.get.asInstanceOf[js.Any])
    if (express != null) __obj.updateDynamic("express")(express.asInstanceOf[js.Any])
    if (!js.isUndefined(lstripBlocks)) __obj.updateDynamic("lstripBlocks")(lstripBlocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnUndefined)) __obj.updateDynamic("throwOnUndefined")(throwOnUndefined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimBlocks)) __obj.updateDynamic("trimBlocks")(trimBlocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
}

