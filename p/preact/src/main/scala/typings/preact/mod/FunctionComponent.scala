package typings.preact.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponent[P]
  extends StObject
     with AnyComponent[P, Any] {
  
  def apply(props: RenderableProps[P, Any]): VNode[Any] | Null = js.native
  def apply(props: RenderableProps[P, Any], context: Any): VNode[Any] | Null = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
