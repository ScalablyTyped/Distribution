package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySnapshotOptions extends StObject {
  
  var closeExistingWindows: js.UndefOr[Boolean] = js.undefined
  
  var skipOutOfBoundsCheck: js.UndefOr[Boolean] = js.undefined
}
object ApplySnapshotOptions {
  
  inline def apply(): ApplySnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySnapshotOptions]
  }
  
  extension [Self <: ApplySnapshotOptions](x: Self) {
    
    inline def setCloseExistingWindows(value: Boolean): Self = StObject.set(x, "closeExistingWindows", value.asInstanceOf[js.Any])
    
    inline def setCloseExistingWindowsUndefined: Self = StObject.set(x, "closeExistingWindows", js.undefined)
    
    inline def setSkipOutOfBoundsCheck(value: Boolean): Self = StObject.set(x, "skipOutOfBoundsCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipOutOfBoundsCheckUndefined: Self = StObject.set(x, "skipOutOfBoundsCheck", js.undefined)
  }
}
