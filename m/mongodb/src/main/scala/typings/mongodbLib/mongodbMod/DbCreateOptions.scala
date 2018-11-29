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
  var promoteValues: js.UndefOr[js.Object] = js.undefined
  /**
       * Return document results as raw BSON buffers.
       */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * https://docs.mongodb.com/manual/reference/read-concern/#read-concern
       **/
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

