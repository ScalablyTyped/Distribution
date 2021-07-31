package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.localByNameReferencePropertyMod.INamedElement
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "LocalByNameReferenceProperty")
@js.native
class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
  extends typings.mendixmodelsdk.propertiesMod.LocalByNameReferenceProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    name: String,
    initialValue: T,
    _targetType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    name: String,
    initialValue: Null,
    _targetType: String
  ) = this()
}
