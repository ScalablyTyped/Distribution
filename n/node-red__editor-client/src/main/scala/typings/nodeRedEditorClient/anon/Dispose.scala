package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  var align: js.UndefOr[right | left] = js.undefined
  
  var dispose: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  def onclose(): Unit
  
  var target: JQuery[HTMLElement]
}
object Dispose {
  
  inline def apply(onclose: () => Unit, target: JQuery[HTMLElement]): Dispose = {
    val __obj = js.Dynamic.literal(onclose = js.Any.fromFunction0(onclose), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose]
  }
  
  extension [Self <: Dispose](x: Self) {
    
    inline def setAlign(value: right | left): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setDispose(value: Boolean): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
    
    inline def setTarget(value: JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
