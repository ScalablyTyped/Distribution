package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientError
  extends nodeLib.Error {
  var failCode: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var provider: js.UndefOr[Providers] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

