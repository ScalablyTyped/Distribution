package typings.mendixmodelsdk.distSdkInternalMod

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "EnumListProperty")
@js.native
class EnumListProperty[T /* <: typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesMod.EnumListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure,
    name: String,
    initialValue: js.Array[T],
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
      ]
  ) = this()
}

