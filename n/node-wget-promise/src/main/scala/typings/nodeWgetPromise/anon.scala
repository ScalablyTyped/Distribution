package typings.nodeWgetPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OnProgress extends StObject {
    
    var onProgress: js.UndefOr[js.Any] = js.undefined
    
    var onStart: js.UndefOr[js.Any] = js.undefined
    
    var output: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object OnProgress {
    
    inline def apply(): OnProgress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnProgress]
    }
    
    extension [Self <: OnProgress](x: Self) {
      
      inline def setOnProgress(value: js.Any): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnStart(value: js.Any): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
