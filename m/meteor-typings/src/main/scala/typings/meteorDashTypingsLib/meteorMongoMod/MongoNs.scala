package typings
package meteorDashTypingsLib.meteorMongoMod

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
    var transform: js.UndefOr[js.Function] = js.undefined
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
    def allow(options: meteorDashTypingsLib.Anon_Doc[T]): scala.Boolean = js.native
    def deny(options: meteorDashTypingsLib.Anon_Doc[T]): scala.Boolean = js.native
    def find(): Cursor[T] = js.native
    def find(selector: java.lang.String): Cursor[T] = js.native
    def find(selector: java.lang.String, options: meteorDashTypingsLib.Anon_FieldsLimit): Cursor[T] = js.native
    def find(selector: ObjectID): Cursor[T] = js.native
    def find(selector: ObjectID, options: meteorDashTypingsLib.Anon_FieldsLimit): Cursor[T] = js.native
    def find(selector: Selector): Cursor[T] = js.native
    def find(selector: Selector, options: meteorDashTypingsLib.Anon_FieldsLimit): Cursor[T] = js.native
    def findOne(): T = js.native
    def findOne(selector: java.lang.String): T = js.native
    def findOne(selector: java.lang.String, options: meteorDashTypingsLib.Anon_FieldsReactiveSkip): T = js.native
    def findOne(selector: ObjectID): T = js.native
    def findOne(selector: ObjectID, options: meteorDashTypingsLib.Anon_FieldsReactiveSkip): T = js.native
    def findOne(selector: Selector): T = js.native
    def findOne(selector: Selector, options: meteorDashTypingsLib.Anon_FieldsReactiveSkip): T = js.native
    def insert(doc: T): java.lang.String = js.native
    def insert(doc: T, callback: js.Function): java.lang.String = js.native
    def rawCollection(): js.Any = js.native
    def rawDatabase(): js.Any = js.native
    def remove(selector: java.lang.String): scala.Double = js.native
    def remove(selector: java.lang.String, callback: js.Function): scala.Double = js.native
    def remove(selector: ObjectID): scala.Double = js.native
    def remove(selector: ObjectID, callback: js.Function): scala.Double = js.native
    def remove(selector: Selector): scala.Double = js.native
    def remove(selector: Selector, callback: js.Function): scala.Double = js.native
    def update(selector: java.lang.String, modifier: Modifier): scala.Double = js.native
    def update(selector: java.lang.String, modifier: Modifier, options: meteorDashTypingsLib.Anon_Multi): scala.Double = js.native
    def update(
      selector: java.lang.String,
      modifier: Modifier,
      options: meteorDashTypingsLib.Anon_Multi,
      callback: js.Function
    ): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: meteorDashTypingsLib.Anon_Multi): scala.Double = js.native
    def update(
      selector: ObjectID,
      modifier: Modifier,
      options: meteorDashTypingsLib.Anon_Multi,
      callback: js.Function
    ): scala.Double = js.native
    def update(selector: Selector, modifier: Modifier): scala.Double = js.native
    def update(selector: Selector, modifier: Modifier, options: meteorDashTypingsLib.Anon_Multi): scala.Double = js.native
    def update(
      selector: Selector,
      modifier: Modifier,
      options: meteorDashTypingsLib.Anon_Multi,
      callback: js.Function
    ): scala.Double = js.native
    def upsert(selector: java.lang.String, modifier: Modifier): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(selector: java.lang.String, modifier: Modifier, options: meteorDashTypingsLib.Anon_MultiBoolean): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(
      selector: java.lang.String,
      modifier: Modifier,
      options: meteorDashTypingsLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: meteorDashTypingsLib.Anon_MultiBoolean): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(
      selector: ObjectID,
      modifier: Modifier,
      options: meteorDashTypingsLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: meteorDashTypingsLib.Anon_MultiBoolean): meteorDashTypingsLib.Anon_InsertedId = js.native
    def upsert(
      selector: Selector,
      modifier: Modifier,
      options: meteorDashTypingsLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorDashTypingsLib.Anon_InsertedId = js.native
  }
  
  @js.native
  class CollectionCls[T] () extends Collection[T] {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, options: meteorDashTypingsLib.Anon_Connection) = this()
    def this(name: scala.Null, options: meteorDashTypingsLib.Anon_Connection) = this()
  }
  
  @js.native
  trait CollectionStatic
    extends org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, Collection[js.Object]]
       with org.scalablytyped.runtime.Instantiable0[Collection[js.Object]]
       with org.scalablytyped.runtime.Instantiable2[
          (/* name */ scala.Null) | (/* name */ java.lang.String), 
          /* options */ meteorDashTypingsLib.Anon_Connection, 
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
    def observe(callbacks: ObserveCallbacks): meteorDashTypingsLib.MeteorNs.LiveQueryHandle = js.native
    def observeChanges(callbacks: ObserveChangesCallbacks): meteorDashTypingsLib.MeteorNs.LiveQueryHandle = js.native
  }
  
  @js.native
  class CursorCls[T] () extends Cursor[T]
  
  @js.native
  trait CursorStatic
    extends org.scalablytyped.runtime.Instantiable0[Cursor[js.Object]]
  
  trait Modifier extends js.Object
  
  trait ObjectID extends js.Object
  
  @js.native
  class ObjectIDCls () extends ObjectID {
    def this(hexString: java.lang.String) = this()
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
  
  trait Selector
    extends stdLib.Object
       with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
  
  trait SortSpecifier extends js.Object
  
  var Collection: CollectionStatic = js.native
  var Cursor: CursorStatic = js.native
  var ObjectID: ObjectIDStatic = js.native
  type FieldSpecifier = org.scalablytyped.runtime.StringDictionary[stdLib.Number]
}

