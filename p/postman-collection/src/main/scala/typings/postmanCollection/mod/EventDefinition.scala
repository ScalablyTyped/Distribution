package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDefinition extends PropertyDefinition {
  var listen: js.UndefOr[String] = js.native
  var script: String | js.Array[String] | ScriptDefinition | Script = js.native
}

object EventDefinition {
  @scala.inline
  def apply(script: String | js.Array[String] | ScriptDefinition | Script): EventDefinition = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDefinition]
  }
  @scala.inline
  implicit class EventDefinitionOps[Self <: EventDefinition] (val x: Self) extends AnyVal {
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
    def setScriptVarargs(value: String*): Self = this.set("script", js.Array(value :_*))
    @scala.inline
    def setScript(value: String | js.Array[String] | ScriptDefinition | Script): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setListen(value: String): Self = this.set("listen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListen: Self = this.set("listen", js.undefined)
  }
  
}

