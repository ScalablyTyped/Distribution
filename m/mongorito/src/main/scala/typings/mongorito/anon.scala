package typings.mongorito

import typings.mongodb.mod.ReadPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Any
    
    var method: String
  }
  object Args {
    
    inline def apply(args: js.Any, method: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchSize extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var readPreference: js.UndefOr[ReadPreference | String] = js.undefined
  }
  object BatchSize {
    
    inline def apply(): BatchSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchSize]
    }
    
    extension [Self <: BatchSize](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setReadPreference(value: ReadPreference | String): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
      
      inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    }
  }
}
