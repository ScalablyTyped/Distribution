package typings
package mendixmodelsdkLib.distSdkConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configurationNs {
  type ICreateWorkingCopyFromTeamServerParameters = stdLib.Pick[
    ICreateWorkingCopyParameters, 
    stdLib.Exclude[
      mendixmodelsdkLib.mendixmodelsdkLibStrings.workingCopyId | mendixmodelsdkLib.mendixmodelsdkLibStrings.name | mendixmodelsdkLib.mendixmodelsdkLibStrings.projectId | mendixmodelsdkLib.mendixmodelsdkLibStrings.description | mendixmodelsdkLib.mendixmodelsdkLibStrings.avatarUrl | mendixmodelsdkLib.mendixmodelsdkLibStrings.template | mendixmodelsdkLib.mendixmodelsdkLibStrings.longLived | mendixmodelsdkLib.mendixmodelsdkLibStrings.setAsDefault | mendixmodelsdkLib.mendixmodelsdkLibStrings.teamServerBaseRevision | mendixmodelsdkLib.mendixmodelsdkLibStrings.teamServerBaseBranch, 
      mendixmodelsdkLib.mendixmodelsdkLibStrings.template
    ]
  ]
}
