package typings
package meteorLib.mongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/mongo", "Mongo")
@js.native
object MongoNs extends js.Object {
  trait AllowDenyOptions extends js.Object {
    var fetch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var insert: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
    var remove: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
    var transform: js.UndefOr[js.Function | scala.Null] = js.undefined
    var update: js.UndefOr[
        js.Function4[
          /* userId */ java.lang.String, 
          /* doc */ js.Any, 
          /* fieldNames */ js.Array[java.lang.String], 
          /* modifier */ js.Any, 
          scala.Boolean
        ]
      ] = js.undefined
  }
  
  @js.native
  trait Collection[T] extends js.Object {
    def _dropIndex(keys: java.lang.String): scala.Unit = js.native
    def _dropIndex(keys: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]): scala.Unit = js.native
    def _ensureIndex(keys: java.lang.String): scala.Unit = js.native
    def _ensureIndex(keys: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    def _ensureIndex(keys: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String]): scala.Unit = js.native
    def _ensureIndex(
      keys: org.scalablytyped.runtime.StringDictionary[scala.Double | java.lang.String],
      options: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): scala.Unit = js.native
    def allow(options: meteorLib.Anon_Doc[T]): scala.Boolean = js.native
    def deny(options: meteorLib.Anon_Doc[T]): scala.Boolean = js.native
    def find(): Cursor[T] = js.native
    def find(selector: java.lang.String): Cursor[T] = js.native
    def find(selector: java.lang.String, options: meteorLib.Anon_FieldsLimit): Cursor[T] = js.native
    def find(selector: ObjectID): Cursor[T] = js.native
    def find(selector: ObjectID, options: meteorLib.Anon_FieldsLimit): Cursor[T] = js.native
    def find(selector: Selector[T]): Cursor[T] = js.native
    def find(selector: Selector[T], options: meteorLib.Anon_FieldsLimit): Cursor[T] = js.native
    def findOne(): T = js.native
    def findOne(selector: java.lang.String): T = js.native
    def findOne(selector: java.lang.String, options: meteorLib.Anon_FieldsReactiveSkip): T = js.native
    def findOne(selector: ObjectID): T = js.native
    def findOne(selector: ObjectID, options: meteorLib.Anon_FieldsReactiveSkip): T = js.native
    def findOne(selector: Selector[T]): T = js.native
    def findOne(selector: Selector[T], options: meteorLib.Anon_FieldsReactiveSkip): T = js.native
    def insert(doc: T): java.lang.String = js.native
    def insert(doc: T, callback: js.Function): java.lang.String = js.native
    def rawCollection(): js.Any = js.native
    def rawDatabase(): js.Any = js.native
    def remove(selector: java.lang.String): scala.Double = js.native
    def remove(selector: java.lang.String, callback: js.Function): scala.Double = js.native
    def remove(selector: ObjectID): scala.Double = js.native
    def remove(selector: ObjectID, callback: js.Function): scala.Double = js.native
    def remove(selector: Selector[T]): scala.Double = js.native
    def remove(selector: Selector[T], callback: js.Function): scala.Double = js.native
    def update(selector: java.lang.String, modifier: Modifier[T]): scala.Double = js.native
    def update(selector: java.lang.String, modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
    def update(
      selector: java.lang.String,
      modifier: Modifier[T],
      options: meteorLib.Anon_Multi,
      callback: js.Function
    ): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T]): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_Multi, callback: js.Function): scala.Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T]): scala.Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_Multi, callback: js.Function): scala.Double = js.native
    def upsert(selector: java.lang.String, modifier: Modifier[T]): meteorLib.Anon_InsertedId = js.native
    def upsert(selector: java.lang.String, modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_InsertedId = js.native
    def upsert(
      selector: java.lang.String,
      modifier: Modifier[T],
      options: meteorLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorLib.Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T]): meteorLib.Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_InsertedId = js.native
    def upsert(
      selector: ObjectID,
      modifier: Modifier[T],
      options: meteorLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorLib.Anon_InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T]): meteorLib.Anon_InsertedId = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_InsertedId = js.native
    def upsert(
      selector: Selector[T],
      modifier: Modifier[T],
      options: meteorLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorLib.Anon_InsertedId = js.native
  }
  
  @js.native
  trait CollectionStatic
    extends org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, Collection[js.Object]]
       with org.scalablytyped.runtime.Instantiable2[
          /* name */ java.lang.String, 
          /* options */ meteorLib.Anon_Connection, 
          Collection[js.Object]
        ]
  
  @js.native
  trait Cursor[T] extends js.Object {
    def count(): scala.Double = js.native
    def count(applySkipLimit: scala.Boolean): scala.Double = js.native
    def fetch(): js.Array[T] = js.native
    def forEach(callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], scala.Unit]): scala.Unit = js.native
    def forEach(
      callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], scala.Unit],
      thisArg: js.Any
    ): scala.Unit = js.native
    def map[U](callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
    def map[U](
      callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    def observe(callbacks: ObserveCallbacks): meteorLib.MeteorNs.LiveQueryHandle = js.native
    def observeChanges(callbacks: ObserveChangesCallbacks): meteorLib.MeteorNs.LiveQueryHandle = js.native
  }
  
  @js.native
  trait CursorStatic
    extends org.scalablytyped.runtime.Instantiable0[Cursor[js.Object]]
  
  trait Dictionary[T]
    extends /* key */ org.scalablytyped.runtime.StringDictionary[T]
  
  @js.native
  trait FieldExpression[T] extends js.Object {
    @JSName("$all")
    var $all: js.UndefOr[js.Array[T]] = js.native
    @JSName("$bitsAllClear")
    var $bitsAllClear: js.UndefOr[js.Any] = js.native
    @JSName("$bitsAllSet")
    var $bitsAllSet: js.UndefOr[js.Any] = js.native
    @JSName("$bitsAnyClear")
    var $bitsAnyClear: js.UndefOr[js.Any] = js.native
    @JSName("$bitsAnySet")
    var $bitsAnySet: js.UndefOr[js.Any] = js.native
    @JSName("$comment")
    var $comment: js.UndefOr[java.lang.String] = js.native
    @JSName("$elemMatch")
    var $elemMatch: js.UndefOr[Query[T]] = js.native
    @JSName("$eq")
    var $eq: js.UndefOr[T] = js.native
    @JSName("$exists")
    var $exists: js.UndefOr[scala.Boolean] = js.native
    @JSName("$expr")
    var $expr: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.FieldExpression<T> */ js.UndefOr[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.FieldExpression<T> */ js.Object
      ] = js.native
    @JSName("$geoIntersects")
    var $geoIntersects: js.UndefOr[js.Any] = js.native
    @JSName("$geoWithin")
    var $geoWithin: js.UndefOr[js.Any] = js.native
    @JSName("$gt")
    var $gt: js.UndefOr[T] = js.native
    @JSName("$gte")
    var $gte: js.UndefOr[T] = js.native
    @JSName("$in")
    var $in: js.UndefOr[js.Array[T]] = js.native
    @JSName("$jsonSchema")
    var $jsonSchema: js.UndefOr[js.Any] = js.native
    @JSName("$lt")
    var $lt: js.UndefOr[T] = js.native
    @JSName("$lte")
    var $lte: js.UndefOr[T] = js.native
    @JSName("$mod")
    var $mod: js.UndefOr[js.Array[scala.Double]] = js.native
    @JSName("$ne")
    var $ne: js.UndefOr[T] = js.native
    @JSName("$near")
    var $near: js.UndefOr[js.Any] = js.native
    @JSName("$nearSphere")
    var $nearSphere: js.UndefOr[js.Any] = js.native
    @JSName("$nin")
    var $nin: js.UndefOr[js.Array[T]] = js.native
    @JSName("$not")
    var $not: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.FieldExpression<T> */ js.UndefOr[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias meteor.meteor/mongo.Mongo.FieldExpression<T> */ js.Object
      ] = js.native
    @JSName("$options")
    var $options: js.UndefOr[java.lang.String] = js.native
    @JSName("$regex")
    var $regex: js.UndefOr[stdLib.RegExp | java.lang.String] = js.native
    @JSName("$size")
    var $size: js.UndefOr[scala.Double] = js.native
    @JSName("$text")
    var $text: js.UndefOr[meteorLib.Anon_CaseSensitive] = js.native
    @JSName("$type")
    var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.native
    @JSName("$where")
    var $where: js.UndefOr[java.lang.String | js.Function] = js.native
  }
  
  trait FieldSpecifier
    extends /* id */ org.scalablytyped.runtime.StringDictionary[stdLib.Number]
  
  trait ObjectID extends js.Object {
    def equals(otherID: ObjectID): scala.Boolean
    def toHexString(): java.lang.String
  }
  
  @js.native
  trait ObjectIDStatic
    extends org.scalablytyped.runtime.Instantiable0[ObjectID]
       with org.scalablytyped.runtime.Instantiable1[/* hexString */ java.lang.String, ObjectID]
  
  trait ObserveCallbacks extends js.Object {
    var added: js.UndefOr[js.Function1[/* document */ js.Object, scala.Unit]] = js.undefined
    var addedAt: js.UndefOr[
        js.Function3[
          /* document */ js.Object, 
          /* atIndex */ scala.Double, 
          /* before */ js.Object, 
          scala.Unit
        ]
      ] = js.undefined
    var changed: js.UndefOr[
        js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, scala.Unit]
      ] = js.undefined
    var changedAt: js.UndefOr[
        js.Function3[
          /* newDocument */ js.Object, 
          /* oldDocument */ js.Object, 
          /* indexAt */ scala.Double, 
          scala.Unit
        ]
      ] = js.undefined
    var movedTo: js.UndefOr[
        js.Function4[
          /* document */ js.Object, 
          /* fromIndex */ scala.Double, 
          /* toIndex */ scala.Double, 
          /* before */ js.Object, 
          scala.Unit
        ]
      ] = js.undefined
    var removed: js.UndefOr[js.Function1[/* oldDocument */ js.Object, scala.Unit]] = js.undefined
    var removedAt: js.UndefOr[
        js.Function2[/* oldDocument */ js.Object, /* atIndex */ scala.Double, scala.Unit]
      ] = js.undefined
  }
  
  trait ObserveChangesCallbacks extends js.Object {
    var added: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
    var addedBefore: js.UndefOr[
        js.Function3[/* id */ java.lang.String, /* fields */ js.Object, /* before */ js.Object, scala.Unit]
      ] = js.undefined
    var changed: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
    var movedBefore: js.UndefOr[js.Function2[/* id */ java.lang.String, /* before */ js.Object, scala.Unit]] = js.undefined
    var removed: js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.undefined
  }
  
  @js.native
  trait QueryWithModifiers[T] extends js.Object {
    @JSName("$comment")
    var $comment: js.UndefOr[java.lang.String] = js.native
    @JSName("$explain")
    var $explain: js.UndefOr[js.Any] = js.native
    @JSName("$hint")
    var $hint: js.UndefOr[js.Any] = js.native
    @JSName("$max")
    var $max: js.UndefOr[js.Any] = js.native
    @JSName("$maxScan")
    var $maxScan: js.UndefOr[js.Any] = js.native
    @JSName("$maxTimeMS")
    var $maxTimeMS: js.UndefOr[js.Any] = js.native
    @JSName("$min")
    var $min: js.UndefOr[js.Any] = js.native
    @JSName("$natural")
    var $natural: js.UndefOr[js.Any] = js.native
    @JSName("$orderby")
    var $orderby: js.UndefOr[js.Any] = js.native
    @JSName("$query")
    var $query: Query[T] = js.native
    @JSName("$returnKey")
    var $returnKey: js.UndefOr[js.Any] = js.native
    @JSName("$showDiskLoc")
    var $showDiskLoc: js.UndefOr[js.Any] = js.native
  }
  
  trait SortSpecifier extends js.Object
  
  var Collection: CollectionStatic = js.native
  var Cursor: CursorStatic = js.native
  var ObjectID: ObjectIDStatic = js.native
  def setConnectionOptions(options: js.Any): scala.Unit = js.native
  type ArraysOrEach[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyArrays<T[P]> | {  $each  :T[P]}}
    */ meteorLib.meteorLibStrings.ArraysOrEach with js.Any
  type BsonType = meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibStrings.double | meteorLib.meteorLibNumbers.`2` | meteorLib.meteorLibStrings.string | meteorLib.meteorLibNumbers.`3` | meteorLib.meteorLibStrings.`object` | meteorLib.meteorLibNumbers.`4` | meteorLib.meteorLibStrings.array | meteorLib.meteorLibNumbers.`5` | meteorLib.meteorLibStrings.binData | meteorLib.meteorLibNumbers.`6` | meteorLib.meteorLibStrings.undefined | meteorLib.meteorLibNumbers.`7` | meteorLib.meteorLibStrings.objectId | meteorLib.meteorLibNumbers.`8` | meteorLib.meteorLibStrings.bool | meteorLib.meteorLibNumbers.`9` | meteorLib.meteorLibStrings.date | meteorLib.meteorLibNumbers.`10` | meteorLib.meteorLibStrings.`null` | meteorLib.meteorLibNumbers.`11` | meteorLib.meteorLibStrings.regex | meteorLib.meteorLibNumbers.`12` | meteorLib.meteorLibStrings.dbPointer | meteorLib.meteorLibNumbers.`13` | meteorLib.meteorLibStrings.javascript | meteorLib.meteorLibNumbers.`14` | meteorLib.meteorLibStrings.symbol | meteorLib.meteorLibNumbers.`15` | meteorLib.meteorLibStrings.javascriptWithScope | meteorLib.meteorLibNumbers.`16` | meteorLib.meteorLibStrings.int | meteorLib.meteorLibNumbers.`17` | meteorLib.meteorLibStrings.timestamp | meteorLib.meteorLibNumbers.`18` | meteorLib.meteorLibStrings.long | meteorLib.meteorLibNumbers.`19` | meteorLib.meteorLibStrings.decimal | meteorLib.meteorLibNumbers.`-1` | meteorLib.meteorLibStrings.minKey | meteorLib.meteorLibNumbers.`127` | meteorLib.meteorLibStrings.maxKey | meteorLib.meteorLibStrings.number
  type CurrentDateModifier = meteorLib.Anon_Date | meteorLib.meteorLibNumbers.`true`
  type ElementsOf[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]>}
    */ meteorLib.meteorLibStrings.ElementsOf with T
  type Flatten[T] = T | (/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any)
  type Modifier[T] = T | meteorLib.Anon_01[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = stdLib.Partial[/* import warning: ImportType.apply Failed type conversion: T[0] */ js.Any]
  type PartialMapTo[T, M] = stdLib.Partial[stdLib.Record[java.lang.String, M]]
  type PushModifier[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? meteor.meteor/mongo.Mongo.OnlyElementsOfArrays<T[P]> | {  $each? :T[P],   $position? :number,   $slice? :number,   $sort? :1 | -1 | meteor.meteor/mongo.Mongo.Dictionary<number>}}
    */ meteorLib.meteorLibStrings.PushModifier with js.Any
  type Query[T] = meteorLib.meteorLibStrings.Query with js.Any with meteorLib.Anon_And with Dictionary[_]
  type Selector[T] = Query[T] | QueryWithModifiers[T]
}

