package typings.mobxStateTree

import typings.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typings.mobxStateTree.distCoreTypeTypeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypesSnapshotProcessorMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/snapshotProcessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ]
  ): ISnapshotProcessor[IT, CustomC, CustomS] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotProcessor")(`type`.asInstanceOf[js.Any], processors.asInstanceOf[js.Any])).asInstanceOf[ISnapshotProcessor[IT, CustomC, CustomS]]
  inline def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ],
    name: String
  ): ISnapshotProcessor[IT, CustomC, CustomS] = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshotProcessor")(`type`.asInstanceOf[js.Any], processors.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ISnapshotProcessor[IT, CustomC, CustomS]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Custom extends mobx-state-tree.mobx-state-tree/dist/types/utility-types/snapshotProcessor._NotCustomized ? Other : Custom
    }}}
    */
  type CustomOrOther[Custom, Other] = Other
  
  type ISnapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS] = IType[
    CustomOrOther[
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
    ], 
    CustomOrOther[
      CustomS, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any
    ], 
    /* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any
  ]
  
  trait ISnapshotProcessors[C, CustomC, S, CustomS] extends StObject {
    
    /**
      * Function that transforms an output snapshot.
      * @param snapshot
      */
    var postProcessor: js.UndefOr[js.Function1[/* snapshot */ S, CustomS]] = js.undefined
    
    /**
      * Function that transforms an input snapshot.
      */
    var preProcessor: js.UndefOr[js.Function1[/* snapshot */ CustomC, C]] = js.undefined
  }
  object ISnapshotProcessors {
    
    inline def apply[C, CustomC, S, CustomS](): ISnapshotProcessors[C, CustomC, S, CustomS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISnapshotProcessors[C, CustomC, S, CustomS]]
    }
    
    extension [Self <: ISnapshotProcessors[?, ?, ?, ?], C, CustomC, S, CustomS](x: Self & (ISnapshotProcessors[C, CustomC, S, CustomS])) {
      
      inline def setPostProcessor(value: /* snapshot */ S => CustomS): Self = StObject.set(x, "postProcessor", js.Any.fromFunction1(value))
      
      inline def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
      
      inline def setPreProcessor(value: /* snapshot */ CustomC => C): Self = StObject.set(x, "preProcessor", js.Any.fromFunction1(value))
      
      inline def setPreProcessorUndefined: Self = StObject.set(x, "preProcessor", js.undefined)
    }
  }
  
  @js.native
  trait NotCustomized extends StObject
}
