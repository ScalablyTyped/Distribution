package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewMetadataColumn extends js.Object {
  /** The aggregates computed for this column, if any. */
  var aggregates: js.UndefOr[DataViewColumnAggregates] = js.undefined
  /** Indicates that aggregates should not be computed across groups with different values of this column. */
  var discourageAggregationAcrossGroups: js.UndefOr[scala.Boolean] = js.undefined
  /** The user-facing display name of the column. */
  var displayName: java.lang.String
  /** The SQExpr this column represents. */
  var expr: js.UndefOr[
    powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
  ] = js.undefined
  /** The format string of the column. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the containing group. */
  var groupName: js.UndefOr[PrimitiveValue] = js.undefined
  /**
    * The set of expressions that define the identity for instances of this grouping field.
    * This must be a subset of the items in the DataViewScopeIdentity in the grouped items result.
    * This property is undefined for measure fields, as well as for grouping fields in DSR generated prior to the CY16SU08 or SU09 timeframe.
    */
  var identityExprs: js.UndefOr[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ]
  ] = js.undefined
  /** The position of the column in the select statement. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Indicates that this column is a measure (aggregate) value. */
  var isMeasure: js.UndefOr[scala.Boolean] = js.undefined
  /** The KPI metadata to use to convert a numeric status value into its visual representation. */
  var kpi: js.UndefOr[DataViewKpiColumnMetadata] = js.undefined
  /** The metadata repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  var parameter: js.UndefOr[js.Object] = js.undefined
  /** The query name the source column in the query. */
  var queryName: js.UndefOr[java.lang.String] = js.undefined
  /** The properties that this column provides to the visualization. */
  var roles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  /** The sort direction of this column. */
  var sort: js.UndefOr[SortDirection] = js.undefined
  /** The order sorts are applied. Lower values are applied first. Undefined indicates no sort was done on this column. */
  var sortOrder: js.UndefOr[scala.Double] = js.undefined
   // TODO: Deprecate this, and populate format string through objects instead.
  /** Data type information for the column. */
  var `type`: js.UndefOr[ValueTypeDescriptor] = js.undefined
}

