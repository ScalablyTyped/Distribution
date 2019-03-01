package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Copy extends js.Object {
  var copy: mendixmodelsdkLib.distSdkInternalElementsMod.Element
  var idMap: mendixmodelsdkLib.distSdkUtilsMod.utilsNs.IMap[mendixmodelsdkLib.distSdkInternalStructuresMod.Structure]
}

object Anon_Copy {
  @scala.inline
  def apply(
    copy: mendixmodelsdkLib.distSdkInternalElementsMod.Element,
    idMap: mendixmodelsdkLib.distSdkUtilsMod.utilsNs.IMap[mendixmodelsdkLib.distSdkInternalStructuresMod.Structure]
  ): Anon_Copy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("idMap")(idMap)
    __obj.asInstanceOf[Anon_Copy]
  }
}

