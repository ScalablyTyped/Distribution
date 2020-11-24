package typings.memFs

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mem-fs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def create(): Store = js.native
  
  @js.native
  trait Store extends EventEmitter {
    
    def add(file: File): this.type = js.native
    
    def each(callback: js.Function2[/* file */ File, /* index */ Double, Unit]): this.type = js.native
    
    def get(filepath: String): File = js.native
    
    def stream(): Transform = js.native
  }
}
