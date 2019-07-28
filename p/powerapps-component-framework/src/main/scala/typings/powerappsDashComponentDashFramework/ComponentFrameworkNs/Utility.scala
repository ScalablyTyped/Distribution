package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.EntityMetadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeDepth
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.TypesNs.PrivilegeType
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.UtilityApiNs.LookupOptions
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
  def getEntityMetadata(entityName: String): js.Promise[EntityMetadata] = js.native
  def getEntityMetadata(entityName: String, attributes: js.Array[String]): js.Promise[EntityMetadata] = js.native
  /**
  		 * Function to return if the user has Privilege for one specific entity
  		 * @entityTypeName entity type name
  		 * @privilegeType privilege type i.e. Create, Read, Write etc.
  		 * @privilegeDepth privilege depth i.e. basic, Global etc.
  		 */
  def hasEntityPrivilege(entityTypeName: String, privilegeType: PrivilegeType, privilegeDepth: PrivilegeDepth): Boolean = js.native
  /**
  		 * Opens a lookup dialog allowing the user to select one or more entities.
  		 * @param lookupOptions Options for opening the lookup dialog.
  		 */
  def lookupObjects(lookupOptions: LookupOptions): js.Promise[js.Array[EntityReference]] = js.native
}

