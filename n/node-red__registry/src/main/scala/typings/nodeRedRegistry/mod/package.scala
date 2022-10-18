package typings.nodeRedRegistry.mod

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

/**
  * Function called by Node Registry to init node.
  */
type NodeInitializer[TSets /* <: NodeAPISettingsWithData */] = js.Function1[/* RED */ NodeAPI[TSets], Unit | js.Promise[Unit]]

/**
  * Omit Helper
  * Typescript 3.5 includes this.
  * TODO: Remove after March 2021, after
  *   the end of support for TS 3.4
  */
type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
