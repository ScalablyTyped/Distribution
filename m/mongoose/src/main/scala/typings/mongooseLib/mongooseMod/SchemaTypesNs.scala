package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "SchemaTypes")
@js.native
object SchemaTypesNs extends js.Object {
  /*
    * section schema/embedded.js
    * http://mongoosejs.com/docs/api.html#schema-embedded-js
    */
  @js.native
  class Embedded protected ()
    extends mongooseLib.mongooseMod.SchemaNs.TypesNs.Embedded {
    /** Sub-schema schematype constructor */
    def this(schema: mongooseLib.mongooseMod.Schema[_], key: java.lang.String) = this()
    def this(schema: mongooseLib.mongooseMod.Schema[_], key: java.lang.String, options: js.Any) = this()
  }
  
  /**
    * section schema/map.js
    * https://mongoosejs.com/docs/schematypes.html#maps
    */
  @js.native
  class Map protected ()
    extends mongooseLib.mongooseMod.SchemaNs.TypesNs.Map {
    /** Sub-schema schematype constructor */
    def this(key: java.lang.String) = this()
    def this(key: java.lang.String, options: js.Any) = this()
  }
  
}

