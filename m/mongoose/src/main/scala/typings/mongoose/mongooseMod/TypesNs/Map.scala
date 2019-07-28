package typings.mongoose.mongooseMod.TypesNs

import typings.mongoose.Anon_FlattenMaps
import typings.mongoose.mongooseMod.GlobalMap
import typings.std.MapConstructor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * section types/map.js
  * https://mongoosejs.com/docs/schematypes.html#maps
  */
@js.native
trait Map[V] extends MapConstructor {
  /** Returns a native js Map. */
  def toObject(): GlobalMap[String, V] = js.native
  /** Returns this Map object as a POJO. */
  def toObject(options: Anon_FlattenMaps with js.Object): Record[String, V] = js.native
  def toObject(options: js.Any): GlobalMap[String, V] = js.native
}

