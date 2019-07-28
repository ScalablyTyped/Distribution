package typings.mendixmodelsdk.distSdkInternalPropertiesMod

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.distSdkInternalInstancesMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", "EnumListProperty")
@js.native
class EnumListProperty[T /* <: AbstractEnum */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod.EnumListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: Structure,
    name: String,
    initialValue: js.Array[T],
    enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
  ) = this()
}

