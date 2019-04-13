package typings
package ngreactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngreactMod {
  type ReactDirective = js.Function4[
    /* reactComponentName */ java.lang.String | (reactLib.reactMod.ComponentClass[js.Any, reactLib.reactMod.ComponentState]), 
    /* propNames */ js.UndefOr[js.Array[java.lang.String]], 
    /* conf */ js.UndefOr[js.Object], 
    /* injectableProps */ js.UndefOr[js.Object], 
    angularLib.angularMod.IDirective[
      angularLib.angularMod.IScope, 
      angularLib.JQLite, 
      angularLib.angularMod.IAttributes, 
      angularLib.angularMod.IController
    ]
  ]
}
