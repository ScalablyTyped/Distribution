package typings.parse.ParseNs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.parse.Anon_ClassName
import typings.parse.ParseNs.ObjectNs.DestroyAllOptions
import typings.parse.ParseNs.ObjectNs.DestroyOptions
import typings.parse.ParseNs.ObjectNs.FetchAllOptions
import typings.parse.ParseNs.ObjectNs.FetchOptions
import typings.parse.ParseNs.ObjectNs.SaveAllOptions
import typings.parse.ParseNs.ObjectNs.SaveOptions
import typings.parse.ParseNs.ObjectNs.SetOptions
import typings.parse.parseNumbers.`false`
import typings.std.Date
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
@JSGlobal("Parse.Object")
@js.native
class Object () extends BaseObject {
  def this(attributes: js.Array[String]) = this()
  def this(className: String) = this()
  def this(attributes: js.Array[String], options: js.Any) = this()
  def this(className: String, options: js.Any) = this()
  var attributes: js.Any = js.native
  var changed: Boolean = js.native
  var cid: String = js.native
  var className: String = js.native
  var createdAt: Date = js.native
  var id: String = js.native
  var updatedAt: Date = js.native
  def add(attr: String, item: js.Any): this.type | `false` = js.native
  def addAll(attr: String, items: js.Array[_]): this.type | `false` = js.native
  def addAllUnique(attr: String, items: js.Array[_]): this.type | `false` = js.native
  def addUnique(attr: String, item: js.Any): this.type | `false` = js.native
  def change(options: js.Any): this.type = js.native
  def changedAttributes(diff: js.Any): Boolean = js.native
  def clear(options: js.Any): js.Any = js.native
  def destroy(): js.Promise[this.type] = js.native
  def destroy(options: DestroyOptions): js.Promise[this.type] = js.native
  def dirty(): Boolean = js.native
  def dirty(attr: String): Boolean = js.native
  def dirtyKeys(): js.Array[String] = js.native
  def equals(other: js.Any): Boolean = js.native
  def escape(attr: String): String = js.native
  def existed(): Boolean = js.native
  def fetch(): js.Promise[this.type] = js.native
  def fetch(options: FetchOptions): js.Promise[this.type] = js.native
  def fetchFromLocalDatastore(): js.Promise[this.type] | Unit = js.native
  def fetchWithInclude(keys: String): js.Promise[this.type] = js.native
  def fetchWithInclude(keys: String, options: RequestOptions): js.Promise[this.type] = js.native
  def fetchWithInclude(keys: js.Array[String | js.Array[String]]): js.Promise[this.type] = js.native
  def fetchWithInclude(keys: js.Array[String | js.Array[String]], options: RequestOptions): js.Promise[this.type] = js.native
  def get(attr: String): js.UndefOr[js.Any] = js.native
  def getACL(): js.UndefOr[ACL] = js.native
  def has(attr: String): Boolean = js.native
  def hasChanged(attr: String): Boolean = js.native
  def increment(attr: String): js.Any = js.native
  def increment(attr: String, amount: Double): js.Any = js.native
  def initialize(): Unit = js.native
  def isNew(): Boolean = js.native
  def isPinned(): js.Promise[Boolean] = js.native
  def isValid(): Boolean = js.native
  def op(attr: String): js.Any = js.native
  def pin(): js.Promise[Unit] = js.native
  def pinWithName(name: String): js.Promise[Unit] = js.native
  def previous(attr: String): js.Any = js.native
  def previousAttributes(): js.Any = js.native
  def relation(attr: String): Relation[this.type, Object] = js.native
  def remove(attr: String, item: js.Any): this.type | `false` = js.native
  def removeAll(attr: String, items: js.Any): this.type | `false` = js.native
  def revert(): Unit = js.native
  def save(): js.Promise[this.type] = js.native
  def save(attrs: js.Object): js.Promise[this.type] = js.native
  def save(attrs: js.Object, options: SaveOptions): js.Promise[this.type] = js.native
  def save(attrs: StringDictionary[js.Any]): js.Promise[this.type] = js.native
  def save(attrs: StringDictionary[js.Any], options: SaveOptions): js.Promise[this.type] = js.native
  def save(attrs: Null, options: SaveOptions): js.Promise[this.type] = js.native
  def save(key: String, value: js.Any): js.Promise[this.type] = js.native
  def save(key: String, value: js.Any, options: SaveOptions): js.Promise[this.type] = js.native
  def set(attrs: js.Object): this.type | `false` = js.native
  def set(attrs: js.Object, options: SetOptions): this.type | `false` = js.native
  def set(key: String, value: js.Any): this.type | `false` = js.native
  def set(key: String, value: js.Any, options: SetOptions): this.type | `false` = js.native
  def setACL(acl: ACL): this.type | `false` = js.native
  def setACL(acl: ACL, options: SuccessFailureOptions): this.type | `false` = js.native
  def toPointer(): Pointer = js.native
  def unPin(): js.Promise[Unit] = js.native
  def unPinWithName(name: String): js.Promise[Unit] = js.native
  def unset(attr: String): js.Any = js.native
  def unset(attr: String, options: js.Any): js.Any = js.native
  def validate(attrs: js.Any): Boolean = js.native
  def validate(attrs: js.Any, options: SuccessFailureOptions): Boolean = js.native
}

/* static members */
@JSGlobal("Parse.Object")
@js.native
object Object extends js.Object {
  def createWithoutData[T /* <: Object */](id: String): T = js.native
  def destroyAll[T /* <: Object */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def destroyAll[T /* <: Object */](list: js.Array[T], options: DestroyAllOptions): js.Promise[js.Array[T]] = js.native
  def extend(className: String): js.Any = js.native
  def extend(className: String, protoProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def extend(className: Anon_ClassName): js.Any = js.native
  def extend(className: Anon_ClassName, protoProps: js.Any): js.Any = js.native
  def extend(className: Anon_ClassName, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T /* <: Object */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: Object */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: Object */](list: js.Array[T], keys: String, options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: Object */](list: js.Array[T], keys: js.Array[String | js.Array[String]], options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fromJSON[T /* <: Object */](json: js.Any): T = js.native
  def fromJSON[T /* <: Object */](json: js.Any, `override`: Boolean): T = js.native
  def pinAll(objects: js.Array[Object]): js.Promise[Unit] = js.native
  def pinAllWithName(name: String, objects: js.Array[Object]): js.Promise[Unit] = js.native
  def registerSubclass[T /* <: Object */](className: String, clazz: Instantiable1[js.UndefOr[/* options */ js.Any], T]): Unit = js.native
  def saveAll[T /* <: Object */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def saveAll[T /* <: Object */](list: js.Array[T], options: SaveAllOptions): js.Promise[js.Array[T]] = js.native
  def unPinAll(objects: js.Array[Object]): js.Promise[Unit] = js.native
  def unPinAllObjects(): js.Promise[Unit] = js.native
  def unPinAllObjectsWithName(name: String): js.Promise[Unit] = js.native
  def unPinAllWithName(name: String, objects: js.Array[Object]): js.Promise[Unit] = js.native
}

