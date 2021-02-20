package typings.mobxStateTree

import typings.mobx.observablearrayMod.IObservableArray
import typings.mobxStateTree.hookMod.IHooksGetter
import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("mobx-state-tree/dist/types/complex-types/array", "array")
  @js.native
  def array[IT /* <: IAnyType */](subtype: IT): IArrayType[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/types/complex-types/array", "isArrayType")
  @js.native
  def isArrayType[Items /* <: IAnyType */](`type`: IAnyType): /* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/array.IArrayType<Items> */ Boolean = js.native
  
  @js.native
  trait IArrayType[IT /* <: IAnyType */]
    extends IType[
          js.UndefOr[
            js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
            ]
          ], 
          js.Array[
            /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any
          ], 
          IMSTArray[IT]
        ] {
    
    def hooks(hooks: IHooksGetter[IMSTArray[IAnyType]]): IArrayType[IT] = js.native
  }
  
  @js.native
  trait IMSTArray[IT /* <: IAnyType */]
    extends IObservableArray[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
        ] {
    
    @JSName("concat")
    def concat_Type(
      items: ((/* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any) | (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
        ]))*
    ): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
      ] = js.native
    
    @JSName("push")
    def push_Type(
      items: (/* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any)*
    ): Double = js.native
    
    @JSName("splice")
    def splice_Type(
      start: Double,
      deleteCount: Double,
      items: (/* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any)*
    ): js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
      ] = js.native
    
    @JSName("unshift")
    def unshift_Type(
      items: (/* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any)*
    ): Double = js.native
  }
}
