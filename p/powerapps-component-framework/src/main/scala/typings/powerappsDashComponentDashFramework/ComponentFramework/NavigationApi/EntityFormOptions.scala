package typings.powerappsDashComponentDashFramework.ComponentFramework.NavigationApi

import typings.powerappsDashComponentDashFramework.ComponentFramework.EntityReference
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
    height: Int | Double = null,
    openInNewWindow: js.UndefOr[Boolean] = js.undefined,
    useQuickCreateForm: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    windowPosition: Int | Double = null
  ): EntityFormOptions = {
    val __obj = js.Dynamic.literal(entityName = entityName)
    if (createFromEntity != null) __obj.updateDynamic("createFromEntity")(createFromEntity)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (formId != null) __obj.updateDynamic("formId")(formId)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(openInNewWindow)) __obj.updateDynamic("openInNewWindow")(openInNewWindow)
    if (!js.isUndefined(useQuickCreateForm)) __obj.updateDynamic("useQuickCreateForm")(useQuickCreateForm)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFormOptions]
  }
}

