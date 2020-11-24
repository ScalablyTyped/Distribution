package typings.preloadjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.VideoLoader")
@js.native
class VideoLoader protected ()
  extends typings.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object, preferXHR: Boolean) = this()
}
/* static members */
@JSGlobal("createjs.VideoLoader")
@js.native
object VideoLoader extends js.Object {
  
  def canLoadItem(item: js.Object): Boolean = js.native
}
