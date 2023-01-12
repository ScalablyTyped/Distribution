package typings.meteor.anon

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineMutationMethods[T /* <: Document */, U] extends StObject {
  
  /**
    * The server connection that will manage this collection. Uses the default connection if not specified. Pass the return value of calling `DDP.connect` to specify a different
    * server. Pass `null` to specify no connection. Unmanaged (`name` is null) collections cannot specify a connection.
    */
  var connection: js.UndefOr[js.Object | Null] = js.undefined
  
  /** Set to `false` to skip setting up the mutation methods that enable insert/update/remove from client code. Default `true`. */
  var defineMutationMethods: js.UndefOr[Boolean] = js.undefined
  
  /** The method of generating the `_id` fields of new documents in this collection.  Possible values:
    * - **`'STRING'`**: random strings
    * - **`'MONGO'`**:  random [`Mongo.ObjectID`](#mongo_object_id) values
    *
    * The default id generation technique is `'STRING'`.
    */
  var idGeneration: js.UndefOr[String] = js.undefined
  
  /**
    * An optional transformation function. Documents will be passed through this function before being returned from `fetch` or `findOne`, and before being passed to callbacks of
    * `observe`, `map`, `forEach`, `allow`, and `deny`. Transforms are *not* applied for the callbacks of `observeChanges` or to cursors returned from publish functions.
    */
  var transform: js.UndefOr[js.Function1[/* doc */ T, U]] = js.undefined
}
object DefineMutationMethods {
  
  inline def apply[T /* <: Document */, U](): DefineMutationMethods[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineMutationMethods[T, U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefineMutationMethods[?, ?], T /* <: Document */, U] (val x: Self & (DefineMutationMethods[T, U])) extends AnyVal {
    
    inline def setConnection(value: js.Object): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDefineMutationMethods(value: Boolean): Self = StObject.set(x, "defineMutationMethods", value.asInstanceOf[js.Any])
    
    inline def setDefineMutationMethodsUndefined: Self = StObject.set(x, "defineMutationMethods", js.undefined)
    
    inline def setIdGeneration(value: String): Self = StObject.set(x, "idGeneration", value.asInstanceOf[js.Any])
    
    inline def setIdGenerationUndefined: Self = StObject.set(x, "idGeneration", js.undefined)
    
    inline def setTransform(value: /* doc */ T => U): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
