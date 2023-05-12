package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<bson.bson.SerializeOptions, 'index'> */
/* Inlined parent std.Omit<bson.bson.DeserializeOptions, 'evalFunctions' | 'cacheFunctions' | 'cacheFunctionsCrc32' | 'allowObjectSmallerThanBufferSize' | 'index' | 'validation'> */
trait BSONSerializeOptions extends StObject {
  
  var bsonRegExp: js.UndefOr[Boolean] = js.undefined
  
  var checkKeys: js.UndefOr[Boolean] = js.undefined
  
  /** Enable utf8 validation when deserializing BSON documents.  Defaults to true. */
  var enableUtf8Validation: js.UndefOr[Boolean] = js.undefined
  
  var fieldsAsRaw: js.UndefOr[Document] = js.undefined
  
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enabling the raw option will return a [Node.js Buffer](https://nodejs.org/api/buffer.html)
    * which is allocated using [allocUnsafe API](https://nodejs.org/api/buffer.html#static-method-bufferallocunsafesize).
    * See this section from the [Node.js Docs here](https://nodejs.org/api/buffer.html#what-makes-bufferallocunsafe-and-bufferallocunsafeslow-unsafe)
    * for more detail about what "unsafe" refers to in this context.
    * If you need to maintain your own editable clone of the bytes returned for an extended life time of the process, it is recommended you allocate
    * your own buffer and clone the contents:
    *
    * @example
    * ```ts
    * const raw = await collection.findOne({}, { raw: true });
    * const myBuffer = Buffer.alloc(raw.byteLength);
    * myBuffer.set(raw, 0);
    * // Only save and use `myBuffer` beyond this point
    * ```
    *
    * @remarks
    * Please note there is a known limitation where this option cannot be used at the MongoClient level (see [NODE-3946](https://jira.mongodb.org/browse/NODE-3946)).
    * It does correctly work at `Db`, `Collection`, and per operation the same as other BSON options work.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  
  var useBigInt64: js.UndefOr[Boolean] = js.undefined
}
object BSONSerializeOptions {
  
  inline def apply(): BSONSerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BSONSerializeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BSONSerializeOptions] (val x: Self) extends AnyVal {
    
    inline def setBsonRegExp(value: Boolean): Self = StObject.set(x, "bsonRegExp", value.asInstanceOf[js.Any])
    
    inline def setBsonRegExpUndefined: Self = StObject.set(x, "bsonRegExp", js.undefined)
    
    inline def setCheckKeys(value: Boolean): Self = StObject.set(x, "checkKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckKeysUndefined: Self = StObject.set(x, "checkKeys", js.undefined)
    
    inline def setEnableUtf8Validation(value: Boolean): Self = StObject.set(x, "enableUtf8Validation", value.asInstanceOf[js.Any])
    
    inline def setEnableUtf8ValidationUndefined: Self = StObject.set(x, "enableUtf8Validation", js.undefined)
    
    inline def setFieldsAsRaw(value: Document): Self = StObject.set(x, "fieldsAsRaw", value.asInstanceOf[js.Any])
    
    inline def setFieldsAsRawUndefined: Self = StObject.set(x, "fieldsAsRaw", js.undefined)
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
    
    inline def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
    
    inline def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
    
    inline def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
    
    inline def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
    
    inline def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
    
    inline def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    
    inline def setUseBigInt64(value: Boolean): Self = StObject.set(x, "useBigInt64", value.asInstanceOf[js.Any])
    
    inline def setUseBigInt64Undefined: Self = StObject.set(x, "useBigInt64", js.undefined)
  }
}
