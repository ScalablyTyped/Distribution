package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalMod {
  type ComponentFactory[P] = (typings.preact.mod.ComponentClass[P, js.Object]) | typings.preact.internalMod.FunctionalComponent[P]
}
