package typings.preloadjs.createjs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.RequestUtils")
@js.native
class RequestUtils () extends js.Object

/* static members */
@JSGlobal("createjs.RequestUtils")
@js.native
object RequestUtils extends js.Object {
  // properties
  var ABSOLUTE_PATH: RegExp = js.native
  var EXTENSION_PATT: RegExp = js.native
  var RELATIVE_PATH: RegExp = js.native
  // methods
  def buildPath(src: String): String = js.native
  def buildPath(src: String, data: js.Object): String = js.native
  def formatQueryString(data: js.Object): String = js.native
  def formatQueryString(data: js.Object, query: js.Array[js.Object]): String = js.native
  def getTypeByExtension(extension: String): String = js.native
  def isAudioTag(item: js.Object): Boolean = js.native
  def isBinary(`type`: String): Boolean = js.native
  def isCrossDomain(item: js.Object): Boolean = js.native
  def isImageTag(item: js.Object): Boolean = js.native
  def isLocal(item: js.Object): Boolean = js.native
  def isText(`type`: String): Boolean = js.native
  def isVideoTag(item: js.Object): Boolean = js.native
  def parseURI(path: String): js.Object = js.native
}

