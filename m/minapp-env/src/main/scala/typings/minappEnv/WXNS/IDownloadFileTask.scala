package typings.minappEnv.WXNS

import typings.minappEnv.AnyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDownloadFileTask extends StObject {
  
  def abort(args: js.Any*): js.Any
  @JSName("abort")
  var abort_Original: AnyFunction
  
  def onProgressUpdate(fn: js.Function1[/* event */ IProgressUpdateEvent, Unit]): Unit
}
object IDownloadFileTask {
  
  @scala.inline
  def apply(abort: AnyFunction, onProgressUpdate: js.Function1[/* event */ IProgressUpdateEvent, Unit] => Unit): IDownloadFileTask = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
    __obj.asInstanceOf[IDownloadFileTask]
  }
  
  @scala.inline
  implicit class IDownloadFileTaskMutableBuilder[Self <: IDownloadFileTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: AnyFunction): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProgressUpdate(value: js.Function1[/* event */ IProgressUpdateEvent, Unit] => Unit): Self = StObject.set(x, "onProgressUpdate", js.Any.fromFunction1(value))
  }
}
