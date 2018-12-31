package typings
package preloadjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.RequestUtils")
@js.native
class RequestUtils () extends js.Object

@JSGlobal("createjs.RequestUtils")
@js.native
object RequestUtils extends js.Object {
  // properties
  var ABSOLUTE_PATH: stdLib.RegExp = js.native
  var EXTENSION_PATT: stdLib.RegExp = js.native
  var RELATIVE_PATH: stdLib.RegExp = js.native
  // methods
  def buildPath(src: java.lang.String): java.lang.String = js.native
  def buildPath(src: java.lang.String, data: js.Object): java.lang.String = js.native
  def formatQueryString(data: js.Object): java.lang.String = js.native
  def formatQueryString(data: js.Object, query: js.Array[js.Object]): java.lang.String = js.native
  def getTypeByExtension(extension: java.lang.String): java.lang.String = js.native
  def isAudioTag(item: js.Object): scala.Boolean = js.native
  def isBinary(`type`: java.lang.String): scala.Boolean = js.native
  def isCrossDomain(item: js.Object): scala.Boolean = js.native
  def isImageTag(item: js.Object): scala.Boolean = js.native
  def isLocal(item: js.Object): scala.Boolean = js.native
  def isText(`type`: java.lang.String): scala.Boolean = js.native
  def isVideoTag(item: js.Object): scala.Boolean = js.native
  def parseURI(path: java.lang.String): js.Object = js.native
}

