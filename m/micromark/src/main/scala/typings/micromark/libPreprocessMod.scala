package typings.micromark

import typings.micromark.libSharedTypesMod.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPreprocessMod {
  
  @JSImport("micromark/lib/preprocess", JSImport.Default)
  @js.native
  def default(): PreprocessReturn = js.native
  
  type PreprocessReturn = js.Function3[
    /* value */ String, 
    /* encoding */ BufferEncoding, 
    /* end */ js.UndefOr[Boolean], 
    js.Array[String]
  ]
}
