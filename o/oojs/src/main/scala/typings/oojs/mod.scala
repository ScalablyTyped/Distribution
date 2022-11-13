package typings.oojs

import org.scalablytyped.runtime.Shortcut
import typings.oojs.OO.ConstructorLike
import typings.oojs.OO.EmitterListConstructor
import typings.oojs.OO.EventEmitterConstructor
import typings.oojs.OO.Factory
import typings.oojs.OO.FactoryConstructor
import typings.oojs.OO.LeavesOf
import typings.oojs.OO.NodesOf
import typings.oojs.OO.RecursivelyGet
import typings.oojs.OO.RegistryConstructor
import typings.oojs.OO.SortedEmitterList
import typings.oojs.OO.SortedEmitterListConstructor
import typings.oojs.OO.SortingCallback
import typings.oojs.OO.ValidKey
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oojs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("oojs", "EmitterList")
  @js.native
  val EmitterList: EmitterListConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("oojs", "EmitterList")
  @js.native
  open class EmitterListCls ()
    extends StObject
       with typings.oojs.OO.EmitterList
  
  @JSImport("oojs", "EventEmitter")
  @js.native
  val EventEmitter: EventEmitterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("oojs", "EventEmitter")
  @js.native
  open class EventEmitterCls ()
    extends StObject
       with typings.oojs.OO.EventEmitter
  
  object Factory extends Shortcut {
    
    @JSImport("oojs", "Factory")
    @js.native
    val ^ : FactoryConstructor = js.native
    
    /** @deprecated Use `super` instead */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("oojs", "Factory.parent")
    @js.native
    open class parent ()
      extends StObject
         with typings.oojs.OO.Registry
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("oojs", "Factory.super")
    @js.native
    open class `super` ()
      extends StObject
         with typings.oojs.OO.Registry
    
    type _To = FactoryConstructor
    
    /* This means you don't have to write `^`, but can instead just say `Factory.foo` */
    override def _to: FactoryConstructor = ^
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("oojs", "Factory")
  @js.native
  open class FactoryCls ()
    extends StObject
       with Factory
  
  @JSImport("oojs", "Registry")
  @js.native
  val Registry: RegistryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("oojs", "Registry")
  @js.native
  open class RegistryCls ()
    extends StObject
       with typings.oojs.OO.Registry
  
  object SortedEmitterList extends Shortcut {
    
    @JSImport("oojs", "SortedEmitterList")
    @js.native
    val ^ : SortedEmitterListConstructor = js.native
    
    /** @deprecated Use `super` instead */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("oojs", "SortedEmitterList.parent")
    @js.native
    open class parent ()
      extends StObject
         with typings.oojs.OO.EmitterList
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("oojs", "SortedEmitterList.super")
    @js.native
    open class `super` ()
      extends StObject
         with typings.oojs.OO.EmitterList
    
    type _To = SortedEmitterListConstructor
    
    /* This means you don't have to write `^`, but can instead just say `SortedEmitterList.foo` */
    override def _to: SortedEmitterListConstructor = ^
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("oojs", "SortedEmitterList")
  @js.native
  open class SortedEmitterListCls protected ()
    extends StObject
       with SortedEmitterList {
    /** @param sortingCallback Callback that compares two items. */
    def this(sortingCallback: SortingCallback) = this()
  }
  
  /**
    * Use binary search to locate an element in a sorted array.
    *
    * searchFunc is given an element from the array. `searchFunc(elem)` must return a number
    * above 0 if the element we're searching for is to the right of (has a higher index than) elem,
    * below 0 if it is to the left of elem, or zero if it's equal to elem.
    *
    * To search for a specific value with a comparator function (a `function cmp(a,b)` that returns
    * above 0 if `a > b`, below 0 if `a < b`, and 0 if `a == b`), you can use
    * `searchFunc = cmp.bind( null, value )`.
    *
    * @param arr Array to search in
    * @param searchFunc Search function
    * @param forInsertion If not found, return index where val could be inserted
    * @return Index where val was found, or null if not found
    */
  inline def binarySearch[T](arr: js.Array[T], searchFunc: js.Function1[/* item */ T, Double]): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(arr.asInstanceOf[js.Any], searchFunc.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def binarySearch[T](arr: js.Array[T], searchFunc: js.Function1[/* item */ T, Double], forInsertion: Boolean): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(arr.asInstanceOf[js.Any], searchFunc.asInstanceOf[js.Any], forInsertion.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  /**
    * Create a new object that is an instance of the same
    * constructor as the input, inherits from the same object
    * and contains the same own properties.
    *
    * This makes a shallow non-recursive copy of own properties.
    * To create a recursive copy of plain objects, use #copy.
    *
    *     var foo = new Person( mom, dad );
    *     foo.setAge( 21 );
    *     var foo2 = OO.cloneObject( foo );
    *     foo.setAge( 22 );
    *
    *     // Then
    *     foo2 !== foo; // true
    *     foo2 instanceof Person; // true
    *     foo2.getAge(); // 21
    *     foo.getAge(); // 22
    *
    * @param origin
    * @return Clone of origin
    */
  inline def cloneObject[T /* <: js.Object */](origin: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(origin.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Recursively compare properties between two objects.
    *
    * A false result may be caused by property inequality or by properties in one object missing from
    * the other. An asymmetrical test may also be performed, which checks only that properties in the
    * first object are present in the second object, but not the inverse.
    *
    * If either a or b is null or undefined it will be treated as an empty object.
    *
    * @param a First object to compare
    * @param b Second object to compare
    * @param asymmetrical Whether to check only that a's values are equal to b's
    *  (i.e. a is a subset of b)
    * @return If the objects contain the same values as each other
    */
  inline def compare(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")().asInstanceOf[Boolean]
  inline def compare(a: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def compare(a: js.Object, b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: js.Object, b: js.Object, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: js.Object, b: Null, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: js.Object, b: Unit, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Null, b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Null, b: js.Object, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Null, b: Null, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Null, b: Unit, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Unit, b: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Unit, b: js.Object, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Unit, b: Null, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compare(a: Unit, b: Unit, asymmetrical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], asymmetrical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Create a plain deep copy of any kind of object.
    *
    * Copies are deep, and will either be an object or an array depending on `source`.
    *
    * @param source Object to copy
    * @return Copy of source object
    */
  inline def copy[T](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def copy[T, D /* <: Double */](source: T, leafCallback: js.Function1[/* leaf */ LeavesOf[T, D], Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], leafCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def copy[T, D /* <: Double */](
    source: T,
    leafCallback: js.Function1[/* leaf */ LeavesOf[T, D], Any],
    nodeCallback: js.Function1[/* node */ NodesOf[T, D], Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], leafCallback.asInstanceOf[js.Any], nodeCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def copy[T, D /* <: Double */](source: T, leafCallback: Unit, nodeCallback: js.Function1[/* node */ NodesOf[T, D], Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], leafCallback.asInstanceOf[js.Any], nodeCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Create a plain deep copy of any kind of object.
    *
    * Copies are deep, and will either be an object or an array depending on `source`.
    *
    * @param source Object to copy
    * @param leafCallback Applied to leaf values after they are cloned but before they are
    *  added to the clone
    * @param nodeCallback Applied to all values before they are cloned. If the
    *  nodeCallback returns a value other than undefined, the returned value is used instead of
    *  attempting to clone.
    * @return Copy of source object
    */
  inline def copy_TD_Any[T, D /* <: Double */](source: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Delete a deeply nested property of an object using variadic arguments, protecting against
    * undefined property errors, and deleting resulting empty objects.
    *
    * @param obj
    * @param keys
    */
  inline def deleteProp(obj: js.Object, keys: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteProp")(scala.List(obj.asInstanceOf[js.Any]).`++`(keys.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  object getHash {
    
    /**
      * Generate a hash of an object based on its name and data.
      *
      * Performance optimization: <http://jsperf.com/ve-gethash-201208#/toJson_fnReplacerIfAoForElse>
      *
      * To avoid two objects with the same values generating different hashes, we utilize the replacer
      * argument of JSON.stringify and sort the object by key as it's being serialized. This may or may
      * not be the fastest way to do this; we should investigate this further.
      *
      * Objects and arrays are hashed recursively. When hashing an object that has a .getHash()
      * function, we call that function and use its return value rather than hashing the object
      * ourselves. This allows classes to define custom hashing.
      *
      * @param val Object to generate hash for
      * @return Hash of object
      */
    inline def apply(`val`: Any): String = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("oojs", "getHash")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Sort objects by key (helper function for {@link OO.getHash}).
      *
      * This is a callback passed into {@link JSON.stringify}.
      *
      * @param key Property name of value being replaced
      * @param val Property value to replace
      * @return Replacement value
      */
    inline def keySortReplacer(key: String, `val`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("keySortReplacer")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  /**
    * Get an array of all property values in an object.
    *
    * @param obj Object to get values from
    * @return List of object values
    */
  inline def getObjectValues[T /* <: js.Object */](obj: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]]
  
  /**
    * Get a deeply nested property of an object using variadic arguments, protecting against
    * undefined property errors.
    *
    * `quux = OO.getProp( obj, 'foo', 'bar', 'baz' );` is equivalent to `quux = obj.foo.bar.baz;`
    * except that the former protects against JS errors if one of the intermediate properties
    * is undefined. Instead of throwing an error, this function will return undefined in
    * that case.
    *
    * @param obj
    * @param keys
    * @return obj[arguments[1]][arguments[2]].... or undefined
    */
  inline def getProp[T /* <: js.Object */, K /* <: js.Array[ValidKey] */](
    obj: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param keys because its type K is not an array type */ keys: K
  ): RecursivelyGet[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProp")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[RecursivelyGet[T, K]]
  
  /**
    * Inherit from prototype to another using {@link Object.create}.
    *
    * Beware: This redefines the prototype, call before setting your prototypes.
    *
    * Beware: This redefines the prototype, can only be called once on a function.
    * If called multiple times on the same function, the previous prototype is lost.
    * This is how prototypal inheritance works, it can only be one straight chain
    * (just like classical inheritance in PHP for example). If you need to work with
    * multiple constructors consider storing an instance of the other constructor in a
    * property instead, or perhaps use a mixin (see {@link OO.mixinClass}).
    *
    *     function Thing() {}
    *     Thing.prototype.exists = function () {};
    *
    *     function Person() {
    *         Person.super.apply( this, arguments );
    *     }
    *     OO.inheritClass( Person, Thing );
    *     Person.static.defaultEyeCount = 2;
    *     Person.prototype.walk = function () {};
    *
    *     function Jumper() {
    *         Jumper.super.apply( this, arguments );
    *     }
    *     OO.inheritClass( Jumper, Person );
    *     Jumper.prototype.jump = function () {};
    *
    *     Jumper.static.defaultEyeCount === 2;
    *     var x = new Jumper();
    *     x.jump();
    *     x.walk();
    *     x instanceof Thing && x instanceof Person && x instanceof Jumper;
    *
    * @param targetFn
    * @param originFn
    * @throws {Error} If target already inherits from origin
    */
  inline def inheritClass(targetFn: ConstructorLike, originFn: ConstructorLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritClass")(targetFn.asInstanceOf[js.Any], originFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Utility to initialize a class for OO inheritance.
    *
    * Currently this just initializes an empty static object.
    *
    * @param fn
    */
  inline def initClass(fn: ConstructorLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initClass")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Assert whether a value is a plain object or not.
    *
    * @param obj
    */
  inline def isPlainObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Test whether one class is a subclass of another, without instantiating it.
    *
    * Every class is considered a subclass of Object and of itself.
    *
    * @param testFn The class to be tested
    * @param baseFn The base class
    * @return Whether testFn is a subclass of baseFn (or equal to it)
    */
  inline def isSubclass(testFn: ConstructorLike, baseFn: ConstructorLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubclass")(testFn.asInstanceOf[js.Any], baseFn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Copy over *own* prototype properties of a mixin.
    *
    * The 'constructor' (whether implicit or explicit) is not copied over.
    *
    * This does not create inheritance to the origin. If you need inheritance,
    * use {@link OO.inheritClass} instead.
    *
    * Beware: This can redefine a prototype property, call before setting your prototypes.
    *
    * Beware: Don't call before {@link OO.inheritClass}.
    *
    *     function Foo() {}
    *     function Context() {}
    *
    *     // Avoid repeating this code
    *     function ContextLazyLoad() {}
    *     ContextLazyLoad.prototype.getContext = function () {
    *         if ( !this.context ) {
    *             this.context = new Context();
    *         }
    *         return this.context;
    *     };
    *
    *     function FooBar() {}
    *     OO.inheritClass( FooBar, Foo );
    *     OO.mixinClass( FooBar, ContextLazyLoad );
    *
    * @param targetFn
    * @param originFn
    */
  inline def mixinClass(targetFn: ConstructorLike, originFn: ConstructorLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mixinClass")(targetFn.asInstanceOf[js.Any], originFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set a deeply nested property of an object using variadic arguments, protecting against
    * undefined property errors.
    *
    * `OO.setProp( obj, 'foo', 'bar', 'baz' );` is equivalent to `obj.foo.bar = baz;` except that
    * the former protects against JS errors if one of the intermediate properties is
    * undefined. Instead of throwing an error, undefined intermediate properties will be
    * initialized to an empty object. If an intermediate property is not an object, or if obj itself
    * is not an object, this function will silently abort.
    *
    * @param obj
    * @param keys
    * @param value
    */
  inline def setProp(
    obj: js.Object,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param keysAndValue because its type [...Array<string>, any] is not an array type */ keysAndValue: Array[Any | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProp")(obj.asInstanceOf[js.Any], keysAndValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Compute the difference of two arrays (items in 'a' but not 'b').
    *
    * Arrays values must be convertible to object keys (strings).
    *
    * @param a First array
    * @param b Second array
    * @return Intersection of arrays
    */
  inline def simpleArrayDifference[T](a: js.Array[T], b: js.Array[Any]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleArrayDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /**
    * Compute the intersection of two arrays (items in both arrays).
    *
    * Arrays values must be convertible to object keys (strings).
    *
    * @param a First array
    * @param b Second array
    * @return Intersection of arrays
    */
  inline def simpleArrayIntersection[T, U](a: js.Array[T], b: js.Array[U]): js.Array[Extract[T, U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleArrayIntersection")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[Extract[T, U]]]
  
  /**
    * Compute the union (duplicate-free merge) of a set of arrays.
    *
    * Arrays values must be convertible to object keys (strings).
    *
    * By building an object (with the values for keys) in parallel with
    * the array, a new item's existence in the union can be computed faster.
    *
    * @param arrays Arrays to union
    * @return Union of the arrays
    */
  inline def simpleArrayUnion[T /* <: js.Array[js.Array[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arrays because its type T is not an array type */ arrays: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<std.Array<infer R>> ? std.Array<R> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleArrayUnion")(arrays.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<std.Array<infer R>> ? std.Array<R> : never */ js.Any]
  
  /**
    * Get the unique values of an array, removing duplicates.
    *
    * @param arr Array
    * @return Unique values in array
    */
  inline def unique[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
