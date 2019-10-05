package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojresponsiveutilsMod.FRAMEWORK_QUERY_KEY
import typings.atOracleOraclejet.ojresponsiveutilsMod.SCREEN_RANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojresponsiveutils", JSImport.Namespace)
@js.native
object ojresponsiveutilsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`sm-up`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`md-up`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`lg-up`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`xl-up`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`xxl-up`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`sm-only`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`md-only`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`lg-only`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`xl-only`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`md-down`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`lg-down`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`xl-down`
    - typings.atOracleOraclejet.atOracleOraclejetStrings.`high-resolution`
  */
  trait FRAMEWORK_QUERY_KEY extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atOracleOraclejet.atOracleOraclejetStrings.sm
    - typings.atOracleOraclejet.atOracleOraclejetStrings.md
    - typings.atOracleOraclejet.atOracleOraclejetStrings.lg
    - typings.atOracleOraclejet.atOracleOraclejetStrings.xl
    - typings.atOracleOraclejet.atOracleOraclejetStrings.xxl
  */
  trait SCREEN_RANGE extends js.Object
  
  def compare(size1: SCREEN_RANGE, size2: SCREEN_RANGE): Double = js.native
  def getFrameworkQuery(frameworkQueryKey: FRAMEWORK_QUERY_KEY): String | Null = js.native
}

