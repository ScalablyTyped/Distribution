package typings.memfs.libVolumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFStatOptions extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.undefined
}
object IFStatOptions {
  
  inline def apply(): IFStatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFStatOptions]
  }
  
  extension [Self <: IFStatOptions](x: Self) {
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
  }
}
