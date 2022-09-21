package typings.pouchdbFind

import org.scalablytyped.runtime.StringDictionary
import typings.pouchdbFind.PouchDB.Find.CreateIndexOptions
import typings.pouchdbFind.PouchDB.Find.CreateIndexResponse
import typings.pouchdbFind.PouchDB.Find.DeleteIndexOptions
import typings.pouchdbFind.PouchDB.Find.DeleteIndexResponse
import typings.pouchdbFind.PouchDB.Find.FindRequest
import typings.pouchdbFind.PouchDB.Find.FindResponse
import typings.pouchdbFind.PouchDB.Find.GetIndexesResponse
import typings.pouchdbFind.anon.Ddoc
import typings.pouchdbFind.anon.Fields
import typings.pouchdbFind.pouchdbFindStrings.`null`
import typings.pouchdbFind.pouchdbFindStrings.`object`
import typings.pouchdbFind.pouchdbFindStrings.array
import typings.pouchdbFind.pouchdbFindStrings.asc
import typings.pouchdbFind.pouchdbFindStrings.boolean
import typings.pouchdbFind.pouchdbFindStrings.desc
import typings.pouchdbFind.pouchdbFindStrings.number
import typings.pouchdbFind.pouchdbFindStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  @js.native
  trait Database[Content /* <: js.Object */] extends StObject {
    
    def createIndex(): js.Promise[CreateIndexResponse[Content]] = js.native
    def createIndex(index: CreateIndexOptions): js.Promise[CreateIndexResponse[Content]] = js.native
    /** Create an index if it doesn't exist, or do nothing if it already exists. */
    def createIndex(
      index: CreateIndexOptions,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.CreateIndexResponse<Content>> */ Any
    ): Unit = js.native
    
    def deleteIndex(): js.Promise[DeleteIndexResponse[Content]] = js.native
    def deleteIndex(index: DeleteIndexOptions): js.Promise[DeleteIndexResponse[Content]] = js.native
    /** Delete an index and clean up any leftover data on the disk. */
    def deleteIndex(
      index: DeleteIndexOptions,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.DeleteIndexResponse<Content>> */ Any
    ): Unit = js.native
    
    def find(): js.Promise[FindResponse[Content]] = js.native
    def find(request: FindRequest[Content]): js.Promise[FindResponse[Content]] = js.native
    /** Query the API to find some documents. */
    def find(
      request: FindRequest[Content],
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.FindResponse<Content>> */ Any
    ): Unit = js.native
    
    def getIndexes(): js.Promise[GetIndexesResponse[Content]] = js.native
    /** Get a list of all the indexes you've created. Also tells you about the special _all_docs index, i.e. the default index on the _id field. */
    def getIndexes(
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.Callback<Find.GetIndexesResponse<Content>> */ Any
    ): Unit = js.native
  }
  
  object Find {
    
    trait CombinationOperators extends StObject {
      
      /** Matches if all the selectors in the array match. */
      @JSName("$and")
      var $and: js.UndefOr[js.Array[Selector]] = js.undefined
      
      /** Matches if none of the selectors in the array match. */
      @JSName("$nor")
      var $nor: js.UndefOr[js.Array[Selector]] = js.undefined
      
      /** Matches if the given selector does not match. */
      @JSName("$not")
      var $not: js.UndefOr[Selector] = js.undefined
      
      /** Matches if any of the selectors in the array match. All selectors must use the same index. */
      @JSName("$or")
      var $or: js.UndefOr[js.Array[Selector]] = js.undefined
    }
    object CombinationOperators {
      
      inline def apply(): CombinationOperators = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CombinationOperators]
      }
      
      extension [Self <: CombinationOperators](x: Self) {
        
        inline def set$and(value: js.Array[Selector]): Self = StObject.set(x, "$and", value.asInstanceOf[js.Any])
        
        inline def set$andUndefined: Self = StObject.set(x, "$and", js.undefined)
        
        inline def set$andVarargs(value: Selector*): Self = StObject.set(x, "$and", js.Array(value*))
        
        inline def set$nor(value: js.Array[Selector]): Self = StObject.set(x, "$nor", value.asInstanceOf[js.Any])
        
        inline def set$norUndefined: Self = StObject.set(x, "$nor", js.undefined)
        
        inline def set$norVarargs(value: Selector*): Self = StObject.set(x, "$nor", js.Array(value*))
        
        inline def set$not(value: Selector): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
        
        inline def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
        
        inline def set$or(value: js.Array[Selector]): Self = StObject.set(x, "$or", value.asInstanceOf[js.Any])
        
        inline def set$orUndefined: Self = StObject.set(x, "$or", js.undefined)
        
        inline def set$orVarargs(value: Selector*): Self = StObject.set(x, "$or", js.Array(value*))
      }
    }
    
    trait ConditionOperators extends StObject {
      
      /** Matches an array value if it contains all the elements of the argument array. */
      @JSName("$all")
      var $all: js.UndefOr[js.Array[Any]] = js.undefined
      
      @JSName("$elemMatch")
      var $elemMatch: js.UndefOr[ConditionOperators] = js.undefined
      
      /** Match fields equal to this one. */
      @JSName("$eq")
      var $eq: js.UndefOr[Any] = js.undefined
      
      /** True if the field should exist, false otherwise. */
      @JSName("$exists")
      var $exists: js.UndefOr[Boolean] = js.undefined
      
      /** Match fields "greater than" this one. */
      @JSName("$gt")
      var $gt: js.UndefOr[Any] = js.undefined
      
      /** Match fields "greater than or equal to" this one. */
      @JSName("$gte")
      var $gte: js.UndefOr[Any] = js.undefined
      
      /** The document field must exist in the list provided. */
      @JSName("$in")
      var $in: js.UndefOr[js.Array[Any]] = js.undefined
      
      /** Match fields "less than" this one. */
      @JSName("$lt")
      var $lt: js.UndefOr[Any] = js.undefined
      
      /** Match fields "less than or equal to" this one. */
      @JSName("$lte")
      var $lte: js.UndefOr[Any] = js.undefined
      
      /**
        * Divisor and Remainder are both positive or negative integers.
        * Non-integer values result in a 404 status.
        * Matches documents where (field % Divisor == Remainder) is true, and only when the document field is an integer.
        * [divisor, remainder]
        */
      @JSName("$mod")
      var $mod: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
      
      /** Match fields not equal to this one. */
      @JSName("$ne")
      var $ne: js.UndefOr[Any] = js.undefined
      
      /** The document field must not exist in the list provided. */
      @JSName("$nin")
      var $nin: js.UndefOr[js.Array[Any]] = js.undefined
      
      /** A regular expression pattern to match against the document field. Only matches when the field is a string value and matches the supplied regular expression. */
      @JSName("$regex")
      var $regex: js.UndefOr[String] = js.undefined
      
      /** Special condition to match the length of an array field in a document. Non-array fields cannot match this condition. */
      @JSName("$size")
      var $size: js.UndefOr[Double] = js.undefined
      
      /** One of: "null", "boolean", "number", "string", "array", or "object". */
      @JSName("$type")
      var $type: js.UndefOr[`null` | boolean | number | string | array | `object`] = js.undefined
    }
    object ConditionOperators {
      
      inline def apply(): ConditionOperators = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConditionOperators]
      }
      
      extension [Self <: ConditionOperators](x: Self) {
        
        inline def set$all(value: js.Array[Any]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
        
        inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
        
        inline def set$allVarargs(value: Any*): Self = StObject.set(x, "$all", js.Array(value*))
        
        inline def set$elemMatch(value: ConditionOperators): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
        
        inline def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
        
        inline def set$eq(value: Any): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
        
        inline def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
        
        inline def set$exists(value: Boolean): Self = StObject.set(x, "$exists", value.asInstanceOf[js.Any])
        
        inline def set$existsUndefined: Self = StObject.set(x, "$exists", js.undefined)
        
        inline def set$gt(value: Any): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
        
        inline def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
        
        inline def set$gte(value: Any): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
        
        inline def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
        
        inline def set$in(value: js.Array[Any]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
        
        inline def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
        
        inline def set$inVarargs(value: Any*): Self = StObject.set(x, "$in", js.Array(value*))
        
        inline def set$lt(value: Any): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
        
        inline def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
        
        inline def set$lte(value: Any): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
        
        inline def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
        
        inline def set$mod(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
        
        inline def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
        
        inline def set$ne(value: Any): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
        
        inline def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
        
        inline def set$nin(value: js.Array[Any]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
        
        inline def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
        
        inline def set$ninVarargs(value: Any*): Self = StObject.set(x, "$nin", js.Array(value*))
        
        inline def set$regex(value: String): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
        
        inline def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
        
        inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
        
        inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
        
        inline def set$type(value: `null` | boolean | number | string | array | `object`): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
        
        inline def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
      }
    }
    
    trait CreateIndexOptions extends StObject {
      
      var index: Ddoc
    }
    object CreateIndexOptions {
      
      inline def apply(index: Ddoc): CreateIndexOptions = {
        val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateIndexOptions]
      }
      
      extension [Self <: CreateIndexOptions](x: Self) {
        
        inline def setIndex(value: Ddoc): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      }
    }
    
    trait CreateIndexResponse[Content /* <: js.Object */] extends StObject {
      
      var result: String
    }
    object CreateIndexResponse {
      
      inline def apply[Content /* <: js.Object */](result: String): CreateIndexResponse[Content] = {
        val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateIndexResponse[Content]]
      }
      
      extension [Self <: CreateIndexResponse[?], Content /* <: js.Object */](x: Self & CreateIndexResponse[Content]) {
        
        inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      }
    }
    
    trait DeleteIndexOptions extends StObject {
      
      /** Design document name */
      var ddoc: String
      
      /** Name of the index */
      var name: String
      
      /** Default 'json' */
      var `type`: js.UndefOr[String] = js.undefined
    }
    object DeleteIndexOptions {
      
      inline def apply(ddoc: String, name: String): DeleteIndexOptions = {
        val __obj = js.Dynamic.literal(ddoc = ddoc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[DeleteIndexOptions]
      }
      
      extension [Self <: DeleteIndexOptions](x: Self) {
        
        inline def setDdoc(value: String): Self = StObject.set(x, "ddoc", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    type DeleteIndexResponse[Content /* <: js.Object */] = StringDictionary[Any]
    
    trait FindRequest[Content /* <: js.Object */] extends StObject {
      
      /** Defines a list of fields that you want to receive. If omitted, you get the full documents. */
      var fields: js.UndefOr[js.Array[String]] = js.undefined
      
      /** Maximum number of documents to return. */
      var limit: js.UndefOr[Double] = js.undefined
      
      /** Defines a selector to filter the results. Required */
      var selector: Selector
      
      /** Number of docs to skip before returning. */
      var skip: js.UndefOr[Double] = js.undefined
      
      /** Defines a list of fields defining how you want to sort. Note that sorted fields also have to be selected in the selector. */
      var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.undefined
      
      /** Set which index to use for the query. It can be “design-doc-name” or “[‘design-doc-name’, ‘name’]”. */
      var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
    }
    object FindRequest {
      
      inline def apply[Content /* <: js.Object */](selector: Selector): FindRequest[Content] = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindRequest[Content]]
      }
      
      extension [Self <: FindRequest[?], Content /* <: js.Object */](x: Self & FindRequest[Content]) {
        
        inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        inline def setSort(value: js.Array[String | (StringDictionary[asc | desc])]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        inline def setSortVarargs(value: (String | (StringDictionary[asc | desc]))*): Self = StObject.set(x, "sort", js.Array(value*))
        
        inline def setUse_index(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "use_index", value.asInstanceOf[js.Any])
        
        inline def setUse_indexUndefined: Self = StObject.set(x, "use_index", js.undefined)
      }
    }
    
    trait FindResponse[Content /* <: js.Object */] extends StObject {
      
      var docs: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ Any
          ]
      
      var warning: js.UndefOr[String] = js.undefined
    }
    object FindResponse {
      
      inline def apply[Content /* <: js.Object */](
        docs: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ Any
            ]
      ): FindResponse[Content] = {
        val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
        __obj.asInstanceOf[FindResponse[Content]]
      }
      
      extension [Self <: FindResponse[?], Content /* <: js.Object */](x: Self & FindResponse[Content]) {
        
        inline def setDocs(
          value: js.Array[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ Any
                ]
        ): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
        
        inline def setDocsVarargs(
          value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ Any)*
        ): Self = StObject.set(x, "docs", js.Array(value*))
        
        inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
        
        inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      }
    }
    
    trait GetIndexesResponse[Content /* <: js.Object */] extends StObject {
      
      var indexes: js.Array[Index]
    }
    object GetIndexesResponse {
      
      inline def apply[Content /* <: js.Object */](indexes: js.Array[Index]): GetIndexesResponse[Content] = {
        val __obj = js.Dynamic.literal(indexes = indexes.asInstanceOf[js.Any])
        __obj.asInstanceOf[GetIndexesResponse[Content]]
      }
      
      extension [Self <: GetIndexesResponse[?], Content /* <: js.Object */](x: Self & GetIndexesResponse[Content]) {
        
        inline def setIndexes(value: js.Array[Index]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
        
        inline def setIndexesVarargs(value: Index*): Self = StObject.set(x, "indexes", js.Array(value*))
      }
    }
    
    trait Index extends StObject {
      
      /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
      var ddoc: String | Null
      
      var `def`: Fields
      
      /** Name of the index, auto-generated if you don't include it */
      var name: String
      
      /** Only supports 'json' */
      var `type`: String
    }
    object Index {
      
      inline def apply(`def`: Fields, name: String, `type`: String): Index = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ddoc = null)
        __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Index]
      }
      
      extension [Self <: Index](x: Self) {
        
        inline def setDdoc(value: String): Self = StObject.set(x, "ddoc", value.asInstanceOf[js.Any])
        
        inline def setDdocNull: Self = StObject.set(x, "ddoc", null)
        
        inline def setDef(value: Fields): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Selector
      extends StObject
         with CombinationOperators
         with /* field */ StringDictionary[Selector | js.Array[Selector] | ConditionOperators | Any] {
      
      var _id: js.UndefOr[String | ConditionOperators] = js.undefined
    }
    object Selector {
      
      inline def apply(): Selector = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Selector]
      }
      
      extension [Self <: Selector](x: Self) {
        
        inline def set_id(value: String | ConditionOperators): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
        
        inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
      }
    }
  }
}
