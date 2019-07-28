package typings.mongooseDashGeojsonDashSchema.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mongoose.Schema.Types.MultiPolygon")
@js.native
class MultiPolygon protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  def cast(geojson: js.Object): this.type = js.native
}

/* static members */
@JSGlobal("mongoose.Schema.Types.MultiPolygon")
@js.native
object MultiPolygon extends js.Object {
  var schemaName: typings.mongooseDashGeojsonDashSchema.mongooseDashGeojsonDashSchemaStrings.MultiPolygon = js.native
}

