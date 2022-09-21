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

trait Options extends StObject {
  
  /** Store comments as an array in the chunk object. */
  var comments: Boolean
  
  /**
    * Defines the relation between code points ≥ U+0080 appearing in parser input and raw bytes in source code,
    * and how Lua escape sequences in JavaScript strings should be interpreted.
    * See the Encoding modes section https://pictelm.github.io/pico8parse/upstream.html#encoding-modes for more information.
    */
  var encodingMode: `pseudo-latin1` | `x-user-defined` | none
  
  /**
    * Whether to allow code points ≥ U+0080 in identifiers, like LuaJIT does.
    * See 'Note on character encodings' below if you wish to use this option.
    * Note: setting luaVersion: 'LuaJIT' currently does not enable this option; this may change in the future.
    */
  var extendedIdentifiers: `false`
  
  /**
    * This overrides the `strictP8FileFormat` feature, making it possible to parse
    * snippets lacking the proper header and sections.
    */
  var ignoreStrictP8FileFormat: Boolean
  
  /** Store location information on each syntax node. */
  var locations: Boolean
  
  /**
    * The version of Lua the parser will target; supported values are '5.1', '5.2', '5.3',
    * 'LuaJIT', 'PICO-8', 'PICO-8-0.2.1' and 'PICO-8-0.2.2'.
    */
  var luaVersion: LuaVersion
  
  /**
    * A callback which will be invoked when a syntax node has been completed.
    * The node which has been created will be passed as the only parameter.
    */
  def onCreateNode(node: Node): Unit
  
  /** A callback which will be invoked when a new scope is created. */
  def onCreateScope(): Unit
  
  /** A callback which will be invoked when the current scope is destroyed. */
  def onDestroyScope(): Unit
  
  /**
    * A callback which will be invoked when a local variable is declared.
    * The identifier will be passed as the only parameter.
    */
  def onLocalDeclaration(identifier: Identifier_): Unit
  
  /** Store the start and end character locations on each syntax node. */
  var ranges: Boolean
  
  /** Track identifier scopes. */
  var scope: Boolean
  
  /** Explicitly tell the parser when the input ends. */
  @JSName("wait")
  var wait_FOptions: Boolean
}
object Options {
  
  inline def apply(
    comments: Boolean,
    encodingMode: `pseudo-latin1` | `x-user-defined` | none,
    ignoreStrictP8FileFormat: Boolean,
    locations: Boolean,
    luaVersion: LuaVersion,
    onCreateNode: Node => Unit,
    onCreateScope: () => Unit,
    onDestroyScope: () => Unit,
    onLocalDeclaration: Identifier_ => Unit,
    ranges: Boolean,
    scope: Boolean,
    wait_ : Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], encodingMode = encodingMode.asInstanceOf[js.Any], extendedIdentifiers = false, ignoreStrictP8FileFormat = ignoreStrictP8FileFormat.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], luaVersion = luaVersion.asInstanceOf[js.Any], onCreateNode = js.Any.fromFunction1(onCreateNode), onCreateScope = js.Any.fromFunction0(onCreateScope), onDestroyScope = js.Any.fromFunction0(onDestroyScope), onLocalDeclaration = js.Any.fromFunction1(onLocalDeclaration), ranges = ranges.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setEncodingMode(value: `pseudo-latin1` | `x-user-defined` | none): Self = StObject.set(x, "encodingMode", value.asInstanceOf[js.Any])
    
    inline def setExtendedIdentifiers(value: `false`): Self = StObject.set(x, "extendedIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setIgnoreStrictP8FileFormat(value: Boolean): Self = StObject.set(x, "ignoreStrictP8FileFormat", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: Boolean): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLuaVersion(value: LuaVersion): Self = StObject.set(x, "luaVersion", value.asInstanceOf[js.Any])
    
    inline def setOnCreateNode(value: Node => Unit): Self = StObject.set(x, "onCreateNode", js.Any.fromFunction1(value))
    
    inline def setOnCreateScope(value: () => Unit): Self = StObject.set(x, "onCreateScope", js.Any.fromFunction0(value))
    
    inline def setOnDestroyScope(value: () => Unit): Self = StObject.set(x, "onDestroyScope", js.Any.fromFunction0(value))
    
    inline def setOnLocalDeclaration(value: Identifier_ => Unit): Self = StObject.set(x, "onLocalDeclaration", js.Any.fromFunction1(value))
    
    inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
