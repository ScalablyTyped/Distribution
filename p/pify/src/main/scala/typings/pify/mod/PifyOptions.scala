package typings.pify.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PifyOptions extends js.Object {
  var errorFirst: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  var excludeMain: js.UndefOr[Boolean] = js.undefined
  var include: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  var multiArgs: js.UndefOr[Boolean] = js.undefined
  var promiseModule: js.UndefOr[PromiseModule] = js.undefined
}

object PifyOptions {
  @scala.inline
  def apply(
    errorFirst: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String | RegExp] = null,
    excludeMain: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[String | RegExp] = null,
    multiArgs: js.UndefOr[Boolean] = js.undefined,
    promiseModule: PromiseModule = null
  ): PifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorFirst)) __obj.updateDynamic("errorFirst")(errorFirst.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeMain)) __obj.updateDynamic("excludeMain")(excludeMain.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs.asInstanceOf[js.Any])
    if (promiseModule != null) __obj.updateDynamic("promiseModule")(promiseModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PifyOptions]
  }
}

