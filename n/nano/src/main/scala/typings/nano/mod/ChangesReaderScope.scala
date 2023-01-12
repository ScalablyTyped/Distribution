package typings.nano.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ChangesReader functions */
trait ChangesReaderScope extends StObject {
  
  /** fetch changes and stop when an empty batch is received */
  def get(opts: ChangesReaderOptions): EventEmitter
  
  /** pause consuming the changes feed */
  def pause(): Unit
  
  /** resume consuming the changes feed */
  def resume(): Unit
  
  /** spool the change in one long feed, instead of batches */
  def spool(opts: ChangesReaderOptions): EventEmitter
  
  /** fetch changes forever */
  def start(opts: ChangesReaderOptions): EventEmitter
  
  /** stop consuming the changes feed */
  def stop(): Unit
}
object ChangesReaderScope {
  
  inline def apply(
    get: ChangesReaderOptions => EventEmitter,
    pause: () => Unit,
    resume: () => Unit,
    spool: ChangesReaderOptions => EventEmitter,
    start: ChangesReaderOptions => EventEmitter,
    stop: () => Unit
  ): ChangesReaderScope = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), spool = js.Any.fromFunction1(spool), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[ChangesReaderScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangesReaderScope] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ChangesReaderOptions => EventEmitter): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    inline def setSpool(value: ChangesReaderOptions => EventEmitter): Self = StObject.set(x, "spool", js.Any.fromFunction1(value))
    
    inline def setStart(value: ChangesReaderOptions => EventEmitter): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
