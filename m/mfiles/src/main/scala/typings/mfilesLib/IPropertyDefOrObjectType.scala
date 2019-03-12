package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefOrObjectType extends js.Object {
  var ID: scala.Double
  var PropertyDef: scala.Boolean
  def Clone(): IPropertyDefOrObjectType
  def GetAsExpression(): IExpression
}

object IPropertyDefOrObjectType {
  @scala.inline
  def apply(
    Clone: () => IPropertyDefOrObjectType,
    GetAsExpression: () => IExpression,
    ID: scala.Double,
    PropertyDef: scala.Boolean
  ): IPropertyDefOrObjectType = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetAsExpression = js.Any.fromFunction0(GetAsExpression), ID = ID, PropertyDef = PropertyDef)
  
    __obj.asInstanceOf[IPropertyDefOrObjectType]
  }
}

