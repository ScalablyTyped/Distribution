package typings.memfs.libVolumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReaddirOptions
  extends StObject
     with IOptions {
  
  var withFileTypes: js.UndefOr[Boolean] = js.undefined
}
object IReaddirOptions {
  
  inline def apply(): IReaddirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReaddirOptions]
  }
  
  extension [Self <: IReaddirOptions](x: Self) {
    
    inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
