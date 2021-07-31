package typings.nvd3.mod

import typings.d3Dispatch.mod.Dispatch_
import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3Transition.mod.Transition_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nvd3Element extends StObject {
  
  def apply(
    selection: Selection_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  def apply(
    transition: Transition_[
      js.Any | js.Array[js.Any], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ js.Any, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ js.Any
    ],
    args: js.Any*
  ): js.Any = js.native
  
  var dispatch: Dispatch_[js.Object] = js.native
  
  def options(options: js.Any): this.type = js.native
  
  def update(): Unit = js.native
}
