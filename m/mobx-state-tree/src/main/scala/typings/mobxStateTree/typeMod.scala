package typings.mobxStateTree

import typings.mobxStateTree.anon.CreationType
import typings.mobxStateTree.anon.SnapshotType
import typings.mobxStateTree.modelMod.ModelPrimitive
import typings.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typings.mobxStateTree.typeCheckerMod.IValidationContext
import typings.mobxStateTree.typeCheckerMod.IValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("mobx-state-tree/dist/core/type/type", "isType")
  @js.native
  def isType(value: js.Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType */ Boolean = js.native
  
  type ExtractCSTWithSTN[IT /* <: SnapshotType */] = /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
  
  type ExtractCSTWithoutSTN[IT /* <: CreationType */] = /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
  
  type IAnyComplexType = IType[js.Any, js.Any, js.Object]
  
  type IAnyType = IType[js.Any, js.Any, js.Any]
  
  type IComplexType[C, S, T] = IType[C, S, T with js.Object]
  
  type ISimpleType[T] = IType[T, T, T]
  
  @js.native
  trait IType[C, S, T] extends StObject {
    
    /**
      * @deprecated use `SnapshotIn<typeof MyType>` instead.
      * @hidden
      */
    val CreationType: C = js.native
    
    /**
      * @deprecated use `SnapshotOut<typeof MyType>` instead.
      * @hidden
      */
    val SnapshotType: S = js.native
    
    /**
      * @deprecated use `Instance<typeof MyType>` instead.
      * @hidden
      */
    val Type: STNValue[T, this.type] = js.native
    
    /**
      * @deprecated do not use.
      * @hidden
      */
    val TypeWithoutSTN: T = js.native
    
    /**
      * Creates an instance for the type given an snapshot input.
      *
      * @returns An instance of that type.
      */
    def create(): /* import warning: importer.ImportType#apply Failed type conversion: this['Type'] */ js.Any = js.native
    def create(snapshot: C): /* import warning: importer.ImportType#apply Failed type conversion: this['Type'] */ js.Any = js.native
    def create(snapshot: C, env: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: this['Type'] */ js.Any = js.native
    def create(snapshot: js.UndefOr[scala.Nothing], env: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: this['Type'] */ js.Any = js.native
    
    /**
      * Gets the textual representation of the type as a string.
      */
    def describe(): String = js.native
    
    /**
      * Name of the identifier attribute or null if none.
      */
    val identifierAttribute: js.UndefOr[String] = js.native
    
    /**
      * Checks if a given snapshot / instance is of the given type.
      *
      * @param thing Snapshot or instance to be checked.
      * @returns true if the value is of the current type, false otherwise.
      */
    def is(thing: js.Any): Boolean = js.native
    
    /**
      * Friendly type name.
      */
    var name: String = js.native
    
    /**
      * Run's the type's typechecker on the given value with the given validation context.
      *
      * @param thing Value to be checked, either a snapshot or an instance.
      * @param context Validation context, an array of { subpaths, subtypes } that should be validated
      * @returns The validation result, an array with the list of validation errors.
      */
    def validate(thing: C, context: IValidationContext): IValidationResult = js.native
  }
  
  type Instance[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T['Type'] */ js.Any)
  
  type Primitives = js.UndefOr[ModelPrimitive | Null]
  
  type STNValue[T, IT /* <: IAnyType */] = T | (T with IStateTreeNode[IT])
  
  type SnapshotIn[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: any['CreationType'] */ js.Any)
  
  type SnapshotOrInstance[T] = SnapshotIn[T] | Instance[T]
  
  type SnapshotOut[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: any['SnapshotType'] */ js.Any)
}
