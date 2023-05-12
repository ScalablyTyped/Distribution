package typings.mdastUtilGfmStrikethrough

import typings.mdastUtilFromMarkdown.libMod.Extension
import typings.mdastUtilFromMarkdown.libMod.Handle
import typings.mdastUtilToMarkdown.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-gfm-strikethrough", "gfmStrikethroughFromMarkdown")
  @js.native
  val gfmStrikethroughFromMarkdown: FromMarkdownExtension = js.native
  
  @JSImport("mdast-util-gfm-strikethrough", "gfmStrikethroughToMarkdown")
  @js.native
  val gfmStrikethroughToMarkdown: ToMarkdownExtension = js.native
  
  type Delete = typings.mdast.mod.Delete
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type ToMarkdownExtension = Options
  
  type ToMarkdownHandle = typings.mdastUtilToMarkdown.libTypesMod.Handle
}
