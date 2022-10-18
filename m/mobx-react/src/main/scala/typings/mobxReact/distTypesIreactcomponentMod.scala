package typings.mobxReact

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIreactcomponentMod {
  
  type IReactComponent[P] = ClassicComponentClass[P] | (ComponentClass[P, ComponentState]) | FunctionComponent[P] | ForwardRefExoticComponent[P]
}
