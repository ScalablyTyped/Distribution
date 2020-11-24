package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object internalMod {
  
  type ComponentFactory[P] = (typings.preact.mod.ComponentClass[P, js.Object]) | typings.preact.internalMod.FunctionalComponent[P]
}
