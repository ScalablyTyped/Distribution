package typings.memfs.libVolumeMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IReadFileOptions] (val x: Self) extends AnyVal {
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
