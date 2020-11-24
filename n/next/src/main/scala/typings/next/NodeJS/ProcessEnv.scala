package typings.next.NodeJS

import typings.next.nextStrings.development
import typings.next.nextStrings.production
import typings.next.nextStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessEnv extends js.Object {
  
  val NODE_ENV: development | production | test = js.native
}
object ProcessEnv {
  
  @scala.inline
  def apply(NODE_ENV: development | production | test): ProcessEnv = {
    val __obj = js.Dynamic.literal(NODE_ENV = NODE_ENV.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEnv]
  }
  
  @scala.inline
  implicit class ProcessEnvOps[Self <: ProcessEnv] (val x: Self) extends AnyVal {
    
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
    def setNODE_ENV(value: development | production | test): Self = this.set("NODE_ENV", value.asInstanceOf[js.Any])
  }
}
