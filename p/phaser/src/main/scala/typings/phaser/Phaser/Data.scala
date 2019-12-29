package typings.phaser.Phaser

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.DataEachCallback
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Scenes.Systems
import typings.phaser.integer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Data")
@js.native
object Data extends js.Object {
  /**
    * The Data Manager Component features a means to store pieces of data specific to a Game Object, System or Plugin.
    * You can then search, query it, and retrieve the data. The parent must either extend EventEmitter,
    * or have a property called `events` that is an instance of it.
    */
  @js.native
  class DataManager protected () extends js.Object {
    /**
      * 
      * @param parent The object that this DataManager belongs to.
      * @param eventEmitter The DataManager's event emitter.
      */
    def this(parent: js.Object, eventEmitter: EventEmitter) = this()
    /**
      * Return the total number of entries in this Data Manager.
      */
    var count: integer = js.native
    /**
      * The DataManager's event emitter.
      */
    var events: EventEmitter = js.native
    /**
      * Gets or sets the frozen state of this Data Manager.
      * A frozen Data Manager will block all attempts to create new values or update existing ones.
      */
    var freeze: Boolean = js.native
    /**
      * The data list.
      */
    var list: StringDictionary[js.Any] = js.native
    /**
      * The object that this DataManager belongs to.
      */
    var parent: js.Any = js.native
    /**
      * The public values list. You can use this to access anything you have stored
      * in this Data Manager. For example, if you set a value called `gold` you can
      * access it via:
      * 
      * ```javascript
      * this.data.values.gold;
      * ```
      * 
      * You can also modify it directly:
      * 
      * ```javascript
      * this.data.values.gold += 1000;
      * ```
      * 
      * Doing so will emit a `setdata` event from the parent of this Data Manager.
      * 
      * Do not modify this object directly. Adding properties directly to this object will not
      * emit any events. Always use `DataManager.set` to create new items the first time around.
      */
    var values: StringDictionary[js.Any] = js.native
    /**
      * Destroy this data manager.
      */
    def destroy(): Unit = js.native
    /**
      * Passes all data entries to the given callback.
      * @param callback The function to call.
      * @param context Value to use as `this` when executing callback.
      * @param args Additional arguments that will be passed to the callback, after the game object, key, and data.
      */
    def each(callback: DataEachCallback): DataManager = js.native
    def each(callback: DataEachCallback, context: js.Any, args: js.Any*): DataManager = js.native
    /**
      * Retrieves the value for the given key, or undefined if it doesn't exist.
      * 
      * You can also access values via the `values` object. For example, if you had a key called `gold` you can do either:
      * 
      * ```javascript
      * this.data.get('gold');
      * ```
      * 
      * Or access the value directly:
      * 
      * ```javascript
      * this.data.values.gold;
      * ```
      * 
      * You can also pass in an array of keys, in which case an array of values will be returned:
      * 
      * ```javascript
      * this.data.get([ 'gold', 'armor', 'health' ]);
      * ```
      * 
      * This approach is useful for destructuring arrays in ES6.
      * @param key The key of the value to retrieve, or an array of keys.
      */
    def get(key: String): js.Any = js.native
    def get(key: js.Array[String]): js.Any = js.native
    /**
      * Retrieves all data values in a new object.
      */
    def getAll(): StringDictionary[js.Any] = js.native
    /**
      * Determines whether the given key is set in this Data Manager.
      * 
      * Please note that the keys are case-sensitive and must be valid JavaScript Object property strings.
      * This means the keys `gold` and `Gold` are treated as two unique values within the Data Manager.
      * @param key The key to check.
      */
    def has(key: String): Boolean = js.native
    /**
      * Merge the given object of key value pairs into this DataManager.
      * 
      * Any newly created values will emit a `setdata` event. Any updated values (see the `overwrite` argument)
      * will emit a `changedata` event.
      * @param data The data to merge.
      * @param overwrite Whether to overwrite existing data. Defaults to true. Default true.
      */
    def merge(data: StringDictionary[js.Any]): DataManager = js.native
    def merge(data: StringDictionary[js.Any], overwrite: Boolean): DataManager = js.native
    /**
      * Retrieves the data associated with the given 'key', deletes it from this Data Manager, then returns it.
      * @param key The key of the value to retrieve and delete.
      */
    def pop(key: String): js.Any = js.native
    /**
      * Queries the DataManager for the values of keys matching the given regular expression.
      * @param search A regular expression object. If a non-RegExp object obj is passed, it is implicitly converted to a RegExp by using new RegExp(obj).
      */
    def query(search: RegExp): StringDictionary[js.Any] = js.native
    /**
      * Remove the value for the given key.
      * 
      * If the key is found in this Data Manager it is removed from the internal lists and a
      * `removedata` event is emitted.
      * 
      * You can also pass in an array of keys, in which case all keys in the array will be removed:
      * 
      * ```javascript
      * this.data.remove([ 'gold', 'armor', 'health' ]);
      * ```
      * @param key The key to remove, or an array of keys to remove.
      */
    def remove(key: String): DataManager = js.native
    def remove(key: js.Array[String]): DataManager = js.native
    /**
      * Delete all data in this Data Manager and unfreeze it.
      */
    def reset(): DataManager = js.native
    /**
      * Sets a value for the given key. If the key doesn't already exist in the Data Manager then it is created.
      * 
      * ```javascript
      * data.set('name', 'Red Gem Stone');
      * ```
      * 
      * You can also pass in an object of key value pairs as the first argument:
      * 
      * ```javascript
      * data.set({ name: 'Red Gem Stone', level: 2, owner: 'Link', gold: 50 });
      * ```
      * 
      * To get a value back again you can call `get`:
      * 
      * ```javascript
      * data.get('gold');
      * ```
      * 
      * Or you can access the value directly via the `values` property, where it works like any other variable:
      * 
      * ```javascript
      * data.values.gold += 50;
      * ```
      * 
      * When the value is first set, a `setdata` event is emitted.
      * 
      * If the key already exists, a `changedata` event is emitted instead, along an event named after the key.
      * For example, if you updated an existing key called `PlayerLives` then it would emit the event `changedata-PlayerLives`.
      * These events will be emitted regardless if you use this method to set the value, or the direct `values` setter.
      * 
      * Please note that the data keys are case-sensitive and must be valid JavaScript Object property strings.
      * This means the keys `gold` and `Gold` are treated as two unique values within the Data Manager.
      * @param key The key to set the value for. Or an object or key value pairs. If an object the `data` argument is ignored.
      * @param data The value to set for the given key. If an object is provided as the key this argument is ignored.
      */
    def set(key: String, data: js.Any): DataManager = js.native
    def set(key: js.Object, data: js.Any): DataManager = js.native
    /**
      * Freeze or unfreeze this Data Manager. A frozen Data Manager will block all attempts
      * to create new values or update existing ones.
      * @param value Whether to freeze or unfreeze the Data Manager.
      */
    def setFreeze(value: Boolean): DataManager = js.native
  }
  
