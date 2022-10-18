package typings.mendixmodelsdk.mod

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "EnumProperty")
@js.native
open class EnumProperty[T /* <: typings.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalPropertiesMod.EnumProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: T,
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typings.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
      ]
  ) = this()
}
