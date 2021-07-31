package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.parse.mod.global.Parse.Object.DestroyOptions
import typings.parse.mod.global.Parse.Object.FetchOptions
import typings.parse.mod.global.Parse.Object.SaveOptions
import typings.parse.mod.global.Parse.Object.SetOptions
import typings.parse.mod.global.Parse.Object.ToJSON
import typings.parse.parseBooleans.`false`
import typings.std.Date
import typings.std.Extract
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * @param attributes The initial set of data to store in the object.
  * @param options The options for this object instance.
  * @see Parse.Object.extend
  *
  *
  * Creates a new model with defined attributes.
  */
@js.native
trait Object[T /* <: Attributes */] extends StObject {
  
  def add[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Array<any>? K : never}[keyof T] */ js.Any */](
    attr: K,
    item: /* import warning: importer.ImportType#apply Failed type conversion: T[K][number] */ js.Any
  ): this.type | `false` = js.native
  
  def addAll[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Array<any>? K : never}[keyof T] */ js.Any */](
    attr: K,
    items: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type | `false` = js.native
  
  var addAllUnique: /* import warning: importer.ImportType#apply Failed type conversion: this['addAll'] */ js.Any = js.native
  
  var addUnique: /* import warning: importer.ImportType#apply Failed type conversion: this['add'] */ js.Any = js.native
  
  var attributes: T = js.native
  
  var className: String = js.native
  
  def clear(options: js.Any): js.Any = js.native
  
  var createdAt: Date = js.native
  
  def decrement(attr: Extract[/* keyof T */ String, String]): this.type | `false` = js.native
  def decrement(attr: Extract[/* keyof T */ String, String], amount: Double): this.type | `false` = js.native
  
  def destroy(): js.Promise[this.type] = js.native
  def destroy(options: DestroyOptions): js.Promise[this.type] = js.native
  
  def dirty(): Boolean = js.native
  def dirty(attr: Extract[/* keyof T */ String, String]): Boolean = js.native
  
  def dirtyKeys(): js.Array[String] = js.native
  
  def escape(attr: Extract[/* keyof T */ String, String]): String = js.native
  
  def existed(): Boolean = js.native
  
  def exists(): js.Promise[Boolean] = js.native
  def exists(options: RequestOptions): js.Promise[Boolean] = js.native
  
  def fetch(): js.Promise[this.type] = js.native
  def fetch(options: FetchOptions): js.Promise[this.type] = js.native
  
  def fetchFromLocalDatastore(): js.Promise[this.type] = js.native
  
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: K): js.Promise[this.type] = js.native
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: K, options: RequestOptions): js.Promise[this.type] = js.native
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: js.Array[K | js.Array[K]]): js.Promise[this.type] = js.native
  def fetchWithInclude[K /* <: Extract[/* keyof T */ String, String] */](keys: js.Array[K | js.Array[K]], options: RequestOptions): js.Promise[this.type] = js.native
  
  def get[K /* <: Extract[/* keyof T */ String, String] */](attr: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  def getACL(): js.UndefOr[ACL] = js.native
  
  def has(attr: Extract[/* keyof T */ String, String]): Boolean = js.native
  
  var id: String = js.native
  
  def increment(attr: Extract[/* keyof T */ String, String]): this.type | `false` = js.native
  def increment(attr: Extract[/* keyof T */ String, String], amount: Double): this.type | `false` = js.native
  
  def initialize(): Unit = js.native
  
  def isDataAvailable(): Boolean = js.native
  
  def isNew(): Boolean = js.native
  
  def isPinned(): js.Promise[Boolean] = js.native
  
  def isValid(): Boolean = js.native
  
  def newInstance(): this.type = js.native
  
  def op(attr: Extract[/* keyof T */ String, String]): js.Any = js.native
  
  def pin(): js.Promise[Unit] = js.native
  
  def pinWithName(name: String): js.Promise[Unit] = js.native
  
  def relation[R /* <: Object[Attributes] */, K /* <: Extract[/* keyof T */ String, String] */](attr: K): Relation[this.type, R] = js.native
  
  var remove: /* import warning: importer.ImportType#apply Failed type conversion: this['add'] */ js.Any = js.native
  
  var removeAll: /* import warning: importer.ImportType#apply Failed type conversion: this['addAll'] */ js.Any = js.native
  
  def revert(keys: (Extract[/* keyof T */ String, String])*): Unit = js.native
  
  def save[K /* <: Extract[/* keyof T */ String, String] */](): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typings.parse.parseStrings.Object & TopLevel[T]) | Partial[T]
  ): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typings.parse.parseStrings.Object & TopLevel[T]) | Partial[T],
    options: SaveOptions
  ): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](attrs: Null, options: SaveOptions): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](attrs: Unit, options: SaveOptions): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](key: K, value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): js.Promise[this.type] = js.native
  def save[K /* <: Extract[/* keyof T */ String, String] */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    options: SaveOptions
  ): js.Promise[this.type] = js.native
  
  def set[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typings.parse.parseStrings.Object & TopLevel[T]) | Partial[T]
  ): this.type | `false` = js.native
  def set[K /* <: Extract[/* keyof T */ String, String] */](
    attrs: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: T[key]}
    */ typings.parse.parseStrings.Object & TopLevel[T]) | Partial[T],
    options: SetOptions
  ): this.type | `false` = js.native
  def set[K /* <: Extract[/* keyof T */ String, String] */](key: K, value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any): this.type | `false` = js.native
  def set[K /* <: Extract[/* keyof T */ String, String] */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
    options: SetOptions
  ): this.type | `false` = js.native
  
  def setACL(acl: ACL): this.type | `false` = js.native
  def setACL(acl: ACL, options: SuccessFailureOptions): this.type | `false` = js.native
  
  def toJSON(): ToJSON[T] & JSONBaseAttributes = js.native
  
  def toPointer(): Pointer = js.native
  
  def unPin(): js.Promise[Unit] = js.native
  
  def unPinWithName(name: String): js.Promise[Unit] = js.native
  
  def unset(attr: Extract[/* keyof T */ String, String]): this.type | `false` = js.native
  def unset(attr: Extract[/* keyof T */ String, String], options: js.Any): this.type | `false` = js.native
  
  var updatedAt: Date = js.native
  
  def validate(attrs: Attributes): Error | `false` = js.native
  def validate(attrs: Attributes, options: SuccessFailureOptions): Error | `false` = js.native
}
object Object extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Parse.Object")
  @js.native
  class ^[T /* <: Attributes */] protected ()
    extends StObject
       with Object[T] {
    def this(className: String, attributes: T) = this()
    def this(className: String, attributes: T, options: js.Any) = this()
  }
  
  @JSGlobal("Parse.Object")
  @js.native
  val ^ : js.Object & ObjectConstructor = js.native
  
  trait DestroyAllOptions
    extends StObject
       with BatchSizeOption
       with ScopeOptions
  object DestroyAllOptions {
    
    @scala.inline
    def apply(): DestroyAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyAllOptions]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parse.mod.global.Parse.WaitOption because var conflicts: wait. Inlined  */ trait DestroyOptions
    extends StObject
       with SuccessFailureOptions
       with ScopeOptions
  object DestroyOptions {
    
    @scala.inline
    def apply(): DestroyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyOptions]
    }
  }
  
  // From https://github.com/parse-community/Parse-SDK-JS/blob/master/src/encode.js
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.parse.mod.global.Parse.Object.ToJSON[T]
    - js.Array[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias parse.parse.<global>.Parse.Object.Encode<R> * / js.Object]
    - java.lang.String
    - typings.parse.anon.Iso
    - typings.std.ReturnType[
  / * import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] * / js.Any]
    - typings.parse.mod.global.Parse.Pointer
  */
  type Encode[T] = _Encode[T] | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias parse.parse.<global>.Parse.Object.Encode<R> */ js.Object
  ]) | (ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] */ js.Any
  ]) | T | ToJSON[T] | String
  
  trait FetchAllOptions
    extends StObject
       with SuccessFailureOptions
       with ScopeOptions
  object FetchAllOptions {
    
    @scala.inline
    def apply(): FetchAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchAllOptions]
    }
  }
  
  trait FetchOptions
    extends StObject
       with SuccessFailureOptions
       with ScopeOptions
  object FetchOptions {
    
    @scala.inline
    def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
  }
  
  trait SaveAllOptions
    extends StObject
       with BatchSizeOption
       with ScopeOptions
  object SaveAllOptions {
    
    @scala.inline
    def apply(): SaveAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveAllOptions]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parse.mod.global.Parse.WaitOption because var conflicts: wait. Inlined  */ trait SaveOptions
    extends StObject
       with CascadeSaveOption
       with SuccessFailureOptions
       with SilentOption
       with ScopeOptions
  object SaveOptions {
    
    @scala.inline
    def apply(): SaveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveOptions]
    }
  }
  
  trait SetOptions
    extends StObject
       with ErrorOption
       with SilentOption {
    
    var promise: js.UndefOr[js.Any] = js.undefined
  }
  object SetOptions {
    
    @scala.inline
    def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    @scala.inline
    implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPromise(value: js.Any): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  type ToJSON[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: parse.parse.<global>.Parse.Object.Encode<T[K]>}
    */ typings.parse.parseStrings.ToJSON & TopLevel[T]
  
  trait _Encode[T] extends StObject
  object _Encode {
    
    @scala.inline
    def Iso(iso: String): typings.parse.anon.Iso = {
      val __obj = js.Dynamic.literal(__type = "Date", iso = iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parse.anon.Iso]
    }
    
    @scala.inline
    def Pointer(__type: String, className: String, objectId: String): typings.parse.mod.global.Parse.Pointer = {
      val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.parse.mod.global.Parse.Pointer]
    }
  }
  
  type _To = js.Object & ObjectConstructor
  
  /* This means you don't have to write `^`, but can instead just say `Object.foo` */
  override def _to: js.Object & ObjectConstructor = ^
}
