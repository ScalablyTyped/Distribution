package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CastError = typings.mongoose.mod.Error.CastError
  type ClientSession = typings.mongodb.mod.ClientSession
  type CreateDocumentDefinition[T] = typings.mongoose.mod.ScrubCreateDefinition[typings.mongoose.mod.DocumentDefinition[T]]
  type CreateQuery[D] = typings.mongoose.mod.CreateDocumentDefinition[D] | (typings.mongodb.mod.OptionalId[
    typings.mongoose.mod.CreateDocumentDefinition[D] with typings.mongoose.anon.IdAny
  ]) | (typings.mongoose.anon.Id with (typings.std.Record[java.lang.String, _]))
  // mongoose allows Map<K, V> to be specified either as a Map or a Record<K, V>
  type DeepMapAsObject[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends std.Map<infer KM, infer KV> | undefined? any extends string? std.Map<any, / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<KV> * / object> | std.Record<any, / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<KV> * / object> | std.Array<[any, / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<KV> * / object]> : never : T[K] extends object | undefined? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepMapAsObject<T[K]> * / object : T[K]}
    */ typings.mongoose.mongooseStrings.DeepMapAsObject with org.scalablytyped.runtime.TopLevel[js.Any])
  // used to exclude functions from all levels of the schema
  type DeepNonFunctionProperties[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ V in keyof mongoose.mongoose.NonFunctionProperties<mongoose.mongoose.OmitReadonly<T>> ]: T[V] extends object | undefined? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepNonFunctionProperties<std.NonNullable<T[V]>> * / object : T[V]}
    */ typings.mongoose.mongooseStrings.DeepNonFunctionProperties with org.scalablytyped.runtime.TopLevel[js.Any]) | (js.Array[
    (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ V in keyof mongoose.mongoose.NonFunctionProperties<mongoose.mongoose.OmitReadonly<any>> ]: any[V] extends object | undefined? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepNonFunctionProperties<std.NonNullable<U[V]>> * / object : any[V]}
    */ typings.mongoose.mongooseStrings.DeepNonFunctionProperties with org.scalablytyped.runtime.TopLevel[js.Any]) | (js.Tuple2[js.Any, js.Any])
  ]) | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongoose.mongoose.DeepNonFunctionProperties<KV> */ js.Object
  ]) | (typings.std.Map[js.Any, js.Any])
  /* Helper type to extract a definition type from a Document type */
  type DocumentDefinition[T] = typings.mongoose.mod.Omit[
    T, 
    typings.std.Exclude[typings.mongoose.mongooseStrings.__v, typings.mongoose.mongooseStrings._id]
  ]
  type Error = typings.mongoose.mod.Error_
  type FilterQuery[T] = typings.mongoose.mod.MongooseFilterQuery[typings.mongoose.mod.DocumentDefinition[T]]
  // Because the mongoose Map type shares a name with the default global interface,
  // this type alias has to exist outside of the namespace
  type GlobalMap[K, V] = typings.std.Map[K, V]
  type HookAsyncCallback[T] = js.ThisFunction3[
    /* this */ T, 
    /* next */ typings.mongoose.mod.HookNextFunction, 
    /* done */ typings.mongoose.mod.HookDoneFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | scala.Unit
  ]
  type HookDoneFunction = js.Function1[/* error */ js.UndefOr[typings.mongoose.mod.Error], js.Any]
  type HookErrorCallback = js.Function1[/* error */ js.UndefOr[typings.mongoose.mod.Error], js.Any]
  type HookNextFunction = js.Function1[/* error */ js.UndefOr[typings.mongoose.mod.Error], js.Any]
  // Hook functions: https://github.com/vkarpov15/hooks-fixed
  type HookSyncCallback[T] = js.ThisFunction2[
    /* this */ T, 
    /* next */ typings.mongoose.mod.HookNextFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | scala.Unit
  ]
  type IfEquals[X, Y, A, B] = B | A
  type MongooseFilterQuery[T] = typings.mongoose.mongooseStrings.MongooseFilterQuery with org.scalablytyped.runtime.TopLevel[js.Any] with typings.mongodb.mod.RootQuerySelector[T]
  type MongooseUpdateQuery[S] = typings.mongodb.mod.UpdateQuery[S] with typings.mongodb.mod.MatchKeysAndValues[S]
  /*
    * Some mongoose classes have the same name as the native JS classes
    * Keep references to native classes using a "Native" prefix
    */
  type NativeBuffer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Buffer */ js.Any
  type NativeDate = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Date */ js.Any
  type NativeError = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error */ js.Any
  type NonFunctionProperties[T] = typings.std.Pick[T, typings.mongoose.mod.NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  // We can use TypeScript Omit once minimum required TypeScript Version is above 3.5
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type OmitReadonly[T] = typings.mongoose.mod.Omit[T, typings.mongoose.mod.ReadonlyKeysOf[T]]
  /*
    * section query.js
    * http://mongoosejs.com/docs/api.html#query-js
    *
    * Query<T> is for backwards compatibility. Example: Query<T>.find() returns Query<T[]>.
    * If later in the query chain a method returns Query<T>, we will need to know type T.
    * So we save this type as the second type parameter in DocumentQuery. Since people have
    * been using Query<T>, we set it as an alias of DocumentQuery.
    *
    * Furthermore, Query<T> is used for function that has an option { rawResult: true }.
    * for instance findOneAndUpdate.
    */
  type Query[T] = typings.mongoose.mod.DocumentQuery[T, js.Any, js.Object]
  type ReadonlyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: mongoose.mongoose.IfEquals<{[ Q in P ]: T[P]}, {-readonly [ Q in P ]: T[P]}, never, P>}[keyof T] */ js.Any
  /*
    * Intellisense for Schema definitions
    */
  type SchemaDefinition = org.scalablytyped.runtime.StringDictionary[
    typings.mongoose.mod.SchemaTypeOpts[js.Any] | typings.mongoose.mod.Schema[js.Any] | typings.mongoose.mod.SchemaType
  ]
  type SchemaTypeOpts[T] = typings.mongoose.mod.SchemaTypeOpts_[T]
  type ScrubCreateDefinition[T] = typings.mongoose.mod.DeepMapAsObject[typings.mongoose.mod.DeepNonFunctionProperties[T]]
  type TagSet = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type UpdateQuery[D] = typings.mongoose.mod.MongooseUpdateQuery[typings.mongoose.mod.DocumentDefinition[D]]
}
