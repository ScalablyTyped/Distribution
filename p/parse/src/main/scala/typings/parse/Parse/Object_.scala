package typings.parse.Parse

import typings.parse.Parse.Object.DestroyOptions
import typings.parse.Parse.Object.FetchOptions
import typings.parse.Parse.Object.SaveOptions
import typings.parse.Parse.Object.SetOptions
import typings.parse.parseNumbers.`false`
import typings.std.Date
import typings.std.Exclude
import typings.std.Partial
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
class Object_[T /* <: js.Any */] () extends BaseObject {
  def this(className: String) = this()
  def this(className: String, attributes: T) = this()
  def this(className: String, attributes: T, options: js.Any) = this()
  var attributes: T = js.native
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
  def get[K /* <: Exclude[String, js.Symbol | Double] */](attr: K): /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any = js.native
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
  def relation(attr: String): Relation[this.type, Object[_]] = js.native
  def remove(attr: String, item: js.Any): this.type | `false` = js.native
  def removeAll(attr: String, items: js.Any): this.type | `false` = js.native
  def revert(): Unit = js.native
  def revert(keys: String*): Unit = js.native
  def save(): js.Promise[this.type] = js.native
  def save(attrs: Null, options: SaveOptions): js.Promise[this.type] = js.native
  def save(attrs: Partial[T]): js.Promise[this.type] = js.native
  def save(attrs: Partial[T], options: SaveOptions): js.Promise[this.type] = js.native
  def save[K /* <: String */](key: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): js.Promise[this.type] = js.native
  def save[K /* <: String */](
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any,
    options: SaveOptions
  ): js.Promise[this.type] = js.native
  def set(attrs: Partial[T]): this.type | `false` = js.native
  def set(attrs: Partial[T], options: SetOptions): this.type | `false` = js.native
  def set[K /* <: String */](key: K, value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): this.type | `false` = js.native
  def set[K /* <: String */](
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any,
    options: SetOptions
  ): this.type | `false` = js.native
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

