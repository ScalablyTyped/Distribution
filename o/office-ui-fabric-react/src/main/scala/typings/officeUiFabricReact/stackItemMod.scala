package typings.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackItemMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/components/Stack/StackItem/StackItem", JSImport.Default)
  @js.native
  val default: FunctionComponent[IStackItemProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Stack/StackItem/StackItem", "StackItem")
  @js.native
  val StackItem: FunctionComponent[IStackItemProps] = js.native
  
  type _To = FunctionComponent[IStackItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `stackItemMod.foo` */
  override def _to: FunctionComponent[IStackItemProps] = default
}
