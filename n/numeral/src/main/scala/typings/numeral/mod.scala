package typings.numeral

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Usage: <code>import * as numeral from 'numeral'</code>
  */
object mod extends Shortcut {
  
  @JSImport("numeral", JSImport.Namespace)
  @js.native
  val ^ : Numeral = js.native
  
  type _To = Numeral
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Numeral = ^
}
