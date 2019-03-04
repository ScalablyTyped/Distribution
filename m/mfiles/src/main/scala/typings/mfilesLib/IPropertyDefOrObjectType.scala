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
    Clone: js.Function0[IPropertyDefOrObjectType],
    GetAsExpression: js.Function0[IExpression],
    ID: scala.Double,
    PropertyDef: scala.Boolean
  ): IPropertyDefOrObjectType = {
    val __obj = js.Dynamic.literal(Clone = Clone, GetAsExpression = GetAsExpression, ID = ID, PropertyDef = PropertyDef)
  
    __obj.asInstanceOf[IPropertyDefOrObjectType]
  }
}

