package typings
package mendixmodelsdkLib.distSdkInternalReferencesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/references", "ByIdReference")
@js.native
class ByIdReference[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement */] protected () extends js.Object {
  /**
       * Constructs and returns a new reference instance, that is owned (by a property of) an abstract element.
       */
  def this(owner: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement) = this()
  var isResolved: scala.Boolean = js.native
  var isResolving: scala.Boolean = js.native
  var owner: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement = js.native
  var referenceId: java.lang.String | scala.Null = js.native
  var target: mobxLib.libTypesObservablevalueMod.IObservableValue[T | scala.Null] = js.native
  def assertValueHasSameUnit(): scala.Unit = js.native
  def assertValueHasSameUnit(valueToCheck: T): scala.Unit = js.native
  def get(): T | scala.Null = js.native
  /**
       * Registers an observer in the form of a callback with this references and fires that callback
       * immediately if the reference is already resolved.
       * Used by properties to observe this reference, so that storage and logical updates can be applied.
       */
  def intercept(
    callback: js.Function1[
      /* change */ mobxLib.libTypesObservablevalueMod.IValueWillChange[T | scala.Null], 
      mobxLib.libTypesObservablevalueMod.IValueWillChange[T | scala.Null]
    ]
  ): mendixmodelsdkLib.distCommonMod.commonNs.IVoidCallback = js.native
  def resolve(): scala.Boolean = js.native
  def set(): scala.Unit = js.native
  def set(newValue: T): scala.Unit = js.native
  /**
       * Sets only the raw target id, without trying to resolve that.
       */
  def updateWithRawValue(value: java.lang.String): scala.Unit = js.native
}

