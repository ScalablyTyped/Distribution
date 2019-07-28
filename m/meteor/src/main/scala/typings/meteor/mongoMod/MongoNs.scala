package typings.meteor.mongoMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Anon_01
import typings.meteor.Anon_And
import typings.meteor.Anon_CaseSensitive
import typings.meteor.Anon_Connection
import typings.meteor.Anon_Doc
import typings.meteor.Anon_FieldsLimit
import typings.meteor.Anon_FieldsReactiveSkip
import typings.meteor.Anon_InsertedId
import typings.meteor.Anon_Multi
import typings.meteor.Anon_MultiBoolean
import typings.meteor.MeteorNs.LiveQueryHandle
import typings.meteor.mongoMod.MongoNs.BsonType
import typings.meteor.mongoMod.MongoNs.Collection
import typings.meteor.mongoMod.MongoNs.CollectionStatic
import typings.meteor.mongoMod.MongoNs.Cursor
import typings.meteor.mongoMod.MongoNs.CursorStatic
import typings.meteor.mongoMod.MongoNs.Dictionary
import typings.meteor.mongoMod.MongoNs.FieldExpression
import typings.meteor.mongoMod.MongoNs.Modifier
import typings.meteor.mongoMod.MongoNs.ObjectID
import typings.meteor.mongoMod.MongoNs.ObjectIDStatic
import typings.meteor.mongoMod.MongoNs.ObserveCallbacks
import typings.meteor.mongoMod.MongoNs.ObserveChangesCallbacks
import typings.meteor.mongoMod.MongoNs.Query
import typings.meteor.mongoMod.MongoNs.QueryWithModifiers
import typings.meteor.mongoMod.MongoNs.Selector
import typings.std.Number
import typings.std.Partial
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/mongo", "Mongo")
@js.native
object MongoNs extends js.Object {
  trait AllowDenyOptions extends js.Object {
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteor.meteorNumbers.`1`
    - typings.meteor.meteorStrings.double
    - typings.meteor.meteorNumbers.`2`
    - typings.meteor.meteorStrings.string
    - typings.meteor.meteorNumbers.`3`
    - typings.meteor.meteorStrings.`object`
    - typings.meteor.meteorNumbers.`4`
    - typings.meteor.meteorStrings.array
    - typings.meteor.meteorNumbers.`5`
    - typings.meteor.meteorStrings.binData
    - typings.meteor.meteorNumbers.`6`
    - typings.meteor.meteorStrings.undefined
    - typings.meteor.meteorNumbers.`7`
    - typings.meteor.meteorStrings.objectId
    - typings.meteor.meteorNumbers.`8`
    - typings.meteor.meteorStrings.bool
    - typings.meteor.meteorNumbers.`9`
    - typings.meteor.meteorStrings.date
    - typings.meteor.meteorNumbers.`10`
    - typings.meteor.meteorStrings.`null`
    - typings.meteor.meteorNumbers.`11`
    - typings.meteor.meteorStrings.regex
    - typings.meteor.meteorNumbers.`12`
    - typings.meteor.meteorStrings.dbPointer
    - typings.meteor.meteorNumbers.`13`
    - typings.meteor.meteorStrings.javascript
    - typings.meteor.meteorNumbers.`14`
    - typings.meteor.meteorStrings.symbol
    - typings.meteor.meteorNumbers.`15`
    - typings.meteor.meteorStrings.javascriptWithScope
    - typings.meteor.meteorNumbers.`16`
    - typings.meteor.meteorStrings.int
    - typings.meteor.meteorNumbers.`17`
    - typings.meteor.meteorStrings.timestamp
    - typings.meteor.meteorNumbers.`18`
    - typings.meteor.meteorStrings.long
    - typings.meteor.meteorNumbers.`19`
    - typings.meteor.meteorStrings.decimal
    - typings.meteor.meteorNumbers.`-1`
    - typings.meteor.meteorStrings.minKey
    - typings.meteor.meteorNumbers.`127`
    - typings.meteor.meteorStrings.maxKey
    - typings.meteor.meteorStrings.number
  */
  trait BsonType extends js.Object
  
