package typings.pico8parse.mod

import typings.pico8parse.mod.ast.Identifier_
import typings.pico8parse.mod.ast.Node
import typings.pico8parse.pico8parseBooleans.`false`
import typings.pico8parse.pico8parseStrings.`pseudo-latin1`
import typings.pico8parse.pico8parseStrings.`x-user-defined`
import typings.pico8parse.pico8parseStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<pico8parse.pico8parse.Options> */
object defaultOptions {
  
  @JSImport("pico8parse", "defaultOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pico8parse", "defaultOptions.comments")
  @js.native
  def comments: js.UndefOr[Boolean] = js.native
  inline def comments_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comments")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.encodingMode")
  @js.native
  def encodingMode: js.UndefOr[`pseudo-latin1` | `x-user-defined` | none] = js.native
  inline def encodingMode_=(x: js.UndefOr[`pseudo-latin1` | `x-user-defined` | none]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodingMode")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.extendedIdentifiers")
  @js.native
  def extendedIdentifiers: js.UndefOr[`false`] = js.native
  inline def extendedIdentifiers_=(x: js.UndefOr[`false`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extendedIdentifiers")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.ignoreStrictP8FileFormat")
  @js.native
  def ignoreStrictP8FileFormat: js.UndefOr[Boolean] = js.native
  inline def ignoreStrictP8FileFormat_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStrictP8FileFormat")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.locations")
  @js.native
  def locations: js.UndefOr[Boolean] = js.native
  inline def locations_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locations")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.luaVersion")
  @js.native
  def luaVersion: js.UndefOr[LuaVersion] = js.native
  inline def luaVersion_=(x: js.UndefOr[LuaVersion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("luaVersion")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.onCreateNode")
  @js.native
  def onCreateNode: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  inline def onCreateNode_=(x: js.UndefOr[js.Function1[/* node */ Node, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreateNode")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.onCreateScope")
  @js.native
  def onCreateScope: js.UndefOr[js.Function0[Unit]] = js.native
  inline def onCreateScope_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCreateScope")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.onDestroyScope")
  @js.native
  def onDestroyScope: js.UndefOr[js.Function0[Unit]] = js.native
  inline def onDestroyScope_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDestroyScope")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.onLocalDeclaration")
  @js.native
  def onLocalDeclaration: js.UndefOr[js.Function1[/* identifier */ Identifier_, Unit]] = js.native
  inline def onLocalDeclaration_=(x: js.UndefOr[js.Function1[/* identifier */ Identifier_, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLocalDeclaration")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.ranges")
  @js.native
  def ranges: js.UndefOr[Boolean] = js.native
  inline def ranges_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.scope")
  @js.native
  def scope: js.UndefOr[Boolean] = js.native
  inline def scope_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
  
  @JSImport("pico8parse", "defaultOptions.wait")
  @js.native
  def wait_ : js.UndefOr[Boolean] = js.native
  
  inline def wait__=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wait")(x.asInstanceOf[js.Any])
}
