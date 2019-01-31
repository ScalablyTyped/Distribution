package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mongooseLib.mongooseMod.ConnectionOpenSetOptions because var conflicts: auth, authMechanism, authSource, authdb, autoReconnect, bufferMaxEntries, checkServerIdentity, ciphers, connectTimeoutMS, db, dbName, domainsEnabled, ecdhCurve, fsync, haInterval, journal, keepAlive, keepAliveInitialDelay, monitoring, nativeParser, pass, poolSize, readPreference, readPreferencetags, reconnectInterval, reconnectTries, replicaSet, replset, rs_name, safe, server, servername, slaveOk, socketTimeoutMS, ssl, sslCA, sslCRL, sslCert, sslKey, sslPass, sslValidate, useCreateIndex, useFindAndModify, useNewUrlParser, user, w, wTimeoutMS. Inlined mongos, promiseLibrary, useMongoClient, bufferCommands */ trait ConnectionOptions extends ConnectionOpenOptions {
  /** See http://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, enables High Availability support for mongos
    * If connecting to multiple mongos servers, set the mongos option to true.
    */
  var mongos: js.UndefOr[scala.Boolean] = js.undefined
  /** sets the underlying driver's promise library (see http://mongodb.github.io/node-mongodb-native/2.1/api/MongoClient.html) */
  var promiseLibrary: js.UndefOr[js.Any] = js.undefined
  /** See http://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[scala.Boolean] = js.undefined
}

