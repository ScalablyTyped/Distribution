package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeStreamEvents[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  def change(doc: ChangeEvent[TSchema]): Unit = js.native
  def close(): Unit = js.native
  def end(): Unit = js.native
  def error(err: MongoError): Unit = js.native
  def resumeTokenChanged(newToken: ResumeToken): Unit = js.native
}

object ChangeStreamEvents {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema](
    change: ChangeEvent[TSchema] => Unit,
    close: () => Unit,
    end: () => Unit,
    error: MongoError => Unit,
    resumeTokenChanged: ResumeToken => Unit
  ): ChangeStreamEvents[TSchema] = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), close = js.Any.fromFunction0(close), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), resumeTokenChanged = js.Any.fromFunction1(resumeTokenChanged))
    __obj.asInstanceOf[ChangeStreamEvents[TSchema]]
  }
  @scala.inline
  implicit class ChangeStreamEventsOps[Self <: ChangeStreamEvents[_], /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ TSchema] (val x: Self with ChangeStreamEvents[TSchema]) extends AnyVal {
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
    def setChange(value: ChangeEvent[TSchema] => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setError(value: MongoError => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setResumeTokenChanged(value: ResumeToken => Unit): Self = this.set("resumeTokenChanged", js.Any.fromFunction1(value))
  }
  
}

