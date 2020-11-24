package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartFactory[TChart /* <: Nvd3Element */] extends js.Object {
  
  var callback: js.UndefOr[js.Function1[/* chart */ TChart, Unit]] = js.native
  
  def generate(): TChart = js.native
}
object ChartFactory {
  
  @scala.inline
  def apply[TChart /* <: Nvd3Element */](generate: () => TChart): ChartFactory[TChart] = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
    __obj.asInstanceOf[ChartFactory[TChart]]
  }
  
  @scala.inline
  implicit class ChartFactoryOps[Self <: ChartFactory[_], TChart /* <: Nvd3Element */] (val x: Self with ChartFactory[TChart]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGenerate(value: () => TChart): Self = this.set("generate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallback(value: /* chart */ TChart => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
  }
}
