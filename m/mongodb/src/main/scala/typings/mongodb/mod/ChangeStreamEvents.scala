package typings.mongodb.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamEvents[TSchema /* <: StringDictionary[js.Any] */] extends StObject {
  
  def change(doc: ChangeEvent[TSchema]): Unit
  
  def close(): Unit
  
  def end(): Unit
  
  def error(err: MongoError): Unit
  
  def resumeTokenChanged(newToken: ResumeToken): Unit
}
object ChangeStreamEvents {
  
  @scala.inline
  def apply[TSchema /* <: StringDictionary[js.Any] */](
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
  implicit class ChangeStreamEventsMutableBuilder[Self <: ChangeStreamEvents[?], TSchema /* <: StringDictionary[js.Any] */] (val x: Self & ChangeStreamEvents[TSchema]) extends AnyVal {
    
    @scala.inline
    def setChange(value: ChangeEvent[TSchema] => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: MongoError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeTokenChanged(value: ResumeToken => Unit): Self = StObject.set(x, "resumeTokenChanged", js.Any.fromFunction1(value))
  }
}
