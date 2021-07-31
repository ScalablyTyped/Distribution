package typings.parse.mod

import typings.parse.mod.global.Parse.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSImport("parse", "Schema")
@js.native
class Schema[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */] protected ()
  extends typings.parse.mod.global.Parse.Schema[T] {
  def this(className: String) = this()
}
object Schema {
  
  @JSImport("parse", "Schema")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static method to get all schemas
    *
    * @return A promise that is resolved with the result when
    * the query completes.
    */
  /* static member */
  @scala.inline
  def all(): js.Promise[js.Array[typings.parse.mod.global.Parse.Schema[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[typings.parse.mod.global.Parse.Schema[js.Any]]]]
}
