package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesWithIconClues extends js.Object {
  val IconClues: IPropertyValueIconClues
  val ObjVer: IObjVer
  val PropertyValues: IPropertyValues
  def Clone(): IPropertyValuesWithIconClues
}

object IPropertyValuesWithIconClues {
  @scala.inline
  def apply(
    Clone: () => IPropertyValuesWithIconClues,
    IconClues: IPropertyValueIconClues,
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues
  ): IPropertyValuesWithIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IconClues = IconClues.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValues = PropertyValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPropertyValuesWithIconClues]
  }
}

