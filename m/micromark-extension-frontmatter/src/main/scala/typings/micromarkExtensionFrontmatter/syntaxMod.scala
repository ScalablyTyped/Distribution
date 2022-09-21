package typings.micromarkExtensionFrontmatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxMod {
  
  @JSImport("micromark-extension-frontmatter/dev/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frontmatter(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatter")().asInstanceOf[Extension]
  inline def frontmatter(options: typings.micromarkExtensionFrontmatter.mattersMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatter")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Construct = typings.micromarkUtilTypes.mod.Construct
  
  type ConstructRecord = typings.micromarkUtilTypes.mod.ConstructRecord
  
  type Extension = typings.micromarkUtilTypes.mod.Extension
  
  type Info = typings.micromarkExtensionFrontmatter.mattersMod.Info
  
  type Matter = typings.micromarkExtensionFrontmatter.mattersMod.Matter
  
  type Options = typings.micromarkExtensionFrontmatter.mattersMod.Options
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type Tokenizer = typings.micromarkUtilTypes.mod.Tokenizer
}
