package typings.meteorDashTypings.meteorMongoMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.meteorDashTypings.Anon_Connection
import typings.meteorDashTypings.Anon_Doc
import typings.meteorDashTypings.Anon_FieldsLimit
import typings.meteorDashTypings.Anon_FieldsReactiveSkip
import typings.meteorDashTypings.Anon_InsertedId
import typings.meteorDashTypings.Anon_Multi
import typings.meteorDashTypings.Anon_MultiBoolean
import typings.meteorDashTypings.MeteorNs.LiveQueryHandle
import typings.meteorDashTypings.meteorMongoMod.MongoNs.Collection
import typings.meteorDashTypings.meteorMongoMod.MongoNs.CollectionStatic
import typings.meteorDashTypings.meteorMongoMod.MongoNs.Cursor
import typings.meteorDashTypings.meteorMongoMod.MongoNs.CursorStatic
import typings.meteorDashTypings.meteorMongoMod.MongoNs.Modifier
import typings.meteorDashTypings.meteorMongoMod.MongoNs.ObjectID
import typings.meteorDashTypings.meteorMongoMod.MongoNs.ObjectIDStatic
import typings.meteorDashTypings.meteorMongoMod.MongoNs.ObserveCallbacks
import typings.meteorDashTypings.meteorMongoMod.MongoNs.ObserveChangesCallbacks
import typings.meteorDashTypings.meteorMongoMod.MongoNs.Selector
import typings.std.Number
import typings.std.Object
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
    var transform: js.UndefOr[js.Function] = js.undefined
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
    def find(selector: Selector): Cursor[T] = js.native
    def find(selector: Selector, options: Anon_FieldsLimit): Cursor[T] = js.native
    def findOne(): T = js.native
    def findOne(selector: String): T = js.native
    def findOne(selector: String, options: Anon_FieldsReactiveSkip): T = js.native
    def findOne(selector: ObjectID): T = js.native
    def findOne(selector: ObjectID, options: Anon_FieldsReactiveSkip): T = js.native
    def findOne(selector: Selector): T = js.native
    def findOne(selector: Selector, options: Anon_FieldsReactiveSkip): T = js.native
    def insert(doc: T): String = js.native
    def insert(doc: T, callback: js.Function): String = js.native
    def rawCollection(): js.Any = js.native
    def rawDatabase(): js.Any = js.native
    def remove(selector: String): Double = js.native
    def remove(selector: String, callback: js.Function): Double = js.native
    def remove(selector: ObjectID): Double = js.native
    def remove(selector: ObjectID, callback: js.Function): Double = js.native
    def remove(selector: Selector): Double = js.native
    def remove(selector: Selector, callback: js.Function): Double = js.native
    def update(selector: String, modifier: Modifier): Double = js.native
    def update(selector: String, modifier: Modifier, options: Anon_Multi): Double = js.native
    def update(selector: String, modifier: Modifier, options: Anon_Multi, callback: js.Function): Double = js.native
    def update(selector: ObjectID, modifier: Modifier): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Anon_Multi): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Anon_Multi, callback: js.Function): Double = js.native
    def update(selector: Selector, modifier: Modifier): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Anon_Multi): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Anon_Multi, callback: js.Function): Double = js.native
    def upsert(selector: String, modifier: Modifier): Anon_InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier): Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier): Anon_InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: Anon_MultiBoolean): Anon_InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: Anon_MultiBoolean, callback: js.Function): Anon_InsertedId = js.native
  }
  
  @js.native
  class CollectionCls[T] () extends Collection[T] {
    def this(name: String) = this()
    def this(name: String, options: Anon_Connection) = this()
    def this(name: Null, options: Anon_Connection) = this()
  }
  
  @js.native
  trait CollectionStatic
    extends Instantiable1[/* name */ String, Collection[js.Object]]
       with Instantiable0[Collection[js.Object]]
       with Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ Anon_Connection, 
          Collection[js.Object]
        ]
  
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
  
  trait Modifier extends js.Object
  
  trait ObjectID extends js.Object
  
  @js.native
  class ObjectIDCls () extends ObjectID {
    def this(hexString: String) = this()
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
  
  trait Selector
    extends Object
       with /* key */ StringDictionary[js.Any]
  
  trait SortSpecifier extends js.Object
  
  var Collection: CollectionStatic = js.native
  var Cursor: CursorStatic = js.native
  var ObjectID: ObjectIDStatic = js.native
  type FieldSpecifier = StringDictionary[Number]
}

