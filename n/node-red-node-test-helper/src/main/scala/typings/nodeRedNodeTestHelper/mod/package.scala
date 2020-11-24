package typings.nodeRedNodeTestHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TestCredentials[TCred] = typings.nodeRed.mod.NodeCredentials[TCred]
  
  type TestFlows = js.Array[typings.nodeRedNodeTestHelper.anon.TestFlowsItemNodeDef]
  
  type TestFlowsItem[TNodeDef /* <: typings.nodeRed.mod.NodeDef */] = typings.std.Partial[TNodeDef] with typings.nodeRedNodeTestHelper.anon.Id
  
  type TestNodeInitializer = typings.nodeRed.mod.NodeInitializer[typings.nodeRed.mod.NodeAPISettingsWithData] | js.Array[typings.nodeRed.mod.NodeInitializer[typings.nodeRed.mod.NodeAPISettingsWithData]]
}
