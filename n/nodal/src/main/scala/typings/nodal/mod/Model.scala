package typings.nodal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodal.AnonAs
import typings.nodal.AnonColumns
import typings.nodal.AnonConvert
import typings.nodal.AnonCreatedat
import typings.nodal.AnonParams
import typings.nodal.TypeofModelInstantiable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "Model")
@js.native
class Model protected () extends js.Object {
  def this(modelData: js.Object) = this()
  def this(modelData: js.Object, fromStorage: Boolean) = this()
  def this(modelData: js.Object, fromStorage: Boolean, fromSeed: Boolean) = this()
  var _calculations: ICalculations = js.native
  var _calculationsList: js.Array[String] = js.native
  var _changed: js.Any = js.native
  var _columnLookup: StringDictionary[js.Any] = js.native
  var _columnNames: js.Array[String] = js.native
  var _columns: js.Array[IColumn] = js.native
  var _data: js.Any = js.native
  var _errors: js.Any = js.native
  var _hides: IAnyObject = js.native
  var _inStorage: Boolean = js.native
  var _isSeeding: js.Any = js.native
  var _joinsCache: js.Any = js.native
  var _joinsList: js.Any = js.native
  var _relationshipCache: IAnyObject = js.native
  var _table: String = js.native
  var _validations: IAnyObject = js.native
  var _validationsList: js.Array[_] = js.native
  var _verificationsList: js.Any = js.native
  var aggregateBy: AnonCreatedat = js.native
  var constructor: TypeofModelInstantiable = js.native
  var data: js.Any = js.native
  var db: Database | js.Any = js.native
  var externalInterface: js.Array[String] = js.native
  var formatters: IAnyObject = js.native
  var schema: AnonColumns = js.native
  /**
    * Destroys model reference in database
    * @param {function} callback Method to execute upon completion, returns error if failed
    * @private
    */
  /* private */ def __destroy__(callback: js.Any): js.Any = js.native
  def __generateSaveQuery__(): AnonParams = js.native
  /**
    * Prepare model for use
    * @private
    */
  /* private */ def __initialize__(): js.Any = js.native
  def __load__(data: js.Any): this.type = js.native
  def __load__(data: js.Any, fromStorage: Boolean): this.type = js.native
  def __load__(data: js.Any, fromStorage: Boolean, fromSeed: Boolean): this.type = js.native
  /**
    * Sets specified field data for the model, assuming data is safe and does not log changes
    * @param {string} field Field to set
    * @param {any} value Value for the field
    */
  def __safeSet__(field: String, value: js.Any): Unit = js.native
  /**
    * Saves model to database
    * @param {function} callback Method to execute upon completion, returns error if failed (including validations didn't pass)
    * @private
    */
  /* private */ def __save__(callback: js.Any): js.Any = js.native
  /**
    * Validates provided fieldList (or all fields if not provided)
    * @private
    * @param {optional Array} fieldList fields to validate
    */
  /* private */ def __validate__(): js.Any = js.native
  /* private */ def __validate__(field: js.Any): js.Any = js.native
  /**
    * Runs all verifications before saving
    * @param {function} callback Method to execute upon completion. Returns true if OK, false if failed
    * @private
    */
  def __verify__(callback: js.Function): js.Any = js.native
  /**
    * Logic to execute after a model is destroyed. Intended to be overwritten when inherited.
    * @param {Function} callback Invoke with first argument as an error if failure.
    */
  def afterDestroy(callback: js.Function): Unit = js.native
  /**
    * Logic to execute after a model saves. Intended to be overwritten when inherited.
    * @param {Function} callback Invoke with first argument as an error if failure.
    */
  def afterSave(callback: js.Function): Unit = js.native
  /**
    * Logic to execute before a model gets destroyed. Intended to be overwritten when inherited.
    * @param {Function} callback Invoke with first argument as an error if failure.
    */
  def beforeDestroy(callback: js.Function): Unit = js.native
  /**
    * Logic to execute before a model saves. Intended to be overwritten when inherited.
    * @param {Function} callback Invoke with first argument as an error if failure.
    */
  def beforeSave(callback: js.Function): Unit = js.native
  /**
    * Calculate field from calculations (assumes it exists)
    *  @param {string} field Name of the calculated field
    */
  def calculate(field: String): Unit = js.native
  /**
    * Provides an array of all changed fields since model was created / loaded from storage
    * @return {Array}
    */
  def changedFields(): js.Array[String] = js.native
  /**
    * Clears all errors for a specified field
    * @param {string} key The specified field for which to create the error (or '*' for generic)
    * @return {boolean}
    */
  def clearError(key: String): Boolean = js.native
  /**
    * Converts a value to its intended format based on its field. Returns null if field not found.
    * @param {string} field The field to use for conversion data
    * @param {any} value The value to convert
    */
  def convert(field: String, value: js.Any): js.Any = js.native
  /**
    * Destroys model reference in database.
    * @param {function({Error} err, {Nodal.Model} model)} callback
    *   Method to execute upon completion, returns error if failed
    */
  def destroy(callback: js.Function): Unit = js.native
  /**
    * Destroys model and cascades all deletes.
    * @param {function} callback method to run upon completion
    */
  def destroyCascade(callback: js.Function): Unit = js.native
  /**
    * Creates an error object for the model if any validations have failed, returns null otherwise
    * @return {Error}
    */
  def errorObject(): IExtendedError | Null = js.native
  /**
    * Retrieve the defaultValue for this field from our schema
    * @param {string} field
    * @return {any}
    */
  def fieldDefaultValue(field: String): js.Any = js.native
  /**
    * Retrieve our field schema definitions
    * @return {Array}
    */
  def fieldDefinitions(): js.Array[IColumn] = js.native
  /**
    * Retrieve an array of fields for our model
    * @return {Array}
    */
  def fieldList(): js.Array[String] = js.native
  /**
    * Retrieve field data for the model.
    * @param {string} field Field for which you'd like to retrieve data.
    */
  def get(field: String): js.Any = js.native
  def get(field: String, ignoreFormat: Boolean): js.Any = js.native
  /**
    * Retrieve the schema data type for the specified field
    * @param {string} field
    * @return {string}
    */
  def getDataTypeOf(field: String): AnonConvert = js.native
  /**
    * Gives us an error object with each errored field as a key, and each value
    * being an array of failure messages from the validators
    * @return {Object}
    */
  def getErrors(): IErrorsObject = js.native
  /**
    * Retrieve the schema field data for the specified field
    * @param {string} field
    * @return {Object}
    */
  def getFieldData(field: String): js.Any = js.native
  /**
    * Tells us whether a model field has changed since we created it or loaded it from storage.
    * @param {string} field The model field
    * @return {boolean}
    */
  def hasChanged(field: String): Boolean = js.native
  /**
    * Tells us whether or not the model has errors (failed validations)
    * @return {boolean}
    */
  def hasErrors(): Boolean = js.native
  /**
    * Determine if the model has a specified field.
    * @param {string} field
    * @return {boolean}
    */
  def hasField(field: String): Boolean = js.native
  /**
    * Indicates whethere or not the model is currently represented in hard storage (db).
    * @return {boolean}
    */
  def inStorage(): Boolean = js.native
  /**
    * Retrieve associated models joined this model from the database.
    * @param {function({Error} err, {Nodal.Model|Nodal.ModelArray} model_1, ... {Nodal.Model|Nodal.ModelArray} model_n)}
    *   Pass in a function with named parameters corresponding the relationships you'd like to retrieve.
    *   The first parameter is always an error callback.
    */
  def include(callback: js.Function2[/* err */ Error, /* repeated */ this.type | ModelArray[this.type], Unit]): Unit = js.native
  /**
    * Determine whether or not this field is an Array (PostgreSQL supports this)
    * @param {string} field
    * @return {boolean}
    */
  def isFieldArray(field: String): Boolean = js.native
  /**
    * Determine whether or not this field is a primary key in our schema
    * @param {string} field
    * @return {boolean}
    */
  def isFieldPrimaryKey(field: String): Boolean = js.native
  /**
    * Indicates whethere or not the model is being generated from a seed.
    * @return {boolean}
    */
  def isSeeding(): Boolean = js.native
  /**
    * Retrieves joined Model or ModelArray
    * @param {String} joinName the name of the join (list of connectors separated by __)
    */
  def joined(joinName: String): Model | ModelArray[this.type] = js.native
  /**
    * Reads new data into the model.
    * @param {Object} data Data to inject into the model
    * @return {this}
    */
  def read(data: IAnyObject): this.type = js.native
  /**
    * Grabs the path of the given relationship from the RelationshipGraph
    * @param {string} name the name of the relationship
    */
  def relationship(name: String): RelationshipPath = js.native
  /**
    * Save a model (execute beforeSave and afterSave)
    * @param {Function} callback Callback to execute upon completion
    */
  def save(callback: js.Function): Unit = js.native
  /**
    * Sets specified field data for the model. Logs and validates the change.
    * @param {string} field Field to set
    * @param {any} value Value for the field
    */
  def set(field: String, value: js.Any): js.Any = js.native
  /**
    * Set an error for a specified field (supports multiple errors)
    * @param {string} key The specified field for which to create the error (or '*' for generic)
    * @param {string} message The error message
    * @return {boolean}
    */
  def setError(key: String, message: String): Boolean = js.native
  def setJoined(field: String, value: Model): Model | ModelArray[this.type] = js.native
  /**
    * Set a joined object (Model or ModelArray)
    * @param {string} field The field (name of the join relationship)
    * @param {Model|ModelArray} value The joined model or array of models
    */
  def setJoined(field: String, value: ModelArray[this.type]): Model | ModelArray[this.type] = js.native
  /**
    * Get the table name for the model.
    * @return {string}
    */
  def tableName(): String = js.native
  /**
    * Creates a plain object from the Model, with properties matching an optional interface
    * @param {Array} arrInterface Interface to use for object creation
    */
  def toObject(): js.Any = js.native
  def toObject(arrInterface: js.Array[_]): js.Any = js.native
  /**
    * Runs an update query for this specific model instance
    * @param {Object} fields Key-value pairs of fields to update
    * @param {Function} callback Callback to execute upon completion
    */
  def update(fields: IAnyObject, callback: js.Function): Unit = js.native
}

