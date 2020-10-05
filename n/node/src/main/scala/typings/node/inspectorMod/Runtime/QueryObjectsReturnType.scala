package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObjectsReturnType extends js.Object {
  /**
    * Array with objects.
    */
  var objects: RemoteObject = js.native
}

object QueryObjectsReturnType {
  @scala.inline
  def apply(objects: RemoteObject): QueryObjectsReturnType = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsReturnType]
  }
  @scala.inline
  implicit class QueryObjectsReturnTypeOps[Self <: QueryObjectsReturnType] (val x: Self) extends AnyVal {
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
    def setObjects(value: RemoteObject): Self = this.set("objects", value.asInstanceOf[js.Any])
  }
  
}

