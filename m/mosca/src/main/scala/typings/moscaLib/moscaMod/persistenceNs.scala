package typings
package moscaLib.moscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "persistence")
@js.native
object persistenceNs extends js.Object {
  trait Persistence extends js.Object {
    def wire(server: moscaLib.moscaMod.Server): scala.Unit
  }
  
  val LevelUp: FactoryFunc = js.native
  val Memory: FactoryFunc = js.native
  val Mongo: FactoryFunc = js.native
  val Redis: FactoryFunc = js.native
  type FactoryFunc = js.Function1[/* options */ org.scalablytyped.runtime.StringDictionary[js.Any], Persistence]
}

