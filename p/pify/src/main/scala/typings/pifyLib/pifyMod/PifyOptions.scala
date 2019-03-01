package typings
package pifyLib.pifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PifyOptions extends js.Object {
  var errorFirst: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var excludeMain: js.UndefOr[scala.Boolean] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var multiArgs: js.UndefOr[scala.Boolean] = js.undefined
  var promiseModule: js.UndefOr[PromiseModule] = js.undefined
}

object PifyOptions {
  @scala.inline
  def apply(
    errorFirst: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: js.Array[java.lang.String | stdLib.RegExp] = null,
    excludeMain: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[java.lang.String | stdLib.RegExp] = null,
    multiArgs: js.UndefOr[scala.Boolean] = js.undefined,
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

