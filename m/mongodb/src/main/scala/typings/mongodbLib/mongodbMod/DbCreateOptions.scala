package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbCreateOptions extends CommonOptions {
  /**
    * If the database authentication is dependent on another databaseName.
    */
  var authSource: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets a cap on how many operations the driver will buffer up before giving up on getting a
    * working connection, default is -1 which is unlimited.
    */
  var bufferMaxEntries: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: false; Force server to create _id fields instead of client.
    */
  var forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify if the BSON serializer should ignore undefined fields.
    */
  var ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false; Use c++ bson parser.
    */
  var native_parser: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Custom primary key factory to generate _id values (see Custom primary keys).
    */
  var pkFactory: js.UndefOr[js.Object] = js.undefined
  /**
    * ES6 compatible promise constructor
    */
  var promiseLibrary: js.UndefOr[js.Object] = js.undefined
  /**
    * Default: false; Promotes Binary BSON values to native Node Buffers
    */
  var promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true; Promotes Long values to number if they fit inside the 53 bits resolution.
    */
  var promoteLongs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true; Promotes BSON values to native types where possible, set to false to only receive wrapper types.
    */
  var promoteValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * https://docs.mongodb.com/manual/reference/read-concern/#read-concern
    */
  var readConcern: js.UndefOr[ReadConcern] = js.undefined
  /**
    * the prefered read preference. use 'ReadPreference' class.
    */
  var readPreference: js.UndefOr[ReadPreference | java.lang.String] = js.undefined
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined
}

object DbCreateOptions {
  @scala.inline
  def apply(
    authSource: java.lang.String = null,
    bufferMaxEntries: scala.Int | scala.Double = null,
    forceServerObjectId: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[scala.Boolean] = js.undefined,
    j: js.UndefOr[scala.Boolean] = js.undefined,
    native_parser: js.UndefOr[scala.Boolean] = js.undefined,
    pkFactory: js.Object = null,
    promiseLibrary: js.Object = null,
    promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined,
    promoteLongs: js.UndefOr[scala.Boolean] = js.undefined,
    promoteValues: js.UndefOr[scala.Boolean] = js.undefined,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    readConcern: ReadConcern = null,
    readPreference: ReadPreference | java.lang.String = null,
    serializeFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    session: ClientSession = null,
    w: scala.Double | mongodbLib.mongodbLibStrings.majority | java.lang.String = null,
    wtimeout: scala.Int | scala.Double = null
  ): DbCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (bufferMaxEntries != null) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId)
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (!js.isUndefined(native_parser)) __obj.updateDynamic("native_parser")(native_parser)
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory)
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary)
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (session != null) __obj.updateDynamic("session")(session)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCreateOptions]
  }
}

