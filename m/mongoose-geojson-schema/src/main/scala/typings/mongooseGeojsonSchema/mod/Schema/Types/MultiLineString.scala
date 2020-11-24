package typings.mongooseGeojsonSchema.mod.Schema.Types

import typings.mongoose.mod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "Schema.Types.MultiLineString")
@js.native
class MultiLineString protected () extends SchemaType {
  def this(key: String) = this()
  def this(key: String, options: js.Object) = this()
  
  def cast(geojson: js.Object): this.type = js.native
}
/* static members */
@JSImport("mongoose", "Schema.Types.MultiLineString")
@js.native
object MultiLineString extends js.Object {
  
  var schemaName: typings.mongooseGeojsonSchema.mongooseGeojsonSchemaStrings.MultiLineString = js.native
}
