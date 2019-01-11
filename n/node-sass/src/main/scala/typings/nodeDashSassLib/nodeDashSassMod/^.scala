package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sass", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def render(
    options: nodeDashSassLib.nodeDashSassMod.Options,
    callback: js.Function2[
      /* err */ nodeDashSassLib.nodeDashSassMod.SassError, 
      /* result */ nodeDashSassLib.nodeDashSassMod.Result, 
      _
    ]
  ): scala.Unit = js.native
  def renderSync(options: nodeDashSassLib.nodeDashSassMod.Options): nodeDashSassLib.nodeDashSassMod.Result = js.native
}

