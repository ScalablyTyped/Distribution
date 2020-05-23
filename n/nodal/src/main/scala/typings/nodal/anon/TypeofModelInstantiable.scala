package typings.nodal.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.nodal.mod.Composer
import typings.nodal.mod.Database
import typings.nodal.mod.IAnyObject
import typings.nodal.mod.IColumn
import typings.nodal.mod.IExtendedError
import typings.nodal.mod.Model
import typings.nodal.mod.RelationshipEdge
import typings.nodal.mod.RelationshipNode
import typings.nodal.mod.RelationshipPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofModelInstantiable
  extends Instantiable1[/* modelData */ js.Object, Model]
     with Instantiable2[/* modelData */ js.Object, /* fromStorage */ Boolean, Model]
     with Instantiable3[/* modelData */ js.Object, /* fromStorage */ Boolean, /* fromSeed */ Boolean, Model] {
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
  def joinsTo(
    modelClass: /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any,
    options: As
  ): RelationshipEdge | Null = js.native
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
  def setSchema(schema: Columns): Unit = js.native
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

