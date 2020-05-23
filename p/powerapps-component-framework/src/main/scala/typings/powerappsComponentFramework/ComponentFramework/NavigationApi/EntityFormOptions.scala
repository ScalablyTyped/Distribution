package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import typings.powerappsComponentFramework.ComponentFramework.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for entity form options.
  */
trait EntityFormOptions extends js.Object {
  /**
    * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name
    */
  var createFromEntity: js.UndefOr[EntityReference] = js.undefined
  /**
    * ID of the entity record to display the form for.
    */
  var entityId: js.UndefOr[String] = js.undefined
  /**
    * Logical name of the entity to display the form for.
    */
  var entityName: String
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[String] = js.undefined
  /**
    * Height of the form window to be displayed in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether to display form in a new window.
    */
  var openInNewWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to open a quick create form. If you do not specify this, by default false is passed.
    */
  var useQuickCreateForm: js.UndefOr[Boolean] = js.undefined
  /**
    * Width of the form window to be displayed in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Specify one of the following values for the window position of the form on the screen:
    *   1:center
    *   2:side
    */
  var windowPosition: js.UndefOr[Double] = js.undefined
}

object EntityFormOptions {
  @scala.inline
  def apply(
    entityName: String,
    createFromEntity: EntityReference = null,
    entityId: String = null,
    formId: String = null,
    height: js.UndefOr[Double] = js.undefined,
    openInNewWindow: js.UndefOr[Boolean] = js.undefined,
    useQuickCreateForm: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    windowPosition: js.UndefOr[Double] = js.undefined
  ): EntityFormOptions = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any])
    if (createFromEntity != null) __obj.updateDynamic("createFromEntity")(createFromEntity.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (formId != null) __obj.updateDynamic("formId")(formId.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openInNewWindow)) __obj.updateDynamic("openInNewWindow")(openInNewWindow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuickCreateForm)) __obj.updateDynamic("useQuickCreateForm")(useQuickCreateForm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowPosition)) __obj.updateDynamic("windowPosition")(windowPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFormOptions]
  }
}

