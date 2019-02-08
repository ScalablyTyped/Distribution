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
  var os: js.UndefOr[Anon_Architecture] = js.undefined
  var prerelease: js.UndefOr[java.lang.String] = js.undefined
  var product: js.UndefOr[java.lang.String] = js.undefined
  var ua: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  def parse(ua: java.lang.String): Platform
}

