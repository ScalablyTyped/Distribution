package typings.pQueue

import typings.pQueue.anon.PartialPriorityQueueOptio
import typings.pQueue.anon.ReadonlyPartialPriorityQu
import typings.pQueue.distOptionsMod.QueueAddOptions
import typings.pQueue.distQueueMod.Queue
import typings.pQueue.distQueueMod.RunFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPriorityQueueMod {
  
  @JSImport("p-queue/dist/priority-queue", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PriorityQueue
  
  @js.native
  trait PriorityQueue
    extends StObject
       with Queue[RunFunction, PriorityQueueOptions] {
    
    def enqueue(run: RunFunction, options: PartialPriorityQueueOptio): Unit = js.native
    
    def filter(options: ReadonlyPartialPriorityQu): js.Array[RunFunction] = js.native
    
    /* private */ var `private`: Any = js.native
    
    @JSName("size")
    def size_MPriorityQueue: Double = js.native
  }
  
  trait PriorityQueueOptions
    extends StObject
       with QueueAddOptions
  object PriorityQueueOptions {
    
    inline def apply(): PriorityQueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PriorityQueueOptions]
    }
  }
}
