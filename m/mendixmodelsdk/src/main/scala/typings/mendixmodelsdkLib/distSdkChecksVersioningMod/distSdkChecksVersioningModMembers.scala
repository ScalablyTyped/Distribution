package typings
package mendixmodelsdkLib.distSdkChecksVersioningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/checks/versioning", JSImport.Namespace)
@js.native
object distSdkChecksVersioningModMembers extends js.Object {
  def lookupByVersion[T /* <: IVersioned */](
    versionedThings: js.Array[T],
    mmVersion: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version
  ): T = js.native
  def lookupByVersion[T /* <: IVersioned */](
    versionedThings: js.UndefOr[scala.Nothing],
    mmVersion: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version
  ): T = js.native
  def lookupByVersion[T /* <: IVersioned */](
    versionedThings: scala.Null,
    mmVersion: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version
  ): T = js.native
}

