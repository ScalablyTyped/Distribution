package typings.parse.mod

import org.scalablytyped.runtime.Instantiable1
import typings.parse.mod.global.Parse.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new parse Parse.Query for the given Parse.Object subclass.
  * @param objectClass -
  *   An instance of a subclass of Parse.Object, or a Parse className string.
  *
  * <p>Parse.Query defines a query that is used to fetch Parse.Objects. The
  * most common use case is finding all objects that match a query through the
  * <code>find</code> method. For example, this sample code fetches all objects
  * of class <code>MyClass</code>. It calls a different function depending on
  * whether the fetch succeeded or not.
  *
  * <pre>
  * var query = new Parse.Query(MyClass);
  * query.find({
  *   success: function(results) {
  *     // results is an array of Parse.Object.
  *   },
  *
  *   error: function(error) {
  *     // error is an instance of Parse.Error.
  *   }
  * });</pre></p>
  *
  * <p>A Parse.Query can also be used to retrieve a single object whose id is
  * known, through the get method. For example, this sample code fetches an
  * object of class <code>MyClass</code> and id <code>myId</code>. It calls a
  * different function depending on whether the fetch succeeded or not.
  *
  * <pre>
  * var query = new Parse.Query(MyClass);
  * query.get(myId, {
  *   success: function(object) {
  *     // object is an instance of Parse.Object.
  *   },
  *
  *   error: function(object, error) {
  *     // error is an instance of Parse.Error.
  *   }
  * });</pre></p>
  *
  * <p>A Parse.Query can also be used to count the number of objects that match
  * the query without retrieving all of those objects. For example, this
  * sample code counts the number of objects of the class <code>MyClass</code>
  * <pre>
  * var query = new Parse.Query(MyClass);
  * query.count({
  *   success: function(number) {
  *     // There are number instances of MyClass.
  *   },
  *
  *   error: function(error) {
  *     // error is an instance of Parse.Error.
  *   }
  * });</pre></p>
  */
@JSImport("parse", "Query")
@js.native
class Query[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */] protected ()
  extends typings.parse.mod.global.Parse.Query[T] {
  def this(objectClass: String) = this()
  def this(objectClass: Instantiable1[
        /* args (repeated) */ js.Any, 
        T | typings.parse.mod.global.Parse.Object[Attributes]
      ]) = this()
}
object Query {
  
  @JSImport("parse", "Query")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def and[U /* <: typings.parse.mod.global.Parse.Object[Attributes] */](args: typings.parse.mod.global.Parse.Query[U]*): typings.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(args.asInstanceOf[js.Any]).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
  
  /* static member */
  @scala.inline
  def fromJSON[U /* <: typings.parse.mod.global.Parse.Object[Attributes] */](className: String, json: js.Any): typings.parse.mod.global.Parse.Query[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(className.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
  
  /* static member */
  @scala.inline
  def nor[U /* <: typings.parse.mod.global.Parse.Object[Attributes] */](args: typings.parse.mod.global.Parse.Query[U]*): typings.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("nor")(args.asInstanceOf[js.Any]).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
  
  /* static member */
  @scala.inline
  def or[U /* <: typings.parse.mod.global.Parse.Object[Attributes] */](var_args: typings.parse.mod.global.Parse.Query[U]*): typings.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(var_args.asInstanceOf[js.Any]).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
}
