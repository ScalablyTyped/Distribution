package typings.maximMazurokGapiClientPoly.gapi.client.poly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresentationParams extends js.Object {
  
  /**
    * A background color which could be used for displaying the 3D asset in a 'thumbnail' or 'palette' style view. Authors have the option to set this background color when publishing or
    * editing their asset. This is represented as a six-digit hexademical triplet specifying the RGB components of the background color, e.g. #FF0000 for Red.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** The materials' diffuse/albedo color. This does not apply to vertex colors or texture maps. */
  var colorSpace: js.UndefOr[String] = js.native
  
  /**
    * A rotation that should be applied to the object root to make it upright. More precisely, this quaternion transforms from "object space" (the space in which the object is defined) to
    * "presentation space", a coordinate system where +Y is up, +X is right, -Z is forward. For example, if the object is the Eiffel Tower, in its local coordinate system the object might
    * be laid out such that the base of the tower is on the YZ plane and the tip of the tower is towards positive X. In this case this quaternion would specify a rotation (of 90 degrees
    * about the Z axis) such that in the presentation space the base of the tower is aligned with the XZ plane, and the tip of the tower lies towards +Y. This rotation is unrelated to the
    * object's pose in the web preview, which is just a camera position setting and is *not* reflected in this rotation. Please note: this is applicable only to the gLTF.
    */
  var orientingRotation: js.UndefOr[Quaternion] = js.native
}
object PresentationParams {
  
  @scala.inline
  def apply(): PresentationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresentationParams]
  }
  
  @scala.inline
  implicit class PresentationParamsOps[Self <: PresentationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColorSpace(value: String): Self = this.set("colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpace: Self = this.set("colorSpace", js.undefined)
    
    @scala.inline
    def setOrientingRotation(value: Quaternion): Self = this.set("orientingRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientingRotation: Self = this.set("orientingRotation", js.undefined)
  }
}
