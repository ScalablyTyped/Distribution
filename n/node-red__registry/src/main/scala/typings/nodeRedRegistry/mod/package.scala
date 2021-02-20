package typings.nodeRedRegistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type NodeApiLog = typings.nodeRedRegistry.mod.Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Log */ js.Any, 
    typings.nodeRedRegistry.nodeRedRegistryStrings.init
  ]
  
  // tslint:disable-line:no-empty-interface
  type NodeConstructor[TNode /* <: typings.nodeRedRegistry.mod.Node[TCred] */, TNodeDef /* <: typings.nodeRedRegistry.mod.NodeDef */, TCred] = js.ThisFunction1[/* this */ TNode, /* nodeDef */ TNodeDef, scala.Unit]
  
  type NodeCredentials[TCreds] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TCreds ]: @node-red/registry.@node-red/registry.NodeCredential}
    */ typings.nodeRedRegistry.nodeRedRegistryStrings.NodeCredentials with org.scalablytyped.runtime.TopLevel[js.Any]
  
  /**
    * Function called by Node Registry to init node.
    */
  type NodeInitializer[TSets /* <: typings.nodeRedRegistry.mod.NodeAPISettingsWithData */] = js.Function1[
    /* RED */ typings.nodeRedRegistry.mod.NodeAPI[TSets], 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  type NodeSettings[TSets] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TSets ]: @node-red/registry.@node-red/registry.NodeSetting<TSets[K]>}
    */ typings.nodeRedRegistry.nodeRedRegistryStrings.NodeSettings with org.scalablytyped.runtime.TopLevel[TSets]
  
  /**
    * Omit Helper
    * Typescript 3.5 includes this.
    * TODO: Remove after March 2021, after
    *   the end of support for TS 3.4
    */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
}
