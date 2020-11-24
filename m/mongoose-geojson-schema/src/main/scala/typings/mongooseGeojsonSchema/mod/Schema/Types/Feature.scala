package typings.mongooseGeojsonSchema.mod.Schema.Types

import typings.mongoose.mod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "Schema.Types.Feature")
@js.native
class Feature protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  
  def cast(geojson: js.Object): this.type = js.native
}
/* static members */
@JSImport("mongoose", "Schema.Types.Feature")
@js.native
object Feature extends js.Object {
  
  var schemaName: typings.mongooseGeojsonSchema.mongooseGeojsonSchemaStrings.Feature = js.native
}
