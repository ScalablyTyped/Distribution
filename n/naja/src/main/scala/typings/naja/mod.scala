package typings.naja

import org.scalablytyped.runtime.Shortcut
import typings.naja.anon.Instantiable
import typings.naja.anon.InstantiableFormsHandler
import typings.naja.anon.InstantiableHistoryHandler
import typings.naja.anon.InstantiableRedirectHandler
import typings.naja.anon.InstantiableScriptLoader
import typings.naja.anon.InstantiableSnippetCache
import typings.naja.anon.InstantiableSnippetHandler
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("naja", JSImport.Default)
  @js.native
  val default: typings.naja.distNajaMod.Naja = js.native
  
  @JSImport("naja", "HttpError")
  @js.native
  open class HttpError protected ()
    extends typings.naja.distNajaMod.HttpError {
    def this(response: Response) = this()
  }
  
  @JSImport("naja", "Naja")
  @js.native
  open class Naja protected ()
    extends typings.naja.distNajaMod.Naja {
    def this(
      uiHandler: js.UndefOr[Instantiable],
      redirectHandler: js.UndefOr[InstantiableRedirectHandler],
      snippetHandler: js.UndefOr[InstantiableSnippetHandler],
      formsHandler: js.UndefOr[InstantiableFormsHandler],
      historyHandler: js.UndefOr[InstantiableHistoryHandler],
      snippetCache: js.UndefOr[InstantiableSnippetCache],
      scriptLoader: js.UndefOr[InstantiableScriptLoader]
    ) = this()
  }
  
  type _To = typings.naja.distNajaMod.Naja
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.naja.distNajaMod.Naja = default
}
