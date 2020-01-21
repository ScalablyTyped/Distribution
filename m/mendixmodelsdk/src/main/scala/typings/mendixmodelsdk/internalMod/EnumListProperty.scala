package typings.mendixmodelsdk.internalMod

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "EnumListProperty")
@js.native
class EnumListProperty[T /* <: typings.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
  extends typings.mendixmodelsdk.propertiesMod.EnumListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.structuresMod.Structure,
    name: String,
    initialValue: js.Array[T],
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typings.mendixmodelsdk.instancesMod.AbstractEnum
      ]
  ) = this()
}

