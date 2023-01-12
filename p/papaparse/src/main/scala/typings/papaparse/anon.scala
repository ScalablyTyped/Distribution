package typings.papaparse

import typings.papaparse.papaparseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Download extends StObject {
    
    var download: js.UndefOr[`false`] = js.undefined
  }
  object Download {
    
    inline def apply(): Download = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Download]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Download] (val x: Self) extends AnyVal {
      
      inline def setDownload(value: `false`): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    }
  }
  
  trait Worker extends StObject {
    
    var download: js.UndefOr[`false`] = js.undefined
    
    var worker: js.UndefOr[`false`] = js.undefined
  }
  object Worker {
    
    inline def apply(): Worker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Worker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Worker] (val x: Self) extends AnyVal {
      
      inline def setDownload(value: `false`): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setWorker(value: `false`): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
}
