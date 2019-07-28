package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Host
import typings.postmanDashCollection.Anon_Pattern
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "UrlMatchPattern")
@js.native
class UrlMatchPattern protected () extends js.Object {
  def this(options: String) = this()
  def this(options: Anon_Pattern) = this()
  var pattern: js.UndefOr[String] = js.native
  def createMatchPattern(): js.UndefOr[Anon_Host] = js.native
  def getProtocols(): js.Array[String] = js.native
  def globPatternToRegexp(pattern: String): RegExp = js.native
  def matchAbsoluteHostPattern(matchRegexObject: Anon_Host, remote: String): Boolean = js.native
  def matchAnyHost(matchRegexObject: Anon_Host): Boolean = js.native
  def matchSuffixHostPattern(matchRegexObject: Anon_Host, remote: String): Boolean = js.native
  def test(urlStr: String): Boolean = js.native
  def testHost(host: String): Boolean = js.native
  def testPath(path: String): Boolean = js.native
  def testProtocol(protocol: String): Boolean = js.native
  def toJSON(): Anon_Pattern = js.native
  def update(options: Anon_Pattern): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "UrlMatchPattern")
@js.native
object UrlMatchPattern extends js.Object {
  var MATCH_ALL_URLS: String = js.native
  var PROTOCOL_DELIMITER: String = js.native
}

