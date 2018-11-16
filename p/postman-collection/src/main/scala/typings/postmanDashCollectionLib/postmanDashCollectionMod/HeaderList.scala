package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "HeaderList")
@js.native
class HeaderList protected () extends PropertyList[Header] {
  def this(parent: js.Any, headers: js.Array[Header]) = this()
  def contentSize(): scala.Double = js.native
}

@JSImport("postman-collection", "HeaderList")
@js.native
object HeaderList extends js.Object {
  def isHeaderList(obj: js.Any): scala.Boolean = js.native
}

