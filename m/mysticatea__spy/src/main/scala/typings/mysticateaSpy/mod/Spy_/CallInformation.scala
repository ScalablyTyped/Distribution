package typings.mysticateaSpy.mod.Spy_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information for calls on a spy. */
@js.native
trait CallInformation[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  
  /** Information for each call. */
  val calls: js.Array[Call[T]] = js.native
  
  /** Information of the first call. */
  val firstCall: Call[T] | Null = js.native
  
  /** Information of the first returned call. */
  val firstReturnedCall: ReturnedCall[T] | Null = js.native
  
  /** Information of the first thrown call. */
  val firstThrownCall: ThrownCall[T] | Null = js.native
  
  /** Information of the last call. */
  val lastCall: Call[T] | Null = js.native
  
  /** Information of the last returned call. */
  val lastReturnedCall: ReturnedCall[T] | Null = js.native
  
  /** Information of the last thrown call. */
  val lastThrownCall: ThrownCall[T] | Null = js.native
  
  /** Reset calls. */
  def reset(): Unit = js.native
  
  /** Information for each returned call. */
  val returnedCalls: js.Array[ReturnedCall[T]] = js.native
  
  /** Information for each thrown call. */
  val thrownCalls: js.Array[ThrownCall[T]] = js.native
}
object CallInformation {
  
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    calls: js.Array[Call[T]],
    reset: () => Unit,
    returnedCalls: js.Array[ReturnedCall[T]],
    thrownCalls: js.Array[ThrownCall[T]]
  ): CallInformation[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), returnedCalls = returnedCalls.asInstanceOf[js.Any], thrownCalls = thrownCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInformation[T]]
  }
  
  @scala.inline
  implicit class CallInformationOps[Self <: CallInformation[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with CallInformation[T]) extends AnyVal {
    
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
    def setCallsVarargs(value: Call[T]*): Self = this.set("calls", js.Array(value :_*))
    
    @scala.inline
    def setCalls(value: js.Array[Call[T]]): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReturnedCallsVarargs(value: ReturnedCall[T]*): Self = this.set("returnedCalls", js.Array(value :_*))
    
    @scala.inline
    def setReturnedCalls(value: js.Array[ReturnedCall[T]]): Self = this.set("returnedCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrownCallsVarargs(value: ThrownCall[T]*): Self = this.set("thrownCalls", js.Array(value :_*))
    
    @scala.inline
    def setThrownCalls(value: js.Array[ThrownCall[T]]): Self = this.set("thrownCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCall(value: Call[T]): Self = this.set("firstCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstCallNull: Self = this.set("firstCall", null)
    
    @scala.inline
    def setFirstReturnedCall(value: ReturnedCall[T]): Self = this.set("firstReturnedCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstReturnedCallNull: Self = this.set("firstReturnedCall", null)
    
    @scala.inline
    def setFirstThrownCall(value: ThrownCall[T]): Self = this.set("firstThrownCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstThrownCallNull: Self = this.set("firstThrownCall", null)
    
    @scala.inline
    def setLastCall(value: Call[T]): Self = this.set("lastCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastCallNull: Self = this.set("lastCall", null)
    
    @scala.inline
    def setLastReturnedCall(value: ReturnedCall[T]): Self = this.set("lastReturnedCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReturnedCallNull: Self = this.set("lastReturnedCall", null)
    
    @scala.inline
    def setLastThrownCall(value: ThrownCall[T]): Self = this.set("lastThrownCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastThrownCallNull: Self = this.set("lastThrownCall", null)
  }
}
