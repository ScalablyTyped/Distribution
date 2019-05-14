package typings
package oracledbLib.oracledbMod

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
  var contentColumn: js.UndefOr[oracledbLib.Anon_Cache] = js.undefined
  /** Object containing information related to the creation time column. */
  var creationTimeColumn: js.UndefOr[oracledbLib.Anon_Name] = js.undefined
  /** Object containing information related to the key column. */
  var keyColumn: js.UndefOr[oracledbLib.Anon_AssignmentMethod] = js.undefined
  /** Object containing information related to the last modified column. */
  var lastModifiedColumn: js.UndefOr[oracledbLib.Anon_Index] = js.undefined
  /** Object containing information related to the media type column. */
  var mediaTypeColumn: js.UndefOr[oracledbLib.Anon_Name] = js.undefined
  /** Specifies whether or not the collection is read-only. */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the Oracle Database schema that owns the table or view to which the collection is mapped. */
  var schemaName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the table to which the collection is mapped. */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
  /** Object containing information related to the version column. */
  var versionColumn: js.UndefOr[oracledbLib.Anon_Method] = js.undefined
  /** Name of the view to which the collection is mapped. */
  var viewName: js.UndefOr[java.lang.String] = js.undefined
}

object SodaMetadata {
  @scala.inline
  def apply(
    contentColumn: oracledbLib.Anon_Cache = null,
    creationTimeColumn: oracledbLib.Anon_Name = null,
    keyColumn: oracledbLib.Anon_AssignmentMethod = null,
    lastModifiedColumn: oracledbLib.Anon_Index = null,
    mediaTypeColumn: oracledbLib.Anon_Name = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    schemaName: java.lang.String = null,
    tableName: java.lang.String = null,
    versionColumn: oracledbLib.Anon_Method = null,
    viewName: java.lang.String = null
  ): SodaMetadata = {
    val __obj = js.Dynamic.literal()
    if (contentColumn != null) __obj.updateDynamic("contentColumn")(contentColumn)
    if (creationTimeColumn != null) __obj.updateDynamic("creationTimeColumn")(creationTimeColumn)
    if (keyColumn != null) __obj.updateDynamic("keyColumn")(keyColumn)
    if (lastModifiedColumn != null) __obj.updateDynamic("lastModifiedColumn")(lastModifiedColumn)
    if (mediaTypeColumn != null) __obj.updateDynamic("mediaTypeColumn")(mediaTypeColumn)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    if (versionColumn != null) __obj.updateDynamic("versionColumn")(versionColumn)
    if (viewName != null) __obj.updateDynamic("viewName")(viewName)
    __obj.asInstanceOf[SodaMetadata]
  }
}

