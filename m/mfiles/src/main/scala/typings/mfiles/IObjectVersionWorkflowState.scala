package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionWorkflowState extends js.Object {
  var State: IPropertyValue
  var VersionComment: IPropertyValue
  var Workflow: IPropertyValue
}

object IObjectVersionWorkflowState {
  @scala.inline
  def apply(State: IPropertyValue, VersionComment: IPropertyValue, Workflow: IPropertyValue): IObjectVersionWorkflowState = {
    val __obj = js.Dynamic.literal(State = State, VersionComment = VersionComment, Workflow = Workflow)
  
    __obj.asInstanceOf[IObjectVersionWorkflowState]
  }
}

