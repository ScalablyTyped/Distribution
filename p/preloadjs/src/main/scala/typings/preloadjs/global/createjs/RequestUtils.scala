package typings.preloadjs.global.createjs

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.RequestUtils")
@js.native
class RequestUtils ()
  extends typings.preloadjs.createjs.RequestUtils
/* static members */
object RequestUtils {
  
  @JSGlobal("createjs.RequestUtils")
  @js.native
  val ^ : js.Any = js.native
  
  // properties
  @JSGlobal("createjs.RequestUtils.ABSOLUTE_PATH")
  @js.native
  def ABSOLUTE_PATH: RegExp = js.native
  @scala.inline
  def ABSOLUTE_PATH_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABSOLUTE_PATH")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.RequestUtils.EXTENSION_PATT")
  @js.native
  def EXTENSION_PATT: RegExp = js.native
  @scala.inline
  def EXTENSION_PATT_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION_PATT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.RequestUtils.RELATIVE_PATH")
  @js.native
  def RELATIVE_PATH: RegExp = js.native
  @scala.inline
  def RELATIVE_PATH_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELATIVE_PATH")(x.asInstanceOf[js.Any])
  
  // methods
  @JSGlobal("createjs.RequestUtils.buildPath")
  @js.native
  def buildPath(src: String): String = js.native
  @JSGlobal("createjs.RequestUtils.buildPath")
  @js.native
  def buildPath(src: String, data: js.Object): String = js.native
  
  @JSGlobal("createjs.RequestUtils.formatQueryString")
  @js.native
  def formatQueryString(data: js.Object): String = js.native
  @JSGlobal("createjs.RequestUtils.formatQueryString")
  @js.native
  def formatQueryString(data: js.Object, query: js.Array[js.Object]): String = js.native
  
  @JSGlobal("createjs.RequestUtils.getTypeByExtension")
  @js.native
  def getTypeByExtension(extension: String): String = js.native
  
  @JSGlobal("createjs.RequestUtils.isAudioTag")
  @js.native
  def isAudioTag(item: js.Object): Boolean = js.native
  
  @JSGlobal("createjs.RequestUtils.isBinary")
  @js.native
  def isBinary(`type`: String): Boolean = js.native
  
  @JSGlobal("createjs.RequestUtils.isCrossDomain")
  @js.native
  def isCrossDomain(item: js.Object): Boolean = js.native
  
  @JSGlobal("createjs.RequestUtils.isImageTag")
  @js.native
  def isImageTag(item: js.Object): Boolean = js.native
  
  @JSGlobal("createjs.RequestUtils.isLocal")
  @js.native
  def isLocal(item: js.Object): Boolean = js.native
  
  @JSGlobal("createjs.RequestUtils.isText")
  @js.native
  def isText(`type`: String): Boolean = js.native
  
  @JSGlobal("createjs.RequestUtils.isVideoTag")
  @js.native
  def isVideoTag(item: js.Object): Boolean = js.native
  
  @JSGlobal("createjs.RequestUtils.parseURI")
  @js.native
  def parseURI(path: String): js.Object = js.native
}
