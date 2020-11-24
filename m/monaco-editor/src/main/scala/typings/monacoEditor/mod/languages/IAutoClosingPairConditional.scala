package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutoClosingPairConditional extends IAutoClosingPair {
  
  var notIn: js.UndefOr[js.Array[String]] = js.native
}
object IAutoClosingPairConditional {
  
  @scala.inline
  def apply(close: String, open: String): IAutoClosingPairConditional = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoClosingPairConditional]
  }
  
  @scala.inline
  implicit class IAutoClosingPairConditionalOps[Self <: IAutoClosingPairConditional] (val x: Self) extends AnyVal {
    
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
    def setNotInVarargs(value: String*): Self = this.set("notIn", js.Array(value :_*))
    
    @scala.inline
    def setNotIn(value: js.Array[String]): Self = this.set("notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotIn: Self = this.set("notIn", js.undefined)
  }
}
