package typings
package parseLib.nodeMod

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
class Object ()
  extends parseLib.ParseNs.Object {
  def this(attributes: js.Array[java.lang.String]) = this()
  def this(className: java.lang.String) = this()
  def this(attributes: js.Array[java.lang.String], options: js.Any) = this()
  def this(className: java.lang.String, options: js.Any) = this()
}

/* static members */
@JSImport("parse/node", "Object")
@js.native
object Object extends js.Object {
  def createWithoutData[T /* <: parseLib.ParseNs.Object */](id: java.lang.String): T = js.native
  def destroyAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def destroyAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.DestroyAllOptions): js.Promise[js.Array[T]] = js.native
  def extend(className: java.lang.String): js.Any = js.native
  def extend(className: java.lang.String, protoProps: js.Any): js.Any = js.native
  def extend(className: java.lang.String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def extend(className: parseLib.Anon_ClassName): js.Any = js.native
  def extend(className: parseLib.Anon_ClassName, protoProps: js.Any): js.Any = js.native
  def extend(className: parseLib.Anon_ClassName, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], keys: java.lang.String, options: parseLib.ParseNs.RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: parseLib.ParseNs.Object */](
    list: js.Array[T],
    keys: js.Array[java.lang.String | js.Array[java.lang.String]],
    options: parseLib.ParseNs.RequestOptions
  ): js.Promise[js.Array[T]] = js.native
  def fromJSON(json: js.Any): parseLib.ParseNs.Object = js.native
  def fromJSON(json: js.Any, `override`: scala.Boolean): parseLib.ParseNs.Object = js.native
  def pinAll(objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
  def pinAllWithName(name: java.lang.String, objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
  def registerSubclass[T /* <: parseLib.ParseNs.Object */](
    className: java.lang.String,
    clazz: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* options */ js.Any], T]
  ): scala.Unit = js.native
  def saveAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def saveAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.SaveAllOptions): js.Promise[js.Array[T]] = js.native
  def unPinAll(objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
  def unPinAllObjects(): js.Promise[scala.Unit] = js.native
  def unPinAllObjectsWithName(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def unPinAllWithName(name: java.lang.String, objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
}

