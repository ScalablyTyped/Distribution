package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "KeyMod")
@js.native
class KeyMod () extends StObject
/* static members */
object KeyMod {
  
  @JSImport("monaco-editor", "KeyMod")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monaco-editor", "KeyMod.Alt")
  @js.native
  val Alt: Double = js.native
  
  @JSImport("monaco-editor", "KeyMod.CtrlCmd")
  @js.native
  val CtrlCmd: Double = js.native
  
  @JSImport("monaco-editor", "KeyMod.Shift")
  @js.native
  val Shift: Double = js.native
  
  @JSImport("monaco-editor", "KeyMod.WinCtrl")
  @js.native
  val WinCtrl: Double = js.native
  
  inline def chord(firstPart: Double, secondPart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("chord")(firstPart.asInstanceOf[js.Any], secondPart.asInstanceOf[js.Any])).asInstanceOf[Double]
}
