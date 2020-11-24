package typings.nano.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesReaderScope extends js.Object {
  
  // fetch changes and stop when an empty batch is received
  def get(opts: ChangesReaderOptions): EventEmitter = js.native
  
  // spool the change in one long feed, instead of batches
  def spool(opts: ChangesReaderOptions): EventEmitter = js.native
  
  // fetch changes forever
  def start(opts: ChangesReaderOptions): EventEmitter = js.native
  
  // stop consuming the changes feed
  def stop(): Unit = js.native
}
object ChangesReaderScope {
  
  @scala.inline
  def apply(
    get: ChangesReaderOptions => EventEmitter,
    spool: ChangesReaderOptions => EventEmitter,
    start: ChangesReaderOptions => EventEmitter,
    stop: () => Unit
  ): ChangesReaderScope = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), spool = js.Any.fromFunction1(spool), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[ChangesReaderScope]
  }
  
  @scala.inline
  implicit class ChangesReaderScopeOps[Self <: ChangesReaderScope] (val x: Self) extends AnyVal {
    
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
    def setGet(value: ChangesReaderOptions => EventEmitter): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpool(value: ChangesReaderOptions => EventEmitter): Self = this.set("spool", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: ChangesReaderOptions => EventEmitter): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
