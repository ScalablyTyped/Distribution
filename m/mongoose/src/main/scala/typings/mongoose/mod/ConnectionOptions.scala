package typings.mongoose.mod

import typings.mongodb.mod.MongoClientOptions
import typings.mongoose.anon.AutoIndex
import typings.mongoose.anon.ExtraOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection optional settings.
  *
  * see
  *   https://mongoosejs.com/docs/api.html#mongoose_Mongoose-connect
  * and
  *   http://mongodb.github.io/node-mongodb-native/3.0/api/MongoClient.html
  * for all available options.
  *
  */
@js.native
trait ConnectionOptions extends MongoClientOptions {
  /** Before Mongoose builds indexes, it calls Model.createCollection()
    * to create the underlying collection in MongoDB if autoCreate
    * is set to true.(default: false) */
  var autoCreate: js.UndefOr[Boolean] = js.native
  /** Configure csfle as especified in MongoDB official guide */
  var autoEncryption: js.UndefOr[ExtraOptions] = js.native
  var autoIndex: js.UndefOr[Boolean] = js.native
  /** mongoose-specific options */
  /** See https://mongoosejs.com/docs/guide.html#bufferCommands */
  var bufferCommands: js.UndefOr[Boolean] = js.native
  var config: js.UndefOr[AutoIndex] = js.native
  /** passed to the connection db instance */
  var db: js.UndefOr[js.Any] = js.native
  /** database Name for Mongodb Atlas Connection */
  var dbName: js.UndefOr[String] = js.native
  /** Specify a journal write concern (default: false). */
  var journal: js.UndefOr[Boolean] = js.native
  // Legacy properties - passed to the connection server instance(s)
  var mongos: js.UndefOr[js.Any] = js.native
  /** The current value of the parameter native_parser */
  var nativeParser: js.UndefOr[Boolean] = js.native
  /** password for authentication */
  var pass: js.UndefOr[String] = js.native
  var replset: js.UndefOr[js.Any] = js.native
  var safe: js.UndefOr[js.Any] = js.native
  var server: js.UndefOr[js.Any] = js.native
  var slaveOk: js.UndefOr[Boolean] = js.native
  /** If true, this connection will use createIndex() instead of ensureIndex() for automatic index builds via Model.init(). */
  var useCreateIndex: js.UndefOr[Boolean] = js.native
  /** Set to false to make findOneAndUpdate() and findOneAndRemove() use native findOneAndUpdate() rather than findAndModify(). */
  var useFindAndModify: js.UndefOr[Boolean] = js.native
  /** See https://mongoosejs.com/docs/connections.html#use-mongo-client **/
  var useMongoClient: js.UndefOr[Boolean] = js.native
  /** username for authentication */
  var user: js.UndefOr[String] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCreate: Self = this.set("autoCreate", js.undefined)
    @scala.inline
    def setAutoEncryption(value: ExtraOptions): Self = this.set("autoEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoEncryption: Self = this.set("autoEncryption", js.undefined)
    @scala.inline
    def setAutoIndex(value: Boolean): Self = this.set("autoIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoIndex: Self = this.set("autoIndex", js.undefined)
    @scala.inline
    def setBufferCommands(value: Boolean): Self = this.set("bufferCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferCommands: Self = this.set("bufferCommands", js.undefined)
    @scala.inline
    def setConfig(value: AutoIndex): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDb(value: js.Any): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    @scala.inline
    def setDbName(value: String): Self = this.set("dbName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbName: Self = this.set("dbName", js.undefined)
    @scala.inline
    def setJournal(value: Boolean): Self = this.set("journal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJournal: Self = this.set("journal", js.undefined)
    @scala.inline
    def setMongos(value: js.Any): Self = this.set("mongos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMongos: Self = this.set("mongos", js.undefined)
    @scala.inline
    def setNativeParser(value: Boolean): Self = this.set("nativeParser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeParser: Self = this.set("nativeParser", js.undefined)
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setReplset(value: js.Any): Self = this.set("replset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplset: Self = this.set("replset", js.undefined)
    @scala.inline
    def setSafe(value: js.Any): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    @scala.inline
    def setServer(value: js.Any): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setSlaveOk(value: Boolean): Self = this.set("slaveOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlaveOk: Self = this.set("slaveOk", js.undefined)
    @scala.inline
    def setUseCreateIndex(value: Boolean): Self = this.set("useCreateIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCreateIndex: Self = this.set("useCreateIndex", js.undefined)
    @scala.inline
    def setUseFindAndModify(value: Boolean): Self = this.set("useFindAndModify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFindAndModify: Self = this.set("useFindAndModify", js.undefined)
    @scala.inline
    def setUseMongoClient(value: Boolean): Self = this.set("useMongoClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMongoClient: Self = this.set("useMongoClient", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

