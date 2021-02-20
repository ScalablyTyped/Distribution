package typings.nedb

import typings.nedb.anon.NewDoc
import typings.nedb.nedbStrings.compactionDotdone
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nedb", JSImport.Namespace)
  @js.native
  class ^[G] () extends Nedb[G] {
    def this(pathOrOptions: String) = this()
    def this(pathOrOptions: DataStoreOptions) = this()
  }
  
  @js.native
  trait Cursor[T] extends StObject {
    
    def exec(callback: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit]): Unit = js.native
    
    def limit(n: Double): Cursor[T] = js.native
    
    def projection(query: js.Any): Cursor[T] = js.native
    
    def skip(n: Double): Cursor[T] = js.native
    
    def sort(query: js.Any): Cursor[T] = js.native
  }
  object Cursor {
    
    @scala.inline
    def apply[T](
      exec: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit] => Unit,
      limit: Double => Cursor[T],
      projection: js.Any => Cursor[T],
      skip: Double => Cursor[T],
      sort: js.Any => Cursor[T]
    ): Cursor[T] = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), limit = js.Any.fromFunction1(limit), projection = js.Any.fromFunction1(projection), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
      __obj.asInstanceOf[Cursor[T]]
    }
    
    @scala.inline
    implicit class CursorMutableBuilder[Self <: Cursor[_], T] (val x: Self with Cursor[T]) extends AnyVal {
      
      @scala.inline
      def setExec(value: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit] => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLimit(value: Double => Cursor[T]): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProjection(value: js.Any => Cursor[T]): Self = StObject.set(x, "projection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkip(value: Double => Cursor[T]): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSort(value: js.Any => Cursor[T]): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CursorCount extends StObject {
    
    def exec(callback: js.Function2[/* err */ Error | Null, /* count */ Double, Unit]): Unit = js.native
  }
  object CursorCount {
    
    @scala.inline
    def apply(exec: js.Function2[/* err */ Error | Null, /* count */ Double, Unit] => Unit): CursorCount = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
      __obj.asInstanceOf[CursorCount]
    }
    
    @scala.inline
    implicit class CursorCountMutableBuilder[Self <: CursorCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExec(value: js.Function2[/* err */ Error | Null, /* count */ Double, Unit] => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DataStoreOptions extends StObject {
    
    // (optional): hook you can use to transform data after it was serialized and before it is written to disk.
    // Can be used for example to encrypt data before writing database to disk.
    // This function takes a string as parameter (one line of an NeDB data file) and outputs the transformed string, which must absolutely not contain a \n character (or data will be lost)
    var afterSerialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.native
    
    // Optional, specify the name of your NW app if you want options.filename to be relative to the directory where
    var autoload: js.UndefOr[Boolean] = js.native
    
    // (optional): reverse of afterSerialization.
    // Make sure to include both and not just one or you risk data loss.
    // For the same reason, make sure both functions are inverses of one another.
    // Some failsafe mechanisms are in place to prevent data loss if you misuse the serialization hooks:
    // NeDB checks that never one is declared without the other, and checks that they are reverse of one another by testing on random strings of various lengths.
    // In addition, if too much data is detected as corrupt,
    // NeDB will refuse to start as it could mean you're not using the deserialization hook corresponding to the serialization hook used before (see below)
    var beforeDeserialization: js.UndefOr[js.Function1[/* line */ String, String]] = js.native
    
    // (optional): between 0 and 1, defaults to 10%. NeDB will refuse to start if more than this percentage of the datafile is corrupt.
    // 0 means you don't tolerate any corruption, 1 means you don't care
    var corruptAlertThreshold: js.UndefOr[Double] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    // Optional, datastore will be in-memory only if not provided
    var inMemoryOnly: js.UndefOr[Boolean] = js.native
    
    // Optional, default to false
    var nodeWebkitAppName: js.UndefOr[Boolean] = js.native
    
    // Optional, defaults to false
    // Optional, if autoload is used this will be called after the load database with the error object as parameter. If you don't pass it the error will be thrown
    var onload: js.UndefOr[js.Function1[/* error */ Error | Null, _]] = js.native
    
    // (optional, defaults to false)
    // timestamp the insertion and last update of all documents, with the fields createdAt and updatedAt. User-specified values override automatic generation, usually useful for testing.
    var timestampData: js.UndefOr[Boolean] = js.native
  }
  object DataStoreOptions {
    
    @scala.inline
    def apply(): DataStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataStoreOptions]
    }
    
    @scala.inline
    implicit class DataStoreOptionsMutableBuilder[Self <: DataStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterSerialization(value: /* line */ String => String): Self = StObject.set(x, "afterSerialization", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterSerializationUndefined: Self = StObject.set(x, "afterSerialization", js.undefined)
      
      @scala.inline
      def setAutoload(value: Boolean): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoloadUndefined: Self = StObject.set(x, "autoload", js.undefined)
      
      @scala.inline
      def setBeforeDeserialization(value: /* line */ String => String): Self = StObject.set(x, "beforeDeserialization", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeDeserializationUndefined: Self = StObject.set(x, "beforeDeserialization", js.undefined)
      
      @scala.inline
      def setCorruptAlertThreshold(value: Double): Self = StObject.set(x, "corruptAlertThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorruptAlertThresholdUndefined: Self = StObject.set(x, "corruptAlertThreshold", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setInMemoryOnly(value: Boolean): Self = StObject.set(x, "inMemoryOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInMemoryOnlyUndefined: Self = StObject.set(x, "inMemoryOnly", js.undefined)
      
      @scala.inline
      def setNodeWebkitAppName(value: Boolean): Self = StObject.set(x, "nodeWebkitAppName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeWebkitAppNameUndefined: Self = StObject.set(x, "nodeWebkitAppName", js.undefined)
      
      @scala.inline
      def setOnload(value: /* error */ Error | Null => _): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setTimestampData(value: Boolean): Self = StObject.set(x, "timestampData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampDataUndefined: Self = StObject.set(x, "timestampData", js.undefined)
    }
  }
  
  @js.native
  trait EnsureIndexOptions extends StObject {
    
    var expireAfterSeconds: js.UndefOr[Double] = js.native
    
    var fieldName: String = js.native
    
    var sparse: js.UndefOr[Boolean] = js.native
    
    var unique: js.UndefOr[Boolean] = js.native
  }
  object EnsureIndexOptions {
    
    @scala.inline
    def apply(fieldName: String): EnsureIndexOptions = {
      val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnsureIndexOptions]
    }
    
    @scala.inline
    implicit class EnsureIndexOptionsMutableBuilder[Self <: EnsureIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpireAfterSeconds(value: Double): Self = StObject.set(x, "expireAfterSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireAfterSecondsUndefined: Self = StObject.set(x, "expireAfterSeconds", js.undefined)
      
      @scala.inline
      def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  @js.native
  trait Nedb[G] extends EventEmitter {
    
    @JSName("addListener")
    def addListener_compactiondone(event: compactionDotdone, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Add one or several document(s) to all indexes
      */
    def addToIndexes[T /* <: G */](doc: T): Unit = js.native
    def addToIndexes[T /* <: G */](doc: js.Array[T]): Unit = js.native
    
    def count(query: js.Any): CursorCount = js.native
    /**
      * Count all documents matching the query
      * @param query MongoDB-style query
      */
    def count(query: js.Any, callback: js.Function2[/* err */ Error | Null, /* n */ Double, Unit]): Unit = js.native
    
    /**
      * Ensure an index is kept for this field. Same parameters as lib/indexes
      * For now this function is synchronous, we need to test how much time it takes
      * We use an async API for consistency with the rest of the code
      * @param cb Optional callback, signature: err
      */
    def ensureIndex(options: EnsureIndexOptions): Unit = js.native
    def ensureIndex(options: EnsureIndexOptions, cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    def find[T /* <: G */](query: js.Any): Cursor[T] = js.native
    /**
      * Find all documents matching the query
      * If no callback is passed, we return the cursor so that user can limit, skip and finally exec
      * * @param {any} query MongoDB-style query
      */
    def find[T /* <: G */](query: js.Any, callback: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit]): Unit = js.native
    def find[T /* <: G */](query: js.Any, projection: js.Any): Cursor[T] = js.native
    /**
      * Find all documents matching the query
      * If no callback is passed, we return the cursor so that user can limit, skip and finally exec
      * @param query MongoDB-style query
      * @param projection MongoDB-style projection
      */
    def find[T /* <: G */](
      query: js.Any,
      projection: js.Any,
      callback: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit]
    ): Unit = js.native
    
    /**
      * Find one document matching the query
      * @param query MongoDB-style query
      */
    def findOne[T /* <: G */](query: js.Any, callback: js.Function2[/* err */ Error | Null, /* document */ T, Unit]): Unit = js.native
    /**
      * Find one document matching the query
      * @param query MongoDB-style query
      * @param projection MongoDB-style projection
      */
    def findOne[T /* <: G */](
      query: js.Any,
      projection: js.Any,
      callback: js.Function2[/* err */ Error | Null, /* document */ T, Unit]
    ): Unit = js.native
    
    /**
      * Get an array of all the data in the database
      */
    def getAllData(): js.Array[_] = js.native
    
    /**
      * Return the list of candidates for a given query
      * Crude implementation for now, we return the candidates given by the first usable index if any
      * We try the following query types, in this order: basic match, $in match, comparison match
      * One way to make it better would be to enable the use of multiple indexes if the first usable index
      * returns too much data. I may do it in the future.
      *
      * TODO: needs to be moved to the Cursor module
      */
    def getCandidates(query: js.Any): Unit = js.native
    
    /**
      * Insert one or more new documents
      * @param cb Optional callback, signature: err, insertedDoc
      */
    def insert[T /* <: G */](newDoc: T): Unit = js.native
    def insert[T /* <: G */](newDoc: T, cb: js.Function2[/* err */ Error | Null, /* document */ T, Unit]): Unit = js.native
    def insert[T /* <: G */](newDocs: js.Array[T]): Unit = js.native
    def insert[T /* <: G */](newDocs: js.Array[T], cb: js.Function2[/* err */ Error | Null, /* documents */ js.Array[T], Unit]): Unit = js.native
    
    @JSName("listenerCount")
    def listenerCount_compactiondone(`type`: compactionDotdone): Double = js.native
    
    @JSName("listeners")
    def listeners_compactiondone(event: compactionDotdone): js.Array[js.Function0[Unit]] = js.native
    
    /**
      * Load the database from the datafile, and trigger the execution of buffered commands if any
      */
    def loadDatabase(): Unit = js.native
    def loadDatabase(cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    @JSName("off")
    def off_compactiondone(event: compactionDotdone, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("on")
    def on_compactiondone(event: compactionDotdone, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_compactiondone(event: compactionDotdone, listener: js.Function0[Unit]): this.type = js.native
    
    var persistence: Persistence = js.native
    
    @JSName("prependListener")
    def prependListener_compactiondone(event: compactionDotdone, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_compactiondone(event: compactionDotdone, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("rawListeners")
    def rawListeners_compactiondone(event: compactionDotdone): js.Array[js.Function0[Unit]] = js.native
    
    def remove(query: js.Any): Unit = js.native
    def remove(query: js.Any, cb: js.Function2[/* err */ Error | Null, /* n */ Double, Unit]): Unit = js.native
    /**
      * Remove all docs matching the query
      * For now very naive implementation (similar to update)
      * @param options Optional options
      *                 options.multi If true, can update multiple documents (defaults to false)
      * @param cb Optional callback, signature: err, numRemoved
      *
      * @api private Use Datastore.remove which has the same signature
      */
    def remove(query: js.Any, options: RemoveOptions): Unit = js.native
    def remove(
      query: js.Any,
      options: RemoveOptions,
      cb: js.Function2[/* err */ Error | Null, /* n */ Double, Unit]
    ): Unit = js.native
    
    /**
      * Remove one or several document(s) from all indexes
      */
    def removeFromIndexes[T /* <: G */](doc: T): Unit = js.native
    def removeFromIndexes[T /* <: G */](doc: js.Array[T]): Unit = js.native
    
    /**
      * Remove an index
      * @param cb Optional callback, signature: err
      */
    def removeIndex(fieldName: String): Unit = js.native
    def removeIndex(fieldName: String, cb: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
    @JSName("removeListener")
    def removeListener_compactiondone(event: compactionDotdone, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Reset all currently defined indexes
      */
    def resetIndexes(newData: js.Any): Unit = js.native
    
    /**
      * Update all docs matching query v1.7.4 and prior signature.
      * For now, very naive implementation (recalculating the whole database)
      * @param options Optional options
      *                 options.multi If true, can update multiple documents (defaults to false)
      *                 options.upsert If true, document is inserted if the query doesn't match anything
      * @param cb Optional callback, signature: err,
      *                                                    numReplaced,
      *                                                    upsert (set to true if the update was in fact an upsert)
      *
      * @api private Use Datastore.update which has the same signature
      */
    def update(query: js.Any, updateQuery: js.Any): Unit = js.native
    def update(
      query: js.Any,
      updateQuery: js.Any,
      options: js.UndefOr[scala.Nothing],
      cb: js.Function3[/* err */ Error | Null, /* numberOfUpdated */ Double, /* upsert */ Boolean, Unit]
    ): Unit = js.native
    def update(query: js.Any, updateQuery: js.Any, options: UpdateOptions): Unit = js.native
    def update(
      query: js.Any,
      updateQuery: js.Any,
      options: UpdateOptions,
      cb: js.Function3[/* err */ Error | Null, /* numberOfUpdated */ Double, /* upsert */ Boolean, Unit]
    ): Unit = js.native
    def update[T /* <: G */](
      query: js.Any,
      updateQuery: js.Any,
      options: js.UndefOr[scala.Nothing],
      cb: js.Function4[
          /* err */ Error | Null, 
          /* numberOfUpdated */ Double, 
          /* affectedDocuments */ js.Any, 
          /* upsert */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    def update[T /* <: G */](
      query: js.Any,
      updateQuery: js.Any,
      options: UpdateOptions,
      cb: js.Function4[
          /* err */ Error | Null, 
          /* numberOfUpdated */ Double, 
          /* affectedDocuments */ js.Any, 
          /* upsert */ Boolean, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Update one or several documents in all indexes
      * To update multiple documents, oldDoc must be an array of { oldDoc, newDoc } pairs
      * If one update violates a constraint, all changes are rolled back
      */
    def updateIndexes[T /* <: G */](oldDoc: T, newDoc: T): Unit = js.native
    def updateIndexes[T /* <: G */](updates: js.Array[NewDoc[T, G]]): Unit = js.native
    
    /**
      * Update all docs matching query v1.8 signature.
      * For now, very naive implementation (recalculating the whole database)
      * @param options Optional options
      *                 options.multi If true, can update multiple documents (defaults to false)
      *                 options.upsert If true, document is inserted if the query doesn't match anything
      * @param cb Optional callback, signature: err,
      *                                                    numAffected,
      *                                                    affectedDocuments (when returnUpdatedDocs is set to true), obj or array
      *                                                    upsert (set to true if the update was in fact an upsert)
      *
      * @api private Use Datastore.update which has the same signature
      */
    @JSName("update")
    def update_T_G[T /* <: G */](query: js.Any, updateQuery: js.Any): Unit = js.native
    @JSName("update")
    def update_T_G[T /* <: G */](query: js.Any, updateQuery: js.Any, options: UpdateOptions): Unit = js.native
  }
  
  @js.native
  trait Persistence extends StObject {
    
    def compactDatafile(): Unit = js.native
    
    def setAutocompactionInterval(interval: Double): Unit = js.native
    
    def stopAutocompaction(): Unit = js.native
  }
  object Persistence {
    
    @scala.inline
    def apply(
      compactDatafile: () => Unit,
      setAutocompactionInterval: Double => Unit,
      stopAutocompaction: () => Unit
    ): Persistence = {
      val __obj = js.Dynamic.literal(compactDatafile = js.Any.fromFunction0(compactDatafile), setAutocompactionInterval = js.Any.fromFunction1(setAutocompactionInterval), stopAutocompaction = js.Any.fromFunction0(stopAutocompaction))
      __obj.asInstanceOf[Persistence]
    }
    
    @scala.inline
    implicit class PersistenceMutableBuilder[Self <: Persistence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompactDatafile(value: () => Unit): Self = StObject.set(x, "compactDatafile", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetAutocompactionInterval(value: Double => Unit): Self = StObject.set(x, "setAutocompactionInterval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopAutocompaction(value: () => Unit): Self = StObject.set(x, "stopAutocompaction", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * options only one option for now: multi which allows the removal of multiple documents if set to true. Default is false
    */
  @js.native
  trait RemoveOptions extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.native
  }
  object RemoveOptions {
    
    @scala.inline
    def apply(): RemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveOptions]
    }
    
    @scala.inline
    implicit class RemoveOptionsMutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    }
  }
  
  /**
    * multi (defaults to false) which allows the modification of several documents if set to true
    * upsert (defaults to false) if you want to insert a new document corresponding to the update rules if your query doesn't match anything
    */
  @js.native
  trait UpdateOptions extends StObject {
    
    var multi: js.UndefOr[Boolean] = js.native
    
    var returnUpdatedDocs: js.UndefOr[Boolean] = js.native
    
    var upsert: js.UndefOr[Boolean] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setReturnUpdatedDocs(value: Boolean): Self = StObject.set(x, "returnUpdatedDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnUpdatedDocsUndefined: Self = StObject.set(x, "returnUpdatedDocs", js.undefined)
      
      @scala.inline
      def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
}
