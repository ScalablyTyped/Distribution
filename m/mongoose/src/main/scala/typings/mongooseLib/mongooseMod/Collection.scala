package typings
package mongooseLib.mongooseMod

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
ScalablyTyped.runtime.Instantiable2[/* name */ java.lang.String, /* conn */ Connection, Collection]
     with /**
     * Collection constructor
     * @param name name of the collection
     * @param conn A MongooseConnection instance
     * @param opts optional collection options
     */
ScalablyTyped.runtime.Instantiable3[/* name */ java.lang.String, /* conn */ Connection, /* opts */ js.Any, Collection] {
  /** Formatter for debug print args */
  @JSName("$format")
  def $format(arg: js.Any): java.lang.String = js.native
  /** Debug print helper */
  @JSName("$print")
  def $print(name: js.Any, i: js.Any, args: js.Array[_]): scala.Unit = js.native
  /** Retrieves information about this collections indexes. */
  def getIndexes(): js.Any = js.native
}

