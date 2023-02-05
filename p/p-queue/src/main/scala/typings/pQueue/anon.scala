package typings.pQueue

import typings.pQueue.pQueueBooleans.`true`
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions> */
  trait PartialPriorityQueueOptio extends StObject {
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var throwOnTimeout: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PartialPriorityQueueOptio {
    
    inline def apply(): PartialPriorityQueueOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPriorityQueueOptio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPriorityQueueOptio] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setThrowOnTimeout(value: Boolean): Self = StObject.set(x, "throwOnTimeout", value.asInstanceOf[js.Any])
      
      inline def setThrowOnTimeoutUndefined: Self = StObject.set(x, "throwOnTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions>> */
  trait ReadonlyPartialPriorityQu extends StObject {
    
    val priority: js.UndefOr[Double] = js.undefined
    
    val signal: js.UndefOr[AbortSignal] = js.undefined
    
    val throwOnTimeout: js.UndefOr[Boolean] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyPartialPriorityQu {
    
    inline def apply(): ReadonlyPartialPriorityQu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialPriorityQu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyPartialPriorityQu] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setThrowOnTimeout(value: Boolean): Self = StObject.set(x, "throwOnTimeout", value.asInstanceOf[js.Any])
      
      inline def setThrowOnTimeoutUndefined: Self = StObject.set(x, "throwOnTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ThrowOnTimeout extends StObject {
    
    var throwOnTimeout: `true`
  }
  object ThrowOnTimeout {
    
    inline def apply(): ThrowOnTimeout = {
      val __obj = js.Dynamic.literal(throwOnTimeout = true)
      __obj.asInstanceOf[ThrowOnTimeout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrowOnTimeout] (val x: Self) extends AnyVal {
      
      inline def setThrowOnTimeout(value: `true`): Self = StObject.set(x, "throwOnTimeout", value.asInstanceOf[js.Any])
    }
  }
}
