package typings.powerappsComponentFramework.ComponentFramework.UtilityApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Options used when opening a lookup dialog.
		 */
trait LookupOptions extends js.Object {
  /**
  			 * Whether the lookup allows more than one item to be selected.
  			 */
  var allowMultiSelect: Boolean
  /**
  			 * The default entity type.
  			 */
  var defaultEntityType: String
  /**
  			 * The default view to use.
  			 */
  var defaultViewId: String
  /**
  			 * The entity types to display.
  			 */
  var entityTypes: js.Array[String]
  /**
  			 * The views to be available in the view picker. Only System views are supported (not user views).
  			 */
  var viewIds: js.Array[String]
}

object LookupOptions {
  @scala.inline
  def apply(
    allowMultiSelect: Boolean,
    defaultEntityType: String,
    defaultViewId: String,
    entityTypes: js.Array[String],
    viewIds: js.Array[String]
  ): LookupOptions = {
    val __obj = js.Dynamic.literal(allowMultiSelect = allowMultiSelect.asInstanceOf[js.Any], defaultEntityType = defaultEntityType.asInstanceOf[js.Any], defaultViewId = defaultViewId.asInstanceOf[js.Any], entityTypes = entityTypes.asInstanceOf[js.Any], viewIds = viewIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LookupOptions]
  }
}

