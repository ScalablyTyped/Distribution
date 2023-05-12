package typings.openui5.sapMLibraryMod

import typings.openui5.sapMImageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageHelper extends StObject {
  
  /**
    * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Creates or updates an image control.
    *
    * @returns The new or updated image control or icon
    */
  def getImageControl(
    /**
    * UD of the image to be dealt with.
    */
  sImgId: String,
    /**
    * The image to update. If undefined, a new image will be created.
    */
  oImage: default,
    /**
    * oImageControl's parentControl.
    */
  oParent: typings.openui5.sapUiCoreControlMod.default,
    /**
    * Settings for the image control; the `src` property MUST be contained; the keys of the object must be
    * valid names of image settings
    */
  mProperties: js.Object,
    /**
    * Array of CSS classes which will be added if the image needs to be created.
    */
  aCssClassesToAdd: js.Array[String],
    /**
    * All CSS classes that oImageControl has and which are contained in this array are removed before adding
    * the CSS classes listed in aCssClassesToAdd.
    */
  aCssClassesToRemove: js.Array[String]
  ): default | typings.openui5.sapUiCoreIconMod.default
}
object ImageHelper {
  
  @JSImport("sap/m/library", "ImageHelper")
  @js.native
  val ^ : ImageHelper = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageHelper] (val x: Self) extends AnyVal {
    
    inline def setGetImageControl(
      value: (String, default, typings.openui5.sapUiCoreControlMod.default, js.Object, js.Array[String], js.Array[String]) => default | typings.openui5.sapUiCoreIconMod.default
    ): Self = StObject.set(x, "getImageControl", js.Any.fromFunction6(value))
  }
}
