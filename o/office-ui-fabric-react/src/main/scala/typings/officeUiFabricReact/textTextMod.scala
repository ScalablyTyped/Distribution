package typings.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import typings.officeUiFabricReact.textTypesMod.ITextProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textTextMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/components/Text/Text", JSImport.Default)
  @js.native
  val default: FunctionComponent[ITextProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Text/Text", "Text")
  @js.native
  val Text: FunctionComponent[ITextProps] = js.native
  
  type _To = FunctionComponent[ITextProps]
  
  /* This means you don't have to write `default`, but can instead just say `textTextMod.foo` */
  override def _to: FunctionComponent[ITextProps] = default
}
