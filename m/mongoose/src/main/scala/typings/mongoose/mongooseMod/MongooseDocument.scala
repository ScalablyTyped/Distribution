package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.Anon_Getters
import typings.mongoose.mongooseMod.Error.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section document.js
  * http://mongoosejs.com/docs/api.html#document-js
  */
@js.native
trait MongooseDocument extends MongooseDocumentOptionals {
  /** Empty object that you can use for storing properties on the document */
  @JSName("$locals")
  var $locals: StringDictionary[js.Any] = js.native
  /** This documents _id. */
  var _id: js.Any = js.native
  /** Hash containing current validation errors. */
  var errors: js.Any = js.native
  /** Boolean flag specifying if the document is new. */
  var isNew: Boolean = js.native
  /** The documents schema. */
  var schema: Schema[_] = js.native
  /** Checks if a path is set to its default. */
  @JSName("$isDefault")
  def $isDefault(): Boolean = js.native
  @JSName("$isDefault")
  def $isDefault(path: String): Boolean = js.native
  /** Getter/setter around the session associated with this document. */
  @JSName("$session")
  def $session(): ClientSession = js.native
  @JSName("$session")
  def $session(session: ClientSession): ClientSession = js.native
  /**
    * Takes a populated field and returns it to its unpopulated state.
    * If the path was not populated, this is a no-op.
    */
  def depopulate(): this.type = js.native
  def depopulate(path: String): this.type = js.native
  /**
    * Returns true if the Document stores the same data as doc.
    * Documents are considered equal when they have matching _ids, unless neither document
    * has an _id, in which case this function falls back to usin deepEqual().
    * @param doc a document to compare
    */
  def equals(doc: MongooseDocument): Boolean = js.native
  /**
    * Explicitly executes population and returns a promise.
    * Useful for ES2015 integration.
    * @returns promise that resolves to the document when population is done
    */
  def execPopulate(): js.Promise[this.type] = js.native
  /**
    * Returns the value of a path.
    * @param type optionally specify a type for on-the-fly attributes
    * @param options
    * @param options.virtuals apply virtuals before getting this path
    * @param options.getters if false, skip applying getters and just get the raw value
    */
  def get(path: String): js.Any = js.native
  def get(path: String, `type`: js.Any): js.Any = js.native
  def get(path: String, `type`: js.Any, options: Anon_Getters): js.Any = js.native
  /**
    * Initializes the document without setters or marking anything modified.
    * Called internally after a document is returned from mongodb.
    * @param doc document returned by mongo
    * @param opts Options
    */
  def init(doc: MongooseDocument): this.type = js.native
  def init(doc: MongooseDocument, opts: js.Any): this.type = js.native
  /** Helper for console.log */
  def inspect(): js.Any = js.native
  def inspect(options: js.Any): js.Any = js.native
  /**
    * Marks a path as invalid, causing validation to fail.
    * The errorMsg argument will become the message of the ValidationError.
    * The value argument (if passed) will be available through the ValidationError.value property.
    * @param path the field to invalidate
    * @param errorMsg the error which states the reason path was invalid
    * @param value optional invalid value
    * @param kind optional kind property for the error
    * @returns the current ValidationError, with all currently invalidated paths
    */
  def invalidate(path: String, errorMsg: String): ValidationError | Boolean = js.native
  def invalidate(path: String, errorMsg: String, value: js.Any): ValidationError | Boolean = js.native
  def invalidate(path: String, errorMsg: String, value: js.Any, kind: String): ValidationError | Boolean = js.native
  def invalidate(path: String, errorMsg: NativeError): ValidationError | Boolean = js.native
  def invalidate(path: String, errorMsg: NativeError, value: js.Any): ValidationError | Boolean = js.native
  def invalidate(path: String, errorMsg: NativeError, value: js.Any, kind: String): ValidationError | Boolean = js.native
  /** Returns true if path was directly set and modified, else false. */
  def isDirectModified(path: String): Boolean = js.native
  /** Checks if path was explicitly selected. If no projection, always returns true. */
  def isDirectSelected(path: String): Boolean = js.native
  /** Checks if path was initialized */
  def isInit(path: String): Boolean = js.native
  /**
    * Returns true if this document was modified, else false.
    * If path is given, checks if a path or any full path containing path as part of its path
    * chain has been modified.
    */
  def isModified(): Boolean = js.native
  def isModified(path: String): Boolean = js.native
  /** Checks if path was selected in the source query which initialized this document. */
  def isSelected(path: String): Boolean = js.native
  /**
    * Marks the path as having pending changes to write to the db.
    * Very helpful when using Mixed types.
    * @param path the path to mark modified
    */
  def markModified(path: String): Unit = js.native
  /** Returns the list of paths that have been modified. */
  def modifiedPaths(): js.Array[String] = js.native
  /**
    * Overwrite all values, except for immutable properties.
    * @param obj the object to overwrite this document with
    */
  def overwrite(obj: js.Any): this.type = js.native
  /**
    * Populates document references, executing the callback when complete.
    * If you want to use promises instead, use this function with
    * execPopulate()
    * Population does not occur unless a callback is passed or you explicitly
    * call execPopulate(). Passing the same path a second time will overwrite
    * the previous path options. See Model.populate() for explaination of options.
    * @param path The path to populate or an options object
    * @param names The properties to fetch from the populated document
    * @param callback When passed, population is invoked
    */
  def populate(callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]): this.type = js.native
  def populate(options: js.Array[ModelPopulateOptions]): this.type = js.native
  def populate(
    options: js.Array[ModelPopulateOptions],
    callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]
  ): this.type = js.native
  def populate(options: ModelPopulateOptions): this.type = js.native
  def populate(options: ModelPopulateOptions, callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]): this.type = js.native
  def populate(path: String): this.type = js.native
  def populate(path: String, callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]): this.type = js.native
  def populate(path: String, names: String): this.type = js.native
  def populate(path: String, names: String, callback: js.Function2[/* err */ js.Any, /* res */ this.type, Unit]): this.type = js.native
  /** Gets _id(s) used during population of the given path. If the path was not populated, undefined is returned. */
  def populated(path: String): js.Any = js.native
  /** Sends an replaceOne command with this document _id as the query selector.  */
  def replaceOne(replacement: js.Any): Query[_] = js.native
  def replaceOne(replacement: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Query[_] = js.native
  /**
    * Sets the value of a path, or many paths.
    * @param path path or object of key/vals to set
    * @param val the value to set
    * @param type optionally specify a type for "on-the-fly" attributes
    * @param options optionally specify options that modify the behavior of the set
    */
  def set(path: String, `val`: js.Any): this.type = js.native
  def set(path: String, `val`: js.Any, options: js.Any): this.type = js.native
  def set(path: String, `val`: js.Any, `type`: js.Any, options: js.Any): this.type = js.native
  def set(value: js.Any): this.type = js.native
  /**
    * The return value of this method is used in calls to JSON.stringify(doc).
    * This method accepts the same options as Document#toObject. To apply the
    * options to every document of your schema by default, set your schemas
    * toJSON option to the same argument.
    */
  def toJSON(): js.Any = js.native
  def toJSON(options: DocumentToObjectOptions): js.Any = js.native
  /**
    * Converts this document into a plain javascript object, ready for storage in MongoDB.
    * Buffers are converted to instances of mongodb.Binary for proper storage.
    */
  def toObject(): js.Any = js.native
  def toObject(options: DocumentToObjectOptions): js.Any = js.native
  /**
    * Clears the modified state on the specified path.
    * @param path the path to unmark modified
    */
  def unmarkModified(path: String): Unit = js.native
  /** Sends an update command with this document _id as the query selector.  */
  def update(doc: js.Any): Query[_] = js.native
  def update(doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Query[_] = js.native
  def update(doc: js.Any, options: ModelUpdateOptions): Query[_] = js.native
  def update(
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] = js.native
  /** Sends an updateOne command with this document _id as the query selector.  */
  def updateOne(doc: js.Any): Query[_] = js.native
  def updateOne(doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Query[_] = js.native
  def updateOne(doc: js.Any, options: ModelUpdateOptions): Query[_] = js.native
  def updateOne(
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] = js.native
  /**
    * Executes registered validation rules for this document.
    * @param optional options internal options
    * @param callback callback called after validation completes, passing an error if one occurred
    */
  def validate(): js.Promise[Unit] = js.native
  def validate(callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def validate(optional: js.Any): js.Promise[Unit] = js.native
  def validate(optional: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  /**
    * Executes registered validation rules (skipping asynchronous validators) for this document.
    * This method is useful if you need synchronous validation.
    * @param pathsToValidate only validate the given paths
    * @returns ValidationError if there are errors during validation, or undefined if there is no error.
    */
  def validateSync(): js.UndefOr[ValidationError] = js.native
  def validateSync(pathsToValidate: String): js.UndefOr[ValidationError] = js.native
  def validateSync(pathsToValidate: js.Array[String]): js.UndefOr[ValidationError] = js.native
}

