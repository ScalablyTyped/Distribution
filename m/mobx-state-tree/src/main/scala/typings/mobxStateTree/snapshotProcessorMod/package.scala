package typings.mobxStateTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object snapshotProcessorMod {
  
  type CustomOrOther[Custom, Other] = Custom | Other
  
  type ISnapshotProcessor[IT /* <: typings.mobxStateTree.typeMod.IAnyType */, CustomC, CustomS] = typings.mobxStateTree.typeMod.IType[
    typings.mobxStateTree.snapshotProcessorMod.CustomOrOther[
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
    ], 
    typings.mobxStateTree.snapshotProcessorMod.CustomOrOther[
      CustomS, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any
  ]
}
