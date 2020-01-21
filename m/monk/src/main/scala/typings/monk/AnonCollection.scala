package typings.monk

import typings.monk.mod.ICollection
import typings.monk.mod.IMonkManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollection extends js.Object {
  var collection: ICollection[_]
  var monkInstance: IMonkManager
}

object AnonCollection {
  @scala.inline
  def apply(collection: ICollection[_], monkInstance: IMonkManager): AnonCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], monkInstance = monkInstance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCollection]
  }
}

