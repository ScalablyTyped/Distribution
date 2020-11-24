package typings.postmanCollection.mod

import typings.postmanCollection.anon.Host
import typings.postmanCollection.anon.Pattern
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "UrlMatchPattern")
@js.native
class UrlMatchPattern protected () extends js.Object {
  def this(options: String) = this()
  def this(options: Pattern) = this()
  
  def createMatchPattern(): js.UndefOr[Host] = js.native
  
  def getProtocols(): js.Array[String] = js.native
  
  def globPatternToRegexp(pattern: String): RegExp = js.native
  
  def matchAbsoluteHostPattern(matchRegexObject: Host, remote: String): Boolean = js.native
  
  def matchAnyHost(matchRegexObject: Host): Boolean = js.native
  
  def matchSuffixHostPattern(matchRegexObject: Host, remote: String): Boolean = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  def test(urlStr: String): Boolean = js.native
  
  def testHost(host: String): Boolean = js.native
  
  def testPath(path: String): Boolean = js.native
  
  def testProtocol(protocol: String): Boolean = js.native
  
  def toJSON(): Pattern = js.native
  
  def update(options: Pattern): Unit = js.native
}
/* static members */
@JSImport("postman-collection", "UrlMatchPattern")
@js.native
object UrlMatchPattern extends js.Object {
  
  var MATCH_ALL_URLS: String = js.native
  
  var PROTOCOL_DELIMITER: String = js.native
}
