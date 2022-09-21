package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Plussign
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.`-_`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkBulletMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/check-bullet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkBullet(context: Context): Exclude[js.UndefOr[`-_` | Asterisk | Plussign], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkBullet")(context.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[`-_` | Asterisk | Plussign], Unit]]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
}
