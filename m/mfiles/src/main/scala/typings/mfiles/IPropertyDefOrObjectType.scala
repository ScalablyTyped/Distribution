package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefOrObjectType extends js.Object {
  var ID: Double
  var PropertyDef: Boolean
  def Clone(): IPropertyDefOrObjectType
  def GetAsExpression(): IExpression
}

object IPropertyDefOrObjectType {
  @scala.inline
  def apply(
    Clone: () => IPropertyDefOrObjectType,
    GetAsExpression: () => IExpression,
    ID: Double,
    PropertyDef: Boolean
  ): IPropertyDefOrObjectType = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetAsExpression = js.Any.fromFunction0(GetAsExpression), ID = ID.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDefOrObjectType]
  }
}

