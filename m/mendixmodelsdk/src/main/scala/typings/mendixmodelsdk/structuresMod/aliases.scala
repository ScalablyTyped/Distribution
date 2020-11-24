package typings.mendixmodelsdk.structuresMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.unitsMod.StructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/structures", "aliases")
@js.native
object aliases extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.unitsMod.IStructuralUnit
    - typings.mendixmodelsdk.elementsMod.IAbstractElement
  */
  trait IContainer extends js.Object
  
  type Container = StructuralUnit[IAbstractModel] | (AbstractElement[
    IAbstractModel, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/structures.aliases.Container */ js.Object
  ])
}
