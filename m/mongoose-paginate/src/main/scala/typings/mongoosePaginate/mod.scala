package typings.mongoosePaginate

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongoose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def model[T /* <: Document */](name: String): PaginateModel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[PaginateModel[T]]
  inline def model[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): PaginateModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[PaginateModel[T]]
  inline def model[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String
  ): PaginateModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[PaginateModel[T]]
  inline def model[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String,
    skipInit: Boolean
  ): PaginateModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PaginateModel[T]]
  inline def model[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: Unit,
    skipInit: Boolean
  ): PaginateModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PaginateModel[T]]
  inline def model[T /* <: Document */](name: String, schema: Unit, collection: String): PaginateModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[PaginateModel[T]]
  inline def model[T /* <: Document */](name: String, schema: Unit, collection: String, skipInit: Boolean): PaginateModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PaginateModel[T]]
  inline def model[T /* <: Document */](name: String, schema: Unit, collection: Unit, skipInit: Boolean): PaginateModel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[PaginateModel[T]]
  
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](name: String): U = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[U]
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String,
    skipInit: Boolean
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: Unit,
    skipInit: Boolean
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](name: String, schema: Unit, collection: String): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](name: String, schema: Unit, collection: String, skipInit: Boolean): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  inline def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](name: String, schema: Unit, collection: Unit, skipInit: Boolean): U = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], collection.asInstanceOf[js.Any], skipInit.asInstanceOf[js.Any])).asInstanceOf[U]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Model<T> * / any */ @js.native
  trait PaginateModel[T /* <: Document */] extends StObject {
    
    def paginate(): js.Promise[PaginateResult[T]] = js.native
    def paginate(query: js.Object): js.Promise[PaginateResult[T]] = js.native
    def paginate(
      query: js.Object,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
    ): js.Promise[PaginateResult[T]] = js.native
    def paginate(query: js.Object, options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
    def paginate(
      query: js.Object,
      options: PaginateOptions,
      callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
    ): js.Promise[PaginateResult[T]] = js.native
    def paginate(
      query: Unit,
      options: Unit,
      callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
    ): js.Promise[PaginateResult[T]] = js.native
    def paginate(query: Unit, options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
    def paginate(
      query: Unit,
      options: PaginateOptions,
      callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
    ): js.Promise[PaginateResult[T]] = js.native
  }
  
  trait PaginateOptions extends StObject {
    
    var lean: js.UndefOr[Boolean] = js.undefined
    
    var leanWithId: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var populate: js.UndefOr[(js.Array[js.Object | String]) | js.Object | String | QueryPopulateOptions] = js.undefined
    
    var select: js.UndefOr[js.Object | String] = js.undefined
    
    var sort: js.UndefOr[js.Object | String] = js.undefined
  }
  object PaginateOptions {
    
    inline def apply(): PaginateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginateOptions]
    }
    
    extension [Self <: PaginateOptions](x: Self) {
      
      inline def setLean(value: Boolean): Self = StObject.set(x, "lean", value.asInstanceOf[js.Any])
      
      inline def setLeanUndefined: Self = StObject.set(x, "lean", js.undefined)
      
      inline def setLeanWithId(value: Boolean): Self = StObject.set(x, "leanWithId", value.asInstanceOf[js.Any])
      
      inline def setLeanWithIdUndefined: Self = StObject.set(x, "leanWithId", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPopulate(value: (js.Array[js.Object | String]) | js.Object | String | QueryPopulateOptions): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setPopulateVarargs(value: (js.Object | String)*): Self = StObject.set(x, "populate", js.Array(value :_*))
      
      inline def setSelect(value: js.Object | String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSort(value: js.Object | String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait PaginateResult[T] extends StObject {
    
    var docs: js.Array[T]
    
    var limit: Double
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var pages: js.UndefOr[Double] = js.undefined
    
    var total: Double
  }
  object PaginateResult {
    
    inline def apply[T](docs: js.Array[T], limit: Double, total: Double): PaginateResult[T] = {
      val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginateResult[T]]
    }
    
    extension [Self <: PaginateResult[?], T](x: Self & PaginateResult[T]) {
      
      inline def setDocs(value: js.Array[T]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
      
      inline def setDocsVarargs(value: T*): Self = StObject.set(x, "docs", js.Array(value :_*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryPopulateOptions extends StObject {
    
    /** optional query conditions to match */
    var `match`: js.UndefOr[js.Any] = js.undefined
    
    /** optional model to use for population */
    var model: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Model<any> */ js.Any)
      ] = js.undefined
    
    /** optional query options like sort, limit, etc */
    var options: js.UndefOr[js.Any] = js.undefined
    
    /** space delimited path(s) to populate */
    var path: String
    
    /** deep populate */
    var populate: js.UndefOr[QueryPopulateOptions | js.Array[QueryPopulateOptions]] = js.undefined
    
    /** optional fields to select */
    var select: js.UndefOr[js.Any] = js.undefined
  }
  object QueryPopulateOptions {
    
    inline def apply(path: String): QueryPopulateOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryPopulateOptions]
    }
    
    extension [Self <: QueryPopulateOptions](x: Self) {
      
      inline def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setModel(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Model<any> */ js.Any)
      ): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPopulate(value: QueryPopulateOptions | js.Array[QueryPopulateOptions]): Self = StObject.set(x, "populate", value.asInstanceOf[js.Any])
      
      inline def setPopulateUndefined: Self = StObject.set(x, "populate", js.undefined)
      
      inline def setPopulateVarargs(value: QueryPopulateOptions*): Self = StObject.set(x, "populate", js.Array(value :_*))
      
      inline def setSelect(value: js.Any): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
}
