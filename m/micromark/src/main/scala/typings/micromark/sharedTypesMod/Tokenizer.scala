package typings.micromark.sharedTypesMod

import typings.micromark.codesMod.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokenizer extends js.Object {
  
  def defineSkip(value: Point): Unit = js.native
  
  var events: js.Array[Event] = js.native
  
  def now(): Point = js.native
  
  var parser: Parser = js.native
  
  var previous: Code = js.native
  
  def sliceSerialize(token: Token): String = js.native
  
  def sliceStream(token: Token): js.Array[Chunk] = js.native
  
  def write(slice: js.Array[Chunk]): js.Array[Event] = js.native
}
object Tokenizer {
  
  @scala.inline
  def apply(
    defineSkip: Point => Unit,
    events: js.Array[Event],
    now: () => Point,
    parser: Parser,
    sliceSerialize: Token => String,
    sliceStream: Token => js.Array[Chunk],
    write: js.Array[Chunk] => js.Array[Event]
  ): Tokenizer = {
    val __obj = js.Dynamic.literal(defineSkip = js.Any.fromFunction1(defineSkip), events = events.asInstanceOf[js.Any], now = js.Any.fromFunction0(now), parser = parser.asInstanceOf[js.Any], sliceSerialize = js.Any.fromFunction1(sliceSerialize), sliceStream = js.Any.fromFunction1(sliceStream), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Tokenizer]
  }
  
  @scala.inline
  implicit class TokenizerOps[Self <: Tokenizer] (val x: Self) extends AnyVal {
    
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
    def setDefineSkip(value: Point => Unit): Self = this.set("defineSkip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNow(value: () => Point): Self = this.set("now", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParser(value: Parser): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceSerialize(value: Token => String): Self = this.set("sliceSerialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSliceStream(value: Token => js.Array[Chunk]): Self = this.set("sliceStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: js.Array[Chunk] => js.Array[Event]): Self = this.set("write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrevious(value: Code): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNull: Self = this.set("previous", null)
  }
}
