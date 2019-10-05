package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueIconClue extends js.Object {
  val PropertyDef: MFBuiltInPropertyDef | Double
  val ValueListItem: Double
  def Clone(): IPropertyValueIconClue
}

object IPropertyValueIconClue {
  @scala.inline
  def apply(
    Clone: () => IPropertyValueIconClue,
    PropertyDef: MFBuiltInPropertyDef | Double,
    ValueListItem: Double
  ): IPropertyValueIconClue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], ValueListItem = ValueListItem)
  
    __obj.asInstanceOf[IPropertyValueIconClue]
  }
}

