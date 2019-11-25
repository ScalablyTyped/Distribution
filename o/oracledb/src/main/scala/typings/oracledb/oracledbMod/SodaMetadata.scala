package typings.oracledb.oracledbMod

import typings.oracledb.Anon_AssignmentMethod
import typings.oracledb.Anon_Cache
import typings.oracledb.Anon_Index
import typings.oracledb.Anon_Method
import typings.oracledb.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata specifying various details about the collection, such as its database storage, whether it should
  * track version and time stamp document components, how such components are generated, and what document
  * types are.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-collection-metadata-components-reference.html#GUID-46E36926-7E6C-4561-A19F-01C09428C56D
  */
trait SodaMetadata extends js.Object {
  /** Object containing information related to the content column. */
  var contentColumn: js.UndefOr[Anon_Cache] = js.undefined
  /** Object containing information related to the creation time column. */
  var creationTimeColumn: js.UndefOr[Anon_Name] = js.undefined
  /** Object containing information related to the key column. */
  var keyColumn: js.UndefOr[Anon_AssignmentMethod] = js.undefined
  /** Object containing information related to the last modified column. */
  var lastModifiedColumn: js.UndefOr[Anon_Index] = js.undefined
  /** Object containing information related to the media type column. */
  var mediaTypeColumn: js.UndefOr[Anon_Name] = js.undefined
  /** Specifies whether or not the collection is read-only. */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Name of the Oracle Database schema that owns the table or view to which the collection is mapped. */
  var schemaName: js.UndefOr[String] = js.undefined
  /** Name of the table to which the collection is mapped. */
  var tableName: js.UndefOr[String] = js.undefined
  /** Object containing information related to the version column. */
  var versionColumn: js.UndefOr[Anon_Method] = js.undefined
  /** Name of the view to which the collection is mapped. */
  var viewName: js.UndefOr[String] = js.undefined
}

object SodaMetadata {
  @scala.inline
  def apply(
    contentColumn: Anon_Cache = null,
    creationTimeColumn: Anon_Name = null,
    keyColumn: Anon_AssignmentMethod = null,
    lastModifiedColumn: Anon_Index = null,
    mediaTypeColumn: Anon_Name = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    schemaName: String = null,
    tableName: String = null,
    versionColumn: Anon_Method = null,
    viewName: String = null
  ): SodaMetadata = {
    val __obj = js.Dynamic.literal()
    if (contentColumn != null) __obj.updateDynamic("contentColumn")(contentColumn.asInstanceOf[js.Any])
    if (creationTimeColumn != null) __obj.updateDynamic("creationTimeColumn")(creationTimeColumn.asInstanceOf[js.Any])
    if (keyColumn != null) __obj.updateDynamic("keyColumn")(keyColumn.asInstanceOf[js.Any])
    if (lastModifiedColumn != null) __obj.updateDynamic("lastModifiedColumn")(lastModifiedColumn.asInstanceOf[js.Any])
    if (mediaTypeColumn != null) __obj.updateDynamic("mediaTypeColumn")(mediaTypeColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (versionColumn != null) __obj.updateDynamic("versionColumn")(versionColumn.asInstanceOf[js.Any])
    if (viewName != null) __obj.updateDynamic("viewName")(viewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaMetadata]
  }
}

