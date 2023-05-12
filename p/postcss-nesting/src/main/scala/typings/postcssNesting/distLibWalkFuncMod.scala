package typings.postcssNesting

import typings.postcss.mod.Container
import typings.postcss.mod.Result
import typings.postcssNesting.anon.NoIsPseudoSelector
import typings.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibWalkFuncMod {
  
  type walkFunc = js.Function3[
    /* node */ Container[ChildNode], 
    /* result */ Result, 
    /* opts */ NoIsPseudoSelector, 
    Unit
  ]
}
