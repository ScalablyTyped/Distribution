package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for context.utils
	 */
@js.native
trait Utility extends js.Object {
  /**
  		 * Gets the entity metadata for the specified entity.
  		 * @param entityType The logical name of the entity.
  		 * @param attributes The attributes to get metadata for.
  		 */
  def getEntityMetadata(entityName: java.lang.String): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.EntityMetadata
  ] = js.native
  def getEntityMetadata(entityName: java.lang.String, attributes: js.Array[java.lang.String]): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.EntityMetadata
  ] = js.native
  /**
  		 * Function to return if the user has Privilege for one specific entity
  		 * @entityTypeName entity type name
  		 * @privilegeType privilege type i.e. Create, Read, Write etc.
  		 * @privilegeDepth privilege depth i.e. basic, Global etc.
  		 */
  def hasEntityPrivilege(
    entityTypeName: java.lang.String,
    privilegeType: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeType,
    privilegeDepth: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeDepth
  ): scala.Boolean = js.native
  /**
  		 * Opens a lookup dialog allowing the user to select one or more entities.
  		 * @param lookupOptions Options for opening the lookup dialog.
  		 */
  def lookupObjects(
    lookupOptions: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UtilityApiNs.LookupOptions
  ): js.Promise[js.Array[EntityReference]] = js.native
}

