package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.mod.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorZoom extends StObject {
  
  def getZoomLevel(): Double
  
  def onDidChangeZoomLevel(listener: js.Function1[/* e */ Double, Any]): IDisposable
  def onDidChangeZoomLevel(listener: js.Function1[/* e */ Double, Any], thisArg: Any): IDisposable
  @JSName("onDidChangeZoomLevel")
  var onDidChangeZoomLevel_Original: IEvent[Double]
  
  def setZoomLevel(zoomLevel: Double): Unit
}
object IEditorZoom {
  
  inline def apply(
    getZoomLevel: () => Double,
    onDidChangeZoomLevel: (/* listener */ js.Function1[Double, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable,
    setZoomLevel: Double => Unit
  ): IEditorZoom = {
    val __obj = js.Dynamic.literal(getZoomLevel = js.Any.fromFunction0(getZoomLevel), onDidChangeZoomLevel = js.Any.fromFunction2(onDidChangeZoomLevel), setZoomLevel = js.Any.fromFunction1(setZoomLevel))
    __obj.asInstanceOf[IEditorZoom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEditorZoom] (val x: Self) extends AnyVal {
    
    inline def setGetZoomLevel(value: () => Double): Self = StObject.set(x, "getZoomLevel", js.Any.fromFunction0(value))
    
    inline def setOnDidChangeZoomLevel(value: (/* listener */ js.Function1[Double, Any], /* thisArg */ js.UndefOr[Any]) => IDisposable): Self = StObject.set(x, "onDidChangeZoomLevel", js.Any.fromFunction2(value))
    
    inline def setSetZoomLevel(value: Double => Unit): Self = StObject.set(x, "setZoomLevel", js.Any.fromFunction1(value))
  }
}
