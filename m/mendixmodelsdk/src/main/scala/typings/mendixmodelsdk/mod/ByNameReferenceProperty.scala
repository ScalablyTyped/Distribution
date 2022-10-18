package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "ByNameReferenceProperty")
@js.native
open class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
  extends typings.mendixmodelsdk.srcSdkInternalPropertiesMod.ByNameReferenceProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
    name: String,
    initialValue: T,
    _targetType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container],
    name: String,
    initialValue: Null,
    _targetType: String
  ) = this()
}
