package typings.officeUiFabricReact.resizeGroupBaseMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.grow
import typings.officeUiFabricReact.officeUiFabricReactStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResizeGroupState extends js.Object {
  
  /**
    * Data to render in a hidden div for measurement
    */
  var dataToMeasure: js.UndefOr[js.Any] = js.native
  
  /**
    * Set to true when the content container might have new dimensions and should
    * be remeasured.
    */
  var measureContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * Final data used to render proper sized component
    */
  var renderedData: js.UndefOr[js.Any] = js.native
  
  /**
    * Are we resizing to accommodate having more or less available space?
    * The 'grow' direction is when the container may have more room than the last render,
    * such as when a window resize occurs. This means we will try to fit more content in the window.
    * The 'shrink' direction is when the contents don't fit in the container and we need
    * to find a transformation of the data that makes everything fit.
    */
  var resizeDirection: js.UndefOr[grow | shrink] = js.native
}
object IResizeGroupState {
  
  @scala.inline
  def apply(): IResizeGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResizeGroupState]
  }
  
  @scala.inline
  implicit class IResizeGroupStateOps[Self <: IResizeGroupState] (val x: Self) extends AnyVal {
    
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
    def setDataToMeasure(value: js.Any): Self = this.set("dataToMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataToMeasure: Self = this.set("dataToMeasure", js.undefined)
    
    @scala.inline
    def setMeasureContainer(value: Boolean): Self = this.set("measureContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureContainer: Self = this.set("measureContainer", js.undefined)
    
    @scala.inline
    def setRenderedData(value: js.Any): Self = this.set("renderedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderedData: Self = this.set("renderedData", js.undefined)
    
    @scala.inline
    def setResizeDirection(value: grow | shrink): Self = this.set("resizeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeDirection: Self = this.set("resizeDirection", js.undefined)
  }
}
