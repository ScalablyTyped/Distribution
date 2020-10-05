package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coverage data for a JavaScript script.
  */
@js.native
trait ScriptCoverage extends js.Object {
  /**
    * Functions contained in the script that has coverage data.
    */
  var functions: js.Array[FunctionCoverage] = js.native
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId = js.native
  /**
    * JavaScript script name or url.
    */
  var url: String = js.native
}

object ScriptCoverage {
  @scala.inline
  def apply(functions: js.Array[FunctionCoverage], scriptId: ScriptId, url: String): ScriptCoverage = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptCoverage]
  }
  @scala.inline
  implicit class ScriptCoverageOps[Self <: ScriptCoverage] (val x: Self) extends AnyVal {
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
    def setFunctionsVarargs(value: FunctionCoverage*): Self = this.set("functions", js.Array(value :_*))
    @scala.inline
    def setFunctions(value: js.Array[FunctionCoverage]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

