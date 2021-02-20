package typings.nodegit

import typings.nodegit.convenientHunkMod.ConvenientHunk
import typings.nodegit.diffDeltaMod.DiffDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyOptionsMod {
  
  @JSImport("nodegit/apply-options", "ApplyOptions")
  @js.native
  class ApplyOptions () extends StObject {
    
    var deltaCb: js.UndefOr[js.Function2[/* delta */ DiffDelta, /* payload */ js.Any, Double]] = js.native
    
    var hunkCb: js.UndefOr[js.Function2[/* hunk */ ConvenientHunk, /* payload */ js.Any, Double]] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
