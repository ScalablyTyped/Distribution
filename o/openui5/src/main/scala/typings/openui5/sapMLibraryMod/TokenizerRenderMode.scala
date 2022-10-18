package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenizerRenderMode extends StObject
@JSImport("sap/m/library", "TokenizerRenderMode")
@js.native
object TokenizerRenderMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TokenizerRenderMode & String] = js.native
  
  /**
    * In `Loose` mode, the `sap.m.Tokenizer` will show all its tokens, even if this means that scrolling needs
    * to be used.
    */
  @js.native
  sealed trait Loose
    extends StObject
       with TokenizerRenderMode
  /* "Loose" */ val Loose: typings.openui5.sapMLibraryMod.TokenizerRenderMode.Loose & String = js.native
  
  /**
    * In `Narrow` mode, the `sap.m.Tokenizer` will show as many tokens as its width allows, as well as an n-More
    * indicator with the count of the hidden tokens. The rest tokens will be hidden.
    */
  @js.native
  sealed trait Narrow
    extends StObject
       with TokenizerRenderMode
  /* "Narrow" */ val Narrow: typings.openui5.sapMLibraryMod.TokenizerRenderMode.Narrow & String = js.native
}
