package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.Schema.FieldOptions
import typings.parse.mod.global.Parse.Schema.Index
import typings.parse.mod.global.Parse.Schema.TYPE
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Parse.Schema object is for handling schema data from Parse.
  * All the schemas methods require MasterKey.
  *
  * @param className Parse Class string
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
class Schema_ protected () extends js.Object {
  def this(className: String) = this()
  def addArray(name: String): this.type = js.native
  def addArray(name: String, options: FieldOptions[js.Array[_]]): this.type = js.native
  def addBoolean(name: String): this.type = js.native
  def addBoolean(name: String, options: FieldOptions[Boolean]): this.type = js.native
  def addDate(name: String): this.type = js.native
  def addDate(name: String, options: FieldOptions[Date]): this.type = js.native
  def addField[T /* <: TYPE */](name: String): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T, options: FieldOptions[_]): this.type = js.native
  def addFile(name: String): this.type = js.native
  def addFile(name: String, options: FieldOptions[File]): this.type = js.native
  def addGeoPoint(name: String): this.type = js.native
  def addGeoPoint(name: String, options: FieldOptions[GeoPoint]): this.type = js.native
  /**
    * Adding an Index to Create / Update a Schema
    * @param name Name of the field that will be created on Parse
    * @param index `{ 'field': value }` where `field` should exist in the schema before using addIndex.
    * @return Returns the schema, so you can chain this call.
    * @example
    * ```
    * schema.addIndex('index_name', {'field': 1});
    * ```
    */
  def addIndex(name: String, index: Index): this.type = js.native
  def addNumber(name: String): this.type = js.native
  def addNumber(name: String, options: FieldOptions[Double]): this.type = js.native
  def addObject(name: String): this.type = js.native
  def addObject(name: String, options: FieldOptions[js.Object]): this.type = js.native
  /**
    * Adding Pointer Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addPointer(name: String, targetClass: String): this.type = js.native
  def addPointer(name: String, targetClass: String, options: FieldOptions[Pointer]): this.type = js.native
  def addPolygon(name: String): this.type = js.native
  def addPolygon(name: String, options: FieldOptions[Polygon]): this.type = js.native
  /**
    * Adding Relation Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addRelation(name: String, targetClass: String): this.type = js.native
  def addString(name: String): this.type = js.native
  def addString(name: String, options: FieldOptions[String]): this.type = js.native
  /**
    * Removing a Schema from Parse Can only be used on Schema without objects
    * @returns A promise that is resolved with the result when the query completes.
    */
  // @TODO Fix Promise<any>
  def delete(): js.Promise[_] = js.native
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
  /**
    * Removes all objects from a Schema (class) in Parse. EXERCISE CAUTION, running this will delete all objects for this schema and cannot be reversed
    */
  // TODO Fix Promise<any>
  def purge(): js.Promise[_] = js.native
  /**
    * Create a new Schema on Parse
    */
  def save(): js.Promise[Schema] = js.native
  /**
    * Update a Schema on Parse
    */
  def update(): js.Promise[Schema] = js.native
}

