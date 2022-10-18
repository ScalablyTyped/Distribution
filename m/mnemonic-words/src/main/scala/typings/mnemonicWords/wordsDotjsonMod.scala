package typings.mnemonicWords

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordsDotjsonMod extends Shortcut {
  
  @JSImport("mnemonic-words/words.json", JSImport.Namespace)
  @js.native
  val ^ : js.Array[String] = js.native
  
  type _To = js.Array[String]
  
  /* This means you don't have to write `^`, but can instead just say `wordsDotjsonMod.foo` */
  override def _to: js.Array[String] = ^
}
