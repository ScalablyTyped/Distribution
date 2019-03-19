package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaOptions extends js.Object {
  /** defaults to true */
  var _id: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to false (which means use the connection's autoIndex option) */
  var autoIndex: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to true */
  var bufferCommands: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to false */
  var capped: js.UndefOr[scala.Boolean | scala.Double | mongooseLib.Anon_AutoIndexId] = js.undefined
  /** Sets a default collation for every query and aggregation. */
  var collation: js.UndefOr[CollationOptions] = js.undefined
  /** no default */
  var collection: js.UndefOr[java.lang.String] = js.undefined
  /** defaults to "__t" */
  var discriminatorKey: js.UndefOr[java.lang.String] = js.undefined
  /** defaults to false. */
  var emitIndexErrors: js.UndefOr[scala.Boolean] = js.undefined
  var excludeIndexes: js.UndefOr[js.Any] = js.undefined
  /** defaults to true */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /** controls document#toObject behavior when called manually - defaults to true */
  var minimize: js.UndefOr[scala.Boolean] = js.undefined
  var read: js.UndefOr[java.lang.String] = js.undefined
  /** defaults to true. */
  var safe: js.UndefOr[scala.Boolean | mongooseLib.Anon_J] = js.undefined
  /**
    * By default, Mongoose will automatically
    * select() any populated paths.
    * To opt out, set selectPopulatedPaths to false.
    */
  var selectPopulatedPaths: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to null */
  var shardKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * skipVersioning allows excluding paths from
    * versioning (the internal revision will not be
    * incremented even if these paths are updated).
    */
  var skipVersioning: js.UndefOr[js.Any] = js.undefined
  /**
    * Validation errors in a single nested schema are reported
    * both on the child and on the parent schema.
    * Set storeSubdocValidationError to false on the child schema
    * to make Mongoose only report the parent error.
    */
  var storeSubdocValidationError: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to true */
  var strict: js.UndefOr[scala.Boolean | mongooseLib.mongooseLibStrings.`throw`] = js.undefined
  /**
    * If set timestamps, mongoose assigns createdAt
    * and updatedAt fields to your schema, the type
    * assigned is Date.
    */
  var timestamps: js.UndefOr[scala.Boolean | SchemaTimestampsConfig] = js.undefined
  /** no default */
  var toJSON: js.UndefOr[DocumentToObjectOptions] = js.undefined
  /** no default */
  var toObject: js.UndefOr[DocumentToObjectOptions] = js.undefined
  /** defaults to 'type' */
  var typeKey: js.UndefOr[java.lang.String] = js.undefined
  /** defaults to false */
  var useNestedStrict: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to false */
  var usePushEach: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to true */
  var validateBeforeSave: js.UndefOr[scala.Boolean] = js.undefined
  /** defaults to "__v" */
  var versionKey: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var writeConcern: js.UndefOr[WriteConcern] = js.undefined
}

object SchemaOptions {
  @scala.inline
  def apply(
    _id: js.UndefOr[scala.Boolean] = js.undefined,
    autoIndex: js.UndefOr[scala.Boolean] = js.undefined,
    bufferCommands: js.UndefOr[scala.Boolean] = js.undefined,
    capped: scala.Boolean | scala.Double | mongooseLib.Anon_AutoIndexId = null,
    collation: CollationOptions = null,
    collection: java.lang.String = null,
    discriminatorKey: java.lang.String = null,
    emitIndexErrors: js.UndefOr[scala.Boolean] = js.undefined,
    excludeIndexes: js.Any = null,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    minimize: js.UndefOr[scala.Boolean] = js.undefined,
    read: java.lang.String = null,
    safe: scala.Boolean | mongooseLib.Anon_J = null,
    selectPopulatedPaths: js.UndefOr[scala.Boolean] = js.undefined,
    shardKey: js.UndefOr[scala.Boolean] = js.undefined,
    skipVersioning: js.Any = null,
    storeSubdocValidationError: js.UndefOr[scala.Boolean] = js.undefined,
    strict: scala.Boolean | mongooseLib.mongooseLibStrings.`throw` = null,
    timestamps: scala.Boolean | SchemaTimestampsConfig = null,
    toJSON: DocumentToObjectOptions = null,
    toObject: DocumentToObjectOptions = null,
    typeKey: java.lang.String = null,
    useNestedStrict: js.UndefOr[scala.Boolean] = js.undefined,
    usePushEach: js.UndefOr[scala.Boolean] = js.undefined,
    validateBeforeSave: js.UndefOr[scala.Boolean] = js.undefined,
    versionKey: java.lang.String | scala.Boolean = null,
    writeConcern: WriteConcern = null
  ): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_id)) __obj.updateDynamic("_id")(_id)
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex)
    if (!js.isUndefined(bufferCommands)) __obj.updateDynamic("bufferCommands")(bufferCommands)
    if (capped != null) __obj.updateDynamic("capped")(capped.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (discriminatorKey != null) __obj.updateDynamic("discriminatorKey")(discriminatorKey)
    if (!js.isUndefined(emitIndexErrors)) __obj.updateDynamic("emitIndexErrors")(emitIndexErrors)
    if (excludeIndexes != null) __obj.updateDynamic("excludeIndexes")(excludeIndexes)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize)
    if (read != null) __obj.updateDynamic("read")(read)
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (!js.isUndefined(selectPopulatedPaths)) __obj.updateDynamic("selectPopulatedPaths")(selectPopulatedPaths)
    if (!js.isUndefined(shardKey)) __obj.updateDynamic("shardKey")(shardKey)
    if (skipVersioning != null) __obj.updateDynamic("skipVersioning")(skipVersioning)
    if (!js.isUndefined(storeSubdocValidationError)) __obj.updateDynamic("storeSubdocValidationError")(storeSubdocValidationError)
    if (strict != null) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    if (toJSON != null) __obj.updateDynamic("toJSON")(toJSON)
    if (toObject != null) __obj.updateDynamic("toObject")(toObject)
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey)
    if (!js.isUndefined(useNestedStrict)) __obj.updateDynamic("useNestedStrict")(useNestedStrict)
    if (!js.isUndefined(usePushEach)) __obj.updateDynamic("usePushEach")(usePushEach)
    if (!js.isUndefined(validateBeforeSave)) __obj.updateDynamic("validateBeforeSave")(validateBeforeSave)
    if (versionKey != null) __obj.updateDynamic("versionKey")(versionKey.asInstanceOf[js.Any])
    if (writeConcern != null) __obj.updateDynamic("writeConcern")(writeConcern)
    __obj.asInstanceOf[SchemaOptions]
  }
}

