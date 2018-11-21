package typings
package mendixmodelsdkLib.distSdkChecksChecksDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheckBodyForVersion
  extends mendixmodelsdkLib.distSdkChecksVersioningMod.IVersioned {
  var checkCondition: ICheckCondition
  /** A property of the indicated structure. */
  var incorrectProperty: js.UndefOr[java.lang.String] = js.undefined
  var message: ICheckMessage
  /**
       * Spec. of when to run.
       * A value of null means: always run and effectively corresponds to { group: null, level: 0 }.
       */
  var runSpec: js.UndefOr[IRunSpecification] = js.undefined
  /** (NONE,) WARNING, ERROR, DEPRECATION */
  var severity: java.lang.String
  var variables: js.UndefOr[js.Array[ICheckVariable]] = js.undefined
}

