package typings.parcelSourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ReadFile extends StObject {
    
    def readFile(path: String, encoding: String): js.Promise[String]
  }
  object ReadFile {
    
    inline def apply(readFile: (String, String) => js.Promise[String]): ReadFile = {
      val __obj = js.Dynamic.literal(readFile = js.Any.fromFunction2(readFile))
      __obj.asInstanceOf[ReadFile]
    }
    
    extension [Self <: ReadFile](x: Self) {
      
      inline def setReadFile(value: (String, String) => js.Promise[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction2(value))
    }
  }
}
