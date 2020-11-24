package typings.openGraphScraper.mod

import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("open-graph-scraper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(options: Options): js.Promise[SuccessResult | ErrorResult] = js.native
  def apply(
    options: Options,
    callback: js.Function3[
      /* error */ Boolean, 
      /* results */ SuccessResult | ErrorResult, 
      /* response */ PassThrough, 
      Unit
    ]
  ): Unit = js.native
}
