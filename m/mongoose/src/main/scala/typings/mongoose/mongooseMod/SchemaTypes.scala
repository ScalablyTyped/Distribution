package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.mongoose.TypeofClassArray
import typings.mongoose.TypeofClassBoolean
import typings.mongoose.TypeofClassBuffer
import typings.mongoose.TypeofClassDate
import typings.mongoose.TypeofClassDecimal128
import typings.mongoose.TypeofClassDocumentArray
import typings.mongoose.TypeofClassMixed
import typings.mongoose.TypeofClassNumber
import typings.mongoose.TypeofClassObjectId
import typings.mongoose.TypeofClassString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "SchemaTypes")
@js.native
object SchemaTypes extends js.Object {
  /*
    * section schema/embedded.js
    * http://mongoosejs.com/docs/api.html#schema-embedded-js
    */
  @js.native
  class Embedded protected () extends SchemaType {
    /** Sub-schema schematype constructor */
    def this(schema: Schema[_], key: String) = this()
    def this(schema: Schema[_], key: String, options: js.Any) = this()
  }
  
  /**
    * section schema/map.js
    * https://mongoosejs.com/docs/schematypes.html#maps
    */
  @js.native
  class Map protected () extends SchemaType {
    /** Sub-schema schematype constructor */
    def this(key: String) = this()
    def this(key: String, options: js.Any) = this()
  }
  
  /*
    * section schema/array.js
    * http://mongoosejs.com/docs/api.html#schema-array-js
    */
  var Array: TypeofClassArray = js.native
  /*
    * section schema/boolean.js
    * http://mongoosejs.com/docs/api.html#schema-boolean-js
    */
  var Boolean: TypeofClassBoolean = js.native
  /*
    * section schema/buffer.js
    * http://mongoosejs.com/docs/api.html#schema-buffer-js
    */
  var Buffer: TypeofClassBuffer = js.native
  /*
    * section schema/date.js
    * http://mongoosejs.com/docs/api.html#schema-date-js
    */
  var Date: TypeofClassDate = js.native
  /*
    * section schema/decimal128.js
    * http://mongoosejs.com/docs/api.html#schema-decimal128-js
    */
  var Decimal128: TypeofClassDecimal128 = js.native
  /*
    * section schema/documentarray.js
    * http://mongoosejs.com/docs/api.html#schema-documentarray-js
    */
  var DocumentArray: TypeofClassDocumentArray = js.native
  /*
    * section schema/embedded.js
    * http://mongoosejs.com/docs/api.html#schema-embedded-js
    */
  var Embedded: Instantiable3[
    /* schema */ Schema[js.Any], 
    /* key */ String, 
    js.UndefOr[/* options */ js.Any], 
    typings.mongoose.mongooseMod.Schema.Types.Embedded
  ] = js.native
  /**
    * section schema/map.js
    * https://mongoosejs.com/docs/schematypes.html#maps
    */
  var Map: Instantiable2[
    /* key */ String, 
    js.UndefOr[/* options */ js.Any], 
    typings.mongoose.mongooseMod.Schema.Types.Map
  ] = js.native
  /*
    * section schema/mixed.js
    * http://mongoosejs.com/docs/api.html#schema-mixed-js
    */
  var Mixed: TypeofClassMixed = js.native
  /*
    * section schema/number.js
    * http://mongoosejs.com/docs/api.html#schema-number-js
    */
  var Number: TypeofClassNumber = js.native
  /*
    * section schema/objectid.js
    * http://mongoosejs.com/docs/api.html#schema-objectid-js
    */
  var ObjectId: TypeofClassObjectId = js.native
  /*
    * section schema/string.js
    * http://mongoosejs.com/docs/api.html#schema-string-js
    */
  var String: TypeofClassString = js.native
}

