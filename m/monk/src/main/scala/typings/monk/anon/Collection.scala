package typings.monk.anon

import typings.monk.mod.ICollection
import typings.monk.mod.IMonkManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var collection: ICollection[_]
  var monkInstance: IMonkManager
}

object Collection {
  @scala.inline
  def apply(collection: ICollection[_], monkInstance: IMonkManager): Collection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], monkInstance = monkInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
}

