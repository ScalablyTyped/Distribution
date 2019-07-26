package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * section types/map.js
  * https://mongoosejs.com/docs/schematypes.html#maps
  */
@js.native
trait Map[V]
  extends stdLib.MapConstructor {
  /** Returns a native js Map. */
  def toObject(): mongooseLib.mongooseMod.GlobalMap[java.lang.String, V] = js.native
  /** Returns this Map object as a POJO. */
  def toObject(options: mongooseLib.Anon_FlattenMaps with js.Object): stdLib.Record[java.lang.String, V] = js.native
  def toObject(options: js.Any): mongooseLib.mongooseMod.GlobalMap[java.lang.String, V] = js.native
}

