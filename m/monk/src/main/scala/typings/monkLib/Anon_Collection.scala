package typings
package monkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collection extends js.Object {
  var collection: monkLib.monkMod.ICollection[_]
  var monkInstance: monkLib.monkMod.IMonkManager
}

object Anon_Collection {
  @scala.inline
  def apply(collection: monkLib.monkMod.ICollection[_], monkInstance: monkLib.monkMod.IMonkManager): Anon_Collection = {
    val __obj = js.Dynamic.literal(collection = collection, monkInstance = monkInstance)
  
    __obj.asInstanceOf[Anon_Collection]
  }
}

