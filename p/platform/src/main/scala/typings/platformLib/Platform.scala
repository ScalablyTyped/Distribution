package typings
package platformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var os: js.UndefOr[Anon_Family] = js.undefined
  var parse: js.UndefOr[js.Function1[/* ua */ java.lang.String, this.type]] = js.undefined
  var prerelease: js.UndefOr[java.lang.String] = js.undefined
  var product: js.UndefOr[java.lang.String] = js.undefined
  @JSName("toString")
  var toString_FPlatform: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var ua: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

