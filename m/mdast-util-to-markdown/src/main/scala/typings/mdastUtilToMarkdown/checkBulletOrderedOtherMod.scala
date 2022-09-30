package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Dot
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkBulletOrderedOtherMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-bullet-ordered-other", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkBulletOrderedOther(context: Context): Exclude[js.UndefOr[Dot | String], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBulletOrderedOther")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[Dot | String], Unit]]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
}
