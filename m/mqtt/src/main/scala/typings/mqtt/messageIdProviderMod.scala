package typings.mqtt

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageIdProviderMod {
  
  trait IMessageIdProvider extends StObject {
    
    /**
      * Allocate the first vacant messageId. The messageId become occupied status.
      * @return {Number} - The first vacant messageId. If all messageIds are occupied, return null.
      */
    def allocate(): Number | Null
    
    /**
      * Clear all occupied messageIds.
      * The all messageIds are set to vacant status.
      */
    def clear(): Unit
    
    /**
      * Deallocate the messageId. The messageId become vacant status.
      * @param {Number} num - The messageId to deallocate. The messageId must be occupied status.
      *                       In other words, the messageId must be allocated by allocate() or
      *                       occupied by register().
      */
    def deallocate(num: Number): Unit
    
    /**
      * Get the last allocated messageId.
      * @return {Number} - messageId.
      */
    def getLastAllocated(): Number | Null
    
    /**
      * Register the messageId. The messageId become occupied status.
      * If the messageId has already been occupied, then return false.
      * @param {Number} num - The messageId to request use.
      * @return {Boolean} - If `num` was not occupied, then return true, otherwise return false.
      */
    def register(num: Number): Boolean
  }
  object IMessageIdProvider {
    
    inline def apply(
      allocate: () => Number | Null,
      clear: () => Unit,
      deallocate: Number => Unit,
      getLastAllocated: () => Number | Null,
      register: Number => Boolean
    ): IMessageIdProvider = {
      val __obj = js.Dynamic.literal(allocate = js.Any.fromFunction0(allocate), clear = js.Any.fromFunction0(clear), deallocate = js.Any.fromFunction1(deallocate), getLastAllocated = js.Any.fromFunction0(getLastAllocated), register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[IMessageIdProvider]
    }
    
    extension [Self <: IMessageIdProvider](x: Self) {
      
      inline def setAllocate(value: () => Number | Null): Self = StObject.set(x, "allocate", js.Any.fromFunction0(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDeallocate(value: Number => Unit): Self = StObject.set(x, "deallocate", js.Any.fromFunction1(value))
      
      inline def setGetLastAllocated(value: () => Number | Null): Self = StObject.set(x, "getLastAllocated", js.Any.fromFunction0(value))
      
      inline def setRegister(value: Number => Boolean): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
}
