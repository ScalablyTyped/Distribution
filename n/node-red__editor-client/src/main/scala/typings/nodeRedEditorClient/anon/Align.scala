package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[right | left] = js.undefined
  
  var dispose: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var target: JQuery[HTMLElement]
}
object Align {
  
  inline def apply(target: JQuery[HTMLElement]): Align = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: right | left): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setDispose(value: Boolean): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTarget(value: JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
