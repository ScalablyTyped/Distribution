package typings.papaparse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base interface for all async parsing
trait ParseAsyncConfigBase[T, TInput]
  extends StObject
     with ParseConfig[T, TInput] {
  
  /**
    * A callback function, identical to `step`, which activates streaming.
    * However, this function is executed after every chunk of the file is loaded and parsed rather than every row.
    * Works only with local and remote files.
    * Do not use both `chunk` and `step` callbacks together.
    */
  var chunk: js.UndefOr[js.Function2[/* results */ ParseResult[T], /* parser */ Parser, Unit]] = js.undefined
  
  /**
    * Overrides `Papa.LocalChunkSize` and `Papa.RemoteChunkSize`.
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A callback to execute if FileReader encounters an error.
    * The function is passed two arguments: the error and the File.
    */
  var error: js.UndefOr[js.Function2[/* error */ js.Error, /* file */ TInput, Unit]] = js.undefined
  
  /**
    * Whether or not to use a worker thread.
    * Using a worker will keep your page reactive, but may be slightly slower.
    * @default false
    */
  var worker: js.UndefOr[Boolean] = js.undefined
}
object ParseAsyncConfigBase {
  
  inline def apply[T, TInput](): ParseAsyncConfigBase[T, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseAsyncConfigBase[T, TInput]]
  }
  
  extension [Self <: ParseAsyncConfigBase[?, ?], T, TInput](x: Self & (ParseAsyncConfigBase[T, TInput])) {
    
    inline def setChunk(value: (/* results */ ParseResult[T], /* parser */ Parser) => Unit): Self = StObject.set(x, "chunk", js.Any.fromFunction2(value))
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    inline def setError(value: (/* error */ js.Error, /* file */ TInput) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setWorker(value: Boolean): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
