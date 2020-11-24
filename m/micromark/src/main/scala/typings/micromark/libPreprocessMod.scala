package typings.micromark

import typings.micromark.libSharedTypesMod.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("micromark/lib/preprocess", JSImport.Namespace)
@js.native
object libPreprocessMod extends js.Object {
  
  def default(): PreprocessReturn = js.native
  
  type PreprocessReturn = js.Function3[
    /* value */ String, 
    /* encoding */ BufferEncoding, 
    /* end */ js.UndefOr[Boolean], 
    js.Array[String]
  ]
}
