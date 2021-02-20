package typings.phaser.phaserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cache {
  
  /**
    * The BaseCache is a base Cache class that can be used for storing references to any kind of data.
    * 
    * Data can be added, retrieved and removed based on the given keys.
    * 
    * Keys are string-based.
    */
  @JSImport("phaser", "Cache.BaseCache")
  @js.native
  class BaseCache ()
    extends typings.phaser.Phaser.Cache.BaseCache
  
  /**
    * The Cache Manager is the global cache owned and maintained by the Game instance.
    * 
    * Various systems, such as the file Loader, rely on this cache in order to store the files
    * it has loaded. The manager itself doesn't store any files, but instead owns multiple BaseCache
    * instances, one per type of file. You can also add your own custom caches.
    */
  @JSImport("phaser", "Cache.CacheManager")
  @js.native
  class CacheManager protected ()
    extends typings.phaser.Phaser.Cache.CacheManager {
    /**
      * 
      * @param game A reference to the Phaser.Game instance that owns this CacheManager.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  object Events {
    
    /**
      * The Cache Add Event.
      * 
      * This event is dispatched by any Cache that extends the BaseCache each time a new object is added to it.
      */
    @JSImport("phaser", "Cache.Events.ADD")
    @js.native
    val ADD: js.Any = js.native
    
    /**
      * The Cache Remove Event.
      * 
      * This event is dispatched by any Cache that extends the BaseCache each time an object is removed from it.
      */
    @JSImport("phaser", "Cache.Events.REMOVE")
    @js.native
    val REMOVE: js.Any = js.native
  }
}
