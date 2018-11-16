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
  var capped: js.UndefOr[scala.Boolean | scala.Double | mongooseLib.Anon_Max] = js.undefined
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
  var safe: js.UndefOr[scala.Boolean | mongooseLib.Anon_W] = js.undefined
  /** defaults to null */
  var shardKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * skipVersioning allows excluding paths from
       * versioning (the internal revision will not be
       * incremented even if these paths are updated).
       */
  var skipVersioning: js.UndefOr[js.Any] = js.undefined
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

