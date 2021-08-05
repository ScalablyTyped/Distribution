package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReadFileOptions
  extends StObject
     with IOptions {
  
  var flag: js.UndefOr[String] = js.undefined
}
object IReadFileOptions {
  
  inline def apply(): IReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadFileOptions]
  }
  
  extension [Self <: IReadFileOptions](x: Self) {
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
