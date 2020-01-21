package typings.officeUiFabricReact.colorPickerBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicColorPickerExampleState extends js.Object {
  var alphaSliderHidden: Boolean
  var color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IColor */ js.Any
  var showPreview: Boolean
}

object IBasicColorPickerExampleState {
  @scala.inline
  def apply(
    alphaSliderHidden: Boolean,
    color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IColor */ js.Any,
    showPreview: Boolean
  ): IBasicColorPickerExampleState = {
    val __obj = js.Dynamic.literal(alphaSliderHidden = alphaSliderHidden.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], showPreview = showPreview.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBasicColorPickerExampleState]
  }
}

