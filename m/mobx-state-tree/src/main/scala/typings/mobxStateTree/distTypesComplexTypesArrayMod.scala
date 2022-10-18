package typings.mobxStateTree

import typings.mobx.distTypesObservablearrayMod.IObservableArray
import typings.mobxStateTree.distCoreNodeHookMod.IHooksGetter
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typings.mobxStateTree.distCoreTypeTypeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComplexTypesArrayMod {
  
  @JSImport("mobx-state-tree/dist/types/complex-types/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def array[IT /* <: IAnyType */](subtype: IT): IArrayType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(subtype.asInstanceOf[js.Any]).asInstanceOf[IArrayType[IT]]
  
  inline def isArrayType[Items /* <: IAnyType */](`type`: IAnyType): /* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/array.IArrayType<Items> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/array.IArrayType<Items> */ Boolean]
  
  @js.native
  trait IArrayType[IT /* <: IAnyType */]
    extends StObject
       with IType[
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
    extends StObject
       with IObservableArray[
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
