package typings.mendixmodelsdk.mendixmodelsdkMod

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "EnumProperty")
@js.native
class EnumProperty[T /* <: typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesMod.EnumProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure,
    name: String,
    initialValue: T,
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
      ]
  ) = this()
}

