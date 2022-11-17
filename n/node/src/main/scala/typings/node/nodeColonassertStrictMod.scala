package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.anon.DeepEqual
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonassertStrictMod extends Shortcut {
  
  @JSImport("node:assert/strict", JSImport.Namespace)
  @js.native
  val ^ : (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    "equal" | "notEqual" | "deepEqual" | "notDeepEqual" | "ok" | "strictEqual" | "deepStrictEqual" | "ifError" | "strict"
  ]) & DeepEqual = js.native
  
  type _To = (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    "equal" | "notEqual" | "deepEqual" | "notDeepEqual" | "ok" | "strictEqual" | "deepStrictEqual" | "ifError" | "strict"
  ]) & DeepEqual
  
  /* This means you don't have to write `^`, but can instead just say `nodeColonassertStrictMod.foo` */
  override def _to: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    "equal" | "notEqual" | "deepEqual" | "notDeepEqual" | "ok" | "strictEqual" | "deepStrictEqual" | "ifError" | "strict"
  ]) & DeepEqual = ^
}
