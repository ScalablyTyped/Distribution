package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.anon.`1`
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilContainerPhrasingMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/container-phrasing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containerPhrasing(parent: typings.mdastUtilToMarkdown.libTypesMod.Parent & `1`, state: State, info: Info): String = (^.asInstanceOf[js.Dynamic].applyDynamic("containerPhrasing")(parent.asInstanceOf[js.Any], state.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typings.mdastUtilToMarkdown.libTypesMod.Handle
  
  type Info = typings.mdastUtilToMarkdown.libTypesMod.Info
  
  /* Inlined mdast-util-to-markdown.mdast-util-to-markdown/lib/types.Parent */
  type Parent = children
  
  type PhrasingContent = typings.mdastUtilToMarkdown.libTypesMod.PhrasingContent
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
