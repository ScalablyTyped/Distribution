package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
  *
  * With this value, the result.metaData result.resultSet.metaData objects only include column names.
  *
  * If extendedMetaData is true then metaData will contain additional attributes.
  *
  * This property may be overridden in an execute() call.
  *
  * @default false
  * @since 1.10
  */
@JSImport("oracledb", "extendedMetaData")
@js.native
object extendedMetaData extends TopLevel[Boolean]

