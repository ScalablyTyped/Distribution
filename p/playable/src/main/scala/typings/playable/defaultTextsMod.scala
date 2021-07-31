package typings.playable

import org.scalablytyped.runtime.Shortcut
import typings.playable.textMapTypesMod.ITextMapConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTextsMod extends Shortcut {
  
  @JSImport("playable/dist/src/modules/text-map/default-texts", JSImport.Default)
  @js.native
  val default: ITextMapConfig = js.native
  
  type _To = ITextMapConfig
  
  /* This means you don't have to write `default`, but can instead just say `defaultTextsMod.foo` */
  override def _to: ITextMapConfig = default
}
