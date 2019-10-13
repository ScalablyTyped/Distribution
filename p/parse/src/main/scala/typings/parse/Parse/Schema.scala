package typings.parse.Parse

import org.scalablytyped.runtime.StringDictionary
import typings.parse.Parse.Schema.Index
import typings.parse.Parse.Schema.TYPE
import typings.parse.Parse.Schema._TYPE
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Parse.Schema object is for handling schema data from Parse.
  * All the schemas methods require MasterKey.
  *
  * @param {String} className Parse Class string
  *
  * https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Schema.html
  *
  * ```
  * const schema = new Parse.Schema('MyClass');
  * schema.addString('field');
  * schema.addIndex('index_name', { field: 1 });
  * schema.save();
  * ```
  */
@JSGlobal("Parse.Schema")
@js.native
class Schema protected () extends js.Object {
  def this(className: String) = this()
  def addArray(name: String): this.type = js.native
  def addBoolean(name: String): this.type = js.native
  def addDate(name: String): this.type = js.native
  def addField(name: String): this.type = js.native
  def addField(name: String, `type`: TYPE): this.type = js.native
  def addFile(name: String): this.type = js.native
  def addGeoPoint(name: String): this.type = js.native
  /**
    * Adding an Index to Create / Update a Schema
    * @param {String} name Name of the field that will be created on Parse
    * @param {Schema.Index} index { 'field': value } `field` should exist in the schema before using addIndex. `value` can be a (String|Number|Boolean|Date|Parse.File|Parse.GeoPoint|Array|Object|Pointer|Parse.Relation)
    * @return Returns the schema, so you can chain this call.
    * @example
    * ```
    * schema.addIndex('index_name', {'field': 1});
    * ```
    */
  def addIndex(name: String, index: Index): this.type = js.native
  def addNumber(name: String): this.type = js.native
  def addObject(name: String): this.type = js.native
  /**
    * Adding Pointer Field
    * @param {String} name Name of the field that will be created on Parse
    * @param {String} targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addPointer(name: String, targetClass: String): this.type = js.native
  def addPolygon(name: String): this.type = js.native
  /**
    * Adding Relation Field
    * @param {String} name Name of the field that will be created on Parse
    * @param {String} targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addRelation(name: String, targetClass: String): this.type = js.native
  def addString(name: String): this.type = js.native
  /**
    * Removing a Schema from Parse Can only be used on Schema without objects
    * @param options
    * Valid options are:
    * - useMasterKey: In Cloud Code and Node only, causes the Master Key to be used for this request.
    * - sessionToken: A valid session token, used for making a request on behalf of a specific user.
    * @returns {Promise} A promise that is resolved with the result when the query completes.
    */
  // @TODO Fix Promise<any>
  def delete(): js.Promise[_] = js.native
  def delete(options: ScopeOptions): js.Promise[_] = js.native
  /**
    * Deleting a Field to Update on a Schema
    * @param name Name of the field
    * @return Returns the schema, so you can chain this call.
    */
  def deleteField(name: String): this.type = js.native
  /**
    * Deleting a Index Field to Update on a Schema
    * @param name Name of the index field
    * @return Returns the schema, so you can chain this call.
    */
  def deleteIndex(name: String): this.type = js.native
  /**
    * Get the Schema from Parse
    */
  def get(): js.Promise[Schema] = js.native
  def get(options: ScopeOptions): js.Promise[Schema] = js.native
  /**
    * Removes all objects from a Schema (class) in Parse. EXERCISE CAUTION, running this will delete all objects for this schema and cannot be reversed
    */
  // TODO Fix Promise<any>
  def purge(): js.Promise[_] = js.native
  /**
    * Create a new Schema on Parse
    */
  def save(): js.Promise[Schema] = js.native
  def save(options: ScopeOptions): js.Promise[Schema] = js.native
  /**
    * Update a Schema on Parse
    */
  def update(): js.Promise[Schema] = js.native
  def update(options: ScopeOptions): js.Promise[Schema] = js.native
}

/* static members */
@JSGlobal("Parse.Schema")
@js.native
object Schema extends js.Object {
  trait _TYPE extends js.Object
  
  /**
    * Static method to get all schemas
    * @param options Valid options are:
    * - useMasterKey: In Cloud Code and Node only, causes the Master Key to be used for this request.
    * - sessionToken: A valid session token, used for making a request on behalf of a specific user.
    */
  def all(): js.Promise[js.Array[Schema]] = js.native
  def all(options: ScopeOptions): js.Promise[js.Array[Schema]] = js.native
  type Index = StringDictionary[TYPE]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.parse.Parse.File
    - typings.parse.Parse.GeoPoint
    - js.Array[js.Any]
    - js.Object
    - typings.parse.Parse.Pointer
    - typings.parse.Parse.Relation[typings.parse.Parse.Object, typings.parse.Parse.Object]
  */
  type TYPE = _TYPE | js.Array[js.Any] | (Relation[Object, Object]) | String | Double | Boolean | Date | js.Object
}

