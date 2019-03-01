package typings
package mobxDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayOrObservableArray extends js.Object {
  var arrayOrObservableArray: reactLib.reactMod.ReactNs.Requireable[_]
  var objectOrObservableObject: reactLib.reactMod.ReactNs.Requireable[_]
  var observableArray: reactLib.reactMod.ReactNs.Requireable[_]
  var observableMap: reactLib.reactMod.ReactNs.Requireable[_]
  var observableObject: reactLib.reactMod.ReactNs.Requireable[_]
  def arrayOrObservableArrayOf(`type`: reactLib.reactMod.ReactNs.Validator[_]): reactLib.reactMod.ReactNs.Requireable[_]
  def observableArrayOf(`type`: reactLib.reactMod.ReactNs.Validator[_]): reactLib.reactMod.ReactNs.Requireable[_]
}

object Anon_ArrayOrObservableArray {
  @scala.inline
  def apply(
    arrayOrObservableArray: reactLib.reactMod.ReactNs.Requireable[_],
    arrayOrObservableArrayOf: js.Function1[reactLib.reactMod.ReactNs.Validator[_], reactLib.reactMod.ReactNs.Requireable[_]],
    objectOrObservableObject: reactLib.reactMod.ReactNs.Requireable[_],
    observableArray: reactLib.reactMod.ReactNs.Requireable[_],
    observableArrayOf: js.Function1[reactLib.reactMod.ReactNs.Validator[_], reactLib.reactMod.ReactNs.Requireable[_]],
    observableMap: reactLib.reactMod.ReactNs.Requireable[_],
    observableObject: reactLib.reactMod.ReactNs.Requireable[_]
  ): Anon_ArrayOrObservableArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrayOrObservableArray")(arrayOrObservableArray)
    __obj.updateDynamic("arrayOrObservableArrayOf")(arrayOrObservableArrayOf)
    __obj.updateDynamic("objectOrObservableObject")(objectOrObservableObject)
    __obj.updateDynamic("observableArray")(observableArray)
    __obj.updateDynamic("observableArrayOf")(observableArrayOf)
    __obj.updateDynamic("observableMap")(observableMap)
    __obj.updateDynamic("observableObject")(observableObject)
    __obj.asInstanceOf[Anon_ArrayOrObservableArray]
  }
}

