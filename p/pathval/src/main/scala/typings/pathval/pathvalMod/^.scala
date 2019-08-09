package typings.pathval.pathvalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pathval", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getPathInfo(obj: js.Object, path: String): PathInfo = js.native
  def getPathValue(obj: js.Object, path: String): js.UndefOr[js.Object] = js.native
  def hasProperty(obj: js.UndefOr[scala.Nothing], name: Property): Boolean = js.native
  def hasProperty(obj: js.Object, name: Property): Boolean = js.native
  def hasProperty(obj: Null, name: Property): Boolean = js.native
  def setPathValue(obj: js.Object, path: String, `val`: js.Any): js.Object = js.native
}

