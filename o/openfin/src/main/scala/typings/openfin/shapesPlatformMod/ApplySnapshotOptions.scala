package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySnapshotOptions extends StObject {
  
  var closeExistingWindows: js.UndefOr[Boolean] = js.native
  
  var skipOutOfBoundsCheck: js.UndefOr[Boolean] = js.native
}
object ApplySnapshotOptions {
  
  @scala.inline
  def apply(): ApplySnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySnapshotOptions]
  }
  
  @scala.inline
  implicit class ApplySnapshotOptionsMutableBuilder[Self <: ApplySnapshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseExistingWindows(value: Boolean): Self = StObject.set(x, "closeExistingWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseExistingWindowsUndefined: Self = StObject.set(x, "closeExistingWindows", js.undefined)
    
    @scala.inline
    def setSkipOutOfBoundsCheck(value: Boolean): Self = StObject.set(x, "skipOutOfBoundsCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOutOfBoundsCheckUndefined: Self = StObject.set(x, "skipOutOfBoundsCheck", js.undefined)
  }
}
