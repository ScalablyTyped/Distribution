package typings.postcssCustomProperties

import typings.postcss.mod.Container
import typings.postcss.mod.Declaration
import typings.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIsIgnoredMod {
  
  @JSImport("postcss-custom-properties/dist/is-ignored", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBlockIgnored(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockIgnored")().asInstanceOf[Any]
  inline def isBlockIgnored(container: Container[ChildNode]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockIgnored")(container.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isDeclarationIgnored(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclarationIgnored")().asInstanceOf[Boolean]
  inline def isDeclarationIgnored(decl: Declaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclarationIgnored")(decl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