/* static members */
@JSImport("nodal", "Model")
@js.native
object Model extends js.Object {
  var _relationshipCache: js.Any = js.native
  /**
    * Create a calculated field (in JavaScript). Must be synchronous.
    * @param {string} calcField The name of the calculated field
    * @param {function} fnCalculate The synchronous method to perform a calculation for.
    *   Pass the names of the (non-computed) fields you'd like to use as parameters.
    */
  def calculates(calcField: String, fnCompute: js.Function): Unit = js.native
  /**
    * Return the column schema data for a given name
    * @param {string} columnName
    */
  def column(columnName: String): js.Any = js.native
  /**
    * Get the model's column lookup data
    * @return {Object}
    */
  def columnLookup(): IAnyObject = js.native
  /**
    * Get the model's column names (fields)
    * @return {Array}
    */
  def columnNames(): js.Array[String] = js.native
  /**
    * Get the model's column data
    * @return {Array}
    */
  def columns(): js.Array[IColumn] = js.native
  /**
    * Creates a new model instance using the provided data.
    * @param {object} data The data to load into the object.
    * @param {function({Error} err, {Nodal.Model} model)} callback The callback to execute upon completion
    */
  def create(
    data: IAnyObject,
    callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  /**
    * Finds and destroys a model with a specified id. Return a notFound error if model does not exist.
    * @param {number} id The id of the model you're looking for
    * @param {function({Error} err, {Nodal.Model} model)} callback The callback to execute upon completion
    */
  def destroy(
    id: Double,
    callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  def find(
    id: Double,
    callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  def findBy(
    field: String,
    value: js.Any,
    callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  /**
    * Finds a model with a provided field, value pair. Returns the first found.
    * @param {string} field Name of the field
    * @param {object} data Key-value pairs of Model creation data. Will use appropriate value to query for based on "field" parametere.
    * @param {function({Error} err, {Nodal.Model} model)} callback The callback to execute upon completion
    */
  def findOrCreateBy(
    field: String,
    data: IAnyObject,
    callback: js.Function2[/* err */ IExtendedError | Null, /* model */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  /**
    * Check if the model has a column name in its schema
    * @param {string} columnName
    */
  def hasColumn(columnName: String): Boolean = js.native
  /**
    * Hides fields from being output in .toObject() (i.e. API responses), even if asked for
    * @param {String} field
    */
  def hides(field: String): Boolean = js.native
  /**
    * Tells us if a field is hidden (i.e. from API queries)
    * @param {String} field
    */
  def isHidden(field: String): js.Any = js.native
  /**
    * Sets a joins relationship for the Model. Sets joinedBy relationship for parent.
    * @param {class Nodal.Model} Model The Model class which your current model belongs to
    * @param {Object} [options={}]
    *   "name": The string name of the parent in the relationship (default to camelCase of Model name)
    *   "via": Which field in current model represents this relationship, defaults to `${name}_id`
    *   "as": What to display the name of the child as when joined to the parent (default to camelCase of child name)
    *   "multiple": Whether the child exists in multiples for the parent (defaults to false)
    */
  def joinsTo(modelClass: TypeofModelInstantiable, options: AnonAs): RelationshipEdge | Null = js.native
  /**
    * Creates a new Composer (ORM) instance to begin a new query.
    * @param {optional Nodal.Database} db Deprecated - provide a database to query from. Set the model's db in its constructor file, instead.
    * @return {Nodal.Composer}
    */
  def query[T /* <: Model */](): Composer[T] = js.native
  def query[T /* <: Model */](db: Database): Composer[T] = js.native
  /**`
    * FIXME
    */
  def relationship(name: String): RelationshipPath = js.native
  /**
    * FIXME
    */
  def relationships(): RelationshipNode = js.native
  /**
    * Set the database to be used for this model
    * @param {Nodal.Database} db
    */
  def setDatabase(db: Database): Unit = js.native
  /**
    * Set the schema to be used for this model
    * @param {Object} schema
    */
  def setSchema(schema: AnonColumns): Unit = js.native
  /**
    * Get the model's table name
    * @return {string}
    */
  def table(): String = js.native
  /**
    * Finds and updates a model with a specified id. Return a notFound error if model does not exist.
    * @param {number} id The id of the model you're looking for
    * @param {object} data The data to load into the object.
    * @param {function({Error} err, {Nodal.Model} model)} callback The callback to execute upon completion
    */
  def update(
    id: Double,
    data: IAnyObject,
    callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[this.type], Unit]
  ): Unit = js.native
  /**
    * Create a validator. These run synchronously and check every time a field is set / cleared.
    * @param {string} field The field you'd like to validate
    * @param {string} message The error message shown if a validation fails.
    * @param {function({any} value)} fnAction the validation to run - first parameter is the value you're testing.
    */
  def validates(field: String, message: String, fnAction: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  /**
    * Creates a verifier. These run asynchronously, support multiple fields, and check every time you try to save a Model.
    * @param {string} message The error message shown if a validation fails.
    * @param {function} fnAction The asynchronous verification method. The last argument passed is always a callback,
    * and field names are determined by the  argument names.
    */
  def verifies(message: String, fnAction: js.Function): Unit = js.native
}

