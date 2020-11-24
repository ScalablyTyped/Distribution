package typings.mergeImg.mod

import typings.jimp.mod.DepreciatedJimp
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merge-img", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(images: js.Array[String | ImageDescriptor | Buffer | DepreciatedJimp]): js.Promise[DepreciatedJimp] = js.native
  def apply(images: js.Array[String | ImageDescriptor | Buffer | DepreciatedJimp], options: Options): js.Promise[DepreciatedJimp] = js.native
}