  /**
    * The Data Component features a means to store pieces of data specific to a Game Object, System or Plugin.
    * You can then search, query it, and retrieve the data. The parent must either extend EventEmitter,
    * or have a property called `events` that is an instance of it.
    */
  @js.native
  class DataManagerPlugin protected () extends DataManager {
    /**
      * 
      * @param scene A reference to the Scene that this DataManager belongs to.
      */
    def this(scene: Scene) = this()
    /**
      * A reference to the Scene that this DataManager belongs to.
      */
    var scene: Scene = js.native
    /**
      * A reference to the Scene's Systems.
      */
    var systems: Systems = js.native
  }
  
  @js.native
  object Events extends js.Object {
    /**
      * The Change Data Event.
      * 
      * This event is dispatched by a Data Manager when an item in the data store is changed.
      * 
      * Game Objects with data enabled have an instance of a Data Manager under the `data` property. So, to listen for
      * a change data event from a Game Object you would use: `sprite.data.on('changedata', listener)`.
      * 
      * This event is dispatched for all items that change in the Data Manager.
      * To listen for the change of a specific item, use the `CHANGE_DATA_KEY_EVENT` event.
      */
    val CHANGE_DATA: js.Any = js.native
    /**
      * The Change Data Key Event.
      * 
      * This event is dispatched by a Data Manager when an item in the data store is changed.
      * 
      * Game Objects with data enabled have an instance of a Data Manager under the `data` property. So, to listen for
      * the change of a specific data item from a Game Object you would use: `sprite.data.on('changedata-key', listener)`,
      * where `key` is the unique string key of the data item. For example, if you have a data item stored called `gold`
      * then you can listen for `sprite.data.on('changedata-gold')`.
      */
    val CHANGE_DATA_KEY: js.Any = js.native
    /**
      * The Remove Data Event.
      * 
      * This event is dispatched by a Data Manager when an item is removed from it.
      * 
      * Game Objects with data enabled have an instance of a Data Manager under the `data` property. So, to listen for
      * the removal of a data item on a Game Object you would use: `sprite.data.on('removedata', listener)`.
      */
    val REMOVE_DATA: js.Any = js.native
    /**
      * The Set Data Event.
      * 
      * This event is dispatched by a Data Manager when a new item is added to the data store.
      * 
      * Game Objects with data enabled have an instance of a Data Manager under the `data` property. So, to listen for
      * the addition of a new data item on a Game Object you would use: `sprite.data.on('setdata', listener)`.
      */
    val SET_DATA: js.Any = js.native
  }
  
}

