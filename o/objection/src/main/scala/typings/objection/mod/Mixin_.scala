package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mixin_ extends js.Object {
  // Using ModelClass<M> causes TS 2.5 to render ModelClass<any> rather
  // than an identity function type. <M extends typeof Model> retains the
  // model subclass type in the return value, without requiring the user
  // to type the Mixin call.
  def apply[MC /* <: ModelClass[_] */](modelClass: MC, plugins: Plugin*): MC = js.native
  def apply[MC /* <: ModelClass[_] */](modelClass: MC, plugins: js.Array[Plugin]): MC = js.native
}

