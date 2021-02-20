package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotProcessorMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/snapshotProcessor", "snapshotProcessor")
  @js.native
  def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ]
  ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/snapshotProcessor", "snapshotProcessor")
  @js.native
  def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ],
    name: String
  ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
  
  type CustomOrOther[Custom, Other] = Custom | Other
  
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
  
  @js.native
  trait ISnapshotProcessors[C, CustomC, S, CustomS] extends StObject {
    
    /**
      * Function that transforms an output snapshot.
      * @param snapshot
      */
    var postProcessor: js.UndefOr[js.Function1[/* snapshot */ S, CustomS]] = js.native
    
    /**
      * Function that transforms an input snapshot.
      */
    var preProcessor: js.UndefOr[js.Function1[/* snapshot */ CustomC, C]] = js.native
  }
  object ISnapshotProcessors {
    
    @scala.inline
    def apply[C, CustomC, S, CustomS](): ISnapshotProcessors[C, CustomC, S, CustomS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISnapshotProcessors[C, CustomC, S, CustomS]]
    }
    
    @scala.inline
    implicit class ISnapshotProcessorsMutableBuilder[Self <: ISnapshotProcessors[_, _, _, _], C, CustomC, S, CustomS] (val x: Self with (ISnapshotProcessors[C, CustomC, S, CustomS])) extends AnyVal {
      
      @scala.inline
      def setPostProcessor(value: /* snapshot */ S => CustomS): Self = StObject.set(x, "postProcessor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostProcessorUndefined: Self = StObject.set(x, "postProcessor", js.undefined)
      
      @scala.inline
      def setPreProcessor(value: /* snapshot */ CustomC => C): Self = StObject.set(x, "preProcessor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreProcessorUndefined: Self = StObject.set(x, "preProcessor", js.undefined)
    }
  }
  
  @js.native
  trait NotCustomized extends StObject
}
