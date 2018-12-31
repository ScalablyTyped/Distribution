package typings
package openui5Lib.sapNs.mNs

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
    sImgId: java.lang.String,
    oImageControl: openui5Lib.sapNs.mNs.Image,
    oParent: openui5Lib.sapNs.uiNs.coreNs.Control,
    mProperties: js.Any,
    aCssClassesToAdd: js.Array[_],
    aCssClassesToRemove: js.Array[_]
  ): scala.Unit = js.native
}

