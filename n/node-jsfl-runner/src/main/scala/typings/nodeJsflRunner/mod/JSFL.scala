package typings.nodeJsflRunner.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSFL
  extends /* index */ StringDictionary[js.Any] {
  
  def init(args: js.Any*): Unit = js.native
}
object JSFL {
  
  @scala.inline
  def apply(init: /* repeated */ js.Any => Unit): JSFL = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[JSFL]
  }
  
  @scala.inline
  implicit class JSFLOps[Self <: JSFL] (val x: Self) extends AnyVal {
    
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
    def setInit(value: /* repeated */ js.Any => Unit): Self = this.set("init", js.Any.fromFunction1(value))
  }
}
