package typings
package parseLib.reactDashNativeMod

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
@JSImport("parse/react-native", "Object")
@js.native
class Object ()
  extends parseLib.nodeMod.Object {
  def this(attributes: js.Array[java.lang.String]) = this()
  def this(className: java.lang.String) = this()
  def this(attributes: js.Array[java.lang.String], options: js.Any) = this()
  def this(className: java.lang.String, options: js.Any) = this()
}

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
@JSImport("parse/react-native", "Object")
@js.native
object Object extends js.Object {
  def createWithoutData[T /* <: js.Object */](id: java.lang.String): T = js.native
  def destroyAll[T](list: js.Array[T]): stdLib.Promise[js.Array[T]] = js.native
  def destroyAll[T](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.DestroyAllOptions): stdLib.Promise[js.Array[T]] = js.native
  def extend(className: java.lang.String): js.Any = js.native
  def extend(className: java.lang.String, protoProps: js.Any): js.Any = js.native
  def extend(className: java.lang.String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T /* <: js.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.FetchAllOptions): stdLib.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: js.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.FetchAllOptions): stdLib.Promise[js.Array[T]] = js.native
  def fromJSON(json: js.Any, `override`: scala.Boolean): js.Any = js.native
  def registerSubclass[T /* <: js.Object */](
    className: java.lang.String,
    clazz: ScalablyTyped.runtime.Instantiable1[/* options */ js.UndefOr[/* options */ js.Any], T]
  ): scala.Unit = js.native
  def saveAll[T /* <: js.Object */](list: js.Array[T]): stdLib.Promise[js.Array[T]] = js.native
  def saveAll[T /* <: js.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.SaveAllOptions): stdLib.Promise[js.Array[T]] = js.native
}

