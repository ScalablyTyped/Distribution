package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.meteor.Meteor.LiveQueryHandle
import typings.meteor.anon.AddToSet
import typings.meteor.anon.And
import typings.meteor.anon.ArrayFilters
import typings.meteor.anon.CaseSensitive
import typings.meteor.anon.Fetch
import typings.meteor.anon.Id
import typings.meteor.anon.IdGeneration
import typings.meteor.anon.InsertedId
import typings.meteor.anon.Multi
import typings.meteor.anon.NonMutatingCallbacks
import typings.meteor.meteorStrings._id
import typings.meteor.meteorStrings.limit
import typings.mongodb.mod.Db
import typings.std.Exclude
import typings.std.Number
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.std.RegExp
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoMod {
  
  object Mongo {
    
    @JSImport("meteor/mongo", "Mongo")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Collection[T, U] extends StObject {
      
      def _dropIndex(keys: String): Unit = js.native
      def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
      
      def _ensureIndex(keys: String): Unit = js.native
      def _ensureIndex(keys: String, options: StringDictionary[js.Any]): Unit = js.native
      def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
      def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[js.Any]): Unit = js.native
      
      def allow[Fn /* <: Transform[T] */](options: Fetch[Fn, T, U]): Boolean = js.native
      
      def deny[Fn /* <: Transform[T] */](options: Fetch[Fn, T, U]): Boolean = js.native
      
      def find(): Cursor[T, U] = js.native
      def find(selector: String): Cursor[T, U] = js.native
      def find(selector: ObjectID): Cursor[T, U] = js.native
      def find(selector: Selector[T]): Cursor[T, U] = js.native
      def find[O /* <: Options[T] */](selector: String, options: O): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      def find[O /* <: Options[T] */](selector: Unit, options: O): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      def find[O /* <: Options[T] */](selector: ObjectID, options: O): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      def find[O /* <: Options[T] */](selector: Selector[T], options: O): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      
      def findOne(): js.UndefOr[U] = js.native
      def findOne(selector: String): js.UndefOr[U] = js.native
      def findOne(selector: ObjectID): js.UndefOr[U] = js.native
      def findOne(selector: Selector[T]): js.UndefOr[U] = js.native
      def findOne[O /* <: Omit[Options[T], limit] */](selector: String, options: O): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      def findOne[O /* <: Omit[Options[T], limit] */](selector: Unit, options: O): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      def findOne[O /* <: Omit[Options[T], limit] */](selector: ObjectID, options: O): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      def findOne[O /* <: Omit[Options[T], limit] */](selector: Selector[T], options: O): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      @JSName("findOne")
      def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      @JSName("findOne")
      def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: String): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      @JSName("findOne")
      def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: ObjectID): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      @JSName("findOne")
      def findOne_O_OmitOptionsTlimit[O /* <: Omit[Options[T], limit] */](selector: Selector[T]): js.UndefOr[
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      
      @JSName("find")
      def find_O_OptionsT[O /* <: Options[T] */](): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      @JSName("find")
      def find_O_OptionsT[O /* <: Options[T] */](selector: String): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      @JSName("find")
      def find_O_OptionsT[O /* <: Options[T] */](selector: ObjectID): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      @JSName("find")
      def find_O_OptionsT[O /* <: Options[T] */](selector: Selector[T]): Cursor[
            T, 
            DispatchTransform[
              /* import warning: importer.ImportType#apply Failed type conversion: O['transform'] */ js.Any, 
              T, 
              U
            ]
          ] = js.native
      
      def insert(doc: OptionalId[T]): String = js.native
      def insert(doc: OptionalId[T], callback: js.Function): String = js.native
      
      def rawCollection(): typings.mongodb.mod.Collection[T] = js.native
      
      def rawDatabase(): Db = js.native
      
      def remove(selector: String): Double = js.native
      def remove(selector: String, callback: js.Function): Double = js.native
      def remove(selector: ObjectID): Double = js.native
      def remove(selector: ObjectID, callback: js.Function): Double = js.native
      def remove(selector: Selector[T]): Double = js.native
      def remove(selector: Selector[T], callback: js.Function): Double = js.native
      
      def update(selector: String, modifier: Modifier[T]): Double = js.native
      def update(selector: String, modifier: Modifier[T], options: Unit, callback: js.Function): Double = js.native
      def update(selector: String, modifier: Modifier[T], options: ArrayFilters): Double = js.native
      def update(selector: String, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[T]): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[T], options: Unit, callback: js.Function): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[T]): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[T], options: Unit, callback: js.Function): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[T], options: ArrayFilters, callback: js.Function): Double = js.native
      
      def upsert(selector: String, modifier: Modifier[T]): InsertedId = js.native
      def upsert(selector: String, modifier: Modifier[T], options: Unit, callback: js.Function): InsertedId = js.native
      def upsert(selector: String, modifier: Modifier[T], options: Multi): InsertedId = js.native
      def upsert(selector: String, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[T]): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[T], options: Unit, callback: js.Function): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[T]): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[T], options: Unit, callback: js.Function): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[T], options: Multi, callback: js.Function): InsertedId = js.native
    }
    @JSImport("meteor/mongo", "Mongo.Collection")
    @js.native
    def Collection: CollectionStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/mongo", "Mongo.Collection")
    @js.native
    class CollectionCls[T, U] ()
      extends StObject
         with Collection[T, U] {
      def this(name: String) = this()
      def this(name: String, options: IdGeneration[T, U]) = this()
      def this(name: Null, options: IdGeneration[T, U]) = this()
    }
    
    inline def Collection_=(x: CollectionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    @js.native
    trait Cursor[T, U] extends StObject {
      
      def count(): Double = js.native
      def count(applySkipLimit: Boolean): Double = js.native
      
      def fetch(): js.Array[U] = js.native
      
      def forEach(callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], Unit]): Unit = js.native
      def forEach(
        callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], Unit],
        thisArg: js.Any
      ): Unit = js.native
      
      def map[M](callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], M]): js.Array[M] = js.native
      def map[M](
        callback: js.Function3[/* doc */ U, /* index */ Double, /* cursor */ Cursor[T, U], M],
        thisArg: js.Any
      ): js.Array[M] = js.native
      
      def observe(callbacks: ObserveCallbacks[U]): LiveQueryHandle = js.native
      
      def observeChanges(callbacks: ObserveChangesCallbacks[T]): LiveQueryHandle = js.native
      def observeChanges(callbacks: ObserveChangesCallbacks[T], options: NonMutatingCallbacks): LiveQueryHandle = js.native
    }
    @JSImport("meteor/mongo", "Mongo.Cursor")
    @js.native
    def Cursor: CursorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/mongo", "Mongo.Cursor")
    @js.native
    class CursorCls[T, U] ()
      extends StObject
         with Cursor[T, U]
    
    inline def Cursor_=(x: CursorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cursor")(x.asInstanceOf[js.Any])
    
    trait ObjectID extends StObject {
      
      def equals(otherID: ObjectID): Boolean
      
      def toHexString(): String
    }
    object ObjectID {
      
      @JSImport("meteor/mongo", "Mongo.ObjectID")
      @js.native
      val ^ : ObjectIDStatic = js.native
      
      extension [Self <: ObjectID](x: Self) {
        
        inline def setEquals_(value: ObjectID => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
        
        inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
      }
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/mongo", "Mongo.ObjectID")
    @js.native
    class ObjectIDCls ()
      extends StObject
         with ObjectID {
      def this(hexString: String) = this()
      
      /* CompleteClass */
      override def equals(otherID: ObjectID): Boolean = js.native
      
      /* CompleteClass */
      override def toHexString(): String = js.native
    }
    
    inline def setConnectionOptions(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConnectionOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    trait AllowDenyOptions extends StObject {
      
      var fetch: js.UndefOr[js.Array[String]] = js.undefined
      
      var insert: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.undefined
      
      var remove: js.UndefOr[js.Function2[/* userId */ String, /* doc */ js.Any, Boolean]] = js.undefined
      
      var transform: js.UndefOr[js.Function | Null] = js.undefined
      
      var update: js.UndefOr[
            js.Function4[
              /* userId */ String, 
              /* doc */ js.Any, 
              /* fieldNames */ js.Array[String], 
              /* modifier */ js.Any, 
              Boolean
            ]
          ] = js.undefined
    }
    object AllowDenyOptions {
      
      inline def apply(): AllowDenyOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AllowDenyOptions]
      }
      
      extension [Self <: AllowDenyOptions](x: Self) {
        
        inline def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
        
        inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
        
        inline def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value :_*))
        
        inline def setInsert(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
        
        inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
        
        inline def setRemove(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
        
        inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
        
        inline def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        inline def setTransformNull: Self = StObject.set(x, "transform", null)
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
        
        inline def setUpdate(
          value: (/* userId */ String, /* doc */ js.Any, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
        ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
        
        inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      }
    }
    
    type ArraysOrEach[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each :T[P]}}
      */ typings.meteor.meteorStrings.ArraysOrEach & TopLevel[js.Any]
    
    /* Rewritten from type alias, can be one of: 
      - typings.meteor.meteorNumbers.`1`
      - typings.meteor.meteorNumbers.`2`
      - typings.meteor.meteorNumbers.`3`
      - typings.meteor.meteorNumbers.`4`
      - typings.meteor.meteorNumbers.`5`
      - typings.meteor.meteorNumbers.`6`
      - typings.meteor.meteorNumbers.`7`
      - typings.meteor.meteorNumbers.`8`
      - typings.meteor.meteorNumbers.`9`
      - typings.meteor.meteorNumbers.`10`
      - typings.meteor.meteorNumbers.`11`
      - typings.meteor.meteorNumbers.`12`
      - typings.meteor.meteorNumbers.`13`
      - typings.meteor.meteorNumbers.`14`
      - typings.meteor.meteorNumbers.`15`
      - typings.meteor.meteorNumbers.`16`
      - typings.meteor.meteorNumbers.`17`
      - typings.meteor.meteorNumbers.`18`
      - typings.meteor.meteorNumbers.`19`
      - typings.meteor.meteorNumbers.`-1`
      - typings.meteor.meteorNumbers.`127`
      - typings.meteor.meteorStrings.double
      - typings.meteor.meteorStrings.string
      - typings.meteor.meteorStrings.`object`
      - typings.meteor.meteorStrings.array
      - typings.meteor.meteorStrings.binData
      - typings.meteor.meteorStrings.undefined
      - typings.meteor.meteorStrings.objectId
      - typings.meteor.meteorStrings.bool
      - typings.meteor.meteorStrings.date
      - typings.meteor.meteorStrings.`null`
      - typings.meteor.meteorStrings.regex
      - typings.meteor.meteorStrings.dbPointer
      - typings.meteor.meteorStrings.javascript
      - typings.meteor.meteorStrings.symbol
      - typings.meteor.meteorStrings.javascriptWithScope
      - typings.meteor.meteorStrings.int
      - typings.meteor.meteorStrings.timestamp
      - typings.meteor.meteorStrings.long
      - typings.meteor.meteorStrings.decimal
      - typings.meteor.meteorStrings.minKey
      - typings.meteor.meteorStrings.maxKey
      - typings.meteor.meteorStrings.number
    */
    trait BsonType extends StObject
    object BsonType {
      
      inline def `-1`: typings.meteor.meteorNumbers.`-1` = -1.asInstanceOf[typings.meteor.meteorNumbers.`-1`]
      
      inline def `1`: typings.meteor.meteorNumbers.`1` = 1.asInstanceOf[typings.meteor.meteorNumbers.`1`]
      
      inline def `10`: typings.meteor.meteorNumbers.`10` = 10.asInstanceOf[typings.meteor.meteorNumbers.`10`]
      
      inline def `11`: typings.meteor.meteorNumbers.`11` = 11.asInstanceOf[typings.meteor.meteorNumbers.`11`]
      
      inline def `12`: typings.meteor.meteorNumbers.`12` = 12.asInstanceOf[typings.meteor.meteorNumbers.`12`]
      
      inline def `127`: typings.meteor.meteorNumbers.`127` = 127.asInstanceOf[typings.meteor.meteorNumbers.`127`]
      
      inline def `13`: typings.meteor.meteorNumbers.`13` = 13.asInstanceOf[typings.meteor.meteorNumbers.`13`]
      
      inline def `14`: typings.meteor.meteorNumbers.`14` = 14.asInstanceOf[typings.meteor.meteorNumbers.`14`]
      
      inline def `15`: typings.meteor.meteorNumbers.`15` = 15.asInstanceOf[typings.meteor.meteorNumbers.`15`]
      
      inline def `16`: typings.meteor.meteorNumbers.`16` = 16.asInstanceOf[typings.meteor.meteorNumbers.`16`]
      
      inline def `17`: typings.meteor.meteorNumbers.`17` = 17.asInstanceOf[typings.meteor.meteorNumbers.`17`]
      
      inline def `18`: typings.meteor.meteorNumbers.`18` = 18.asInstanceOf[typings.meteor.meteorNumbers.`18`]
      
      inline def `19`: typings.meteor.meteorNumbers.`19` = 19.asInstanceOf[typings.meteor.meteorNumbers.`19`]
      
      inline def `2`: typings.meteor.meteorNumbers.`2` = 2.asInstanceOf[typings.meteor.meteorNumbers.`2`]
      
      inline def `3`: typings.meteor.meteorNumbers.`3` = 3.asInstanceOf[typings.meteor.meteorNumbers.`3`]
      
      inline def `4`: typings.meteor.meteorNumbers.`4` = 4.asInstanceOf[typings.meteor.meteorNumbers.`4`]
      
      inline def `5`: typings.meteor.meteorNumbers.`5` = 5.asInstanceOf[typings.meteor.meteorNumbers.`5`]
      
      inline def `6`: typings.meteor.meteorNumbers.`6` = 6.asInstanceOf[typings.meteor.meteorNumbers.`6`]
      
      inline def `7`: typings.meteor.meteorNumbers.`7` = 7.asInstanceOf[typings.meteor.meteorNumbers.`7`]
      
      inline def `8`: typings.meteor.meteorNumbers.`8` = 8.asInstanceOf[typings.meteor.meteorNumbers.`8`]
      
      inline def `9`: typings.meteor.meteorNumbers.`9` = 9.asInstanceOf[typings.meteor.meteorNumbers.`9`]
      
      inline def array: typings.meteor.meteorStrings.array = "array".asInstanceOf[typings.meteor.meteorStrings.array]
      
      inline def binData: typings.meteor.meteorStrings.binData = "binData".asInstanceOf[typings.meteor.meteorStrings.binData]
      
      inline def bool: typings.meteor.meteorStrings.bool = "bool".asInstanceOf[typings.meteor.meteorStrings.bool]
      
      inline def date: typings.meteor.meteorStrings.date = "date".asInstanceOf[typings.meteor.meteorStrings.date]
      
      inline def dbPointer: typings.meteor.meteorStrings.dbPointer = "dbPointer".asInstanceOf[typings.meteor.meteorStrings.dbPointer]
      
      inline def decimal: typings.meteor.meteorStrings.decimal = "decimal".asInstanceOf[typings.meteor.meteorStrings.decimal]
      
      inline def double: typings.meteor.meteorStrings.double = "double".asInstanceOf[typings.meteor.meteorStrings.double]
      
      inline def int: typings.meteor.meteorStrings.int = "int".asInstanceOf[typings.meteor.meteorStrings.int]
      
      inline def javascript: typings.meteor.meteorStrings.javascript = "javascript".asInstanceOf[typings.meteor.meteorStrings.javascript]
      
      inline def javascriptWithScope: typings.meteor.meteorStrings.javascriptWithScope = "javascriptWithScope".asInstanceOf[typings.meteor.meteorStrings.javascriptWithScope]
      
      inline def long: typings.meteor.meteorStrings.long = "long".asInstanceOf[typings.meteor.meteorStrings.long]
      
      inline def maxKey: typings.meteor.meteorStrings.maxKey = "maxKey".asInstanceOf[typings.meteor.meteorStrings.maxKey]
      
      inline def minKey: typings.meteor.meteorStrings.minKey = "minKey".asInstanceOf[typings.meteor.meteorStrings.minKey]
      
      inline def `null`: typings.meteor.meteorStrings.`null` = "null".asInstanceOf[typings.meteor.meteorStrings.`null`]
      
      inline def number: typings.meteor.meteorStrings.number = "number".asInstanceOf[typings.meteor.meteorStrings.number]
      
      inline def `object`: typings.meteor.meteorStrings.`object` = "object".asInstanceOf[typings.meteor.meteorStrings.`object`]
      
      inline def objectId: typings.meteor.meteorStrings.objectId = "objectId".asInstanceOf[typings.meteor.meteorStrings.objectId]
      
      inline def regex: typings.meteor.meteorStrings.regex = "regex".asInstanceOf[typings.meteor.meteorStrings.regex]
      
      inline def string: typings.meteor.meteorStrings.string = "string".asInstanceOf[typings.meteor.meteorStrings.string]
      
      inline def symbol: typings.meteor.meteorStrings.symbol = "symbol".asInstanceOf[typings.meteor.meteorStrings.symbol]
      
      inline def timestamp: typings.meteor.meteorStrings.timestamp = "timestamp".asInstanceOf[typings.meteor.meteorStrings.timestamp]
      
      inline def undefined: typings.meteor.meteorStrings.undefined = "undefined".asInstanceOf[typings.meteor.meteorStrings.undefined]
    }
    
    @js.native
    trait CollectionStatic
      extends StObject
         with Instantiable0[Collection[js.Object, js.Object]]
         with Instantiable1[/* name */ String, Collection[js.Object, js.Object]]
         with Instantiable2[
              (/* name */ Null) | (/* name */ String), 
              /* options */ IdGeneration[js.Object, js.Object], 
              Collection[js.Object, js.Object]
            ]
    
    /* Rewritten from type alias, can be one of: 
      - typings.meteor.anon.Type
      - typings.meteor.meteorBooleans.`true`
    */
    trait CurrentDateModifier extends StObject
    
    @js.native
    trait CursorStatic
      extends StObject
         with Instantiable0[Cursor[js.Object, js.Object]]
    
    type Dictionary[T] = StringDictionary[T]
    
    type DispatchTransform[Transform, T, U] = U | T | ReturnType[Transform]
    
    type ElementsOf[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]>}
      */ typings.meteor.meteorStrings.ElementsOf & TopLevel[T]
    
    trait FieldExpression[T] extends StObject {
      
      @JSName("$all")
      var $all: js.UndefOr[js.Array[T]] = js.undefined
      
      @JSName("$bitsAllClear")
      var $bitsAllClear: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$bitsAllSet")
      var $bitsAllSet: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$bitsAnyClear")
      var $bitsAnyClear: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$bitsAnySet")
      var $bitsAnySet: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$comment")
      var $comment: js.UndefOr[String] = js.undefined
      
      @JSName("$elemMatch")
      var $elemMatch: js.UndefOr[FieldExpression[T] | Query[T]] = js.undefined
      
      @JSName("$eq")
      var $eq: js.UndefOr[T] = js.undefined
      
      @JSName("$exists")
      var $exists: js.UndefOr[Boolean] = js.undefined
      
      @JSName("$expr")
      var $expr: js.UndefOr[FieldExpression[T]] = js.undefined
      
      @JSName("$geoIntersects")
      var $geoIntersects: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$geoWithin")
      var $geoWithin: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$gt")
      var $gt: js.UndefOr[T] = js.undefined
      
      @JSName("$gte")
      var $gte: js.UndefOr[T] = js.undefined
      
      @JSName("$in")
      var $in: js.UndefOr[js.Array[T]] = js.undefined
      
      @JSName("$jsonSchema")
      var $jsonSchema: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$lt")
      var $lt: js.UndefOr[T] = js.undefined
      
      @JSName("$lte")
      var $lte: js.UndefOr[T] = js.undefined
      
      @JSName("$mod")
      var $mod: js.UndefOr[js.Array[Double]] = js.undefined
      
      @JSName("$ne")
      var $ne: js.UndefOr[T] = js.undefined
      
      @JSName("$near")
      var $near: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$nearSphere")
      var $nearSphere: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$nin")
      var $nin: js.UndefOr[js.Array[T]] = js.undefined
      
      @JSName("$not")
      var $not: js.UndefOr[FieldExpression[T]] = js.undefined
      
      @JSName("$options")
      var $options: js.UndefOr[String] = js.undefined
      
      @JSName("$regex")
      var $regex: js.UndefOr[RegExp | String] = js.undefined
      
      @JSName("$size")
      var $size: js.UndefOr[Double] = js.undefined
      
      @JSName("$text")
      var $text: js.UndefOr[CaseSensitive] = js.undefined
      
      @JSName("$type")
      var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.undefined
      
      @JSName("$where")
      var $where: js.UndefOr[String | js.Function] = js.undefined
    }
    object FieldExpression {
      
      inline def apply[T](): FieldExpression[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FieldExpression[T]]
      }
      
      extension [Self <: FieldExpression[?], T](x: Self & FieldExpression[T]) {
        
        inline def set$all(value: js.Array[T]): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
        
        inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
        
        inline def set$allVarargs(value: T*): Self = StObject.set(x, "$all", js.Array(value :_*))
        
        inline def set$bitsAllClear(value: js.Any): Self = StObject.set(x, "$bitsAllClear", value.asInstanceOf[js.Any])
        
        inline def set$bitsAllClearUndefined: Self = StObject.set(x, "$bitsAllClear", js.undefined)
        
        inline def set$bitsAllSet(value: js.Any): Self = StObject.set(x, "$bitsAllSet", value.asInstanceOf[js.Any])
        
        inline def set$bitsAllSetUndefined: Self = StObject.set(x, "$bitsAllSet", js.undefined)
        
        inline def set$bitsAnyClear(value: js.Any): Self = StObject.set(x, "$bitsAnyClear", value.asInstanceOf[js.Any])
        
        inline def set$bitsAnyClearUndefined: Self = StObject.set(x, "$bitsAnyClear", js.undefined)
        
        inline def set$bitsAnySet(value: js.Any): Self = StObject.set(x, "$bitsAnySet", value.asInstanceOf[js.Any])
        
        inline def set$bitsAnySetUndefined: Self = StObject.set(x, "$bitsAnySet", js.undefined)
        
        inline def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
        
        inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
        
        inline def set$elemMatch(value: FieldExpression[T] | Query[T]): Self = StObject.set(x, "$elemMatch", value.asInstanceOf[js.Any])
        
        inline def set$elemMatchUndefined: Self = StObject.set(x, "$elemMatch", js.undefined)
        
        inline def set$eq(value: T): Self = StObject.set(x, "$eq", value.asInstanceOf[js.Any])
        
        inline def set$eqUndefined: Self = StObject.set(x, "$eq", js.undefined)
        
        inline def set$exists(value: Boolean): Self = StObject.set(x, "$exists", value.asInstanceOf[js.Any])
        
        inline def set$existsUndefined: Self = StObject.set(x, "$exists", js.undefined)
        
        inline def set$expr(value: FieldExpression[T]): Self = StObject.set(x, "$expr", value.asInstanceOf[js.Any])
        
        inline def set$exprUndefined: Self = StObject.set(x, "$expr", js.undefined)
        
        inline def set$geoIntersects(value: js.Any): Self = StObject.set(x, "$geoIntersects", value.asInstanceOf[js.Any])
        
        inline def set$geoIntersectsUndefined: Self = StObject.set(x, "$geoIntersects", js.undefined)
        
        inline def set$geoWithin(value: js.Any): Self = StObject.set(x, "$geoWithin", value.asInstanceOf[js.Any])
        
        inline def set$geoWithinUndefined: Self = StObject.set(x, "$geoWithin", js.undefined)
        
        inline def set$gt(value: T): Self = StObject.set(x, "$gt", value.asInstanceOf[js.Any])
        
        inline def set$gtUndefined: Self = StObject.set(x, "$gt", js.undefined)
        
        inline def set$gte(value: T): Self = StObject.set(x, "$gte", value.asInstanceOf[js.Any])
        
        inline def set$gteUndefined: Self = StObject.set(x, "$gte", js.undefined)
        
        inline def set$in(value: js.Array[T]): Self = StObject.set(x, "$in", value.asInstanceOf[js.Any])
        
        inline def set$inUndefined: Self = StObject.set(x, "$in", js.undefined)
        
        inline def set$inVarargs(value: T*): Self = StObject.set(x, "$in", js.Array(value :_*))
        
        inline def set$jsonSchema(value: js.Any): Self = StObject.set(x, "$jsonSchema", value.asInstanceOf[js.Any])
        
        inline def set$jsonSchemaUndefined: Self = StObject.set(x, "$jsonSchema", js.undefined)
        
        inline def set$lt(value: T): Self = StObject.set(x, "$lt", value.asInstanceOf[js.Any])
        
        inline def set$ltUndefined: Self = StObject.set(x, "$lt", js.undefined)
        
        inline def set$lte(value: T): Self = StObject.set(x, "$lte", value.asInstanceOf[js.Any])
        
        inline def set$lteUndefined: Self = StObject.set(x, "$lte", js.undefined)
        
        inline def set$mod(value: js.Array[Double]): Self = StObject.set(x, "$mod", value.asInstanceOf[js.Any])
        
        inline def set$modUndefined: Self = StObject.set(x, "$mod", js.undefined)
        
        inline def set$modVarargs(value: Double*): Self = StObject.set(x, "$mod", js.Array(value :_*))
        
        inline def set$ne(value: T): Self = StObject.set(x, "$ne", value.asInstanceOf[js.Any])
        
        inline def set$neUndefined: Self = StObject.set(x, "$ne", js.undefined)
        
        inline def set$near(value: js.Any): Self = StObject.set(x, "$near", value.asInstanceOf[js.Any])
        
        inline def set$nearSphere(value: js.Any): Self = StObject.set(x, "$nearSphere", value.asInstanceOf[js.Any])
        
        inline def set$nearSphereUndefined: Self = StObject.set(x, "$nearSphere", js.undefined)
        
        inline def set$nearUndefined: Self = StObject.set(x, "$near", js.undefined)
        
        inline def set$nin(value: js.Array[T]): Self = StObject.set(x, "$nin", value.asInstanceOf[js.Any])
        
        inline def set$ninUndefined: Self = StObject.set(x, "$nin", js.undefined)
        
        inline def set$ninVarargs(value: T*): Self = StObject.set(x, "$nin", js.Array(value :_*))
        
        inline def set$not(value: FieldExpression[T]): Self = StObject.set(x, "$not", value.asInstanceOf[js.Any])
        
        inline def set$notUndefined: Self = StObject.set(x, "$not", js.undefined)
        
        inline def set$options(value: String): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
        
        inline def set$optionsUndefined: Self = StObject.set(x, "$options", js.undefined)
        
        inline def set$regex(value: RegExp | String): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
        
        inline def set$regexUndefined: Self = StObject.set(x, "$regex", js.undefined)
        
        inline def set$size(value: Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
        
        inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
        
        inline def set$text(value: CaseSensitive): Self = StObject.set(x, "$text", value.asInstanceOf[js.Any])
        
        inline def set$textUndefined: Self = StObject.set(x, "$text", js.undefined)
        
        inline def set$type(value: js.Array[BsonType] | BsonType): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
        
        inline def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
        
        inline def set$typeVarargs(value: BsonType*): Self = StObject.set(x, "$type", js.Array(value :_*))
        
        inline def set$where(value: String | js.Function): Self = StObject.set(x, "$where", value.asInstanceOf[js.Any])
        
        inline def set$whereUndefined: Self = StObject.set(x, "$where", js.undefined)
      }
    }
    
    type FieldSpecifier = StringDictionary[Number]
    
    type Flatten[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
    
    type Modifier[T] = T | AddToSet[T]
    
    @js.native
    trait ObjectIDStatic
      extends StObject
         with Instantiable0[ObjectID]
         with Instantiable1[/* hexString */ String, ObjectID]
    
    trait ObserveCallbacks[T] extends StObject {
      
      var added: js.UndefOr[js.Function1[/* document */ T, Unit]] = js.undefined
      
      var addedAt: js.UndefOr[
            js.Function3[/* document */ T, /* atIndex */ Double, /* before */ T | Null, Unit]
          ] = js.undefined
      
      var changed: js.UndefOr[js.Function2[/* newDocument */ T, /* oldDocument */ T, Unit]] = js.undefined
      
      var changedAt: js.UndefOr[
            js.Function3[/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double, Unit]
          ] = js.undefined
      
      var movedTo: js.UndefOr[
            js.Function4[
              /* document */ T, 
              /* fromIndex */ Double, 
              /* toIndex */ Double, 
              /* before */ T | Null, 
              Unit
            ]
          ] = js.undefined
      
      var removed: js.UndefOr[js.Function1[/* oldDocument */ T, Unit]] = js.undefined
      
      var removedAt: js.UndefOr[js.Function2[/* oldDocument */ T, /* atIndex */ Double, Unit]] = js.undefined
    }
    object ObserveCallbacks {
      
      inline def apply[T](): ObserveCallbacks[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ObserveCallbacks[T]]
      }
      
      extension [Self <: ObserveCallbacks[?], T](x: Self & ObserveCallbacks[T]) {
        
        inline def setAdded(value: /* document */ T => Unit): Self = StObject.set(x, "added", js.Any.fromFunction1(value))
        
        inline def setAddedAt(value: (/* document */ T, /* atIndex */ Double, /* before */ T | Null) => Unit): Self = StObject.set(x, "addedAt", js.Any.fromFunction3(value))
        
        inline def setAddedAtUndefined: Self = StObject.set(x, "addedAt", js.undefined)
        
        inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
        
        inline def setChanged(value: (/* newDocument */ T, /* oldDocument */ T) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction2(value))
        
        inline def setChangedAt(value: (/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double) => Unit): Self = StObject.set(x, "changedAt", js.Any.fromFunction3(value))
        
        inline def setChangedAtUndefined: Self = StObject.set(x, "changedAt", js.undefined)
        
        inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
        
        inline def setMovedTo(
          value: (/* document */ T, /* fromIndex */ Double, /* toIndex */ Double, /* before */ T | Null) => Unit
        ): Self = StObject.set(x, "movedTo", js.Any.fromFunction4(value))
        
        inline def setMovedToUndefined: Self = StObject.set(x, "movedTo", js.undefined)
        
        inline def setRemoved(value: /* oldDocument */ T => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
        
        inline def setRemovedAt(value: (/* oldDocument */ T, /* atIndex */ Double) => Unit): Self = StObject.set(x, "removedAt", js.Any.fromFunction2(value))
        
        inline def setRemovedAtUndefined: Self = StObject.set(x, "removedAt", js.undefined)
        
        inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      }
    }
    
    trait ObserveChangesCallbacks[T] extends StObject {
      
      var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.undefined
      
      var addedBefore: js.UndefOr[
            js.Function3[/* id */ String, /* fields */ Partial[T], /* before */ T | Null, Unit]
          ] = js.undefined
      
      var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ Partial[T], Unit]] = js.undefined
      
      var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ T | Null, Unit]] = js.undefined
      
      var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    }
    object ObserveChangesCallbacks {
      
      inline def apply[T](): ObserveChangesCallbacks[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ObserveChangesCallbacks[T]]
      }
      
      extension [Self <: ObserveChangesCallbacks[?], T](x: Self & ObserveChangesCallbacks[T]) {
        
        inline def setAdded(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self = StObject.set(x, "added", js.Any.fromFunction2(value))
        
        inline def setAddedBefore(value: (/* id */ String, /* fields */ Partial[T], /* before */ T | Null) => Unit): Self = StObject.set(x, "addedBefore", js.Any.fromFunction3(value))
        
        inline def setAddedBeforeUndefined: Self = StObject.set(x, "addedBefore", js.undefined)
        
        inline def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
        
        inline def setChanged(value: (/* id */ String, /* fields */ Partial[T]) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction2(value))
        
        inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
        
        inline def setMovedBefore(value: (/* id */ String, /* before */ T | Null) => Unit): Self = StObject.set(x, "movedBefore", js.Any.fromFunction2(value))
        
        inline def setMovedBeforeUndefined: Self = StObject.set(x, "movedBefore", js.undefined)
        
        inline def setRemoved(value: /* id */ String => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
        
        inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      }
    }
    
    type OnlyArrays[T] = T
    
    type OnlyElementsOfArrays[T] = Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ]
    
    type OptionalId[TSchema] = (typings.meteor.mongoMod.UnionOmit[TSchema, _id]) & Id
    
    trait Options[T] extends StObject {
      
      var fields: js.UndefOr[FieldSpecifier] = js.undefined
      
      var limit: js.UndefOr[Double] = js.undefined
      
      var reactive: js.UndefOr[Boolean] = js.undefined
      
      var skip: js.UndefOr[Double] = js.undefined
      
      var sort: js.UndefOr[SortSpecifier] = js.undefined
      
      var transform: js.UndefOr[Transform[T]] = js.undefined
    }
    object Options {
      
      inline def apply[T](): Options[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options[T]]
      }
      
      extension [Self <: Options[?], T](x: Self & Options[T]) {
        
        inline def setFields(value: FieldSpecifier): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setReactive(value: Boolean): Self = StObject.set(x, "reactive", value.asInstanceOf[js.Any])
        
        inline def setReactiveUndefined: Self = StObject.set(x, "reactive", js.undefined)
        
        inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        inline def setSort(value: SortSpecifier): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
        
        inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        inline def setTransform(value: T => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
        
        inline def setTransformNull: Self = StObject.set(x, "transform", null)
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
    
    type PartialMapTo[T, M] = Partial[Record[/* keyof T */ String, M]]
    
    type PushModifier[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each :T[P] | undefined,   $position :number | undefined,   $slice :number | undefined,   $sort :1 | -1 | meteor.meteor/mongo.Mongo.Dictionary<number> | undefined}}
      */ typings.meteor.meteorStrings.PushModifier & TopLevel[js.Any]
    
    type Query[T] = typings.meteor.meteorStrings.Query & TopLevel[js.Any] & And & Dictionary[js.Any]
    
    trait QueryWithModifiers[T] extends StObject {
      
      @JSName("$comment")
      var $comment: js.UndefOr[String] = js.undefined
      
      @JSName("$explain")
      var $explain: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$hint")
      var $hint: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$max")
      var $max: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$maxScan")
      var $maxScan: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$maxTimeMS")
      var $maxTimeMS: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$min")
      var $min: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$natural")
      var $natural: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$orderby")
      var $orderby: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$query")
      var $query: Query[T]
      
      @JSName("$returnKey")
      var $returnKey: js.UndefOr[js.Any] = js.undefined
      
      @JSName("$showDiskLoc")
      var $showDiskLoc: js.UndefOr[js.Any] = js.undefined
    }
    object QueryWithModifiers {
      
      inline def apply[T]($query: Query[T]): QueryWithModifiers[T] = {
        val __obj = js.Dynamic.literal($query = $query.asInstanceOf[js.Any])
        __obj.asInstanceOf[QueryWithModifiers[T]]
      }
      
      extension [Self <: QueryWithModifiers[?], T](x: Self & QueryWithModifiers[T]) {
        
        inline def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
        
        inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
        
        inline def set$explain(value: js.Any): Self = StObject.set(x, "$explain", value.asInstanceOf[js.Any])
        
        inline def set$explainUndefined: Self = StObject.set(x, "$explain", js.undefined)
        
        inline def set$hint(value: js.Any): Self = StObject.set(x, "$hint", value.asInstanceOf[js.Any])
        
        inline def set$hintUndefined: Self = StObject.set(x, "$hint", js.undefined)
        
        inline def set$max(value: js.Any): Self = StObject.set(x, "$max", value.asInstanceOf[js.Any])
        
        inline def set$maxScan(value: js.Any): Self = StObject.set(x, "$maxScan", value.asInstanceOf[js.Any])
        
        inline def set$maxScanUndefined: Self = StObject.set(x, "$maxScan", js.undefined)
        
        inline def set$maxTimeMS(value: js.Any): Self = StObject.set(x, "$maxTimeMS", value.asInstanceOf[js.Any])
        
        inline def set$maxTimeMSUndefined: Self = StObject.set(x, "$maxTimeMS", js.undefined)
        
        inline def set$maxUndefined: Self = StObject.set(x, "$max", js.undefined)
        
        inline def set$min(value: js.Any): Self = StObject.set(x, "$min", value.asInstanceOf[js.Any])
        
        inline def set$minUndefined: Self = StObject.set(x, "$min", js.undefined)
        
        inline def set$natural(value: js.Any): Self = StObject.set(x, "$natural", value.asInstanceOf[js.Any])
        
        inline def set$naturalUndefined: Self = StObject.set(x, "$natural", js.undefined)
        
        inline def set$orderby(value: js.Any): Self = StObject.set(x, "$orderby", value.asInstanceOf[js.Any])
        
        inline def set$orderbyUndefined: Self = StObject.set(x, "$orderby", js.undefined)
        
        inline def set$query(value: Query[T]): Self = StObject.set(x, "$query", value.asInstanceOf[js.Any])
        
        inline def set$returnKey(value: js.Any): Self = StObject.set(x, "$returnKey", value.asInstanceOf[js.Any])
        
        inline def set$returnKeyUndefined: Self = StObject.set(x, "$returnKey", js.undefined)
        
        inline def set$showDiskLoc(value: js.Any): Self = StObject.set(x, "$showDiskLoc", value.asInstanceOf[js.Any])
        
        inline def set$showDiskLocUndefined: Self = StObject.set(x, "$showDiskLoc", js.undefined)
      }
    }
    
    type Selector[T] = Query[T] | QueryWithModifiers[T]
    
    trait SortSpecifier extends StObject
    
    type Transform[T] = js.UndefOr[(js.Function1[/* doc */ T, js.Any]) | Null]
  }
  
  // Based on https://github.com/microsoft/TypeScript/issues/28791#issuecomment-443520161
  type UnionOmit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
