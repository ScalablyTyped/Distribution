package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import typings.powerappsComponentFramework.ComponentFramework.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for entity form options.
  */
@js.native
trait EntityFormOptions extends js.Object {
  /**
    * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name
    */
  var createFromEntity: js.UndefOr[EntityReference] = js.native
  /**
    * ID of the entity record to display the form for.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Logical name of the entity to display the form for.
    */
  var entityName: String = js.native
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[String] = js.native
  /**
    * Height of the form window to be displayed in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to display form in a new window.
    */
  var openInNewWindow: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to open a quick create form. If you do not specify this, by default false is passed.
    */
  var useQuickCreateForm: js.UndefOr[Boolean] = js.native
  /**
    * Width of the form window to be displayed in pixels.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Specify one of the following values for the window position of the form on the screen:
    *   1:center
    *   2:side
    */
  var windowPosition: js.UndefOr[Double] = js.native
}

object EntityFormOptions {
  @scala.inline
  def apply(entityName: String): EntityFormOptions = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFormOptions]
  }
  @scala.inline
  implicit class EntityFormOptionsOps[Self <: EntityFormOptions] (val x: Self) extends AnyVal {
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
    def setEntityName(value: String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateFromEntity(value: EntityReference): Self = this.set("createFromEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateFromEntity: Self = this.set("createFromEntity", js.undefined)
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    @scala.inline
    def setFormId(value: String): Self = this.set("formId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormId: Self = this.set("formId", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOpenInNewWindow(value: Boolean): Self = this.set("openInNewWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenInNewWindow: Self = this.set("openInNewWindow", js.undefined)
    @scala.inline
    def setUseQuickCreateForm(value: Boolean): Self = this.set("useQuickCreateForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseQuickCreateForm: Self = this.set("useQuickCreateForm", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWindowPosition(value: Double): Self = this.set("windowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPosition: Self = this.set("windowPosition", js.undefined)
  }
  
}

