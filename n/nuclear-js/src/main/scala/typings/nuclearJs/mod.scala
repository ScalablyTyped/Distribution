package typings.nuclearJs

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Collection
import typings.immutable.Immutable.Collection.Indexed
import typings.immutable.Immutable.Collection.Keyed
import typings.immutable.Immutable.Collection.Set
import typings.immutable.Immutable.Record
import typings.immutable.Immutable.Record.Factory
import typings.nuclearJs.anon.LogAppState
import typings.std.Iterable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Immutable {
    
    object Collection {
      
      @JSImport("nuclear-js", "Immutable.Collection")
      @js.native
      def apply[I /* <: typings.immutable.Immutable.Collection[_, _] */](collection: I): I = js.native
      @JSImport("nuclear-js", "Immutable.Collection")
      @js.native
      def apply[T](collection: Iterable[T]): Indexed[T] = js.native
      @JSImport("nuclear-js", "Immutable.Collection")
      @js.native
      def apply[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
      
      @JSImport("nuclear-js", "Immutable.Collection.Indexed")
      @js.native
      def Indexed[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Indexed[T] = js.native
      
      @JSImport("nuclear-js", "Immutable.Collection.Keyed")
      @js.native
      def Keyed[V](obj: StringDictionary[V]): typings.immutable.Immutable.Collection.Keyed[String, V] = js.native
      @JSImport("nuclear-js", "Immutable.Collection.Keyed")
      @js.native
      def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Collection.Keyed[K, V] = js.native
      
      @JSImport("nuclear-js", "Immutable.Collection.Set")
      @js.native
      def Set[T](collection: Iterable[T]): typings.immutable.Immutable.Collection.Set[T] = js.native
      
      /**
        * @deprecated use `const { isAssociative } = require('immutable')`
        */
      @JSImport("nuclear-js", "Immutable.Collection.isAssociative")
      @js.native
      def isAssociative(maybeAssociative: js.Any): Boolean = js.native
      
      /**
        * @deprecated use `const { isIndexed } = require('immutable')`
        */
      @JSImport("nuclear-js", "Immutable.Collection.isIndexed")
      @js.native
      def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
      
      /**
        * @deprecated use `const { isKeyed } = require('immutable')`
        */
      @JSImport("nuclear-js", "Immutable.Collection.isKeyed")
      @js.native
      def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
      
      /**
        * @deprecated use `const { isOrdered } = require('immutable')`
        */
      @JSImport("nuclear-js", "Immutable.Collection.isOrdered")
      @js.native
      def isOrdered(maybeOrdered: js.Any): Boolean = js.native
    }
    
    object List {
      
      @JSImport("nuclear-js", "Immutable.List")
      @js.native
      def apply(): typings.immutable.Immutable.List[_] = js.native
      @JSImport("nuclear-js", "Immutable.List")
      @js.native
      def apply[T](collection: Iterable[T]): typings.immutable.Immutable.List[T] = js.native
      
      /**
        * True if the provided value is a List
        *
        * <!-- runkit:activate -->
        * ```js
        * const { List } = require('immutable');
        * List.isList([]); // false
        * List.isList(List()); // true
        * ```
        */
      @JSImport("nuclear-js", "Immutable.List.isList")
      @js.native
      def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
      
      /**
        * Creates a new List containing `values`.
        *
        * <!-- runkit:activate -->
        * ```js
        * const { List } = require('immutable');
        * List.of(1, 2, 3, 4)
        * // List [ 1, 2, 3, 4 ]
        * ```
        *
        * Note: Values are not altered or converted in any way.
        *
        * <!-- runkit:activate -->
        * ```js
        * const { List } = require('immutable');
        * List.of({x:1}, 2, [3], 4)
        * // List [ { x: 1 }, 2, [ 3 ], 4 ]
        * ```
        */
      @JSImport("nuclear-js", "Immutable.List.of")
      @js.native
      def of[T](values: T*): typings.immutable.Immutable.List[T] = js.native
    }
    
    object Map {
      
      @JSImport("nuclear-js", "Immutable.Map")
      @js.native
      def apply(): typings.immutable.Immutable.Map[_, _] = js.native
      @JSImport("nuclear-js", "Immutable.Map")
      @js.native
      def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Map[String, V] = js.native
      @JSImport("nuclear-js", "Immutable.Map")
      @js.native
      def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Map[K, V] = js.native
      
      /**
        * True if the provided value is a Map
        *
        * <!-- runkit:activate -->
        * ```js
        * const { Map } = require('immutable')
        * Map.isMap({}) // false
        * Map.isMap(Map()) // true
        * ```
        */
      @JSImport("nuclear-js", "Immutable.Map.isMap")
      @js.native
      def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
      
      /**
        * Creates a new Map from alternating keys and values
        *
        * <!-- runkit:activate -->
        * ```js
        * const { Map } = require('immutable')
        * Map.of(
        *   'key', 'value',
        *   'numerical value', 3,
        *    0, 'numerical key'
        * )
        * // Map { 0: "numerical key", "key": "value", "numerical value": 3 }
        * ```
        *
        * @deprecated Use Map([ [ 'k', 'v' ] ]) or Map({ k: 'v' })
        */
      @JSImport("nuclear-js", "Immutable.Map.of")
      @js.native
      def of(keyValues: js.Any*): typings.immutable.Immutable.Map[_, _] = js.native
    }
    
    object OrderedMap {
      
      @JSImport("nuclear-js", "Immutable.OrderedMap")
      @js.native
      def apply(): typings.immutable.Immutable.OrderedMap[_, _] = js.native
      @JSImport("nuclear-js", "Immutable.OrderedMap")
      @js.native
      def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.OrderedMap[String, V] = js.native
      @JSImport("nuclear-js", "Immutable.OrderedMap")
      @js.native
      def apply[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.OrderedMap[K, V] = js.native
      
      /**
        * True if the provided value is an OrderedMap.
        */
      @JSImport("nuclear-js", "Immutable.OrderedMap.isOrderedMap")
      @js.native
      def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
    }
    
    object OrderedSet {
      
      @JSImport("nuclear-js", "Immutable.OrderedSet")
      @js.native
      def apply(): typings.immutable.Immutable.OrderedSet[_] = js.native
      @JSImport("nuclear-js", "Immutable.OrderedSet")
      @js.native
      def apply[T](collection: Iterable[T]): typings.immutable.Immutable.OrderedSet[T] = js.native
      
      @JSImport("nuclear-js", "Immutable.OrderedSet.fromKeys")
      @js.native
      def fromKeys(obj: StringDictionary[js.Any]): typings.immutable.Immutable.OrderedSet[String] = js.native
      /**
        * `OrderedSet.fromKeys()` creates a new immutable OrderedSet containing
        * the keys from this Collection or JavaScript Object.
        */
      @JSImport("nuclear-js", "Immutable.OrderedSet.fromKeys")
      @js.native
      def fromKeys[T](iter: Collection[T, _]): typings.immutable.Immutable.OrderedSet[T] = js.native
      
      /**
        * True if the provided value is an OrderedSet.
        */
      @JSImport("nuclear-js", "Immutable.OrderedSet.isOrderedSet")
      @js.native
      def isOrderedSet(maybeOrderedSet: js.Any): Boolean = js.native
      
      /**
        * Creates a new OrderedSet containing `values`.
        */
      @JSImport("nuclear-js", "Immutable.OrderedSet.of")
      @js.native
      def of[T](values: T*): typings.immutable.Immutable.OrderedSet[T] = js.native
    }
    
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], step: Double): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(start: js.UndefOr[scala.Nothing], end: Double): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(start: js.UndefOr[scala.Nothing], end: Double, step: Double): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(start: Double): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(start: Double, end: js.UndefOr[scala.Nothing], step: Double): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(start: Double, end: Double): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    @JSImport("nuclear-js", "Immutable.Range")
    @js.native
    def Range(start: Double, end: Double, step: Double): typings.immutable.Immutable.Seq.Indexed[Double] = js.native
    
    object Record {
      
      @JSImport("nuclear-js", "Immutable.Record")
      @js.native
      def apply[TProps](defaultValues: TProps): Factory[TProps] = js.native
      @JSImport("nuclear-js", "Immutable.Record")
      @js.native
      def apply[TProps](defaultValues: TProps, name: String): Factory[TProps] = js.native
      
      @JSImport("nuclear-js", "Immutable.Record.Factory")
      @js.native
      def Factory[TProps /* <: js.Object */](): typings.immutable.Immutable.Record[TProps] with TProps = js.native
      @JSImport("nuclear-js", "Immutable.Record.Factory")
      @js.native
      def Factory[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
      @JSImport("nuclear-js", "Immutable.Record.Factory")
      @js.native
      def Factory[TProps /* <: js.Object */](values: Partial[TProps]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
      
      @JSImport("nuclear-js", "Immutable.Record.getDescriptiveName")
      @js.native
      def getDescriptiveName(record: typings.immutable.Immutable.Record[_]): String = js.native
      
      @JSImport("nuclear-js", "Immutable.Record.isRecord")
      @js.native
      def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
    }
    
    @JSImport("nuclear-js", "Immutable.Repeat")
    @js.native
    def Repeat[T](value: T): typings.immutable.Immutable.Seq.Indexed[T] = js.native
    @JSImport("nuclear-js", "Immutable.Repeat")
    @js.native
    def Repeat[T](value: T, times: Double): typings.immutable.Immutable.Seq.Indexed[T] = js.native
    
    object Seq {
      
      @JSImport("nuclear-js", "Immutable.Seq")
      @js.native
      def apply(): typings.immutable.Immutable.Seq[_, _] = js.native
      @JSImport("nuclear-js", "Immutable.Seq")
      @js.native
      def apply[T](collection: Indexed[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
      @JSImport("nuclear-js", "Immutable.Seq")
      @js.native
      def apply[T](collection: Set[T]): typings.immutable.Immutable.Seq.Set[T] = js.native
      @JSImport("nuclear-js", "Immutable.Seq")
      @js.native
      def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
      @JSImport("nuclear-js", "Immutable.Seq")
      @js.native
      def apply[V](obj: StringDictionary[V]): typings.immutable.Immutable.Seq.Keyed[String, V] = js.native
      @JSImport("nuclear-js", "Immutable.Seq")
      @js.native
      def apply[S /* <: typings.immutable.Immutable.Seq[_, _] */](seq: S): S = js.native
      @JSImport("nuclear-js", "Immutable.Seq")
      @js.native
      def apply[K, V](collection: Keyed[K, V]): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
      
      /**
        * `Seq` which represents an ordered indexed list of values.
        */
      object Indexed {
        
        @JSImport("nuclear-js", "Immutable.Seq.Indexed")
        @js.native
        def apply(): typings.immutable.Immutable.Seq.Indexed[_] = js.native
        @JSImport("nuclear-js", "Immutable.Seq.Indexed")
        @js.native
        def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Indexed[T] = js.native
        
        /**
          * Provides an Seq.Indexed of the values provided.
          */
        @JSImport("nuclear-js", "Immutable.Seq.Indexed.of")
        @js.native
        def of[T](values: T*): typings.immutable.Immutable.Seq.Indexed[T] = js.native
      }
      
      @JSImport("nuclear-js", "Immutable.Seq.Keyed")
      @js.native
      def Keyed(): typings.immutable.Immutable.Seq.Keyed[_, _] = js.native
      @JSImport("nuclear-js", "Immutable.Seq.Keyed")
      @js.native
      def Keyed[V](obj: StringDictionary[V]): typings.immutable.Immutable.Seq.Keyed[String, V] = js.native
      @JSImport("nuclear-js", "Immutable.Seq.Keyed")
      @js.native
      def Keyed[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
      @JSImport("nuclear-js", "Immutable.Seq.Keyed")
      @js.native
      def Keyed_KV[K, V](): typings.immutable.Immutable.Seq.Keyed[K, V] = js.native
      
      object Set {
        
        @JSImport("nuclear-js", "Immutable.Seq.Set")
        @js.native
        def apply(): typings.immutable.Immutable.Seq.Set[_] = js.native
        @JSImport("nuclear-js", "Immutable.Seq.Set")
        @js.native
        def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Seq.Set[T] = js.native
        
        /**
          * Returns a Seq.Set of the provided values
          */
        @JSImport("nuclear-js", "Immutable.Seq.Set.of")
        @js.native
        def of[T](values: T*): typings.immutable.Immutable.Seq.Set[T] = js.native
      }
      
      /**
        * True if `maybeSeq` is a Seq, it is not backed by a concrete
        * structure such as Map, List, or Set.
        */
      @JSImport("nuclear-js", "Immutable.Seq.isSeq")
      @js.native
      def isSeq(maybeSeq: js.Any): Boolean = js.native
    }
    
    object Set_ {
      
      @JSImport("nuclear-js", "Immutable.Set")
      @js.native
      def apply(): typings.immutable.Immutable.Set[_] = js.native
      @JSImport("nuclear-js", "Immutable.Set")
      @js.native
      def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Set[T] = js.native
      
      @JSImport("nuclear-js", "Immutable.Set.fromKeys")
      @js.native
      def fromKeys(obj: StringDictionary[js.Any]): typings.immutable.Immutable.Set[String] = js.native
      /**
        * `Set.fromKeys()` creates a new immutable Set containing the keys from
        * this Collection or JavaScript Object.
        */
      @JSImport("nuclear-js", "Immutable.Set.fromKeys")
      @js.native
      def fromKeys[T](iter: Collection[T, _]): typings.immutable.Immutable.Set[T] = js.native
      
      /**
        * `Set.intersect()` creates a new immutable Set that is the intersection of
        * a collection of other sets.
        *
        * ```js
        * const { Set } = require('immutable')
        * const intersected = Set.intersect([
        *   Set([ 'a', 'b', 'c' ])
        *   Set([ 'c', 'a', 't' ])
        * ])
        * // Set [ "a", "c"" ]
        * ```
        */
      @JSImport("nuclear-js", "Immutable.Set.intersect")
      @js.native
      def intersect[T](sets: Iterable[Iterable[T]]): typings.immutable.Immutable.Set[T] = js.native
      
      /**
        * True if the provided value is a Set
        */
      @JSImport("nuclear-js", "Immutable.Set.isSet")
      @js.native
      def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
      
      /**
        * Creates a new Set containing `values`.
        */
      @JSImport("nuclear-js", "Immutable.Set.of")
      @js.native
      def of[T](values: T*): typings.immutable.Immutable.Set[T] = js.native
      
      /**
        * `Set.union()` creates a new immutable Set that is the union of a
        * collection of other sets.
        *
        * ```js
        * const { Set } = require('immutable')
        * const unioned = Set.union([
        *   Set([ 'a', 'b', 'c' ])
        *   Set([ 'c', 'a', 't' ])
        * ])
        * // Set [ "a", "b", "c", "t"" ]
        * ```
        */
      @JSImport("nuclear-js", "Immutable.Set.union")
      @js.native
      def union[T](sets: Iterable[Iterable[T]]): typings.immutable.Immutable.Set[T] = js.native
    }
    
    object Stack {
      
      @JSImport("nuclear-js", "Immutable.Stack")
      @js.native
      def apply(): typings.immutable.Immutable.Stack[_] = js.native
      @JSImport("nuclear-js", "Immutable.Stack")
      @js.native
      def apply[T](collection: Iterable[T]): typings.immutable.Immutable.Stack[T] = js.native
      
      /**
        * True if the provided value is a Stack
        */
      @JSImport("nuclear-js", "Immutable.Stack.isStack")
      @js.native
      def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
      
      /**
        * Creates a new Stack containing `values`.
        */
      @JSImport("nuclear-js", "Immutable.Stack.of")
      @js.native
      def of[T](values: T*): typings.immutable.Immutable.Stack[T] = js.native
    }
    
    @JSImport("nuclear-js", "Immutable.fromJS")
    @js.native
    def fromJS(jsValue: js.Any): js.Any = js.native
    @JSImport("nuclear-js", "Immutable.fromJS")
    @js.native
    def fromJS(
      jsValue: js.Any,
      reviver: js.Function3[
          /* key */ String | Double, 
          /* sequence */ (Keyed[String, _]) | Indexed[_], 
          /* path */ js.UndefOr[js.Array[String | Double]], 
          _
        ]
    ): js.Any = js.native
    
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[V](collection: js.Array[V], key: Double): js.UndefOr[V] = js.native
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = js.native
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = js.native
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = js.native
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[K, V](collection: Collection[K, V], key: K): js.UndefOr[V] = js.native
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[C /* <: js.Object */, K /* <: /* keyof C */ String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = js.native
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[TProps, K /* <: /* keyof TProps */ String */](record: Record[TProps], key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
    @JSImport("nuclear-js", "Immutable.get")
    @js.native
    def get[K, V, NSV](collection: Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
    
    @JSImport("nuclear-js", "Immutable.getIn")
    @js.native
    def getIn(collection: js.Any, keyPath: Iterable[_], notSetValue: js.Any): js.Any = js.native
    
    @JSImport("nuclear-js", "Immutable.has")
    @js.native
    def has(collection: js.Object, key: js.Any): Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.hasIn")
    @js.native
    def hasIn(collection: js.Any, keyPath: Iterable[_]): Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.hash")
    @js.native
    def hash(value: js.Any): Double = js.native
    
    @JSImport("nuclear-js", "Immutable.is")
    @js.native
    def is(first: js.Any, second: js.Any): Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isAssociative")
    @js.native
    def isAssociative(maybeAssociative: js.Any): Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isCollection")
    @js.native
    def isCollection(maybeCollection: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isImmutable")
    @js.native
    def isImmutable(maybeImmutable: js.Any): /* is immutable.Immutable.Collection<any, any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isIndexed")
    @js.native
    def isIndexed(maybeIndexed: js.Any): /* is immutable.Immutable.Collection.Indexed<any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isKeyed")
    @js.native
    def isKeyed(maybeKeyed: js.Any): /* is immutable.Immutable.Collection.Keyed<any, any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isList")
    @js.native
    def isList(maybeList: js.Any): /* is immutable.Immutable.List<any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isMap")
    @js.native
    def isMap(maybeMap: js.Any): /* is immutable.Immutable.Map<any, any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isOrdered")
    @js.native
    def isOrdered(maybeOrdered: js.Any): Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isOrderedMap")
    @js.native
    def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.Immutable.OrderedMap<any, any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isOrderedSet")
    @js.native
    def isOrderedSet(maybeOrderedSet: js.Any): /* is immutable.Immutable.OrderedSet<any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isRecord")
    @js.native
    def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isSeq")
    @js.native
    def isSeq(maybeSeq: js.Any): Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isSet")
    @js.native
    def isSet(maybeSet: js.Any): /* is immutable.Immutable.Set<any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isStack")
    @js.native
    def isStack(maybeStack: js.Any): /* is immutable.Immutable.Stack<any> */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.isValueObject")
    @js.native
    def isValueObject(maybeValue: js.Any): /* is immutable.Immutable.ValueObject */ Boolean = js.native
    
    @JSImport("nuclear-js", "Immutable.merge")
    @js.native
    def merge[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
    
    @JSImport("nuclear-js", "Immutable.mergeDeep")
    @js.native
    def mergeDeep[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
    
    @JSImport("nuclear-js", "Immutable.mergeDeepWith")
    @js.native
    def mergeDeepWith[C](
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
      collection: C,
      collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
    ): C = js.native
    
    @JSImport("nuclear-js", "Immutable.mergeWith")
    @js.native
    def mergeWith[C](
      merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
      collection: C,
      collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
    ): C = js.native
    
    @JSImport("nuclear-js", "Immutable.remove")
    @js.native
    def remove[C /* <: js.Array[_] */](collection: C, key: Double): C = js.native
    @JSImport("nuclear-js", "Immutable.remove")
    @js.native
    def remove[C, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
    
    @JSImport("nuclear-js", "Immutable.removeIn")
    @js.native
    def removeIn[C](collection: C, keyPath: Iterable[_]): C = js.native
    
    @JSImport("nuclear-js", "Immutable.remove")
    @js.native
    def remove_C_StringDictionaryAnyK_String[C /* <: StringDictionary[js.Any] */, K /* <: /* keyof C */ String */](collection: C, key: K): C = js.native
    @JSImport("nuclear-js", "Immutable.remove")
    @js.native
    def remove_KC_CollectionKWildcard[K, C /* <: Collection[K, _] */](collection: C, key: K): C = js.native
    @JSImport("nuclear-js", "Immutable.remove")
    @js.native
    def remove_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](collection: C, key: K): C = js.native
    
    @JSImport("nuclear-js", "Immutable.set")
    @js.native
    def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
    @JSImport("nuclear-js", "Immutable.set")
    @js.native
    def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
    @JSImport("nuclear-js", "Immutable.set")
    @js.native
    def set[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ): C = js.native
    @JSImport("nuclear-js", "Immutable.set")
    @js.native
    def set[K, V, C /* <: Collection[K, V] */](collection: C, key: K, value: V): C = js.native
    
    @JSImport("nuclear-js", "Immutable.setIn")
    @js.native
    def setIn[C](collection: C, keyPath: Iterable[_], value: js.Any): C = js.native
    
    @JSImport("nuclear-js", "Immutable.set")
    @js.native
    def set_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ): C = js.native
    
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update[V, NSV](
      collection: js.Array[V],
      key: Double,
      notSetValue: NSV,
      updater: js.Function1[/* value */ V | NSV, V]
    ): js.Array[V] = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update[C, K /* <: /* keyof C */ String */](
      `object`: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update[C, K /* <: /* keyof C */ String */, NSV](
      `object`: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
        ]
    ): C = js.native
    
    @JSImport("nuclear-js", "Immutable.updateIn")
    @js.native
    def updateIn[C](
      collection: C,
      keyPath: Iterable[_],
      notSetValue: js.Any,
      updater: js.Function1[/* value */ js.Any, _]
    ): C = js.native
    @JSImport("nuclear-js", "Immutable.updateIn")
    @js.native
    def updateIn[C](collection: C, keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
    
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update_KVC_CollectionKV[K, V, C /* <: Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): C = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update_KVC_CollectionKVNSV[K, V, C /* <: Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): C = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */](
      record: C,
      key: K,
      updater: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update_TPropsC_RecordTPropsK_StringNSV[TProps, C /* <: Record[TProps] */, K /* <: /* keyof TProps */ String */, NSV](
      record: C,
      key: K,
      notSetValue: NSV,
      updater: js.Function1[
          /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
          /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
        ]
    ): C = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update_VC_StringDictionaryVK_StringNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = js.native
    @JSImport("nuclear-js", "Immutable.update")
    @js.native
    def update_VC_StringDictionaryVK_String_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: /* keyof C */ String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = js.native
  }
  
  @js.native
  trait Reactor extends StObject {
    
    var ReactMixin: typings.nuclearJs.mod.ReactMixin = js.native
    
    /**
      * Allows multiple dispatches within the `fn` function before notifying
      * any observers.
      */
    def batch(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Dispatches a message to all registered Stores.
      *
      * This process is done synchronously, all registered Stores are passed
      * this message and all components are re-evaluated (efficiently). After
      * a dispatch, a Reactor will emit the new state on the
      * reactor.changeEmitter.
      */
    def dispatch(actionType: String): Unit = js.native
    def dispatch(actionType: String, payload: js.Any): Unit = js.native
    
    /**
      * Returns the immutable value for some KeyPath or Getter in the reactor
      * state.
      *
      * Returns `undefined` if a keyPath doesn't have a value.
      */
    def evaluate(getter: Getter): js.Any = js.native
    
    /**
      * Returns a plain JS value for some KeyPath or Getter in the reactor
      * state.
      *
      * Returns `undefined` if a keyPath doesn't have a value.
      */
    def evaluateToJS(getter: Getter): js.Any = js.native
    
    /**
      * Takes a plain JavaScript object and merges into the reactor state,
      * using `store.deserialize()`.
      *
      * This can be useful if you need to load data already on the page.
      */
    def loadState(state: js.Any): Unit = js.native
    
    /**
      * Adds a change observer that is invoked whenever any dependencies of
      * the getter change.
      *
      * @returns An "unsubscribe" function
      */
    def observe(getter: Getter, handler: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): js.Function0[Unit] = js.native
    /**
      * Adds a change observer that is invoked whenever any part of the
      * reactor state changes.
      */
    def observe(handler: js.Function0[Unit]): js.Function0[Unit] = js.native
    
    var observerState: js.Any = js.native
    
    var prevReactorState: js.Any = js.native
    
    var reactorState: js.Any = js.native
    
    /**
      * Registers stores.
      */
    def registerStores(stores: StringDictionary[Store[_]]): Unit = js.native
    
    /**
      * Replace store implementation (handlers) without modifying the app
      * state or calling `getInitialState`.
      *
      * Useful for hot reloading
      */
    def replaceStores(stores: StringDictionary[Store[_]]): Unit = js.native
    
    /**
      * Resets the state of a reactor and returns it back to initial state.
      */
    def reset(): Unit = js.native
    
    /**
      * Returns a plain JavaScript object representing the application state.
      *
      * By default this maps over all stores and returns `toJS(storeState)`.
      */
    def serialize(): js.Any = js.native
    
    /**
      * Removes the change observer for the getter.
      */
    def unobserve(getter: Getter, handler: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  /**
    * State is stored in NuclearJS Reactors. Reactors contain a `state` object
    * which is an Immutable.Map
    *
    * The only way Reactors can change state is by reacting to messages. To
    * update state, Reactor's dispatch messages to all registered stores, and
    * the store returns it's new state based on the message
    */
  @JSImport("nuclear-js", "Reactor")
  @js.native
  def Reactor(): Reactor = js.native
  @JSImport("nuclear-js", "Reactor")
  @js.native
  def Reactor(config: ReactorConfig): Reactor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("nuclear-js", "Reactor")
  @js.native
  /**
    * State is stored in NuclearJS Reactors. Reactors contain a `state` object
    * which is an Immutable.Map
    *
    * The only way Reactors can change state is by reacting to messages. To
    * update state, Reactor's dispatch messages to all registered stores, and
    * the store returns it's new state based on the message
    */
  class ReactorCls () extends Reactor {
    def this(config: ReactorConfig) = this()
  }
  
  @js.native
  trait Store[T] extends StoreLike[T] {
    
    /**
      * Deserializes plain JavaScript to store state.
      */
    @JSName("deserialize")
    def deserialize_MStore(state: js.Any): T = js.native
    
    /**
      * Takes a current reactor state, action type and payload, does the
      * reaction, and returns the new state.
      */
    def handle(state: T, actionType: String): T = js.native
    def handle(state: T, actionType: String, payload: js.Any): T = js.native
    
    /**
      * Pure function taking the current state of store and returning the new
      * state after a NuclearJS reactor has been reset
      */
    @JSName("handleReset")
    def handleReset_MStore(state: T): T = js.native
    
    /**
      * Binds an action type to a handler.
      */
    def on(actionType: String, handler: js.Function2[/* state */ T, /* payload */ js.UndefOr[js.Any], T]): Unit = js.native
    
    /**
      * Serializes store state to plain JSON serializable JavaScript.
      */
    @JSName("serialize")
    def serialize_MStore(state: T): js.Any = js.native
  }
  /**
    * A Store defines how a certain domain of the application should respond to
    * actions taken on the whole system. They manage their own section of the
    * entire app state and have no knowledge about the other parts of the
    * application state.
    */
  @JSImport("nuclear-js", "Store")
  @js.native
  def Store[T](config: StoreLike[T]): Store[T] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("nuclear-js", "Store")
  @js.native
  class StoreCls[T] protected () extends Store[T] {
    /**
      * A Store defines how a certain domain of the application should respond to
      * actions taken on the whole system. They manage their own section of the
      * entire app state and have no knowledge about the other parts of the
      * application state.
      */
    def this(config: StoreLike[T]) = this()
  }
  
  @JSImport("nuclear-js", "createReactMixin")
  @js.native
  def createReactMixin(reactor: Reactor): ReactMixin = js.native
  
  @JSImport("nuclear-js", "isGetter")
  @js.native
  def isGetter(toTest: js.Any): Boolean = js.native
  
  @JSImport("nuclear-js", "isImmutable")
  @js.native
  def isImmutable(arg: js.Any): Boolean = js.native
  
  @JSImport("nuclear-js", "isKeyPath")
  @js.native
  def isKeyPath(toTest: js.Any): Boolean = js.native
  
  @JSImport("nuclear-js", "toImmutable")
  @js.native
  def toImmutable(arg: js.Any): js.Any = js.native
  
  @JSImport("nuclear-js", "toJS")
  @js.native
  def toJS(arg: js.Any): js.Any = js.native
  
  // Getters have a really complex, recursive type that can't be represented
  // in TypeScript, but at a high level they are all Arrays.
  type Getter = js.Array[js.Any]
  
  @js.native
  trait ReactMixin extends StObject {
    
    def componentDidMount(): Unit = js.native
    
    def componentWillUnmount(): Unit = js.native
    
    def getInitialState(): js.Any = js.native
  }
  object ReactMixin {
    
    @scala.inline
    def apply(componentDidMount: () => Unit, componentWillUnmount: () => Unit, getInitialState: () => js.Any): ReactMixin = {
      val __obj = js.Dynamic.literal(componentDidMount = js.Any.fromFunction0(componentDidMount), componentWillUnmount = js.Any.fromFunction0(componentWillUnmount), getInitialState = js.Any.fromFunction0(getInitialState))
      __obj.asInstanceOf[ReactMixin]
    }
    
    @scala.inline
    implicit class ReactMixinMutableBuilder[Self <: ReactMixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentDidMount(value: () => Unit): Self = StObject.set(x, "componentDidMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComponentWillUnmount(value: () => Unit): Self = StObject.set(x, "componentWillUnmount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInitialState(value: () => js.Any): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ReactorConfig extends StObject {
    
    /** If true it will log the entire app state for every dispatch. */
    var debug: js.UndefOr[Boolean] = js.native
    
    /** Additional options for customizing Reactor behavior. */
    var options: js.UndefOr[LogAppState] = js.native
  }
  object ReactorConfig {
    
    @scala.inline
    def apply(): ReactorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactorConfig]
    }
    
    @scala.inline
    implicit class ReactorConfigMutableBuilder[Self <: ReactorConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setOptions(value: LogAppState): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /**
    * Stores are initialized like:
    *
    * ```
    * new Store({
    *   initialize() { ... },
    *   getInitialState() { ... },
    * })
    * ```
    *
    * This type defines the functions for the object passed to the
    * `new Store()` constructor. In additional, all of these functions are
    * available on the base `Store` object itself.
    */
  @js.native
  trait StoreLike[T] extends StObject {
    
    /**
      * Deserializes plain JavaScript to store state.
      */
    var deserialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T]] = js.native
    
    /**
      * Gets the initial state for this type of store
      */
    def getInitialState(): T = js.native
    
    /**
      * Pure function taking the current state of store and returning the new
      * state after a NuclearJS reactor has been reset
      */
    var handleReset: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, T]] = js.native
    
    /**
      * Sets up message handlers via `this.on` and to set up the initial
      * state.
      */
    def initialize(): Unit = js.native
    
    /**
      * Serializes store state to plain JSON serializable JavaScript.
      */
    var serialize: js.UndefOr[js.ThisFunction1[/* this */ Store[T], /* state */ T, _]] = js.native
  }
  object StoreLike {
    
    @scala.inline
    def apply[T](getInitialState: () => T, initialize: () => Unit): StoreLike[T] = {
      val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), initialize = js.Any.fromFunction0(initialize))
      __obj.asInstanceOf[StoreLike[T]]
    }
    
    @scala.inline
    implicit class StoreLikeMutableBuilder[Self <: StoreLike[_], T] (val x: Self with StoreLike[T]) extends AnyVal {
      
      @scala.inline
      def setDeserialize(value: js.ThisFunction1[/* this */ Store[T], /* state */ js.Any, T]): Self = StObject.set(x, "deserialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      @scala.inline
      def setGetInitialState(value: () => T): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleReset(value: js.ThisFunction1[/* this */ Store[T], /* state */ T, T]): Self = StObject.set(x, "handleReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleResetUndefined: Self = StObject.set(x, "handleReset", js.undefined)
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSerialize(value: js.ThisFunction1[/* this */ Store[T], /* state */ T, _]): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
}
