package typings.mobxStateTree

import typings.mobxStateTree.anon.AcceptsUndefined
import typings.mobxStateTree.anon.`0`
import typings.mobxStateTree.identifierMod.ReferenceIdentifier
import typings.mobxStateTree.maybeMod.IMaybe
import typings.mobxStateTree.mobxStateTreeStrings.destroy
import typings.mobxStateTree.mobxStateTreeStrings.detach
import typings.mobxStateTree.mobxStateTreeStrings.invalidSnapshotReference
import typings.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typings.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typings.mobxStateTree.typeMod.IAnyComplexType
import typings.mobxStateTree.typeMod.IAnyType
import typings.mobxStateTree.typeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/reference", "isReferenceType")
  @js.native
  def isReferenceType[IT /* <: IReferenceType[_] */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/reference", "reference")
  @js.native
  def reference[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/reference", "reference")
  @js.native
  def reference[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/reference", "safeReference")
  @js.native
  def safeReference[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/reference", "safeReference")
  @js.native
  def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with AcceptsUndefined): IMaybe[IReferenceType[IT]] = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/reference", "safeReference")
  @js.native
  def safeReference_IT_IAnyComplexType_IReferenceType[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with `0`): IReferenceType[IT] = js.native
  
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
    - typings.mobxStateTree.referenceMod.ReferenceOptionsGetSet[IT]
    - typings.mobxStateTree.referenceMod.ReferenceOptionsOnInvalidated[IT]
    - typings.mobxStateTree.referenceMod.ReferenceOptionsGetSet[IT] with typings.mobxStateTree.referenceMod.ReferenceOptionsOnInvalidated[IT]
  */
  type ReferenceOptions[IT /* <: IAnyComplexType */] = _ReferenceOptions[IT] | (ReferenceOptionsGetSet[IT] with ReferenceOptionsOnInvalidated[IT])
  
  @js.native
  trait ReferenceOptionsGetSet[IT /* <: IAnyComplexType */] extends _ReferenceOptions[IT] {
    
    def get(identifier: ReferenceIdentifier): ReferenceT[IT] = js.native
    def get(identifier: ReferenceIdentifier, parent: IAnyStateTreeNode): ReferenceT[IT] = js.native
    
    def set(value: ReferenceT[IT]): ReferenceIdentifier = js.native
    def set(value: ReferenceT[IT], parent: IAnyStateTreeNode): ReferenceIdentifier = js.native
  }
  
  @js.native
  trait ReferenceOptionsOnInvalidated[IT /* <: IAnyComplexType */] extends _ReferenceOptions[IT] {
    
    def onInvalidated(event: OnReferenceInvalidatedEvent[ReferenceT[IT]]): Unit = js.native
    @JSName("onInvalidated")
    var onInvalidated_Original: OnReferenceInvalidated[ReferenceT[IT]] = js.native
  }
  
  type ReferenceT[IT /* <: IAnyType */] = (/* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any) with IStateTreeNode[IReferenceType[IT]]
  
  trait _ReferenceOptions[IT /* <: IAnyComplexType */] extends StObject
}
