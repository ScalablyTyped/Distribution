package typings.mobxStateTree

import typings.mobxStateTree.anon.CreationType
import typings.mobxStateTree.anon.SnapshotType
import typings.mobxStateTree.distCoreTypeTypeCheckerMod.IValidationContext
import typings.mobxStateTree.distCoreTypeTypeCheckerMod.IValidationResult
import typings.mobxStateTree.distTypesComplexTypesModelMod.ModelPrimitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreTypeTypeMod {
  
  @JSImport("mobx-state-tree/dist/core/type/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isType(value: Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType */ Boolean]
  
  type ExtractCSTWithSTN[IT /* <: CreationType */] = /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
  
  type ExtractCSTWithoutSTN[IT /* <: SnapshotType */] = /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any
  
  type IAnyComplexType = IType[Any, Any, js.Object]
  
  type IAnyType = IType[Any, Any, Any]
  
  type IComplexType[C, S, T] = IType[C, S, T & js.Object]
  
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
    def create(snapshot: C, env: Any): /* import warning: importer.ImportType#apply Failed type conversion: this['Type'] */ js.Any = js.native
    def create(snapshot: Unit, env: Any): /* import warning: importer.ImportType#apply Failed type conversion: this['Type'] */ js.Any = js.native
    
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
    def is(thing: Any): Boolean = js.native
    
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {[$type] : undefined,   Type :any} ? T['Type'] : T
    }}}
    */
  @js.native
  trait Instance[T]
    extends StObject
       with SnapshotOrInstance[T]
  
  type Primitives = js.UndefOr[ModelPrimitive | Null]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? T & mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IStateTreeNode<IT> : T
    }}}
    */
  @js.native
  trait STNValue[T, IT /* <: IAnyType */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {[$type] : undefined,   CreationType :any} ? T['CreationType'] : T extends mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IStateTreeNode<infer IT> ? IT['CreationType'] : T
    }}}
    */
  @js.native
  trait SnapshotIn[T]
    extends StObject
       with SnapshotOrInstance[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxStateTree.distCoreTypeTypeMod.SnapshotIn[T]
    - typings.mobxStateTree.distCoreTypeTypeMod.Instance[T]
  */
  trait SnapshotOrInstance[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {[$type] : undefined,   SnapshotType :any} ? T['SnapshotType'] : T extends mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.IStateTreeNode<infer IT> ? IT['SnapshotType'] : T
    }}}
    */
  @js.native
  trait SnapshotOut[T] extends StObject
}
