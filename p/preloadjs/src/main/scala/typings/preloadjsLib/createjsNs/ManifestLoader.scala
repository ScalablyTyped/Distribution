package typings
package preloadjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.ManifestLoader")
@js.native
class ManifestLoader protected () extends AbstractLoader {
  def this(loadItem: js.Object) = this()
  def this(loadItem: LoadItem) = this()
}

/* static members */
@JSGlobal("createjs.ManifestLoader")
@js.native
object ManifestLoader extends js.Object {
  def canLoadItem(item: js.Object): scala.Boolean = js.native
  // methods
  def canLoadItem(item: preloadjsLib.createjsNs.LoadItem): scala.Boolean = js.native
}

