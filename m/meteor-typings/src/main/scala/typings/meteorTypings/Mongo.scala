package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.meteorTypings.Meteor.LiveQueryHandle
import typings.meteorTypings.anon.Connection
import typings.meteorTypings.anon.Fetch
import typings.meteorTypings.anon.InsertedId
import typings.meteorTypings.anon.Limit
import typings.meteorTypings.anon.Multi
import typings.meteorTypings.anon.Skip
import typings.meteorTypings.anon.`1`
import typings.std.Number
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mongo {
  
  trait AllowDenyOptions extends StObject {
    
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
  object AllowDenyOptions {
    
    @scala.inline
    def apply(): AllowDenyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowDenyOptions]
    }
    
    @scala.inline
    implicit class AllowDenyOptionsMutableBuilder[Self <: AllowDenyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: js.Array[String]): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFetchVarargs(value: String*): Self = StObject.set(x, "fetch", js.Array(value :_*))
      
      @scala.inline
      def setInsert(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setRemove(value: (/* userId */ String, /* doc */ js.Any) => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setTransform(value: js.Function): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* userId */ String, /* doc */ js.Any, /* fieldNames */ js.Array[String], /* modifier */ js.Any) => Boolean
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Collection[T] extends StObject {
    
    def _dropIndex(keys: String): Unit = js.native
    def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
    
    def _ensureIndex(keys: String): Unit = js.native
    def _ensureIndex(keys: String, options: StringDictionary[js.Any]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
    def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[js.Any]): Unit = js.native
    
    def allow(options: Fetch[T]): Boolean = js.native
    
    def deny(options: Fetch[T]): Boolean = js.native
    
    def find(): Cursor[T] = js.native
    def find(selector: String): Cursor[T] = js.native
    def find(selector: String, options: Limit): Cursor[T] = js.native
    def find(selector: Unit, options: Limit): Cursor[T] = js.native
    def find(selector: ObjectID): Cursor[T] = js.native
    def find(selector: ObjectID, options: Limit): Cursor[T] = js.native
    def find(selector: Selector): Cursor[T] = js.native
    def find(selector: Selector, options: Limit): Cursor[T] = js.native
    
    def findOne(): T = js.native
    def findOne(selector: String): T = js.native
    def findOne(selector: String, options: Skip): T = js.native
    def findOne(selector: Unit, options: Skip): T = js.native
    def findOne(selector: ObjectID): T = js.native
    def findOne(selector: ObjectID, options: Skip): T = js.native
    def findOne(selector: Selector): T = js.native
    def findOne(selector: Selector, options: Skip): T = js.native
    
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
    def update(selector: String, modifier: Modifier, options: Unit, callback: js.Function): Double = js.native
    def update(selector: String, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: String, modifier: Modifier, options: Multi, callback: js.Function): Double = js.native
    def update(selector: ObjectID, modifier: Modifier): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Unit, callback: js.Function): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: ObjectID, modifier: Modifier, options: Multi, callback: js.Function): Double = js.native
    def update(selector: Selector, modifier: Modifier): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Unit, callback: js.Function): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Multi): Double = js.native
    def update(selector: Selector, modifier: Modifier, options: Multi, callback: js.Function): Double = js.native
    
    def upsert(selector: String, modifier: Modifier): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: Unit, callback: js.Function): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: `1`): InsertedId = js.native
    def upsert(selector: String, modifier: Modifier, options: `1`, callback: js.Function): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: Unit, callback: js.Function): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: `1`): InsertedId = js.native
    def upsert(selector: ObjectID, modifier: Modifier, options: `1`, callback: js.Function): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: Unit, callback: js.Function): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: `1`): InsertedId = js.native
    def upsert(selector: Selector, modifier: Modifier, options: `1`, callback: js.Function): InsertedId = js.native
  }
  
  @js.native
  trait CollectionStatic
    extends StObject
       with Instantiable0[Collection[js.Object]]
       with Instantiable1[/* name */ String, Collection[js.Object]]
       with Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ Connection, 
          Collection[js.Object]
        ]
  
  @js.native
  trait Cursor[T] extends StObject {
    
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
  trait CursorStatic
    extends StObject
       with Instantiable0[Cursor[js.Object]]
  
  type FieldSpecifier = StringDictionary[Number]
  
  trait Modifier extends StObject
  
  trait ObjectID extends StObject
  
  @js.native
  trait ObjectIDStatic
    extends StObject
       with Instantiable0[ObjectID]
       with Instantiable1[/* hexString */ String, ObjectID]
  
  trait ObserveCallbacks extends StObject {
    
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
  object ObserveCallbacks {
    
    @scala.inline
    def apply(): ObserveCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObserveCallbacks]
    }
    
    @scala.inline
    implicit class ObserveCallbacksMutableBuilder[Self <: ObserveCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: /* document */ js.Object => Unit): Self = StObject.set(x, "added", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddedAt(value: (/* document */ js.Object, /* atIndex */ Double, /* before */ js.Object) => Unit): Self = StObject.set(x, "addedAt", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddedAtUndefined: Self = StObject.set(x, "addedAt", js.undefined)
      
      @scala.inline
      def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      @scala.inline
      def setChanged(value: (/* newDocument */ js.Object, /* oldDocument */ js.Object) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChangedAt(value: (/* newDocument */ js.Object, /* oldDocument */ js.Object, /* indexAt */ Double) => Unit): Self = StObject.set(x, "changedAt", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChangedAtUndefined: Self = StObject.set(x, "changedAt", js.undefined)
      
      @scala.inline
      def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      @scala.inline
      def setMovedTo(
        value: (/* document */ js.Object, /* fromIndex */ Double, /* toIndex */ Double, /* before */ js.Object) => Unit
      ): Self = StObject.set(x, "movedTo", js.Any.fromFunction4(value))
      
      @scala.inline
      def setMovedToUndefined: Self = StObject.set(x, "movedTo", js.undefined)
      
      @scala.inline
      def setRemoved(value: /* oldDocument */ js.Object => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovedAt(value: (/* oldDocument */ js.Object, /* atIndex */ Double) => Unit): Self = StObject.set(x, "removedAt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemovedAtUndefined: Self = StObject.set(x, "removedAt", js.undefined)
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    }
  }
  
  trait ObserveChangesCallbacks extends StObject {
    
    var added: js.UndefOr[js.Function2[/* id */ String, /* fields */ js.Object, Unit]] = js.undefined
    
    var addedBefore: js.UndefOr[
        js.Function3[/* id */ String, /* fields */ js.Object, /* before */ js.Object, Unit]
      ] = js.undefined
    
    var changed: js.UndefOr[js.Function2[/* id */ String, /* fields */ js.Object, Unit]] = js.undefined
    
    var movedBefore: js.UndefOr[js.Function2[/* id */ String, /* before */ js.Object, Unit]] = js.undefined
    
    var removed: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
  }
  object ObserveChangesCallbacks {
    
    @scala.inline
    def apply(): ObserveChangesCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObserveChangesCallbacks]
    }
    
    @scala.inline
    implicit class ObserveChangesCallbacksMutableBuilder[Self <: ObserveChangesCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: (/* id */ String, /* fields */ js.Object) => Unit): Self = StObject.set(x, "added", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddedBefore(value: (/* id */ String, /* fields */ js.Object, /* before */ js.Object) => Unit): Self = StObject.set(x, "addedBefore", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddedBeforeUndefined: Self = StObject.set(x, "addedBefore", js.undefined)
      
      @scala.inline
      def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
      
      @scala.inline
      def setChanged(value: (/* id */ String, /* fields */ js.Object) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
      
      @scala.inline
      def setMovedBefore(value: (/* id */ String, /* before */ js.Object) => Unit): Self = StObject.set(x, "movedBefore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMovedBeforeUndefined: Self = StObject.set(x, "movedBefore", js.undefined)
      
      @scala.inline
      def setRemoved(value: /* id */ String => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    }
  }
  
  trait Selector
    extends StObject
       with Object
       with /* key */ StringDictionary[js.Any]
  object Selector {
    
    @scala.inline
    def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): Selector = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[Selector]
    }
  }
  
  trait SortSpecifier extends StObject
}
