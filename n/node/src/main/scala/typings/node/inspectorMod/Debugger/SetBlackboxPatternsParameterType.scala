package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBlackboxPatternsParameterType extends js.Object {
  /**
    * Array of regexps that will be used to check script url for blackbox state.
    */
  var patterns: js.Array[String] = js.native
}

object SetBlackboxPatternsParameterType {
  @scala.inline
  def apply(patterns: js.Array[String]): SetBlackboxPatternsParameterType = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlackboxPatternsParameterType]
  }
  @scala.inline
  implicit class SetBlackboxPatternsParameterTypeOps[Self <: SetBlackboxPatternsParameterType] (val x: Self) extends AnyVal {
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
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
  }
  
}

