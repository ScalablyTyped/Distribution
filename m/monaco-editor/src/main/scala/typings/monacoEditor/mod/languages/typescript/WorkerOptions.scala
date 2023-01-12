package typings.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerOptions extends StObject {
  
  /** A full HTTP path to a JavaScript file which adds a function `customTSWorkerFactory` to the self inside a web-worker */
  var customWorkerPath: js.UndefOr[String] = js.undefined
}
object WorkerOptions {
  
  inline def apply(): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomWorkerPath(value: String): Self = StObject.set(x, "customWorkerPath", value.asInstanceOf[js.Any])
    
    inline def setCustomWorkerPathUndefined: Self = StObject.set(x, "customWorkerPath", js.undefined)
  }
}
