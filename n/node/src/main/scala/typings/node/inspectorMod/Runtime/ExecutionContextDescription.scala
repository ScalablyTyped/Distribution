package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of an isolated world.
  */
@js.native
trait ExecutionContextDescription extends js.Object {
  /**
    * Embedder-specific auxiliary data.
    */
  var auxData: js.UndefOr[js.Object] = js.native
  /**
    * Unique id of the execution context. It can be used to specify in which execution context script evaluation should be performed.
    */
  var id: ExecutionContextId = js.native
  /**
    * Human readable name describing given context.
    */
  var name: String = js.native
  /**
    * Execution context origin.
    */
  var origin: String = js.native
}

object ExecutionContextDescription {
  @scala.inline
  def apply(id: ExecutionContextId, name: String, origin: String): ExecutionContextDescription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDescription]
  }
  @scala.inline
  implicit class ExecutionContextDescriptionOps[Self <: ExecutionContextDescription] (val x: Self) extends AnyVal {
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
    def setId(value: ExecutionContextId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuxData(value: js.Object): Self = this.set("auxData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxData: Self = this.set("auxData", js.undefined)
  }
  
}

