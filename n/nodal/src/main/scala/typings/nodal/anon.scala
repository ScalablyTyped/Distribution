package typings.nodal

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait As extends StObject {
    
    var as: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var via: js.UndefOr[String] = js.undefined
  }
  object As {
    
    @scala.inline
    def apply(): As = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[As]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
    }
  }
  
  trait Columns extends StObject {
    
    var columns: js.Array[IColumn]
    
    var table: String
  }
  object Columns {
    
    @scala.inline
    def apply(columns: js.Array[IColumn], table: String): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    @scala.inline
    implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[IColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: IColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait Convert extends StObject {
    
    var convert: js.Function
  }
  object Convert {
    
    @scala.inline
    def apply(convert: js.Function): Convert = {
      val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any])
      __obj.asInstanceOf[Convert]
    }
    
    @scala.inline
    implicit class ConvertMutableBuilder[Self <: Convert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvert(value: js.Function): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var error: js.Any
    
    var offset: Double
    
    var resource: js.Any
    
    var summary: js.UndefOr[String | Null] = js.undefined
    
    var total: Double
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, error: js.Any, offset: Double, resource: js.Any, total: Double): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: js.Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryNull: Self = StObject.set(x, "summary", null)
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Createdat extends StObject {
    
    var created_at: String
    
    var id: String
    
    var updated_at: String
  }
  object Createdat {
    
    @scala.inline
    def apply(created_at: String, id: String, updated_at: String): Createdat = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[Createdat]
    }
    
    @scala.inline
    implicit class CreatedatMutableBuilder[Self <: Createdat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var meta: Count
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, meta: Count): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Count): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.Array[js.Any]
    
    var name: String
  }
  object Fields {
    
    @scala.inline
    def apply(fields: js.Array[js.Any], name: String): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Joins extends StObject {
    
    var structure: js.Any
  }
  object Joins {
    
    @scala.inline
    def apply(structure: js.Any): Joins = {
      val __obj = js.Dynamic.literal(structure = structure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Joins]
    }
    
    @scala.inline
    implicit class JoinsMutableBuilder[Self <: Joins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStructure(value: js.Any): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    }
  }
  
  trait Meta extends StObject {
    
    var data: js.Array[scala.Nothing]
    
    var meta: Count
  }
  object Meta {
    
    @scala.inline
    def apply(data: js.Array[scala.Nothing], meta: Count): Meta = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    @scala.inline
    implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[scala.Nothing]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: scala.Nothing*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setMeta(value: Count): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: js.Any
    
    var sql: js.Any
  }
  object Params {
    
    @scala.inline
    def apply(params: js.Any, sql: js.Any): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSql(value: js.Any): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofModel
    extends StObject
       with Instantiable1[/* modelData */ js.Object, Model]
       with Instantiable2[/* modelData */ js.Object, /* fromStorage */ Boolean, Model]
       with Instantiable3[
          /* modelData */ js.Object, 
          (/* fromStorage */ Boolean) | (/* fromStorage */ Unit), 
          /* fromSeed */ Boolean, 
          Model
        ] {
    
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
      callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[Model], Unit]
    ): Unit = js.native
    
    /**
      * Finds and destroys a model with a specified id. Return a notFound error if model does not exist.
      * @param {number} id The id of the model you're looking for
      * @param {function({Error} err, {Nodal.Model} model)} callback The callback to execute upon completion
      */
    def destroy(id: Double, callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[Model], Unit]): Unit = js.native
    
    def find(id: Double, callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[Model], Unit]): Unit = js.native
    
    def findBy(
      field: String,
      value: js.Any,
      callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[Model], Unit]
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
      callback: js.Function2[/* err */ IExtendedError | Null, /* model */ js.UndefOr[Model], Unit]
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
      callback: js.Function2[/* err */ IExtendedError, /* model */ js.UndefOr[Model], Unit]
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
  
  @js.native
  trait TypeofModelInstantiable
    extends StObject
       with Instantiable1[/* modelData */ js.Object, Model]
       with Instantiable2[/* modelData */ js.Object, /* fromStorage */ Boolean, Model]
       with Instantiable3[
          /* modelData */ js.Object, 
          (/* fromStorage */ Boolean) | (/* fromStorage */ Unit), 
          /* fromSeed */ Boolean, 
          Model
        ] {
    
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
}
