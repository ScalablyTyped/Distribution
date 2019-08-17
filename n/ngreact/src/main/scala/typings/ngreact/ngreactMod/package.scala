package typings.ngreact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngreactMod {
  import typings.angular.JQLite
  import typings.angular.angularMod.IAttributes
  import typings.angular.angularMod.IController
  import typings.angular.angularMod.IDirective
  import typings.angular.angularMod.IScope
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState

  type ReactDirective = js.Function4[
    /* reactComponentName */ String | (ComponentClass[js.Any, ComponentState]), 
    /* propNames */ js.UndefOr[js.Array[String]], 
    /* conf */ js.UndefOr[js.Object], 
    /* injectableProps */ js.UndefOr[js.Object], 
    IDirective[IScope, JQLite, IAttributes, IController]
  ]
}
