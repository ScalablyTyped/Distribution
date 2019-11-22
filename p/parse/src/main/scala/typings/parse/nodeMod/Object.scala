package typings.parse.nodeMod

import org.scalablytyped.runtime.Instantiable1
import typings.parse.Anon_ClassName
import typings.parse.Parse.Object.DestroyAllOptions
import typings.parse.Parse.Object.FetchAllOptions
import typings.parse.Parse.Object.SaveAllOptions
import typings.parse.Parse.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new model with defined attributes. A client id (cid) is
  * automatically generated and assigned for you.
  *
  * <p>You won't normally call this method directly.  It is recommended that
  * you use a subclass of <code>Parse.Object</code> instead, created by calling
  * <code>extend</code>.</p>
  *
  * <p>However, if you don't want to use a subclass, or aren't sure which
  * subclass is appropriate, you can use this form:<pre>
  *     var object = new Parse.Object("ClassName");
  * </pre>
  * That is basically equivalent to:<pre>
  *     var MyClass = Parse.Object.extend("ClassName");
  *     var object = new MyClass();
  * </pre></p>
  *
  * @param {Object} attributes The initial set of data to store in the object.
  * @param {Object} options The options for this object instance.
  * @see Parse.Object.extend
  *
  * @class
  *
  * Creates a new model with defined attributes.
  */
@JSImport("parse/node", "Object")
@js.native
class Object[T /* <: js.Any */] ()
  extends typings.parse.Parse.Object[T] {
  def this(className: String) = this()
  def this(className: String, attributes: T) = this()
  def this(className: String, attributes: T, options: js.Any) = this()
}

/* static members */
@JSImport("parse/node", "Object")
@js.native
object Object extends js.Object {
  def createWithoutData[T /* <: typings.parse.Parse.Object[_] */](id: String): T = js.native
  def destroyAll[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def destroyAll[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T], options: DestroyAllOptions): js.Promise[js.Array[T]] = js.native
  def extend(className: String): js.Any = js.native
  def extend(className: String, protoProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def extend(className: Anon_ClassName): js.Any = js.native
  def extend(className: Anon_ClassName, protoProps: js.Any): js.Any = js.native
  def extend(className: Anon_ClassName, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T], keys: String, options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T], keys: js.Array[String | js.Array[String]], options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fromJSON[T /* <: typings.parse.Parse.Object[_] */](json: js.Any): T = js.native
  def fromJSON[T /* <: typings.parse.Parse.Object[_] */](json: js.Any, `override`: Boolean): T = js.native
  def pinAll(objects: js.Array[typings.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
  def pinAllWithName(name: String, objects: js.Array[typings.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
  def registerSubclass[T /* <: typings.parse.Parse.Object[_] */](className: String, clazz: Instantiable1[js.UndefOr[/* options */ js.Any], T]): Unit = js.native
  def saveAll[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def saveAll[T /* <: typings.parse.Parse.Object[_] */](list: js.Array[T], options: SaveAllOptions): js.Promise[js.Array[T]] = js.native
  def unPinAll(objects: js.Array[typings.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
  def unPinAllObjects(): js.Promise[Unit] = js.native
  def unPinAllObjectsWithName(name: String): js.Promise[Unit] = js.native
  def unPinAllWithName(name: String, objects: js.Array[typings.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
}

