package typings.postmanCollection.mod

import typings.postmanCollection.AnonHost
import typings.postmanCollection.AnonPattern
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "UrlMatchPattern")
@js.native
class UrlMatchPattern protected () extends js.Object {
  def this(options: String) = this()
  def this(options: AnonPattern) = this()
  var pattern: js.UndefOr[String] = js.native
  def createMatchPattern(): js.UndefOr[AnonHost] = js.native
  def getProtocols(): js.Array[String] = js.native
  def globPatternToRegexp(pattern: String): RegExp = js.native
  def matchAbsoluteHostPattern(matchRegexObject: AnonHost, remote: String): Boolean = js.native
  def matchAnyHost(matchRegexObject: AnonHost): Boolean = js.native
  def matchSuffixHostPattern(matchRegexObject: AnonHost, remote: String): Boolean = js.native
  def test(urlStr: String): Boolean = js.native
  def testHost(host: String): Boolean = js.native
  def testPath(path: String): Boolean = js.native
  def testProtocol(protocol: String): Boolean = js.native
  def toJSON(): AnonPattern = js.native
  def update(options: AnonPattern): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "UrlMatchPattern")
@js.native
object UrlMatchPattern extends js.Object {
  var MATCH_ALL_URLS: String = js.native
  var PROTOCOL_DELIMITER: String = js.native
}

