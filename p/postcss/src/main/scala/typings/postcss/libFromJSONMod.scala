package typings.postcss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.JSONHydrator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFromJSONMod extends Shortcut {
  
  @JSImport("postcss/lib/fromJSON", JSImport.Default)
  @js.native
  val default: JSONHydrator = js.native
  
  type _To = JSONHydrator
  
  /* This means you don't have to write `default`, but can instead just say `libFromJSONMod.foo` */
  override def _to: JSONHydrator = default
}
