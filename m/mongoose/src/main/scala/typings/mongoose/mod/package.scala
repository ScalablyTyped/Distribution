package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CastError = typings.mongoose.mod.Error.CastError
  type ClientSession = typings.mongodb.mod.ClientSession
  /* Helper type to extract a definition type from a Document type */
  type DocumentDefinition[T] = typings.mongoose.mod.Omit[
    T, 
    typings.std.Exclude[typings.mongoose.mongooseStrings.__v, typings.mongoose.mongooseStrings._id]
  ]
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
  type MongooseFilterQuery[T] = typings.mongoose.mongooseStrings.MongooseFilterQuery with org.scalablytyped.runtime.TopLevel[js.Any] with typings.mongodb.mod.RootQuerySelector[T]
  type MongooseUpdateQuery[S] = typings.mongodb.mod.UpdateQuery[S] with typings.mongodb.mod.MatchKeysAndValues[S]
  /*
    * Some mongoose classes have the same name as the native JS classes
    * Keep references to native classes using a "Native" prefix
    */
  type NativeBuffer = typings.node.TypeofBuffer
  type NativeDate = typings.std.DateConstructor
  type NativeError = typings.std.ErrorConstructor
  // We can use TypeScript Omit once minimum required TypeScript Version is above 3.5
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
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
  /*
    * Intellisense for Schema definitions
    */
  type SchemaDefinition = org.scalablytyped.runtime.StringDictionary[
    typings.mongoose.mod.SchemaTypeOpts[js.Any] | typings.mongoose.mod.Schema[js.Any] | typings.mongoose.mod.SchemaType
  ]
  type SchemaTypeOpts[T] = typings.mongoose.mod.SchemaTypeOpts_[T]
  type TagSet = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type UpdateQuery[D] = typings.mongoose.mod.MongooseUpdateQuery[typings.mongoose.mod.DocumentDefinition[D]]
}
