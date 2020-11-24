package typings.oracledb.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This readonly property gives a numeric representation of the Oracle client library version which
  * is useful in comparisons. For version a.b.c.d.e, this property
  * gives the number: (100000000 * a) + (1000000 * b) + (10000 * c) + (100 * d) + e
  *
  * @since 1.3
  */
@JSImport("oracledb", "oracleClientVersion")
@js.native
object oracleClientVersion extends TopLevel[Double]
