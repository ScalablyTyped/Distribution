package typings.mongooseDashGeojsonDashSchema.mongooseMod.Schema.Types

import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "Schema.Types.MultiPolygon")
@js.native
class MultiPolygon protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  def cast(geojson: js.Object): this.type = js.native
}

/* static members */
@JSImport("mongoose", "Schema.Types.MultiPolygon")
@js.native
object MultiPolygon extends js.Object {
  var schemaName: typings.mongooseDashGeojsonDashSchema.mongooseDashGeojsonDashSchemaStrings.MultiPolygon = js.native
}

