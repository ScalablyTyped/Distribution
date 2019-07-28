package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object that encapsulates an Entity Reference as a plain object suitable for storing in the state tree
	 */
trait EntityReference extends js.Object {
  /**
  		 * The entity logical name. Read-only.
  		 */
  var entityType: js.UndefOr[String] = js.undefined
  /**
  		 * The record id. Read-only.
  		 */
  var id: String
  /**
  		 * The name of the entity reference. Read-only.
  		 */
  var name: String
}

object EntityReference {
  @scala.inline
  def apply(id: String, name: String, entityType: String = null): EntityReference = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (entityType != null) __obj.updateDynamic("entityType")(entityType)
    __obj.asInstanceOf[EntityReference]
  }
}

