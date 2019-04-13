package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongooseMod {
  type CastError = mongooseLib.mongooseMod.ErrorNs.CastError
  type ClientSession = mongodbLib.mongodbMod.ClientSession
  type HookAsyncCallback[T] = js.ThisFunction3[
    /* this */ T, 
    /* next */ HookNextFunction, 
    /* done */ HookDoneFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | scala.Unit
  ]
  type HookDoneFunction = js.Function1[/* error */ js.UndefOr[Error], js.Any]
  type HookErrorCallback = js.Function1[/* error */ js.UndefOr[Error], js.Any]
  type HookNextFunction = js.Function1[/* error */ js.UndefOr[Error], js.Any]
  // Hook functions: https://github.com/vkarpov15/hooks-fixed
  type HookSyncCallback[T] = js.ThisFunction2[
    /* this */ T, 
    /* next */ HookNextFunction, 
    /* docs */ js.Array[js.Any], 
    js.Promise[js.Any] | scala.Unit
  ]
  /*
    * Some mongoose classes have the same name as the native JS classes
    * Keep references to native classes using a "Native" prefix
    */
  type NativeBuffer = nodeLib.Anon_Alloc
  type NativeDate = stdLib.DateConstructor
  type NativeError = stdLib.ErrorConstructor
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
  type SchemaDefinition = org.scalablytyped.runtime.StringDictionary[SchemaTypeOpts[js.Any] | Schema[js.Any] | SchemaType]
  type TagSet = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
