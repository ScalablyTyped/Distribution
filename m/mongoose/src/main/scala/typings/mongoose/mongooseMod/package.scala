package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongooseMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.DateConstructor
  import typings.std.ErrorConstructor
  import typings.std.Map

  type CastError = typings.mongoose.mongooseMod.ErrorNs.CastError
  type ClientSession = typings.mongodb.mongodbMod.ClientSession
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer U>? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias mongoose.mongoose.DeepPartial<U> * / object> : T[P] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias mongoose.mongoose.DeepPartial<T[P]> * / object : T[P]}
    */ typings.mongoose.mongooseStrings.DeepPartial with js.Any
  // Because the mongoose Map type shares a name with the default global interface,
  // this type alias has to exist outside of the namespace
  type GlobalMap[K, V] = Map[K, V]
  type HookAsyncCallback[T] = js.ThisFunction3[
    /* this */ T, 
    /* next */ HookNextFunction, 
    /* done */ HookDoneFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | Unit
  ]
  type HookDoneFunction = js.Function1[/* error */ js.UndefOr[Error], js.Any]
  type HookErrorCallback = js.Function1[/* error */ js.UndefOr[Error], js.Any]
  type HookNextFunction = js.Function1[/* error */ js.UndefOr[Error], js.Any]
  // Hook functions: https://github.com/vkarpov15/hooks-fixed
  type HookSyncCallback[T] = js.ThisFunction2[
    /* this */ T, 
    /* next */ HookNextFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | Unit
  ]
  /*
    * Some mongoose classes have the same name as the native JS classes
    * Keep references to native classes using a "Native" prefix
    */
  type NativeBuffer = typings.node.TypeofClassBuffer
  type NativeDate = DateConstructor
  type NativeError = ErrorConstructor
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
  type Query[T] = DocumentQuery[T, js.Any, js.Object]
  /*
    * Intellisense for Schema definitions
    */
  type SchemaDefinition = StringDictionary[SchemaTypeOpts[js.Any] | Schema[js.Any] | SchemaType]
  type TagSet = StringDictionary[String]
}
