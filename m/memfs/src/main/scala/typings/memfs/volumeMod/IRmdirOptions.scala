package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRmdirOptions extends StObject {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object IRmdirOptions {
  
  inline def apply(): IRmdirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRmdirOptions]
  }
  
  extension [Self <: IRmdirOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
