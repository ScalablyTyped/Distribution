package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection
  extends CollectionBase
     with /**
  * Collection constructor
  * @param name name of the collection
  * @param conn A MongooseConnection instance
  * @param opts optional collection options
  */
Instantiable2[/* name */ String, /* conn */ Connection, Collection]
     with Instantiable3[/* name */ String, /* conn */ Connection, /* opts */ js.Any, Collection] {
  /** Formatter for debug print args */
  @JSName("$format")
  def $format(arg: js.Any): String = js.native
  /** Debug print helper */
  @JSName("$print")
  def $print(name: js.Any, i: js.Any, args: js.Array[_]): Unit = js.native
  /** Retrieves information about this collections indexes. */
  def getIndexes(): js.Any = js.native
}

