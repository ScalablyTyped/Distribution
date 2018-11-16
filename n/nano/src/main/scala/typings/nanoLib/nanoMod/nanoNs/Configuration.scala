package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Configuration extends js.Object {
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[js.Function2[/* id */ java.lang.String, /* args */ js.Any, scala.Unit]] = js.undefined
  var parseUrl: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[js.Function1[/* params */ js.Any, scala.Unit]] = js.undefined
  var requestDefaults: js.UndefOr[requestLib.requestMod.requestNs.CoreOptions] = js.undefined
  var url: java.lang.String
}

