package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellUIEvents
  extends StObject
     with IEvents {
  
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IShellUIEvents {
  
  inline def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellUIEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellUIEvents]
  }
  
  extension [Self <: IShellUIEvents](x: Self) {
    
    inline def setOnNewCommonDialogShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewCommonDialogShellFrame", js.Any.fromFunction1(value))
    
    inline def setOnNewCommonDialogShellFrameUndefined: Self = StObject.set(x, "OnNewCommonDialogShellFrame", js.undefined)
    
    inline def setOnNewEmbeddedShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewEmbeddedShellFrame", js.Any.fromFunction1(value))
    
    inline def setOnNewEmbeddedShellFrameUndefined: Self = StObject.set(x, "OnNewEmbeddedShellFrame", js.undefined)
    
    inline def setOnNewNormalShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewNormalShellFrame", js.Any.fromFunction1(value))
    
    inline def setOnNewNormalShellFrameUndefined: Self = StObject.set(x, "OnNewNormalShellFrame", js.undefined)
    
    inline def setOnNewShellFrame(value: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents): Self = StObject.set(x, "OnNewShellFrame", js.Any.fromFunction1(value))
    
    inline def setOnNewShellFrameUndefined: Self = StObject.set(x, "OnNewShellFrame", js.undefined)
    
    inline def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    inline def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
