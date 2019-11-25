package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticPermissions extends js.Object {
  var CanDeactivate: Boolean
  val IsBasedOnObjectACL: Boolean
  val IsDefault: Boolean
  val NamedACL: INamedACL
  def Clone(): IAutomaticPermissions
  def SetBasedOnObjectACL(): Unit
  def SetNamedACL(NamedACL: INamedACL): Unit
}

object IAutomaticPermissions {
  @scala.inline
  def apply(
    CanDeactivate: Boolean,
    Clone: () => IAutomaticPermissions,
    IsBasedOnObjectACL: Boolean,
    IsDefault: Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: () => Unit,
    SetNamedACL: INamedACL => Unit
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal(CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), IsBasedOnObjectACL = IsBasedOnObjectACL.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], SetBasedOnObjectACL = js.Any.fromFunction0(SetBasedOnObjectACL), SetNamedACL = js.Any.fromFunction1(SetNamedACL))
  
    __obj.asInstanceOf[IAutomaticPermissions]
  }
}

