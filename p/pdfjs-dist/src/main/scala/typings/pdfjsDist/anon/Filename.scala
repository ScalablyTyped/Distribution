package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filename extends StObject {
  
  var filename: Any
}
object Filename {
  
  inline def apply(filename: Any): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
  
  extension [Self <: Filename](x: Self) {
    
    inline def setFilename(value: Any): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
  }
}
