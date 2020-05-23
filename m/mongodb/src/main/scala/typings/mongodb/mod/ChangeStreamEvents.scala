package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeStreamEvents[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  def change(doc: ChangeEvent[TSchema]): Unit
  def close(): Unit
  def end(): Unit
  def error(err: MongoError): Unit
  def resumeTokenChanged(newToken: ResumeToken): Unit
}

object ChangeStreamEvents {
  @scala.inline
  def apply[TSchema](
    change: ChangeEvent[TSchema] => Unit,
    close: () => Unit,
    end: () => Unit,
    error: MongoError => Unit,
    resumeTokenChanged: ResumeToken => Unit
  ): ChangeStreamEvents[TSchema] = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), close = js.Any.fromFunction0(close), end = js.Any.fromFunction0(end), error = js.Any.fromFunction1(error), resumeTokenChanged = js.Any.fromFunction1(resumeTokenChanged))
    __obj.asInstanceOf[ChangeStreamEvents[TSchema]]
  }
}

