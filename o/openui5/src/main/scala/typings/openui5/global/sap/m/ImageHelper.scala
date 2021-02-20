package typings.openui5.global.sap.m

import typings.openui5.sap.ui.core.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageHelper {
  
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
  @JSGlobal("sap.m.ImageHelper.getImageControl")
  @js.native
  def getImageControl(
    sImgId: String,
    oImageControl: typings.openui5.sap.m.Image,
    oParent: Control,
    mProperties: js.Any,
    aCssClassesToAdd: js.Array[_],
    aCssClassesToRemove: js.Array[_]
  ): Unit = js.native
}
