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

