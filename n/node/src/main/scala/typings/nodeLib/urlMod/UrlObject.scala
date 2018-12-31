package typings
package nodeLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Input to `url.format`
trait UrlObject extends UrlObjectCommon {
  var port: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var query: js.UndefOr[
    java.lang.String | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
}

