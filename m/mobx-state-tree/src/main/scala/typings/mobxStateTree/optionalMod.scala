package typings.mobxStateTree

import typings.mobxStateTree.typeMod.ExtractCSTWithSTN
import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.IType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-state-tree/dist/types/utility-types/optional", JSImport.Namespace)
@js.native
object optionalMod extends js.Object {
  
  def isOptionalType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  def optional[IT /* <: IAnyType */](`type`: IT, defaultValueOrFunction: OptionalDefaultValueOrFunction[IT]): IOptionalIType[IT, js.Array[js.UndefOr[scala.Nothing]]] = js.native
  def optional[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */](
    `type`: IT,
    defaultValueOrFunction: OptionalDefaultValueOrFunction[IT],
    optionalValues: OptionalVals
  ): IOptionalIType[IT, OptionalVals] = js.native
  
  type IOptionalIType[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */] = IType[
    /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any
  ]
  
  type OptionalDefaultValueOrFunction[IT /* <: IAnyType */] = (/* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any) | js.Function0[ExtractCSTWithSTN[IT]]
  
  type ValidOptionalValue = js.UndefOr[String | Boolean | Double | Null]
  
  type ValidOptionalValues = Array[ValidOptionalValue]
}
