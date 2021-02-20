package typings.pQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions> */
  @js.native
  trait PartialPriorityQueueOptio extends StObject {
    
    var priority: js.UndefOr[Double] = js.native
  }
  object PartialPriorityQueueOptio {
    
    @scala.inline
    def apply(): PartialPriorityQueueOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPriorityQueueOptio]
    }
    
    @scala.inline
    implicit class PartialPriorityQueueOptioMutableBuilder[Self <: PartialPriorityQueueOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Partial<p-queue.p-queue/dist/priority-queue.PriorityQueueOptions>> */
  @js.native
  trait ReadonlyPartialPriorityQu extends StObject {
    
    val priority: js.UndefOr[Double] = js.native
  }
  object ReadonlyPartialPriorityQu {
    
    @scala.inline
    def apply(): ReadonlyPartialPriorityQu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialPriorityQu]
    }
    
    @scala.inline
    implicit class ReadonlyPartialPriorityQuMutableBuilder[Self <: ReadonlyPartialPriorityQu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
