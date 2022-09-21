package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.anon.DeepEqual
import typings.node.nodeStrings.deepEqual
import typings.node.nodeStrings.deepStrictEqual
import typings.node.nodeStrings.equal
import typings.node.nodeStrings.ifError
import typings.node.nodeStrings.notDeepEqual
import typings.node.nodeStrings.notEqual
import typings.node.nodeStrings.ok
import typings.node.nodeStrings.strict
import typings.node.nodeStrings.strictEqual
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonassertMod extends Shortcut {
  
  @JSImport("node:assert/strict", JSImport.Namespace)
  @js.native
  val ^ : (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual = js.native
  
  type _To = (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual
  
  /* This means you don't have to write `^`, but can instead just say `nodeColonassertMod.foo` */
  override def _to: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual = ^
}
