package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ImageHelper")
@js.native
object ImageHelperNs extends js.Object {
  /**
    * Creates or updates an image control.
    * @param sImgId id of the image to be dealt with.
    * @param oImageControl the image to update. If undefined, a new image will be created.
    * @param oParent oImageControl's parentControl.
    * @param mProperties map object that contains key value pairs if image propeties. The 'src'
    * propertyMUST be contained. Also the map's keys must be names of image properties
    * @param aCssClassesToAdd array of css classes which will be added if the image needs to be created.
    * @param aCssClassesToRemove all css clases that oImageControl has and which are contained in this
    * arrayare removed bevore adding the css classes listed in aCssClassesToAdd.
    */
  def getImageControl(
    sImgId: String,
    oImageControl: Image,
    oParent: Control,
    mProperties: js.Any,
    aCssClassesToAdd: js.Array[_],
    aCssClassesToRemove: js.Array[_]
  ): Unit = js.native
}

