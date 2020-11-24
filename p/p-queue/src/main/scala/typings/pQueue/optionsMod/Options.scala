package typings.pQueue.optionsMod

import org.scalablytyped.runtime.Instantiable0
import typings.pQueue.queueMod.Queue
import typings.pQueue.queueMod.RunFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */] extends js.Object {
  
  /**
    Whether queue tasks within concurrency limit, are auto-executed as soon as they're added.
    @default true
    */
  val autoStart: js.UndefOr[Boolean] = js.native
  
  /**
    Whether the task must finish in the given interval or will be carried over into the next interval count.
    @default false
    */
  val carryoverConcurrencyCount: js.UndefOr[Boolean] = js.native
  
  /**
    Concurrency limit.
    Minimum: `1`.
    @default Infinity
    */
  val concurrency: js.UndefOr[Double] = js.native
  
  /**
    The length of time in milliseconds before the interval count resets. Must be finite.
    Minimum: `0`.
    @default 0
    */
  val interval: js.UndefOr[Double] = js.native
  
  /**
    The max number of runs in the given interval of time.
    Minimum: `1`.
    @default Infinity
    */
  val intervalCap: js.UndefOr[Double] = js.native
  
  /**
    Class with a `enqueue` and `dequeue` method, and a `size` getter. See the [Custom QueueClass](https://github.com/sindresorhus/p-queue#custom-queueclass) section.
    */
  val queueClass: js.UndefOr[Instantiable0[QueueType]] = js.native
  
  /**
    Whether or not a timeout is considered an exception.
    @default false
    */
  var throwOnTimeout: js.UndefOr[Boolean] = js.native
  
  /**
    Per-operation timeout in milliseconds. Operations fulfill once `timeout` elapses if they haven't already.
    */
  var timeout: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply[QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */](): Options[QueueType, QueueOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[QueueType, QueueOptions]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], QueueType /* <: Queue[RunFunction, QueueOptions] */, QueueOptions /* <: QueueAddOptions */] (val x: Self with (Options[QueueType, QueueOptions])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setCarryoverConcurrencyCount(value: Boolean): Self = this.set("carryoverConcurrencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarryoverConcurrencyCount: Self = this.set("carryoverConcurrencyCount", js.undefined)
    
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setIntervalCap(value: Double): Self = this.set("intervalCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalCap: Self = this.set("intervalCap", js.undefined)
    
    @scala.inline
    def setQueueClass(value: Instantiable0[QueueType]): Self = this.set("queueClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueClass: Self = this.set("queueClass", js.undefined)
    
    @scala.inline
    def setThrowOnTimeout(value: Boolean): Self = this.set("throwOnTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowOnTimeout: Self = this.set("throwOnTimeout", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
