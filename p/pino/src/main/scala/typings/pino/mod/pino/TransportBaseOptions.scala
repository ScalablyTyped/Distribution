package typings.pino.mod.pino

import typings.pino.anon.WorkerOptionsautoEndboole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportBaseOptions[TransportOptions] extends StObject {
  
  var options: js.UndefOr[TransportOptions] = js.undefined
  
  var worker: js.UndefOr[WorkerOptionsautoEndboole] = js.undefined
}
object TransportBaseOptions {
  
  inline def apply[TransportOptions](): TransportBaseOptions[TransportOptions] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransportBaseOptions[TransportOptions]]
  }
  
  extension [Self <: TransportBaseOptions[?], TransportOptions](x: Self & TransportBaseOptions[TransportOptions]) {
    
    inline def setOptions(value: TransportOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setWorker(value: WorkerOptionsautoEndboole): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
