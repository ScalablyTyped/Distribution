package typings.mocha.commonMod

import typings.mocha.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteFunctions extends js.Object {
  
  /**
    * Creates a suite.
    */
  def create(opts: CreateOptions): Suite = js.native
  
  /**
    * Create an exclusive Suite; convenience function
    */
  def only(opts: CreateOptions): Suite = js.native
  
  /**
    * Create a Suite, but skip it; convenience function
    */
  def skip(opts: CreateOptions): Suite = js.native
}
object SuiteFunctions {
  
  @scala.inline
  def apply(create: CreateOptions => Suite, only: CreateOptions => Suite, skip: CreateOptions => Suite): SuiteFunctions = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), only = js.Any.fromFunction1(only), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[SuiteFunctions]
  }
  
  @scala.inline
  implicit class SuiteFunctionsOps[Self <: SuiteFunctions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: CreateOptions => Suite): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnly(value: CreateOptions => Suite): Self = this.set("only", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: CreateOptions => Suite): Self = this.set("skip", js.Any.fromFunction1(value))
  }
}
