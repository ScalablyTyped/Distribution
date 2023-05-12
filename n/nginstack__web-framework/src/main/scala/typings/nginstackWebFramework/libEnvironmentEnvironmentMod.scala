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
    def confirm(msg: String, negativeDefaultAnswer: Boolean): Boolean = js.native
    
    def exit(): Unit = js.native
    def exit(uri: String): Unit = js.native
    
    var exiting: Boolean = js.native
    
    def lockScreen(): Boolean = js.native
    
    def prompt(label: String, options: js.Array[Any]): Any = js.native
    def prompt(label: String, options: js.Array[Any], verticalAlign: Boolean): Any = js.native
    def prompt(label: String, options: js.Array[Any], verticalAlign: Boolean, defaultOptionIndex: Double): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      verticalAlign: Boolean,
      defaultOptionIndex: Double,
      escapeIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      verticalAlign: Boolean,
      defaultOptionIndex: Unit,
      escapeIndex: Double
    ): Any = js.native
    def prompt(label: String, options: js.Array[Any], verticalAlign: Unit, defaultOptionIndex: Double): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      verticalAlign: Unit,
      defaultOptionIndex: Double,
      escapeIndex: Double
    ): Any = js.native
    def prompt(
      label: String,
      options: js.Array[Any],
      verticalAlign: Unit,
      defaultOptionIndex: Unit,
      escapeIndex: Double
    ): Any = js.native
  }
}
