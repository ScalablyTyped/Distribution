package typings.mqtt

import typings.mqtt.typesLibMessageIdProviderMod.IMessageIdProvider
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibUniqueMessageIdProviderMod {
  
  /**
    * UniqueMessageIdProvider
    */
  @JSImport("mqtt/types/lib/unique-message-id-provider", "UniqueMessageIdProvider")
  @js.native
  /**
    * UniqueMessageIdProvider constructor.
    * @constructor
    */
  open class UniqueMessageIdProvider ()
    extends StObject
       with IMessageIdProvider {
    
    /**
      * Allocate the first vacant messageId. The messageId become occupied status.
      * @return {Number} - The first vacant messageId. If all messageIds are occupied, return null.
      */
    /* CompleteClass */
    override def allocate(): Number | Null = js.native
    
    /**
      * Clear all occupied messageIds.
      * The all messageIds are set to vacant status.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Deallocate the messageId. The messageId become vacant status.
      * @param {Number} num - The messageId to deallocate. The messageId must be occupied status.
      *                       In other words, the messageId must be allocated by allocate() or
      *                       occupied by register().
      */
    /* CompleteClass */
    override def deallocate(num: Number): Unit = js.native
    
    /**
      * Get the last allocated messageId.
      * @return {Number} - messageId.
      */
    /* CompleteClass */
    override def getLastAllocated(): Number | Null = js.native
    
    /**
      * Register the messageId. The messageId become occupied status.
      * If the messageId has already been occupied, then return false.
      * @param {Number} num - The messageId to request use.
      * @return {Boolean} - If `num` was not occupied, then return true, otherwise return false.
      */
    /* CompleteClass */
    override def register(num: Number): Boolean = js.native
  }
}
