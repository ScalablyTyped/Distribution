package typings.mkdirp

import typings.mkdirp.distMjsOptsArgMod.MkdirpOptionsResolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsFindMadeMod {
  
  @JSImport("mkdirp/dist/mjs/find-made", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findMade(opts: MkdirpOptionsResolved, parent: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findMade")(opts.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def findMade(opts: MkdirpOptionsResolved, parent: String, path: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findMade")(opts.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def findMadeSync(opts: MkdirpOptionsResolved, parent: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findMadeSync")(opts.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findMadeSync(opts: MkdirpOptionsResolved, parent: String, path: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findMadeSync")(opts.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
