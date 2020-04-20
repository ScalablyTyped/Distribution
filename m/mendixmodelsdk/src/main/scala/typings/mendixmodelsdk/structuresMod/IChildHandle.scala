package typings.mendixmodelsdk.structuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChildHandle extends js.Object {
  var containingProperty: AbstractStructureProperty
  def delete(): Unit
  def detach(): Unit
}

object IChildHandle {
  @scala.inline
  def apply(containingProperty: AbstractStructureProperty, delete: () => Unit, detach: () => Unit): IChildHandle = {
    val __obj = js.Dynamic.literal(containingProperty = containingProperty.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), detach = js.Any.fromFunction0(detach))
    __obj.asInstanceOf[IChildHandle]
  }
}

