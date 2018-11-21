package typings
package mendixmodelsdkLib.distSdkChecksChecksDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheckIssue extends js.Object {
  /** The name of the check's definition. */
  var checkName: java.lang.String
  var incorrectProperty: js.UndefOr[java.lang.String]
  var message: java.lang.String
  var severity: java.lang.String
  /** The structure to which this issue applies
       * - may be different from the structure that triggered the check.
       */
  var structure: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure
}

