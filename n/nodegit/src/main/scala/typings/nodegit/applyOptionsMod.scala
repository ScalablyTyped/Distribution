package typings.nodegit

import typings.nodegit.convenientHunkMod.ConvenientHunk
import typings.nodegit.diffDeltaMod.DiffDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/apply-options", JSImport.Namespace)
@js.native
object applyOptionsMod extends js.Object {
  
  @js.native
  class ApplyOptions () extends js.Object {
    
    var deltaCb: js.UndefOr[js.Function2[/* delta */ DiffDelta, /* payload */ js.Any, Double]] = js.native
    
    var hunkCb: js.UndefOr[js.Function2[/* hunk */ ConvenientHunk, /* payload */ js.Any, Double]] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
