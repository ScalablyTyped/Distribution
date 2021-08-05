package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalWorkerOptions extends StObject {
  
  var workerSrc: String
}
object GlobalWorkerOptions {
  
  inline def apply(workerSrc: String): GlobalWorkerOptions = {
    val __obj = js.Dynamic.literal(workerSrc = workerSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalWorkerOptions]
  }
  
  extension [Self <: GlobalWorkerOptions](x: Self) {
    
    inline def setWorkerSrc(value: String): Self = StObject.set(x, "workerSrc", value.asInstanceOf[js.Any])
  }
}
