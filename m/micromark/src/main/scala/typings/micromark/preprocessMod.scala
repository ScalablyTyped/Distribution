package typings.micromark

import typings.micromark.sharedTypesMod.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("micromark/dist/preprocess", JSImport.Namespace)
@js.native
object preprocessMod extends js.Object {
  
  def default(): PreprocessReturn = js.native
  
  type PreprocessReturn = js.Function3[
    /* value */ String, 
    /* encoding */ BufferEncoding, 
    /* end */ js.UndefOr[Boolean], 
    js.Array[String]
  ]
}
