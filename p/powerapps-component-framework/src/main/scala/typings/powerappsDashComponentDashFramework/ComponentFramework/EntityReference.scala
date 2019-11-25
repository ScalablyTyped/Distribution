package typings.powerappsDashComponentDashFramework.ComponentFramework

import typings.powerappsDashComponentDashFramework.Anon_Guid
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
  var etn: js.UndefOr[String] = js.undefined
  /**
  		 * The record id. Read-only.
  		 */
  var id: Anon_Guid
  /**
  		 * The name of the entity reference. Read-only.
  		 */
  var name: String
}

object EntityReference {
  @scala.inline
  def apply(id: Anon_Guid, name: String, etn: String = null): EntityReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (etn != null) __obj.updateDynamic("etn")(etn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityReference]
  }
}

