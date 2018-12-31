package typings
package polymerDashTsLib.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var attached: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var attributeChanged: js.UndefOr[
    js.Function3[/* attrName */ java.lang.String, /* oldVal */ js.Any, /* newVal */ js.Any, scala.Unit]
  ] = js.undefined
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var created: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var detached: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var listeners: js.UndefOr[js.Object] = js.undefined
  var observers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var properties: js.UndefOr[js.Object] = js.undefined
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

