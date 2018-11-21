package typings
package mendixmodelsdkLib.distSdkChecksChecksDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/checks/checks-runner", JSImport.Namespace)
@js.native
object distSdkChecksChecksDashRunnerModMembers extends js.Object {
  def makeChecksResolver(): IChecksResolver = js.native
  def makeChecksResolver(checks: js.Array[mendixmodelsdkLib.distSdkChecksChecksDashTypesMod.ICheck]): IChecksResolver = js.native
  def runChecksOn(
    unit: mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit,
    checksResolver: IChecksResolver,
    queryResolver: mendixmodelsdkLib.distSdkChecksQueriesMod.IQueryResolver
  ): js.Array[mendixmodelsdkLib.distSdkChecksChecksDashTypesMod.ICheckIssue] = js.native
}

