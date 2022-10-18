package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEnvironmentEnvironmentMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/environment/Environment", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Environment
  @JSImport("@nginstack/web-framework/lib/environment/Environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Environment = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Environment]
  
  @js.native
  trait Environment extends StObject {
    
    /* private */ var _ctrlChannel: Any = js.native
    
    def alert(message: String): Any = js.native
    
    def confirm(msg: String): Boolean = js.native
    def confirm(msg: String, opt_negativeDefaultAnswer: Boolean): Boolean = js.native
    
    def exit(): Unit = js.native
    def exit(uri: String): Unit = js.native
    
    var exiting: Boolean = js.native
    
    def prompt(label: String, options: js.Array[Any]): Any = js.native
    def prompt(label: String, options: js.Array[Any], opt_verticalAlign: Boolean): Any = js.native
    def prompt(label: String, options: js.Array[Any], opt_verticalAlign: Boolean, opt_defaultOptionIndex: Double): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      opt_verticalAlign: Boolean,
      opt_defaultOptionIndex: Double,
      opt_escapeIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      opt_verticalAlign: Boolean,
      opt_defaultOptionIndex: Unit,
      opt_escapeIndex: Double
    ): Any = js.native
    def prompt(label: String, options: js.Array[Any], opt_verticalAlign: Unit, opt_defaultOptionIndex: Double): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      opt_verticalAlign: Unit,
      opt_defaultOptionIndex: Double,
      opt_escapeIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      opt_verticalAlign: Unit,
      opt_defaultOptionIndex: Unit,
      opt_escapeIndex: Double
    ): Any = js.native
  }
}
