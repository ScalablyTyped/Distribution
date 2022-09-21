package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.TopLevel
import typings.nodeRedRegistry.nodeRedRegistryStrings.init
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type NodeApiLog = Omit[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify util.Log */ Any, 
init]

// tslint:disable-line:no-empty-interface
type NodeConstructor[TNode /* <: Node[TCred] */, TNodeDef /* <: NodeDef */, TCred /* <: js.Object */] = js.ThisFunction1[/* this */ TNode, /* nodeDef */ TNodeDef, Unit]

type NodeCredentials[TCreds] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TCreds ]: @node-red/registry.@node-red/registry.NodeCredential}
  */ typings.nodeRedRegistry.nodeRedRegistryStrings.NodeCredentials & TopLevel[Any]

/**
  * Function called by Node Registry to init node.
  */
type NodeInitializer[TSets /* <: NodeAPISettingsWithData */] = js.Function1[/* RED */ NodeAPI[TSets], Unit | js.Promise[Unit]]

type NodeSettings[TSets] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TSets ]: @node-red/registry.@node-red/registry.NodeSetting<TSets[K]>}
  */ typings.nodeRedRegistry.nodeRedRegistryStrings.NodeSettings & TopLevel[TSets]

/**
  * Omit Helper
  * Typescript 3.5 includes this.
  * TODO: Remove after March 2021, after
  *   the end of support for TS 3.4
  */
type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
