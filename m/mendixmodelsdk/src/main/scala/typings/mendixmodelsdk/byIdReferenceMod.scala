package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.commonMod.common.IVoidCallback
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mobx.observablevalueMod.IObservableValue
import typings.mobx.observablevalueMod.IValueWillChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byIdReferenceMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/ByIdReference", "ByIdReference")
  @js.native
  class ByIdReference[T /* <: AbstractElement[IAbstractModel, Container] */] protected () extends StObject {
    /**
      * Constructs and returns a new reference instance, that is owned (by a property of) an abstract element.
      */
    def this(owner: AbstractElement[IAbstractModel, Container]) = this()
    
    def assertValueHasSameUnit(): Unit = js.native
    def assertValueHasSameUnit(valueToCheck: T): Unit = js.native
    
    def get(): T | Null = js.native
    
    /**
      * Get the row target id, the target might be not resolved yet
      */
    def getRawValue(): String | Null = js.native
    
    /**
      * Registers an observer in the form of a callback with this references and fires that callback
      * immediately if the reference is already resolved.
      * Used by properties to observe this reference, so that storage and logical updates can be applied.
      */
    def intercept(callback: js.Function1[/* change */ IValueWillChange[T | Null], IValueWillChange[T | Null]]): IVoidCallback = js.native
    
    var isResolved: Boolean = js.native
    
    var isResolving: Boolean = js.native
    
    var owner: AbstractElement[IAbstractModel, Container] = js.native
    
    var referenceId: String | Null = js.native
    
    def resolve(): Unit = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    var target: IObservableValue[T | Null] = js.native
    
    /**
      * Sets only the raw target id, without trying to resolve that.
      */
    def updateWithRawValue(value: String): Unit = js.native
  }
}
