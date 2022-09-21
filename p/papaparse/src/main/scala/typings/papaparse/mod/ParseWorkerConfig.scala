package typings.papaparse.mod

import typings.papaparse.papaparseBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseWorkerConfig[T]
  extends StObject
     with ParseConfig[T, Unit] {
  
  /**
    * The callback to execute when parsing is complete.
    * It receives the parse results. If parsing a local file, the File is passed in, too.
    * When streaming, parse results are not available in this callback.
    */
  @JSName("complete")
  def complete_MParseWorkerConfig(results: ParseResult[T]): Unit
  
  /**
    * Whether or not to use a worker thread.
    * Using a worker will keep your page reactive, but may be slightly slower.
    */
  var worker: `true`
}
object ParseWorkerConfig {
  
  inline def apply[T](complete: ParseResult[T] => Unit): ParseWorkerConfig[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), worker = true)
    __obj.asInstanceOf[ParseWorkerConfig[T]]
  }
  
  extension [Self <: ParseWorkerConfig[?], T](x: Self & ParseWorkerConfig[T]) {
    
    inline def setComplete(value: ParseResult[T] => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setWorker(value: `true`): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
  }
}
