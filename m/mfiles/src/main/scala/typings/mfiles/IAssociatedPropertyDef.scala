package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInPropertyDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAssociatedPropertyDef extends js.Object {
  var PropertyDef: MFBuiltInPropertyDef | Double
  var Required: Boolean
  def Clone(): IAssociatedPropertyDef
}

object IAssociatedPropertyDef {
  @scala.inline
  def apply(Clone: () => IAssociatedPropertyDef, PropertyDef: MFBuiltInPropertyDef | Double, Required: Boolean): IAssociatedPropertyDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyDef = PropertyDef.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAssociatedPropertyDef]
  }
}

