package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  /*
    * section schema/array.js
    * http://mongoosejs.com/docs/api.html#schema-array-js
    */
  var Array: Anon_Cast
  /*
    * section schema/boolean.js
    * http://mongoosejs.com/docs/api.html#schema-boolean-js
    */
  var Boolean: Anon_Options
  /*
    * section schema/buffer.js
    * http://mongoosejs.com/docs/api.html#schema-buffer-js
    */
  var Buffer: Anon_KeyOptionsSchemaNameAnyBuffer
  /*
    * section schema/date.js
    * http://mongoosejs.com/docs/api.html#schema-date-js
    */
  var Date: Anon_KeyOptionsSchemaNameAny
  /*
    * section schema/decimal128.js
    * http://mongoosejs.com/docs/api.html#schema-decimal128-js
    */
  var Decimal128: Anon_KeyOptionsSchemaNameAnyDecimal128
  /*
    * section schema/documentarray.js
    * http://mongoosejs.com/docs/api.html#schema-documentarray-js
    */
  var DocumentArray: Anon_KeyOptions
  /*
    * section schema/embedded.js
    * http://mongoosejs.com/docs/api.html#schema-embedded-js
    */
  var Embedded: org.scalablytyped.runtime.Instantiable3[
    /* schema */ mongooseLib.mongooseMod.Schema[js.Any], 
    /* key */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ js.Any], 
    mongooseLib.mongooseMod.SchemaNs.TypesNs.Embedded
  ]
  /*
    * section schema/mixed.js
    * http://mongoosejs.com/docs/api.html#schema-mixed-js
    */
  var Mixed: Anon_OptionsPath
  /*
    * section schema/number.js
    * http://mongoosejs.com/docs/api.html#schema-number-js
    */
  var Number: Anon_KeyOptionsSchemaName
  /*
    * section schema/objectid.js
    * http://mongoosejs.com/docs/api.html#schema-objectid-js
    */
  var ObjectId: Anon_KeyOptionsSchemaNameAnyObjectId
  /*
    * section schema/string.js
    * http://mongoosejs.com/docs/api.html#schema-string-js
    */
  var String: Anon_Key
}

object Anon_Array {
  @scala.inline
  def apply(
    Array: Anon_Cast,
    Boolean: Anon_Options,
    Buffer: Anon_KeyOptionsSchemaNameAnyBuffer,
    Date: Anon_KeyOptionsSchemaNameAny,
    Decimal128: Anon_KeyOptionsSchemaNameAnyDecimal128,
    DocumentArray: Anon_KeyOptions,
    Embedded: org.scalablytyped.runtime.Instantiable3[
      /* schema */ mongooseLib.mongooseMod.Schema[js.Any], 
      /* key */ java.lang.String, 
      /* options */ js.UndefOr[/* options */ js.Any], 
      mongooseLib.mongooseMod.SchemaNs.TypesNs.Embedded
    ],
    Mixed: Anon_OptionsPath,
    Number: Anon_KeyOptionsSchemaName,
    ObjectId: Anon_KeyOptionsSchemaNameAnyObjectId,
    String: Anon_Key
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(Array = Array, Boolean = Boolean, Buffer = Buffer, Date = Date, Decimal128 = Decimal128, DocumentArray = DocumentArray, Embedded = Embedded, Mixed = Mixed, Number = Number, ObjectId = ObjectId, String = String)
  
    __obj.asInstanceOf[Anon_Array]
  }
}

