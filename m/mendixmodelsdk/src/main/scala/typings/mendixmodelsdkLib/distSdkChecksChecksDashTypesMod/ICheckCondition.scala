package typings
package mendixmodelsdkLib.distSdkChecksChecksDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheckCondition
  extends mendixmodelsdkLib.distSdkChecksBaseDashTypesMod.ITyped {
  /** can be present iff $Type == 'MxCheckConditionForList': */
  var errorVar: js.UndefOr[ICheckErrorVariable] = js.undefined
  var rule: mendixmodelsdkLib.distGenExpressionsDashTypesMod.expressionsTypesNs.MxExpression
}

