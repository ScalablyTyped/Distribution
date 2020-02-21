package typings.mobxReact

import typings.react.mod.Requireable
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react/dist/propTypes", JSImport.Namespace)
@js.native
object propTypesMod extends js.Object {
  @js.native
  object PropTypes extends js.Object {
    var arrayOrObservableArray: Requireable[_] = js.native
    var objectOrObservableObject: Requireable[_] = js.native
    var observableArray: Requireable[_] = js.native
    var observableMap: Requireable[_] = js.native
    var observableObject: Requireable[_] = js.native
    def arrayOrObservableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
    def observableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
  }
  
}

