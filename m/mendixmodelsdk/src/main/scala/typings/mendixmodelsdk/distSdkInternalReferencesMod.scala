package typings.mendixmodelsdk

import typings.mendixmodelsdk.distCommonMod.common.IVoidCallback
import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import typings.mobx.libTypesObservablevalueMod.IValueWillChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/references", JSImport.Namespace)
@js.native
object distSdkInternalReferencesMod extends js.Object {
  @js.native
  class ByIdReference[T /* <: AbstractElement */] protected () extends js.Object {
    /**
      * Constructs and returns a new reference instance, that is owned (by a property of) an abstract element.
      */
    def this(owner: AbstractElement) = this()
    var isResolved: Boolean = js.native
    var isResolving: Boolean = js.native
    var owner: AbstractElement = js.native
    var referenceId: String | Null = js.native
    var target: IObservableValue[T | Null] = js.native
    def assertValueHasSameUnit(): Unit = js.native
    def assertValueHasSameUnit(valueToCheck: T): Unit = js.native
    def get(): T | Null = js.native
    /**
      * Registers an observer in the form of a callback with this references and fires that callback
      * immediately if the reference is already resolved.
      * Used by properties to observe this reference, so that storage and logical updates can be applied.
      */
    def intercept(callback: js.Function1[/* change */ IValueWillChange[T | Null], IValueWillChange[T | Null]]): IVoidCallback = js.native
    def resolve(): Unit = js.native
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    /**
      * Sets only the raw target id, without trying to resolve that.
      */
    def updateWithRawValue(value: String): Unit = js.native
  }
  
}

