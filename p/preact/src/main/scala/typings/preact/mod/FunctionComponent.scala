package typings.preact.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponent[P]
  extends AnyComponent[P, js.Any] {
  
  def apply(props: RenderableProps[P, _]): VNode[_] | Null = js.native
  def apply(props: RenderableProps[P, _], context: js.Any): VNode[_] | Null = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
