package typings.phaser.global.Phaser

import typings.phaser.Phaser.Events.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  /**
    * The Data Manager Component features a means to store pieces of data specific to a Game Object, System or Plugin.
    * You can then search, query it, and retrieve the data. The parent must either extend EventEmitter,
    * or have a property called `events` that is an instance of it.
    */
  @JSGlobal("Phaser.Data.DataManager")
  @js.native
  open class DataManager protected ()
    extends StObject
       with typings.phaser.Phaser.Data.DataManager {
    /**
      * 
      * @param parent The object that this DataManager belongs to.
      * @param eventEmitter The DataManager's event emitter.
      */
    def this(parent: js.Object) = this()
    def this(parent: js.Object, eventEmitter: EventEmitter) = this()
  }
  
  /**
    * The Data Component features a means to store pieces of data specific to a Game Object, System or Plugin.
    * You can then search, query it, and retrieve the data. The parent must either extend EventEmitter,
    * or have a property called `events` that is an instance of it.
    */
  @JSGlobal("Phaser.Data.DataManagerPlugin")
  @js.native
  open class DataManagerPlugin protected ()
    extends StObject
       with typings.phaser.Phaser.Data.DataManagerPlugin {
    /**
      * 
      * @param scene A reference to the Scene that this DataManager belongs to.
      */
    def this(scene: typings.phaser.Phaser.Scene) = this()
  }
  
  object Events {
    
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
    @JSGlobal("Phaser.Data.Events.CHANGE_DATA")
    @js.native
    val CHANGE_DATA: Any = js.native
    
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
    @JSGlobal("Phaser.Data.Events.CHANGE_DATA_KEY")
    @js.native
    val CHANGE_DATA_KEY: Any = js.native
    
    /**
      * The Data Manager Destroy Event.
      * 
      * The Data Manager will listen for the destroy event from its parent, and then close itself down.
      */
    @JSGlobal("Phaser.Data.Events.DESTROY")
    @js.native
    val DESTROY: Any = js.native
    
    /**
      * The Remove Data Event.
      * 
      * This event is dispatched by a Data Manager when an item is removed from it.
      * 
      * Game Objects with data enabled have an instance of a Data Manager under the `data` property. So, to listen for
      * the removal of a data item on a Game Object you would use: `sprite.data.on('removedata', listener)`.
      */
    @JSGlobal("Phaser.Data.Events.REMOVE_DATA")
    @js.native
    val REMOVE_DATA: Any = js.native
    
    /**
      * The Set Data Event.
      * 
      * This event is dispatched by a Data Manager when a new item is added to the data store.
      * 
      * Game Objects with data enabled have an instance of a Data Manager under the `data` property. So, to listen for
      * the addition of a new data item on a Game Object you would use: `sprite.data.on('setdata', listener)`.
      */
    @JSGlobal("Phaser.Data.Events.SET_DATA")
    @js.native
    val SET_DATA: Any = js.native
  }
}
