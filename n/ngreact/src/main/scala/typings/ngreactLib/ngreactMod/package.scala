package typings
package ngreactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngreactMod {
  type ReactDirective = js.Function4[
    /* reactComponentName */ java.lang.String | (reactLib.reactMod.ReactNs.ComponentClass[js.Any, reactLib.reactMod.ReactNs.ComponentState]), 
    /* propNames */ js.UndefOr[js.Array[java.lang.String]], 
    /* conf */ js.UndefOr[js.Object], 
    /* injectableProps */ js.UndefOr[js.Object], 
    angularLib.angularMod.angularNs.IDirective[
      angularLib.angularMod.angularNs.IScope, 
      angularLib.JQLite, 
      angularLib.angularMod.angularNs.IAttributes, 
      angularLib.angularMod.angularNs.IController
    ]
  ]
}
