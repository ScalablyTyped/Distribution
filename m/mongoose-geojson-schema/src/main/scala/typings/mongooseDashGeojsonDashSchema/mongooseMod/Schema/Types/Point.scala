package typings.mongooseDashGeojsonDashSchema.mongooseMod.Schema.Types

import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "Schema.Types.Point")
@js.native
class Point protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  def cast(geojson: js.Object): this.type = js.native
}

/* static members */
@JSImport("mongoose", "Schema.Types.Point")
@js.native
object Point extends js.Object {
  var schemaName: typings.mongooseDashGeojsonDashSchema.mongooseDashGeojsonDashSchemaStrings.Point = js.native
}

