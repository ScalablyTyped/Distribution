package typings.mosca.moscaMod

import org.scalablytyped.runtime.StringDictionary
import typings.mosca.moscaMod.persistenceNs.FactoryFunc
import typings.mosca.moscaMod.persistenceNs.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mosca", "persistence")
@js.native
object persistenceNs extends js.Object {
  trait Persistence extends js.Object {
    def wire(server: Server): Unit
  }
  
  val LevelUp: FactoryFunc = js.native
  val Memory: FactoryFunc = js.native
  val Mongo: FactoryFunc = js.native
  val Redis: FactoryFunc = js.native
  type FactoryFunc = js.Function1[/* options */ StringDictionary[js.Any], Persistence]
}

