package typings.mdx

import typings.mdx.typesMod.MDXProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Support markdown extensions from
// https://github.com/sindresorhus/markdown-extensions/blob/v1.1.1/markdown-extensions.json
/**
  * A markdown file which exports a JSX component.
  */
object AsteriskDotmdMod {
  
  @JSImport("*.md", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MDXProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
}
