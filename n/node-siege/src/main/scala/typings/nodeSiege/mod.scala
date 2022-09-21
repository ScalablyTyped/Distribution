package typings.nodeSiege

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Siege = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Siege]
  
  @JSImport("node-siege", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Siege extends EventEmitter {
    
    def args(args: String): Siege = js.native
    
    def error(err: Any): Unit = js.native
    
    def run(): Siege = js.native
    
    val running: Boolean = js.native
    
    def validateArgs(): Unit = js.native
  }
}
