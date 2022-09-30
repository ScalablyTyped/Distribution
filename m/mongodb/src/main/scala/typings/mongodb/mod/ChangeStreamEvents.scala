package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeStreamEvents[TSchema /* <: Document */, TChange /* <: Document */]
  extends StObject
     with AbstractCursorEvents {
  
  def change(change: TChange): Unit = js.native
  
  def end(): Unit = js.native
  
  def error(error: js.Error): Unit = js.native
  
  def init(response: Any): Unit = js.native
  
  def more(): Unit = js.native
  def more(response: Any): Unit = js.native
  
  def response(): Unit = js.native
  
  def resumeTokenChanged(token: ResumeToken): Unit = js.native
}
