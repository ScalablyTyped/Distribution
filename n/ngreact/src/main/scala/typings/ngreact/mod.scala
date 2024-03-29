package typings.ngreact

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ReactDirective = js.Function4[
    /* reactComponentName */ String | (ComponentClass[Any, ComponentState]), 
    /* propNames */ js.UndefOr[js.Array[String]], 
    /* conf */ js.UndefOr[js.Object], 
    /* injectableProps */ js.UndefOr[js.Object], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IDirective */ Any
  ]
}
