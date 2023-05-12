package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.anon.`0`
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilContainerFlowMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/container-flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containerFlow(parent: typings.mdastUtilToMarkdown.libTypesMod.Parent & `0`, state: State, info: TrackFields): String = (^.asInstanceOf[js.Dynamic].applyDynamic("containerFlow")(parent.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type FlowContent = typings.mdastUtilToMarkdown.libTypesMod.FlowContent
  
  type Node = typings.mdastUtilToMarkdown.libTypesMod.Node
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
  
  type TrackFields = typings.mdastUtilToMarkdown.libTypesMod.TrackFields
}
