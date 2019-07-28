package typings.pify.pifyMod

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
    if (!js.isUndefined(errorFirst)) __obj.updateDynamic("errorFirst")(errorFirst)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(excludeMain)) __obj.updateDynamic("excludeMain")(excludeMain)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs)
    if (promiseModule != null) __obj.updateDynamic("promiseModule")(promiseModule)
    __obj.asInstanceOf[PifyOptions]
  }
}

