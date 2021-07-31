package typings.micromark

import typings.micromark.sharedTypesMod.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preprocessMod {
  
  @JSImport("micromark/dist/preprocess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): PreprocessReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PreprocessReturn]
  
  type PreprocessReturn = js.Function3[
    /* value */ String, 
    /* encoding */ BufferEncoding, 
    /* end */ js.UndefOr[Boolean], 
    js.Array[String]
  ]
}
