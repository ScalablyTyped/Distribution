package typings.monk

import typings.monk.monkMod.ICollection
import typings.monk.monkMod.IMonkManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collection extends js.Object {
  var collection: ICollection[_]
  var monkInstance: IMonkManager
}

object Anon_Collection {
  @scala.inline
  def apply(collection: ICollection[_], monkInstance: IMonkManager): Anon_Collection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], monkInstance = monkInstance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Collection]
  }
}

