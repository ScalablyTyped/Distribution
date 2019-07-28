package typings.mongooseDashGeojsonDashSchema.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mongoose.Schema.Types.FeatureCollection")
@js.native
class FeatureCollection protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  def cast(geojson: js.Object): this.type = js.native
}

/* static members */
@JSGlobal("mongoose.Schema.Types.FeatureCollection")
@js.native
object FeatureCollection extends js.Object {
  var schemaName: typings.mongooseDashGeojsonDashSchema.mongooseDashGeojsonDashSchemaStrings.FeatureCollection = js.native
}

