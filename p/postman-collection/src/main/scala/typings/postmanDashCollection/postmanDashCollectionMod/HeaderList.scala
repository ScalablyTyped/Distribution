package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "HeaderList")
@js.native
class HeaderList protected () extends PropertyList[Header] {
  def this(parent: js.Any, headers: js.Array[Header]) = this()
  def contentSize(): Double = js.native
}

/* static members */
@JSImport("postman-collection", "HeaderList")
@js.native
object HeaderList extends js.Object {
  def isHeaderList(obj: js.Any): Boolean = js.native
}

