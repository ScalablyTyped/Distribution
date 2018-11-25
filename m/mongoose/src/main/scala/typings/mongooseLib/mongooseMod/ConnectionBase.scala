package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
   * section connection.js
   * http://mongoosejs.com/docs/api.html#connection-js
   *
   * The Connection class exposed by require('mongoose')
   *   is actually the driver's NativeConnection class.
   *   connection.js defines a base class that the native
   *   versions extend. See:
   *   http://mongoosejs.com/docs/api.html#drivers-node-mongodb-native-connection-js
   */
@js.native
trait ConnectionBase
  extends eventsLib.eventsMod.EventEmitter {
  /** A hash of the collections associated with this connection */
  var collections: ScalablyTyped.runtime.StringDictionary[Collection] = js.native
  /** A hash of the global options that are associated with this connection */
  var config: js.Any = js.native
  /** The mongodb.Db instance, set when the connection is opened */
  var db: mongodbLib.mongodbMod.Db = js.native
  /** A hash of models registered with this connection */
  var models: ScalablyTyped.runtime.StringDictionary[Model[_, js.Object]] = js.native
  /**
       * Connection ready state
       * 0 = disconnected
       * 1 = connected
       * 2 = connecting
       * 3 = disconnecting
       * Each state change emits its associated event name.
       */
  var readyState: scala.Double = js.native
  /** Closes the connection */
  def close(): stdLib.Promise[scala.Unit] = js.native
  /** Closes the connection */
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  /** Closes the connection */
  def close(force: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
  /** Closes the connection */
  def close(force: scala.Boolean, callback: js.Function1[/* err */ js.Any, scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  /**
       * Retrieves a collection, creating it if not cached.
       * Not typically needed by applications. Just talk to your collection through your model.
       * @param name name of the collection
       * @param options optional collection options
       */
  def collection(name: java.lang.String): Collection = js.native
  /**
       * Retrieves a collection, creating it if not cached.
       * Not typically needed by applications. Just talk to your collection through your model.
       * @param name name of the collection
       * @param options optional collection options
       */
  def collection(name: java.lang.String, options: js.Any): Collection = js.native
  /** Helper for creating a collection */
  def createCollection(name: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Helper for creating a collection */
  def createCollection(name: java.lang.String, options: mongodbLib.mongodbMod.CollectionCreateOptions): stdLib.Promise[scala.Unit] = js.native
  /** Helper for creating a collection */
  def createCollection(
    name: java.lang.String,
    options: mongodbLib.mongodbMod.CollectionCreateOptions,
    cb: js.Function2[
      /* err */ js.Any, 
      /* collection */ mongodbLib.mongodbMod.Collection[mongodbLib.Default], 
      scala.Unit
    ]
  ): stdLib.Promise[scala.Unit] = js.native
  /** Helper for dropCollection() */
  def dropCollection(name: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Helper for dropCollection() */
  def dropCollection(name: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  /** Helper for dropDatabase() */
  def dropDatabase(): stdLib.Promise[_] = js.native
  /** Helper for dropDatabase() */
  def dropDatabase(callback: js.Function1[/* err */ js.Any, scala.Unit]): stdLib.Promise[_] = js.native
  /**
       * Defines or retrieves a model.
       * When no collection argument is passed, Mongoose produces a collection name by passing
       * the model name to the utils.toCollectionName method. This method pluralizes the name.
       * If you don't like this behavior, either pass a collection name or set your schemas
       * collection name option.
       * @param name the model name
       * @param schema a schema. necessary when defining a model
       * @param collection name of mongodb collection (optional) if not given it will be induced from model name
       * @returns The compiled model
       */
  def model[T /* <: Document */](name: java.lang.String): Model[T, js.Object] = js.native
  /**
       * Defines or retrieves a model.
       * When no collection argument is passed, Mongoose produces a collection name by passing
       * the model name to the utils.toCollectionName method. This method pluralizes the name.
       * If you don't like this behavior, either pass a collection name or set your schemas
       * collection name option.
       * @param name the model name
       * @param schema a schema. necessary when defining a model
       * @param collection name of mongodb collection (optional) if not given it will be induced from model name
       * @returns The compiled model
       */
  def model[T /* <: Document */](name: java.lang.String, schema: Schema): Model[T, js.Object] = js.native
  /**
       * Defines or retrieves a model.
       * When no collection argument is passed, Mongoose produces a collection name by passing
       * the model name to the utils.toCollectionName method. This method pluralizes the name.
       * If you don't like this behavior, either pass a collection name or set your schemas
       * collection name option.
       * @param name the model name
       * @param schema a schema. necessary when defining a model
       * @param collection name of mongodb collection (optional) if not given it will be induced from model name
       * @returns The compiled model
       */
  def model[T /* <: Document */](name: java.lang.String, schema: Schema, collection: java.lang.String): Model[T, js.Object] = js.native
  /** Returns an array of model names created on this connection. */
  def modelNames(): js.Array[java.lang.String] = js.native
  @JSName("model")
  def model_TDocumentUModelU[T /* <: Document */, U /* <: Model[T, js.Object] */](name: java.lang.String): U = js.native
  @JSName("model")
  def model_TDocumentUModelU[T /* <: Document */, U /* <: Model[T, js.Object] */](name: java.lang.String, schema: Schema): U = js.native
  @JSName("model")
  def model_TDocumentUModelU[T /* <: Document */, U /* <: Model[T, js.Object] */](name: java.lang.String, schema: Schema, collection: java.lang.String): U = js.native
  /**
       * Opens the connection to MongoDB.
       * @deprecated open() is deprecated in mongoose >= 4.11.0
       * @param mongodb://uri or the host to which you are connecting
       * @param database database name
       * @param port database port
       * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
       *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
       *   See the node-mongodb-native driver instance for options that it understands.
       *   Options passed take precedence over options included in connection strings.
       */
  def open(connection_string: java.lang.String): js.Any = js.native
  /**
       * Opens the connection to MongoDB.
       * @deprecated open() is deprecated in mongoose >= 4.11.0
       * @param mongodb://uri or the host to which you are connecting
       * @param database database name
       * @param port database port
       * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
       *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
       *   See the node-mongodb-native driver instance for options that it understands.
       *   Options passed take precedence over options included in connection strings.
       */
  def open(connection_string: java.lang.String, database: java.lang.String): js.Any = js.native
  /**
       * Opens the connection to MongoDB.
       * @deprecated open() is deprecated in mongoose >= 4.11.0
       * @param mongodb://uri or the host to which you are connecting
       * @param database database name
       * @param port database port
       * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
       *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
       *   See the node-mongodb-native driver instance for options that it understands.
       *   Options passed take precedence over options included in connection strings.
       */
  def open(connection_string: java.lang.String, database: java.lang.String, port: scala.Double): js.Any = js.native
  /**
       * Opens the connection to MongoDB.
       * @deprecated open() is deprecated in mongoose >= 4.11.0
       * @param mongodb://uri or the host to which you are connecting
       * @param database database name
       * @param port database port
       * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
       *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
       *   See the node-mongodb-native driver instance for options that it understands.
       *   Options passed take precedence over options included in connection strings.
       */
  def open(
    connection_string: java.lang.String,
    database: java.lang.String,
    port: scala.Double,
    options: ConnectionOpenOptions
  ): js.Any = js.native
  /**
       * Opens the connection to MongoDB.
       * @deprecated open() is deprecated in mongoose >= 4.11.0
       * @param mongodb://uri or the host to which you are connecting
       * @param database database name
       * @param port database port
       * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
       *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
       *   See the node-mongodb-native driver instance for options that it understands.
       *   Options passed take precedence over options included in connection strings.
       */
  def open(
    connection_string: java.lang.String,
    database: java.lang.String,
    port: scala.Double,
    options: ConnectionOpenOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Any = js.native
  /**
       * Opens the connection to a replica set.
       * @param uris comma-separated mongodb:// URIs
       * @param database database name if not included in uris
       * @param options passed to the internal driver
       */
  def openSet(uris: java.lang.String): js.Any = js.native
  /**
       * Opens the connection to a replica set.
       * @param uris comma-separated mongodb:// URIs
       * @param database database name if not included in uris
       * @param options passed to the internal driver
       */
  def openSet(uris: java.lang.String, database: java.lang.String): js.Any = js.native
  /**
       * Opens the connection to a replica set.
       * @param uris comma-separated mongodb:// URIs
       * @param database database name if not included in uris
       * @param options passed to the internal driver
       */
  def openSet(uris: java.lang.String, database: java.lang.String, options: ConnectionOpenSetOptions): js.Any = js.native
  /**
       * Opens the connection to a replica set.
       * @param uris comma-separated mongodb:// URIs
       * @param database database name if not included in uris
       * @param options passed to the internal driver
       */
  def openSet(
    uris: java.lang.String,
    database: java.lang.String,
    options: ConnectionOpenSetOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Any = js.native
  /**
      * Opens the connection to MongoDB.
      * @param mongodb://uri or the host to which you are connecting
      * @param database database name
      * @param port database port
      * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
      *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
      *   See the node-mongodb-native driver instance for options that it understands.
      *   Options passed take precedence over options included in connection strings.
      */
  def openUri(connection_string: java.lang.String): js.Any = js.native
  /**
      * Opens the connection to MongoDB.
      * @param mongodb://uri or the host to which you are connecting
      * @param database database name
      * @param port database port
      * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
      *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
      *   See the node-mongodb-native driver instance for options that it understands.
      *   Options passed take precedence over options included in connection strings.
      */
  def openUri(connection_string: java.lang.String, database: java.lang.String): js.Any = js.native
  /**
      * Opens the connection to MongoDB.
      * @param mongodb://uri or the host to which you are connecting
      * @param database database name
      * @param port database port
      * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
      *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
      *   See the node-mongodb-native driver instance for options that it understands.
      *   Options passed take precedence over options included in connection strings.
      */
  def openUri(connection_string: java.lang.String, database: java.lang.String, port: scala.Double): js.Any = js.native
  /**
      * Opens the connection to MongoDB.
      * @param mongodb://uri or the host to which you are connecting
      * @param database database name
      * @param port database port
      * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
      *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
      *   See the node-mongodb-native driver instance for options that it understands.
      *   Options passed take precedence over options included in connection strings.
      */
  def openUri(
    connection_string: java.lang.String,
    database: java.lang.String,
    port: scala.Double,
    options: ConnectionOpenOptions
  ): js.Any = js.native
  /**
      * Opens the connection to MongoDB.
      * @param mongodb://uri or the host to which you are connecting
      * @param database database name
      * @param port database port
      * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
      *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
      *   See the node-mongodb-native driver instance for options that it understands.
      *   Options passed take precedence over options included in connection strings.
      */
  def openUri(
    connection_string: java.lang.String,
    database: java.lang.String,
    port: scala.Double,
    options: ConnectionOpenOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): js.Any = js.native
}

