package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigResultWithFilePath[T] extends StObject {
  
  var contents: T
  
  var filePath: FilePath
}
object ConfigResultWithFilePath {
  
  inline def apply[T](contents: T, filePath: FilePath): ConfigResultWithFilePath[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigResultWithFilePath[T]]
  }
  
  extension [Self <: ConfigResultWithFilePath[?], T](x: Self & ConfigResultWithFilePath[T]) {
    
    inline def setContents(value: T): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
