package typings.parse.reactDashNativeMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new parse Parse.Query for the given Parse.Object subclass.
  * @param objectClass -
  *   An instance of a subclass of Parse.Object, or a Parse className string.
  * @class
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
@JSImport("parse/react-native", "Query")
@js.native
class Query[T /* <: typings.parse.Parse.Object[_] */] protected ()
  extends typings.parse.nodeMod.Query[T] {
  def this(objectClass: String) = this()
  def this(objectClass: Instantiable1[/* args (repeated) */ js.Any, T]) = this()
}

/* static members */
@JSImport("parse/react-native", "Query")
@js.native
object Query extends js.Object {
  def and[U /* <: typings.parse.Parse.Object[_] */](args: typings.parse.Parse.Query[U]*): typings.parse.Parse.Query[U] = js.native
  def fromJSON[U /* <: typings.parse.Parse.Object[_] */](className: String, json: js.Any): typings.parse.Parse.Query[U] = js.native
  def nor[U /* <: typings.parse.Parse.Object[_] */](args: typings.parse.Parse.Query[U]*): typings.parse.Parse.Query[U] = js.native
  def or[U /* <: typings.parse.Parse.Object[_] */](var_args: typings.parse.Parse.Query[U]*): typings.parse.Parse.Query[U] = js.native
}

