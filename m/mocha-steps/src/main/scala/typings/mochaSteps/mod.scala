package typings.mochaSteps

import typings.mocha.Mocha.Func
import typings.mocha.Mocha.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("step")
    @js.native
    def step(title: String): Test = js.native
    @JSGlobal("step")
    @js.native
    def step(title: String, fn: Func): Test = js.native
    
    @JSGlobal("xstep")
    @js.native
    def xstep(title: String): Test = js.native
    @JSGlobal("xstep")
    @js.native
    def xstep(title: String, fn: Func): Test = js.native
  }
  
  @JSImport("mocha-steps", "step")
  @js.native
  def step(title: String): Test = js.native
  @JSImport("mocha-steps", "step")
  @js.native
  def step(title: String, fn: Func): Test = js.native
  
  @JSImport("mocha-steps", "xstep")
  @js.native
  def xstep(title: String): Test = js.native
  @JSImport("mocha-steps", "xstep")
  @js.native
  def xstep(title: String, fn: Func): Test = js.native
}
