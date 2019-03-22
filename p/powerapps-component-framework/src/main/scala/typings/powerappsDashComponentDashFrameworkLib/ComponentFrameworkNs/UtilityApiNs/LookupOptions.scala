package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UtilityApiNs

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
  var allowMultiSelect: scala.Boolean
  /**
  			 * The default entity type.
  			 */
  var defaultEntityType: java.lang.String
  /**
  			 * The default view to use.
  			 */
  var defaultViewId: java.lang.String
  /**
  			 * The entity types to display.
  			 */
  var entityTypes: js.Array[java.lang.String]
  /**
  			 * The views to be available in the view picker. Only System views are supported (not user views).
  			 */
  var viewIds: js.Array[java.lang.String]
}

object LookupOptions {
  @scala.inline
  def apply(
    allowMultiSelect: scala.Boolean,
    defaultEntityType: java.lang.String,
    defaultViewId: java.lang.String,
    entityTypes: js.Array[java.lang.String],
    viewIds: js.Array[java.lang.String]
  ): LookupOptions = {
    val __obj = js.Dynamic.literal(allowMultiSelect = allowMultiSelect, defaultEntityType = defaultEntityType, defaultViewId = defaultViewId, entityTypes = entityTypes, viewIds = viewIds)
  
    __obj.asInstanceOf[LookupOptions]
  }
}

