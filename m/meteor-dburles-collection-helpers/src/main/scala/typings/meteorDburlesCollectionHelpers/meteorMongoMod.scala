package typings.meteorDburlesCollectionHelpers

import typings.meteor.Meteor.LiveQueryHandle
import typings.meteor.mongoMod.Mongo.Modifier
import typings.meteor.mongoMod.Mongo.ObjectID
import typings.meteor.mongoMod.Mongo.ObserveCallbacks
import typings.meteor.mongoMod.Mongo.OptionalId
import typings.meteor.mongoMod.Mongo.Selector
import typings.meteorDburlesCollectionHelpers.anon.ArrayFilters
import typings.meteorDburlesCollectionHelpers.anon.Fetch
import typings.meteorDburlesCollectionHelpers.anon.Fields
import typings.meteorDburlesCollectionHelpers.anon.InsertedId
import typings.meteorDburlesCollectionHelpers.anon.Multi
import typings.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersBooleans.`false`
import typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.AllowPartial
import typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.Data
import typings.meteorDburlesCollectionHelpers.meteorDburlesColoncollectionHelpersMod.Full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Cursor<T> and Collection<T> are pulled from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/meteor/mongo.d.ts
// and should be kept in sync with any changes to it
// only modified properties are included
/* augmented module */
object meteorMongoMod {
  
  object Mongo {
    
    @js.native
    trait Collection[T] extends StObject {
      
      // modifications:
      // - replaced T with Full<T> & T everywhere Collection._transform is applied
      // - replaced T with Data<T> everywhere the user provides a T
      def allow(options: Fetch[T]): Boolean = js.native
      
      def deny(options: Fetch[T]): Boolean = js.native
      
      def findOne(): js.UndefOr[Full[T] & T] = js.native
      def findOne(selector: String): js.UndefOr[Full[T] & T] = js.native
      def findOne(selector: String, options: Fields): js.UndefOr[Full[T] & T] = js.native
      def findOne(selector: Unit, options: Fields): js.UndefOr[Full[T] & T] = js.native
      def findOne(selector: ObjectID): js.UndefOr[Full[T] & T] = js.native
      def findOne(selector: ObjectID, options: Fields): js.UndefOr[Full[T] & T] = js.native
      def findOne(selector: Selector[T]): js.UndefOr[Full[T] & T] = js.native
      def findOne(selector: Selector[T], options: Fields): js.UndefOr[Full[T] & T] = js.native
      
      /**
        * Provide the definitions here for the methods and Helper<T>s you declared on your item interface.
        * Use helpers<AllowPartial> if you want to provide the helpers across multiple calls.
        * Tip: If you make those properties non-optional, they still won't be required when inserting items,
        * but you'll know that any object of your interface type has them.
        * Alternatively, if they're marked optional on your interface, they'll still be guaranteed on any
        * object you get out of the collection.
        * If you plan to pass around and create a lot of items pre-insertion, make them optional and use Full<T>
        * for ones with helpers attached.
        * If you plan to mostly pass around items that came out of a collection, make them required and use Data<T>
        * when creating new items.
        */
      def helpers[allowPartial /* <: `false` | AllowPartial */](
        // tslint:disable-next-line no-unnecessary-generics
      helpers: /* import warning: importer.ImportType#apply Failed type conversion: allowPartial extends meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.AllowPartial ? meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.PartialHelpers<T> : meteor-dburles-collection-helpers.meteor/dburles:collection-helpers.Helpers<T> */ js.Any
      ): Unit = js.native
      
      // ditto
      // tslint:disable-next-line ban-types
      def insert(doc: OptionalId[Data[T]]): String = js.native
      def insert(doc: OptionalId[Data[T]], callback: js.Function): String = js.native
      
      def update(selector: String, modifier: Modifier[Data[T]]): Double = js.native
      def update(
        selector: String,
        modifier: Modifier[Data[T]],
        options: Unit,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: String, modifier: Modifier[Data[T]], options: ArrayFilters): Double = js.native
      def update(
        selector: String,
        modifier: Modifier[Data[T]],
        options: ArrayFilters,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[Data[T]]): Double = js.native
      def update(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: Unit,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[Data[T]], options: ArrayFilters): Double = js.native
      def update(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: ArrayFilters,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[Data[T]]): Double = js.native
      def update(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: Unit,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[Data[T]], options: ArrayFilters): Double = js.native
      def update(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: ArrayFilters,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      
      def upsert(selector: String, modifier: Modifier[Data[T]]): InsertedId = js.native
      def upsert(
        selector: String,
        modifier: Modifier[Data[T]],
        options: Unit,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: String, modifier: Modifier[Data[T]], options: Multi): InsertedId = js.native
      def upsert(
        selector: String,
        modifier: Modifier[Data[T]],
        options: Multi,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[Data[T]]): InsertedId = js.native
      def upsert(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: Unit,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[Data[T]], options: Multi): InsertedId = js.native
      def upsert(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: Multi,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[Data[T]]): InsertedId = js.native
      def upsert(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: Unit,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[Data[T]], options: Multi): InsertedId = js.native
      def upsert(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: Multi,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
    }
    
    // modifications: replaced T with Full<T> & T everywhere Collection._transform is applied
    // note: it's not applied for observeChanges; however, ObserveChangesCallbacks uses Partial<T> anyway
    @js.native
    trait Cursor[T] extends StObject {
      
      def fetch(): js.Array[Full[T] & T] = js.native
      
      def forEach(callback: js.Function3[/* doc */ Full[T] & T, /* index */ Double, /* cursor */ Cursor[T], Unit]): Unit = js.native
      def forEach(
        callback: js.Function3[/* doc */ Full[T] & T, /* index */ Double, /* cursor */ Cursor[T], Unit],
        thisArg: Any
      ): Unit = js.native
      
      def map[U](callback: js.Function3[/* doc */ Full[T] & T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
      def map[U](
        callback: js.Function3[/* doc */ Full[T] & T, /* index */ Double, /* cursor */ Cursor[T], U],
        thisArg: Any
      ): js.Array[U] = js.native
      
      def observe(callbacks: ObserveCallbacks[Full[T] & T]): LiveQueryHandle = js.native
    }
  }
}
