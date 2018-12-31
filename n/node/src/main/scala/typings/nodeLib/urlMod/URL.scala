package typings
package nodeLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "URL")
@js.native
class URL protected () extends js.Object {
  def this(input: java.lang.String) = this()
  def this(input: java.lang.String, base: java.lang.String) = this()
  def this(input: java.lang.String, base: URL) = this()
  var hash: java.lang.String = js.native
  var host: java.lang.String = js.native
  var hostname: java.lang.String = js.native
  var href: java.lang.String = js.native
  val origin: java.lang.String = js.native
  var password: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var search: java.lang.String = js.native
  val searchParams: URLSearchParams = js.native
  var username: java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
}

// Output of `url.parse`
trait Url extends UrlObjectCommon {
  var port: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String | scala.Null | nodeLib.querystringMod.ParsedUrlQuery] = js.undefined
}

