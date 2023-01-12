package typings.pleaseUpgradeNode

import typings.pleaseUpgradeNode.anon.PartialOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pkg: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].apply(pkg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(pkg: Record[String, Any], opts: PartialOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(pkg.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("please-upgrade-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var exitCode: Double
    
    def message(version: String): String
  }
  object Options {
    
    inline def apply(exitCode: Double, message: String => String): Options = {
      val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], message = js.Any.fromFunction1(message))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    }
  }
}
