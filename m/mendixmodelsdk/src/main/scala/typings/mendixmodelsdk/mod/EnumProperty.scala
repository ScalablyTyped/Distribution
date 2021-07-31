package typings.mendixmodelsdk.mod

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "EnumProperty")
@js.native
class EnumProperty[T /* <: typings.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
  extends typings.mendixmodelsdk.propertiesMod.EnumProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: T,
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typings.mendixmodelsdk.instancesMod.AbstractEnum
      ]
  ) = this()
}
