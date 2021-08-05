package typings.pQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions> */
  trait PartialPriorityQueueOptio extends StObject {
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object PartialPriorityQueueOptio {
    
    inline def apply(): PartialPriorityQueueOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPriorityQueueOptio]
    }
    
    extension [Self <: PartialPriorityQueueOptio](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions>> */
  trait ReadonlyPartialPriorityQu extends StObject {
    
    val priority: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyPartialPriorityQu {
    
    inline def apply(): ReadonlyPartialPriorityQu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialPriorityQu]
    }
    
    extension [Self <: ReadonlyPartialPriorityQu](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
