package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.Schema.AttrType
import typings.parse.mod.global.Parse.Schema.CLP
import typings.parse.mod.global.Parse.Schema.FieldOptions
import typings.parse.mod.global.Parse.Schema.Index
import typings.parse.mod.global.Parse.Schema.TYPE
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Schema_[T /* <: Object[Attributes] */] protected () extends js.Object {
  def this(className: String) = this()
  
  def addArray(key: AttrType[T, js.Array[_]]): this.type = js.native
  def addArray(key: AttrType[T, js.Array[_]], options: FieldOptions[js.Array[_]]): this.type = js.native
  
  def addBoolean(key: AttrType[T, Boolean]): this.type = js.native
  def addBoolean(key: AttrType[T, Boolean], options: FieldOptions[Boolean]): this.type = js.native
  
  def addDate(key: AttrType[T, Date]): this.type = js.native
  def addDate(key: AttrType[T, Date], options: FieldOptions[Date]): this.type = js.native
  
  def addField[T /* <: TYPE */](name: String): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T, options: FieldOptions[_]): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: js.UndefOr[scala.Nothing], options: FieldOptions[_]): this.type = js.native
  
  def addFile(key: AttrType[T, File]): this.type = js.native
  def addFile(key: AttrType[T, File], options: FieldOptions[File]): this.type = js.native
  
  def addGeoPoint(key: AttrType[T, GeoPoint]): this.type = js.native
  def addGeoPoint(key: AttrType[T, GeoPoint], options: FieldOptions[GeoPoint]): this.type = js.native
  
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
  
  def addNumber(key: AttrType[T, Double]): this.type = js.native
  def addNumber(key: AttrType[T, Double], options: FieldOptions[Double]): this.type = js.native
  
  def addObject(key: AttrType[T, js.Object]): this.type = js.native
  def addObject(key: AttrType[T, js.Object], options: FieldOptions[js.Object]): this.type = js.native
  
  /**
    * Adding Pointer Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addPointer(key: AttrType[T, Object[Attributes] | Pointer], targetClass: String): this.type = js.native
  def addPointer(
    key: AttrType[T, Object[Attributes] | Pointer],
    targetClass: String,
    options: FieldOptions[Pointer]
  ): this.type = js.native
  
  def addPolygon(key: AttrType[T, Polygon]): this.type = js.native
  def addPolygon(key: AttrType[T, Polygon], options: FieldOptions[Polygon]): this.type = js.native
  
  /**
    * Adding Relation Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addRelation(key: AttrType[T, Relation[Object[Attributes], Object[Attributes]]], targetClass: String): this.type = js.native
  def addRelation(
    key: AttrType[T, Relation[Object[Attributes], Object[Attributes]]],
    targetClass: String,
    options: FieldOptions[Relation[Object[Attributes], Object[Attributes]]]
  ): this.type = js.native
  
  def addString(key: AttrType[T, String]): this.type = js.native
  def addString(key: AttrType[T, String], options: FieldOptions[String]): this.type = js.native
  
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
  def get(): js.Promise[Schema[_]] = js.native
  
  /**
    * Removes all objects from a Schema (class) in  EXERCISE CAUTION, running this will delete all objects for this schema and cannot be reversed
    */
  // TODO Fix Promise<any>
  def purge(): js.Promise[_] = js.native
  
  /**
    * Create a new Schema on Parse
    */
  def save(): js.Promise[Schema[_]] = js.native
  
  /**
    * Sets Class Level Permissions when creating / updating a Schema.
    * EXERCISE CAUTION, running this may override CLP for this schema and cannot be reversed
    */
  def setCLP(clp: CLP): this.type = js.native
  
  /**
    * Update a Schema on Parse
    */
  def update(): js.Promise[Schema[_]] = js.native
}
