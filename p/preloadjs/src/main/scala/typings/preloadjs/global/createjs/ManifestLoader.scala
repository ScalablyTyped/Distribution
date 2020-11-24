package typings.preloadjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.ManifestLoader")
@js.native
class ManifestLoader protected ()
  extends typings.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object) = this()
  def this(loadItem: typings.preloadjs.createjs.LoadItem) = this()
}
/* static members */
@JSGlobal("createjs.ManifestLoader")
@js.native
object ManifestLoader extends js.Object {
  
  def canLoadItem(item: js.Object): Boolean = js.native
  // methods
  def canLoadItem(item: typings.preloadjs.createjs.LoadItem): Boolean = js.native
}
