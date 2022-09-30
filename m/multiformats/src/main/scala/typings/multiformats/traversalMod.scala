package typings.multiformats

import typings.multiformats.anon.Load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traversalMod {
  
  @JSImport("multiformats/types/src/traversal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def walk[T](hasCidLoadSeen: Load[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(hasCidLoadSeen.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type Block[T] = typings.multiformats.blockMod.Block[T]
  
  type CID = typings.multiformats.cidMod.CID
}
