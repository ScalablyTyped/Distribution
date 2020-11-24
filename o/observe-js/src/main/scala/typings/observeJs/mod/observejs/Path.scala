package typings.observeJs.mod.observejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*----------------------
  Path
  ----------------------*/
@js.native
trait Path extends js.Object {
  
  /**
    * Returns the current value of the path from the provided object. If eval() is available,
    * a compiled getter will be used for better performance. Like PathObserver above, undefined
    * is returned unless you provide an overriding defaultValue.
    */
  def getValueFrom(`object`: js.Any, defaultValue: js.Any): js.Any = js.native
}
object Path {
  
  @scala.inline
  def apply(getValueFrom: (js.Any, js.Any) => js.Any): Path = {
    val __obj = js.Dynamic.literal(getValueFrom = js.Any.fromFunction2(getValueFrom))
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    
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
    def setGetValueFrom(value: (js.Any, js.Any) => js.Any): Self = this.set("getValueFrom", js.Any.fromFunction2(value))
  }
}
