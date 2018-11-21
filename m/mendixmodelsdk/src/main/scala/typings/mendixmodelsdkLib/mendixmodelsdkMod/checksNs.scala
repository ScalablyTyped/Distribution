package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "checks")
@js.native
object checksNs extends js.Object {
  val makeChecksResolver: js.Function1[
    /* checks */ js.UndefOr[js.Array[mendixmodelsdkLib.distSdkChecksChecksDashTypesMod.ICheck]], 
    mendixmodelsdkLib.distSdkChecksChecksDashRunnerMod.IChecksResolver
  ] = js.native
  val makeQueryResolver: js.Function2[
    /* queryMap */ js.UndefOr[mendixmodelsdkLib.distSdkChecksQueriesMod.IQueryMap], 
    /* superTypeMap */ js.UndefOr[mendixmodelsdkLib.distSdkChecksQueriesMod.ISuperTypeMap], 
    mendixmodelsdkLib.distSdkChecksQueriesMod.IQueryResolver
  ] = js.native
  val runChecksOn: js.Function3[
    /* unit */ mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit, 
    /* checksResolver */ mendixmodelsdkLib.distSdkChecksChecksDashRunnerMod.IChecksResolver, 
    /* queryResolver */ mendixmodelsdkLib.distSdkChecksQueriesMod.IQueryResolver, 
    js.Array[mendixmodelsdkLib.distSdkChecksChecksDashTypesMod.ICheckIssue]
  ] = js.native
  /**
       * Validates the name syntactically without looking at the context (so no uniqueness check).
       * @returns {string} with error message or null in which case name is valid.
       */
  val validateNameSyntax: js.Function1[/* name */ java.lang.String, java.lang.String | scala.Null] = js.native
}

