package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "UrlMatchPattern")
@js.native
class UrlMatchPattern protected () extends js.Object {
  def this(options: java.lang.String) = this()
  def this(options: postmanDashCollectionLib.Anon_Pattern) = this()
  var pattern: js.UndefOr[java.lang.String] = js.native
  def createMatchPattern(): js.UndefOr[postmanDashCollectionLib.Anon_Host] = js.native
  def getProtocols(): js.Array[java.lang.String] = js.native
  def globPatternToRegexp(pattern: java.lang.String): stdLib.RegExp = js.native
  def matchAbsoluteHostPattern(matchRegexObject: postmanDashCollectionLib.Anon_Host, remote: java.lang.String): scala.Boolean = js.native
  def matchAnyHost(matchRegexObject: postmanDashCollectionLib.Anon_Host): scala.Boolean = js.native
  def matchSuffixHostPattern(matchRegexObject: postmanDashCollectionLib.Anon_Host, remote: java.lang.String): scala.Boolean = js.native
  def test(urlStr: java.lang.String): scala.Boolean = js.native
  def testHost(host: java.lang.String): scala.Boolean = js.native
  def testPath(path: java.lang.String): scala.Boolean = js.native
  def testProtocol(protocol: java.lang.String): scala.Boolean = js.native
  def toJSON(): postmanDashCollectionLib.Anon_Pattern = js.native
  def update(options: postmanDashCollectionLib.Anon_Pattern): scala.Unit = js.native
}

/* static members */
@JSImport("postman-collection", "UrlMatchPattern")
@js.native
object UrlMatchPattern extends js.Object {
  var MATCH_ALL_URLS: java.lang.String = js.native
  var PROTOCOL_DELIMITER: java.lang.String = js.native
}

