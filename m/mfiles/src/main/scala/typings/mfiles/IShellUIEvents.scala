package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellUIEvents extends IEvents {
  
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.native
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}
object IShellUIEvents {
  
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellUIEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellUIEvents]
  }
  
  @scala.inline
  implicit class IShellUIEventsMutableBuilder[Self <: IShellUIEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnNewCommonDialogShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewCommonDialogShellFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewCommonDialogShellFrameUndefined: Self = StObject.set(x, "OnNewCommonDialogShellFrame", js.undefined)
    
    @scala.inline
    def setOnNewEmbeddedShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewEmbeddedShellFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewEmbeddedShellFrameUndefined: Self = StObject.set(x, "OnNewEmbeddedShellFrame", js.undefined)
    
    @scala.inline
    def setOnNewNormalShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewNormalShellFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewNormalShellFrameUndefined: Self = StObject.set(x, "OnNewNormalShellFrame", js.undefined)
    
    @scala.inline
    def setOnNewShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewShellFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNewShellFrameUndefined: Self = StObject.set(x, "OnNewShellFrame", js.undefined)
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
