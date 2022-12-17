package typings.mobxStateTree

import typings.mobxStateTree.anon.AcceptsUndefined
import typings.mobxStateTree.anon.OnInvalidated
import typings.mobxStateTree.distCoreNodeNodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.distCoreNodeNodeUtilsMod.IStateTreeNode
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyComplexType
import typings.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typings.mobxStateTree.distCoreTypeTypeMod.IType
import typings.mobxStateTree.distTypesUtilityTypesIdentifierMod.ReferenceIdentifier
import typings.mobxStateTree.distTypesUtilityTypesMaybeMod.IMaybe
import typings.mobxStateTree.mobxStateTreeStrings.destroy
import typings.mobxStateTree.mobxStateTreeStrings.detach
import typings.mobxStateTree.mobxStateTreeStrings.invalidSnapshotReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypesReferenceMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isReferenceType[IT /* <: IReferenceType[Any] */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReferenceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def reference[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("reference")(subType.asInstanceOf[js.Any]).asInstanceOf[IReferenceType[IT]]
  inline def reference[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("reference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IReferenceType[IT]]
  
  inline def safeReference[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any]).asInstanceOf[IMaybe[IReferenceType[IT]]]
  inline def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] & OnInvalidated[IT]) | OnInvalidated[IT]): IReferenceType[IT] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IReferenceType[IT]]
  inline def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] & AcceptsUndefined[IT]) | AcceptsUndefined[IT]): IMaybe[IReferenceType[IT]] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeReference")(subType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IMaybe[IReferenceType[IT]]]
  
  type IReferenceType[IT /* <: IAnyComplexType */] = IType[
    ReferenceIdentifier, 
    ReferenceIdentifier, 
    /* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any
  ]
  
  type OnReferenceInvalidated[STN /* <: IAnyStateTreeNode */] = js.Function1[/* event */ OnReferenceInvalidatedEvent[STN], Unit]
  
  @js.native
  trait OnReferenceInvalidatedEvent[STN /* <: IAnyStateTreeNode */] extends StObject {
    
    var cause: detach | destroy | invalidSnapshotReference = js.native
    
    var invalidId: ReferenceIdentifier = js.native
    
    var invalidTarget: js.UndefOr[STN] = js.native
    
    var parent: IAnyStateTreeNode = js.native
    
    def removeRef(): Unit = js.native
    
    def replaceRef(): Unit = js.native
    def replaceRef(newRef: STN): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxStateTree.distTypesUtilityTypesReferenceMod.ReferenceOptionsGetSet[IT]
    - typings.mobxStateTree.distTypesUtilityTypesReferenceMod.ReferenceOptionsOnInvalidated[IT]
    - typings.mobxStateTree.distTypesUtilityTypesReferenceMod.ReferenceOptionsGetSet[IT] & typings.mobxStateTree.distTypesUtilityTypesReferenceMod.ReferenceOptionsOnInvalidated[IT]
  */
  type ReferenceOptions[IT /* <: IAnyComplexType */] = _ReferenceOptions[IT] | (ReferenceOptionsGetSet[IT] & ReferenceOptionsOnInvalidated[IT])
  
  @js.native
  trait ReferenceOptionsGetSet[IT /* <: IAnyComplexType */]
    extends StObject
       with _ReferenceOptions[IT] {
    
    def get(identifier: ReferenceIdentifier): ReferenceT[IT] = js.native
    def get(identifier: ReferenceIdentifier, parent: IAnyStateTreeNode): ReferenceT[IT] = js.native
    
    def set(value: ReferenceT[IT]): ReferenceIdentifier = js.native
    def set(value: ReferenceT[IT], parent: IAnyStateTreeNode): ReferenceIdentifier = js.native
  }
  
  trait ReferenceOptionsOnInvalidated[IT /* <: IAnyComplexType */]
    extends StObject
       with _ReferenceOptions[IT] {
    
    def onInvalidated(event: OnReferenceInvalidatedEvent[ReferenceT[IT]]): Unit
    @JSName("onInvalidated")
    var onInvalidated_Original: OnReferenceInvalidated[ReferenceT[IT]]
  }
  object ReferenceOptionsOnInvalidated {
    
    inline def apply[IT /* <: IAnyComplexType */](onInvalidated: /* event */ OnReferenceInvalidatedEvent[ReferenceT[IT]] => Unit): ReferenceOptionsOnInvalidated[IT] = {
      val __obj = js.Dynamic.literal(onInvalidated = js.Any.fromFunction1(onInvalidated))
      __obj.asInstanceOf[ReferenceOptionsOnInvalidated[IT]]
    }
    
    extension [Self <: ReferenceOptionsOnInvalidated[?], IT /* <: IAnyComplexType */](x: Self & ReferenceOptionsOnInvalidated[IT]) {
      
      inline def setOnInvalidated(value: /* event */ OnReferenceInvalidatedEvent[ReferenceT[IT]] => Unit): Self = StObject.set(x, "onInvalidated", js.Any.fromFunction1(value))
    }
  }
  
  type ReferenceT[IT /* <: IAnyType */] = (/* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any) & IStateTreeNode[IReferenceType[IT]]
  
  trait _ReferenceOptions[IT /* <: IAnyComplexType */] extends StObject
}