  @js.native
  trait Collection[T] extends js.Object {
    def _dropIndex(keys: String): Unit = js.native
    def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
    def _ensureIndex(keys: String): Unit = js.native
    def _ensureIndex(keys: String, options: StringDictionary[js.Any]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[js.Any]): Unit = js.native
    def allow(options: Anon_Doc[T]): Boolean = js.native
    def deny(options: Anon_Doc[T]): Boolean = js.native
    def find(): Cursor[T] = js.native
    def find(selector: String): Cursor[T] = js.native
    def find(selector: String, options: Anon_FieldsLimit): Cursor[T] = js.native
    def find(selector: ObjectID): Cursor[T] = js.native
    def find(selector: ObjectID, options: Anon_FieldsLimit): Cursor[T] = js.native
    def find(selector: Selector[T]): Cursor[T] = js.native
    def find(selector: Selector[T], options: Anon_FieldsLimit): Cursor[T] = js.native
    def findOne(): js.UndefOr[T] = js.native
    def findOne(selector: String): js.UndefOr[T] = js.native
    def findOne(selector: String, options: Anon_FieldsReactiveSkip): js.UndefOr[T] = js.native
    def findOne(selector: ObjectID): js.UndefOr[T] = js.native
    def findOne(selector: ObjectID, options: Anon_FieldsReactiveSkip): js.UndefOr[T] = js.native
    def findOne(selector: Selector[T]): js.UndefOr[T] = js.native
    def findOne(selector: Selector[T], options: Anon_FieldsReactiveSkip): js.UndefOr[T] = js.native
    def insert(doc: T): String = js.native
    def insert(doc: T, callback: js.Function): String = js.native
    def rawCollection(): js.Any = js.native
    def rawDatabase(): js.Any = js.native
    def remove(selector: String): Double = js.native
    def remove(selector: String, callback: js.Function): Double = js.native
    def remove(selector: ObjectID): Double = js.native
    def remove(selector: ObjectID, callback: js.Function): Double = js.native
    def remove(selector: Selector[T]): Double = js.native
    def remove(selector: Selector[T], callback: js.Function): Double = js.native
    def update(selector: String, modifier: Modifier[T]): Double = js.native
    def update(selector: String, modifier: Modifier[T], options: Anon_Multi): Double = js.native
    def update(selector: String, modifier: Modifier[T], options: Anon_Multi, callback: js.Function): Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T]): Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: Anon_Multi): Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: Anon_Multi, callback: js.Function): Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T]): Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: Anon_Multi): Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: Anon_Multi, callback: js.Function): Double = js.native
    def upsert(selector: String, modifier: Modifier[T]): Anon_InsertedId = js.native
    def upsert(selector: String, modifier: Modifier[T], options: Anon_MultiBoolean): Anon_InsertedId = js.native
    def upsert(selector: String, modifier: Modifier[T], options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T]): Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T], options: Anon_MultiBoolean): Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T], options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T]): Anon_InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T], options: Anon_MultiBoolean): Anon_InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T], options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
  }
  
  @js.native
  class CollectionCls[T] protected () extends Collection[T] {
    def this(name: String) = this()
    def this(name: String, options: Anon_Connection) = this()
  }
  
  @js.native
  trait CollectionStatic
    extends Instantiable1[/* name */ String, Collection[js.Object]]
       with Instantiable2[/* name */ String, /* options */ Anon_Connection, Collection[js.Object]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteor.Anon_Date
    - typings.meteor.meteorNumbers.`true`
  */
  trait CurrentDateModifier extends js.Object
  
  @js.native
  trait Cursor[T] extends js.Object {
    def count(): Double = js.native
    def count(applySkipLimit: Boolean): Double = js.native
    def fetch(): js.Array[T] = js.native
    def forEach(callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
    def map[U](
      callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    def observe(callbacks: ObserveCallbacks): LiveQueryHandle = js.native
    def observeChanges(callbacks: ObserveChangesCallbacks): LiveQueryHandle = js.native
  }
  
  @js.native
  class CursorCls[T] () extends Cursor[T]
  
  @js.native
  trait CursorStatic
    extends Instantiable0[Cursor[js.Object]]
  
  trait FieldExpression[T] extends js.Object {
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
    var $text: js.UndefOr[Anon_CaseSensitive] = js.undefined
    @JSName("$type")
    var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.undefined
    @JSName("$where")
    var $where: js.UndefOr[String | js.Function] = js.undefined
  }
  
  trait ObjectID extends js.Object {
    def equals(otherID: ObjectID): Boolean
    def toHexString(): String
  }
  
  @js.native
  class ObjectIDCls () extends ObjectID {
    def this(hexString: String) = this()
    /* CompleteClass */
    override def equals(otherID: ObjectID): Boolean = js.native
    /* CompleteClass */
    override def toHexString(): String = js.native
  }
  
  @js.native
  trait ObjectIDStatic
    extends Instantiable0[ObjectID]
       with Instantiable1[/* hexString */ String, ObjectID]
  
  trait ObserveCallbacks extends js.Object {
    var added: js.UndefOr[js.Function1[/* document */ js.Object, Unit]] = js.undefined
    var addedAt: js.UndefOr[
        js.Function3[/* document */ js.Object, /* atIndex */ Double, /* before */ js.Object, Unit]
      ] = js.undefined
    var changed: js.UndefOr[js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, Unit]] = js.undefined
    var changedAt: js.UndefOr[
        js.Function3[/* newDocument */ js.Object, /* oldDocument */ js.Object, /* indexAt */ Double, Unit]
      ] = js.undefined
    var movedTo: js.UndefOr[
        js.Function4[
          /* document */ js.Object, 
          /* fromIndex */ Double, 
          /* toIndex */ Double, 
          /* before */ js.Object, 
          Unit
        ]
      ] = js.undefined
    var removed: js.UndefOr[js.Function1[/* oldDocument */ js.Object, Unit]] = js.undefined
    var removedAt: js.UndefOr[js.Function2[/* oldDocument */ js.Object, /* atIndex */ Double, Unit]] = js.undefined
  }
  
  trait ObserveChangesCallbacks extends js.Object {
    var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ js.Object, Unit]] = js.undefined
    var addedBefore: js.UndefOr[
        js.Function3[/* id */ String, /* fields */ js.Object, /* before */ js.Object, Unit]
      ] = js.undefined
    var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ js.Object, Unit]] = js.undefined
    var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ js.Object, Unit]] = js.undefined
    var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
  }
  
  trait QueryWithModifiers[T] extends js.Object {
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
  
  trait SortSpecifier extends js.Object
  
  var Collection: CollectionStatic = js.native
  var Cursor: CursorStatic = js.native
  var ObjectID: ObjectIDStatic = js.native
  def setConnectionOptions(options: js.Any): Unit = js.native
  type ArraysOrEach[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each  :T[P]}}
    */ typings.meteor.meteorStrings.ArraysOrEach with js.Any
  type Dictionary[T] = StringDictionary[T]
  type ElementsOf[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]>}
    */ typings.meteor.meteorStrings.ElementsOf with T
  type FieldSpecifier = StringDictionary[Number]
  type Flatten[T] = T | (/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | Anon_01[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
  type PartialMapTo[T, M] = Partial[Record[String, M]]
  type PushModifier[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.meteor/mongo.Mongo.Dictionary<number>}}
    */ typings.meteor.meteorStrings.PushModifier with js.Any
  type Query[T] = typings.meteor.meteorStrings.Query with js.Any with Anon_And with Dictionary[_]
  type Selector[T] = Query[T] | QueryWithModifiers[T]
}

