package typings.pleaseUpgradeNode

import typings.pleaseUpgradeNode.anon.PartialOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("please-upgrade-node", JSImport.Namespace)
  @js.native
  def apply(pkg: Record[String, _]): Unit = js.native
  @JSImport("please-upgrade-node", JSImport.Namespace)
  @js.native
  def apply(pkg: Record[String, _], opts: PartialOptions): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var exitCode: Double = js.native
    
    def message(version: String): String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(exitCode: Double, message: String => String): Options = {
      val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], message = js.Any.fromFunction1(message))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    }
  }
}
